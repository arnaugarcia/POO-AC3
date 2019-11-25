
package domain;

import java.util.HashMap;
import java.util.Map;

public class Founder {

    private String name;
    private Long born;

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


    @Override
    public String toString() {
        return "Founder{" +
                "name='" + name + '\'' +
                ", born=" + born +
                '}';
    }
}
