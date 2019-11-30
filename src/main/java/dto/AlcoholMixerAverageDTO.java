package dto;

import java.util.Objects;

public class AlcoholMixerAverageDTO {

    private String mixerName;
    private Double average;

    public AlcoholMixerAverageDTO() {}

    public AlcoholMixerAverageDTO(String mixerName, Double average) {
        this.mixerName = mixerName;
        this.average = average;
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
        return Objects.equals(mixerName, that.mixerName) &&
                Objects.equals(average, that.average);
    }

    @Override
    public String toString() {
        return "AlcoholMixerAverageDTO{" +
                "mixerName='" + mixerName + '\'' +
                ", average=" + average +
                '}';
    }
}
