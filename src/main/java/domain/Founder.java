
package domain;

import java.util.HashMap;
import java.util.Map;

public class Founder {

    private String name;
    private Long born;
    private Map<String, Object> additionalProperties = new HashMap<>();

    public Founder() {
    }

    public Founder(String name, Long born) {
        super();
        this.name = name;
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Founder withName(String name) {
        this.name = name;
        return this;
    }

    public Long getBorn() {
        return born;
    }

    public void setBorn(Long born) {
        this.born = born;
    }

    public Founder withBorn(Long born) {
        this.born = born;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Founder withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return "Founder{" +
                "name='" + name + '\'' +
                ", born=" + born +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
