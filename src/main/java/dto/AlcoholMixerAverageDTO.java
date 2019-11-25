package dto;

import java.util.Objects;

public class AlcoholMixerAverageDTO {

    private String alcoholName;
    private String mixerName;
    private Double average;

    public AlcoholMixerAverageDTO() {}

    public String getAlcoholName() {
        return alcoholName;
    }

    public String getMixerName() {
        return mixerName;
    }

    public Double getAverage() {
        return average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlcoholMixerAverageDTO)) return false;
        AlcoholMixerAverageDTO that = (AlcoholMixerAverageDTO) o;
        return Objects.equals(alcoholName, that.alcoholName) &&
                Objects.equals(mixerName, that.mixerName) &&
                Objects.equals(average, that.average);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alcoholName, mixerName, average);
    }
}
