
package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alcohol {

    private String nom;
    private Double graduation;
    private String procedence;
    private Long year;
    private Long type;
    private List<Founder> founders = null;
    private List<Long> combinations = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Alcohol() {
    }

    public Alcohol(String nom,
                   Double graduation,
                   String procedence,
                   Long year,
                   Long type,
                   List<Founder> founders,
                   List<Long> combinations) {
        super();
        this.nom = nom;
        this.graduation = graduation;
        this.procedence = procedence;
        this.year = year;
        this.type = type;
        this.founders = founders;
        this.combinations = combinations;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Alcohol withNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Double getGraduation() {
        return graduation;
    }

    public void setGraduation(Double graduation) {
        this.graduation = graduation;
    }

    public Alcohol withGraduation(Double graduation) {
        this.graduation = graduation;
        return this;
    }

    public String getProcedence() {
        return procedence;
    }

    public void setProcedence(String procedence) {
        this.procedence = procedence;
    }

    public Alcohol withProcedence(String procedence) {
        this.procedence = procedence;
        return this;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Alcohol withYear(Long year) {
        this.year = year;
        return this;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Alcohol withType(Long type) {
        this.type = type;
        return this;
    }

    public List<Founder> getFounders() {
        return founders;
    }

    public void setFounders(List<Founder> founders) {
        this.founders = founders;
    }

    public Alcohol withFounders(List<Founder> founders) {
        this.founders = founders;
        return this;
    }

    public List<Long> getCombinations() {
        return combinations;
    }

    public void setCombinations(List<Long> combinations) {
        this.combinations = combinations;
    }

    public Alcohol withCombinations(List<Long> combinations) {
        this.combinations = combinations;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Alcohol withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "nom='" + nom + '\'' +
                ", graduation=" + graduation +
                ", procedence='" + procedence + '\'' +
                ", year=" + year +
                ", type=" + type +
                ", founders=" + founders +
                ", combinations=" + combinations +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
