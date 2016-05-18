package projekt.zespolowy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projekt.zespolowy.dao.repository.CoordinateRepository;
import projekt.zespolowy.domain.Coordinate;
import projekt.zespolowy.domain.Run;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomahavvq on 14.05.16.
 */
@Service
@Transactional
public class CoordinateService {

    @Inject
    private CoordinateRepository coordinateRepository;

    public List<Coordinate> saveCoordinates(Double[][] coordinates, Run run) {
        int length = coordinates.length;
        List<Coordinate> cordinatesList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            Coordinate coordinate = new Coordinate();
            coordinate.setAltitude(coordinates[i][0]);
            coordinate.setLatitude(coordinates[i][1]);
            coordinate.setRun(run);
            cordinatesList.add(coordinate);
        }
        return coordinateRepository.save(cordinatesList);
    }
}
