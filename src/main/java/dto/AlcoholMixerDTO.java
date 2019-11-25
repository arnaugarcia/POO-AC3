package dto;

import domain.Alcohol;

import java.util.Objects;

public class AlcoholMixerDTO {
    private Alcohol alcohol;
    private Long mixer;

    public AlcoholMixerDTO(Alcohol alcohol, Long mixer) {
        this.alcohol = alcohol;
        this.mixer = mixer;
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }

    public Long getMixer() {
        return mixer;
    }

    public void setMixer(Long mixer) {
        this.mixer = mixer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlcoholMixerDTO)) return false;
        AlcoholMixerDTO that = (AlcoholMixerDTO) o;
        return Objects.equals(alcohol.getType(), that.alcohol.getType()) &&
                Objects.equals(mixer, that.mixer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alcohol.getType(), mixer);
    }

    @Override
    public String toString() {
        return "AlcoholMixerDTO{" +
                "alcohol=" + alcohol.getNom() +
                ", mixer=" + mixer +
                '}';
    }
}
