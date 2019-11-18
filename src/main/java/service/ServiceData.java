package service;

import com.google.gson.Gson;
import domain.Alcohol;
import domain.Data;
import domain.Mixer;
import domain.Type;
import exceptions.MixerNotFound;
import exceptions.TypeNotFound;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

public class ServiceData {

    private final static String filePath = "data/C2H5OH.json";

    private final Data data;

    public ServiceData() {
        data = loadData();
    }

    public Mixer findMixerByName(String name) {
        return data.getMixers()
                .stream()
                .filter(mixer -> mixer.getName().equals(name))
                .findFirst()
                .orElseThrow(MixerNotFound::new);
    }

    public List<Type> findAllTypes() {
        return data.getTypes();
    }

    public List<Alcohol> findAlcoholByType(Type type) {
        return data.getAlcohols()
                .stream()
                .filter(byType(type))
                .collect(toList());
    }

    public List<Alcohol> findByGraduationBetweenAndCombineWith(double min, double max, Mixer mixer) {
        return data.getAlcohols()
                .stream()
                .filter(combineWith(mixer))
                .filter(graduationBetween(min, max))
                .collect(toList());

    }

    private Data loadData() {

        Data data = null;

        ClassLoader classLoader = getClass().getClassLoader();

        File file = new File(requireNonNull(classLoader.getResource(filePath)).getFile());

        try (Reader reader = new FileReader(file)) {

            Gson gson = new Gson();

            data = gson.fromJson(reader, Data.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    private static Predicate<Alcohol> combineWith(Mixer mixer) {
        return alcohol -> alcohol.getCombinations().contains(mixer.getId());
    }

    private static Predicate<Alcohol> graduationBetween(double min, double max) {
        return alcohol -> alcohol.getGraduation() > min && alcohol.getGraduation() < max;
    }

    private Predicate<Alcohol> byType(Type type) {
        return alcohol -> alcohol.getType().equals(type.getId());
    }

}
