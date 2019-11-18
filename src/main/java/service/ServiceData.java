package service;

import com.google.gson.Gson;
import domain.Data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class ServiceData {

    private final static String filePath = "data/C2H5OH.json";

    private final Gson gson;

    public ServiceData() {
        gson = new Gson();
    }

    public Optional<Data> findAll() {

        ClassLoader classLoader = getClass().getClassLoader();

        File file = new File(classLoader.getResource(filePath).getFile());

        try (Reader reader = new FileReader(file)) {

            Data data = gson.fromJson(reader, Data.class);

            return of(data);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return empty();

    }

}
