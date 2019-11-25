package dto;

import domain.Alcohol;
import domain.Mixer;

import java.util.Objects;

public class AlcoholMixerDTO {
    private Alcohol alcohol;
    private Mixer mixer;

    public AlcoholMixerDTO(Alcohol alcohol, Mixer mixer) {
        this.alcohol = alcohol;
        this.mixer = mixer;
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public Mixer getMixer() {
        return mixer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlcoholMixerDTO)) return false;
        AlcoholMixerDTO that = (AlcoholMixerDTO) o;
        return Objects.equals(alcohol.getType(), that.alcohol.getType()) &&
                Objects.equals(mixer.getId(), that.mixer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(alcohol.getType(), mixer.getId());
    }

    @Override
    public String toString() {
        return "AlcoholMixerDTO{" +
                "alcohol=" + alcohol.getNom() +
                ", mixer=" + mixer.getName() +
                '}';
    }
}
