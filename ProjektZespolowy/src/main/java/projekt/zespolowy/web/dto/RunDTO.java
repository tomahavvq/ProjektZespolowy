package projekt.zespolowy.web.dto;

import java.time.LocalDateTime;

/**
 * Created by tomahavvq on 14.05.16.
 */
public class RunDTO {

    private Long runId;
    private Integer[] pace;
    private Double[][] coordinates;
    private Integer duration;
    private LocalDateTime dateTime;
    private String name;
    private Integer distance;

    public Long getRunId() {
        return runId;
    }

    public void setRunId(Long runId) {
        this.runId = runId;
    }

    public Integer[] getPace() {
        return pace;
    }

    public void setPace(Integer[] pace) {
        this.pace = pace;
    }

    public Double[][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Double[][] coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
