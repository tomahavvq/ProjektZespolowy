package projekt.zespolowy.domain;

import javax.persistence.*;

/**
 * Created by tomahavvq on 13.05.16.
 */
@Entity
@Table
public class UserInfo {

    @Id
    @Column(name = "user_id")
    private Long userId;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(name = "training_amount")
    private Integer trainingAmount;

    //[s]
    @Column(name = "longest_training")
    private Integer longestTraining;

    //[m]
    @Column(name = "longest_run")
    private Integer longestRun;

    //km/h
    @Column(name = "best_pace")
    private Double bestPace;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        this.userId = user.getId();
    }

    public Integer getTrainingAmount() {
        return trainingAmount;
    }

    public void setTrainingAmount(Integer trainingAmount) {
        this.trainingAmount = trainingAmount;
    }

    public Integer getLongestTraining() {
        return longestTraining;
    }

    public void setLongestTraining(Integer longestTraining) {
        this.longestTraining = longestTraining;
    }

    public Integer getLongestRun() {
        return longestRun;
    }

    public void setLongestRun(Integer longestRun) {
        this.longestRun = longestRun;
    }

    public Double getBestPace() {
        return bestPace;
    }

    public void setBestPace(Double bestPace) {
        this.bestPace = bestPace;
    }
}
