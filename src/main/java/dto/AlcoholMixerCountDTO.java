package dto;

import java.util.Objects;

public class AlcoholMixerCountDTO {
    private String alcoholName;
    private String mixer;
    private Long count;

    public AlcoholMixerCountDTO(String alcoholName, String mixer, Long count) {
        this.alcoholName = alcoholName;
        this.mixer = mixer;
        this.count = count;
    }

    public String getAlcoholName() {
        return alcoholName;
    }

    public String getMixer() {
        return mixer;
    }


    public Long getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlcoholMixerCountDTO)) return false;
        AlcoholMixerCountDTO that = (AlcoholMixerCountDTO) o;
        return Objects.equals(alcoholName, that.alcoholName) &&
                Objects.equals(mixer, that.mixer) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alcoholName, mixer, count);
    }

    @Override
    public String toString() {
        return alcoholName + " " + mixer + " " + count;
    }
}
