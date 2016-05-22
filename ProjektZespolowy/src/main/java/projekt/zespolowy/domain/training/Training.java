package projekt.zespolowy.domain.training;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

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
public class Training implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DateTimeFormat
    private Date training_date;

    @NotNull
    private Boolean isStrength = Boolean.TRUE;

    @NotNull
    private Boolean isDone = Boolean.FALSE;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "training")
    private List<ExerciseDetails> exercises;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return training_date;
    }

    public void setDate(Date training_date) {
        this.training_date = training_date;
    }

    public Boolean getStrength() {
        return isStrength;
    }

    public void setStrength(Boolean strength) {
        isStrength = strength;
    }

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
