package projekt.zespolowy.web.dto;

import projekt.zespolowy.domain.training.Exercise;

import java.util.Map;

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
    private Map<Exercise, Integer> sumOfAllDoneExercises;
    private Map<Exercise, Integer> sumOfAllExercises;
    private Double averageRunPace;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Map<Exercise, Integer> getSumOfAllExercises() {
        return sumOfAllExercises;
    }

    public void setSumOfAllExercises(Map<Exercise, Integer> sumOfAllExercises) {
        this.sumOfAllExercises = sumOfAllExercises;
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

    public Map<Exercise, Integer> getSumOfAllDoneExercises() {
        return sumOfAllDoneExercises;
    }

    public void setSumOfAllDoneExercises(Map<Exercise, Integer> sumOfAllDoneExercises) {
        this.sumOfAllDoneExercises = sumOfAllDoneExercises;
    }

    public Double getAverageRunPace() {
        return averageRunPace;
    }

    public void setAverageRunPace(Double averageRunPace) {
        this.averageRunPace = averageRunPace;
    }
}
