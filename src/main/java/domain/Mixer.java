
package domain;

public class Mixer {

    private Long id;
    private String name;

    public Mixer() {
    }

    public Mixer(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mixer withId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mixer withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Mixer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
