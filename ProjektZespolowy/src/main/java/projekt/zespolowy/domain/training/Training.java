package projekt.zespolowy.domain.training;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;
import projekt.zespolowy.domain.AbstractTrainingEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * Created by matexo on 21.05.16.
 */
@Entity
@Table
public class Training extends AbstractTrainingEntity{

    @NotNull
    private Boolean isDone = Boolean.FALSE;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "training")
    private List<ExerciseDetails> exercises;

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public List<ExerciseDetails> getExercises() {
        return exercises;
    }

    public void setExercises(List<ExerciseDetails> exercises) {
        this.exercises = exercises;
    }
}
