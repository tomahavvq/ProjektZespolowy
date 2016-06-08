package projekt.zespolowy.web.dto;

/**
 * Created by pysiek on 08.06.16.
 */
public class StatisticDTO {
    private Integer numberOfRepetitions;
    private Integer numberOfSeries;
    private Integer numberOfWeight;
    private Integer runDistance;
    private Integer runDuration;
    private Integer numberOfAllDoneExercises;
    private Integer averageRunPace;

    public Integer getNumberOfRepetitions() {
        return numberOfRepetitions;
    }

    public void setNumberOfRepetitions(Integer numberOfRepetitions) {
        this.numberOfRepetitions = numberOfRepetitions;
    }

    public Integer getNumberOfSeries() {
        return numberOfSeries;
    }

    public void setNumberOfSeries(Integer numberOfSeries) {
        this.numberOfSeries = numberOfSeries;
    }

    public Integer getNumberOfWeight() {
        return numberOfWeight;
    }

    public void setNumberOfWeight(Integer numberOfWeight) {
        this.numberOfWeight = numberOfWeight;
    }

    public Integer getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(Integer runDistance) {
        this.runDistance = runDistance;
    }

    public Integer getRunDuration() {
        return runDuration;
    }

    public void setRunDuration(Integer runDuration) {
        this.runDuration = runDuration;
    }

    public Integer getNumberOfAllDoneExercises() {
        return numberOfAllDoneExercises;
    }

    public void setNumberOfAllDoneExercises(Integer numberOfAllDoneExercises) {
        this.numberOfAllDoneExercises = numberOfAllDoneExercises;
    }

    public Integer getAverageRunPace() {
        return averageRunPace;
    }

    public void setAverageRunPace(Integer averageRunPace) {
        this.averageRunPace = averageRunPace;
    }
}
