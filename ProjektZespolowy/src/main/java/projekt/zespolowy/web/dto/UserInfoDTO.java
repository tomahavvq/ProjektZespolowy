package projekt.zespolowy.web.dto;

/**
 * Created by tomahavvq on 13.05.16.
 */
public class UserInfoDTO {

    private long userId;
    private Integer trainingAmount;
    private String longestTraining;
    private Integer longestRun;
    private Double bestPace;

    public UserInfoDTO() {
    }

    public UserInfoDTO(long userId, Integer trainingAmount, String longestTraining, Integer longestRun, Double bestPace) {
        this.userId = userId;
        this.trainingAmount = trainingAmount;
        this.longestTraining = longestTraining;
        this.longestRun = longestRun;
        this.bestPace = bestPace;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Integer getTrainingAmount() {
        return trainingAmount;
    }

    public void setTrainingAmount(Integer trainingAmount) {
        this.trainingAmount = trainingAmount;
    }

    public String getLongestTraining() {
        return longestTraining;
    }

    public void setLongestTraining(String longestTraining) {
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
