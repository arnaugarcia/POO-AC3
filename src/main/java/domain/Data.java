
package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

    private ArrayList<Alcohol> alcohols = new ArrayList<Alcohol>();
    private ArrayList<Type> types = new ArrayList<Type>();
    private ArrayList<Mixer> mixers = new ArrayList<Mixer>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Data() {
    }

    public Data(ArrayList<Alcohol> alcohols, ArrayList<Type> types, ArrayList<Mixer> mixers) {
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return "Data{" +
                "alcohols=" + alcohols +
                ", types=" + types +
                ", mixers=" + mixers +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
