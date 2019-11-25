package service;

import com.google.gson.Gson;
import domain.Alcohol;
import domain.Data;
import domain.Mixer;
import domain.Type;
import dto.AlcoholMixerAverageDTO;
import dto.AlcoholMixerCountDTO;
import dto.AlcoholMixerDTO;
import exceptions.AlcoholNotFound;
import exceptions.MixerNotFound;
import exceptions.TypeNotFound;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingLong;
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

    public Mixer findMixerById(Long id) {
        return data.getMixers()
                .stream()
                .filter(mixer -> mixer.getId().equals(id))
                .findFirst().orElseThrow(MixerNotFound::new);
    }

    public Alcohol findTopAlcoholByFoundersNameLengthSum(String alcoholName) {
        Type gin = findTypeByName(alcoholName);
        return findAlcoholByType(gin)
                .stream()
                .sorted(comparing(Alcohol::getFoundersNameSize))
                .findFirst()
                .orElseThrow(AlcoholNotFound::new);
    }


    public List<Type> findAllTypes() {
        return data.getTypes();
    }

    private Type findTypeByName(String name) {
        return data.getTypes().stream()
                .filter(type -> type.getName().equals(name))
                .findFirst()
                .orElseThrow(TypeNotFound::new);
    }

    public List<Alcohol> findAlcoholByType(Type type) {
        return data.getAlcohols()
                .stream()
                .filter(byType(type))
                .collect(toList());
    }

    public List<AlcoholMixerCountDTO> findTopAlcoholCombinations(int topSize) {
        Map<AlcoholMixerDTO, Long> hashMap = new HashMap<>(topSize);

        for (Alcohol alcohol: data.getAlcohols()) {
            for (Long mixer: alcohol.getCombinations()) {
                hashMap.merge(new AlcoholMixerDTO(alcohol, findMixerById(mixer)),1L, Long::sum);
            }
        }

        return hashMap.entrySet()
                .stream()
                .map(entry -> new AlcoholMixerCountDTO(entry.getKey().getAlcohol().getNom(), entry.getKey().getMixer().getName(), entry.getValue()))
                .sorted(comparingLong(AlcoholMixerCountDTO::getCount).reversed())
                .limit(topSize)
                .collect(toList());
    }

    public List<AlcoholMixerAverageDTO> findTopMixersByAverageAlcoholGraduation(int topSize) {
        return null;
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
