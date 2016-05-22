package projekt.zespolowy.web.dto;

/**
 * Created by matexo on 21.05.16.
 */
public class ExersiseDTO {
    private Long id;
    private Boolean isDone;
    private Integer repeatation;
    private Integer series;
    private Integer weight;
    private Long exerciseId;
    private String name;
    private String description;
    private String bodyPart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Integer getRepeatation() {
        return repeatation;
    }

    public void setRepeatation(Integer repeatation) {
        this.repeatation = repeatation;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public Long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Long exerciseId) {
        this.exerciseId = exerciseId;
    }
}
