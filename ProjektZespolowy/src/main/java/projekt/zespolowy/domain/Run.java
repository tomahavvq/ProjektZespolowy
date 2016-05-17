package projekt.zespolowy.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by tomahavvq on 14.05.16.
 */
@Entity
@Table
public class Run extends AbstractTrainingEntity {

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "run")
    private List<Pace> paceList;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "run")
    private List<Coordinate> coordinates;

    @Column
    private Integer distance;

    public List<Pace> getPaceList() {
        return paceList;
    }

    public void setPaceList(List<Pace> paceList) {
        this.paceList = paceList;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
