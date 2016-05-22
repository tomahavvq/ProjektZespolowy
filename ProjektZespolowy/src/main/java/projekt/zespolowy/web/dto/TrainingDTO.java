package projekt.zespolowy.web.dto;

import java.sql.Date;
import java.util.List;

/**
 * Created by matexo on 21.05.16.
 */
public class TrainingDTO {

    private Long id;
    private Date trainingDate;
    private Boolean isDone;
    private Boolean isStrength;
    private List<ExersiseDTO> exersiseDTOList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Boolean getStrength() {
        return isStrength;
    }

    public void setStrength(Boolean strength) {
        isStrength = strength;
    }

    public List<ExersiseDTO> getExersiseDTOList() {
        return exersiseDTOList;
    }

    public void setExersiseDTOList(List<ExersiseDTO> exersiseDTOList) {
        this.exersiseDTOList = exersiseDTOList;
    }
}
