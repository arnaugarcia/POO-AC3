
package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {

    private ArrayList<Alcohol> alcohols = new ArrayList<>();
    private ArrayList<Type> types = new ArrayList<>();
    private ArrayList<Mixer> mixers = new ArrayList<>();

    public Data() {
    }

    public Data(ArrayList<Alcohol> alcohols,
                ArrayList<Type> types,
                ArrayList<Mixer> mixers) {
        super();
        this.alcohols = alcohols;
        this.types = types;
        this.mixers = mixers;
    }

    public ArrayList<Alcohol> getAlcohols() {
        return alcohols;
    }

    public void setAlcohols(ArrayList<Alcohol> alcohols) {
        this.alcohols = alcohols;
    }

    public Data withAlcohols(ArrayList<Alcohol> alcohols) {
        this.alcohols = alcohols;
        return this;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }

    public Data withTypes(ArrayList<Type> types) {
        this.types = types;
        return this;
    }

    public ArrayList<Mixer> getMixers() {
        return mixers;
    }

    public void setMixers(ArrayList<Mixer> mixers) {
        this.mixers = mixers;
    }

    public Data withMixers(ArrayList<Mixer> mixers) {
        this.mixers = mixers;
        return this;
    }

    @Override
    public String toString() {
        return "Data{" +
                "alcohols=" + alcohols +
                ", types=" + types +
                ", mixers=" + mixers +
                '}';
    }
}
