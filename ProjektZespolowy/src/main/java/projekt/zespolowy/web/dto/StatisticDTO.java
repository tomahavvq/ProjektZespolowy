package projekt.zespolowy.web.dto;

/**
 * Created by pysiek on 08.06.16.
 */
public class StatisticDTO {
    private Long userId;
    private Integer sumOfRepetitions;
    private Integer sumOfSeries;
    private Integer sumOfWeight;
    private Integer runDistance;
    private Integer runDuration;
    private Integer sumOfAllDoneExercises;
    private Integer sumOffAllExercises;
    private Double averageRunPace;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getSumOffAllExercises() {
        return sumOffAllExercises;
    }

    public void setSumOffAllExercises(Integer sumOffAllExercises) {
        this.sumOffAllExercises = sumOffAllExercises;
    }

    public Integer getSumOfRepetitions() {
        return sumOfRepetitions;
    }

    public void setSumOfRepetitions(Integer sumOfRepetitions) {
        this.sumOfRepetitions = sumOfRepetitions;
    }

    public Integer getSumOfSeries() {
        return sumOfSeries;
    }

    public void setSumOfSeries(Integer sumOfSeries) {
        this.sumOfSeries = sumOfSeries;
    }

    public Integer getSumOfWeight() {
        return sumOfWeight;
    }

    public void setSumOfWeight(Integer sumOfWeight) {
        this.sumOfWeight = sumOfWeight;
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

    public Integer getSumOfAllDoneExercises() {
        return sumOfAllDoneExercises;
    }

    public void setSumOfAllDoneExercises(Integer sumOfAllDoneExercises) {
        this.sumOfAllDoneExercises = sumOfAllDoneExercises;
    }

    public Double getAverageRunPace() {
        return averageRunPace;
    }

    public void setAverageRunPace(Double averageRunPace) {
        this.averageRunPace = averageRunPace;
    }
}
