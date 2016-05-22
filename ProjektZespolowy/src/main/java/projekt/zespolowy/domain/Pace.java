package projekt.zespolowy.domain;

import javax.persistence.*;

/**
 * Created by tomahavvq on 14.05.16.
 */
@Table
@Entity
public class Pace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private Integer pace;

    @ManyToOne
    @JoinColumn(name = "run_id")
    private Run run;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPace() {
        return pace;
    }

    public void setPace(Integer pace) {
        this.pace = pace;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }
}
