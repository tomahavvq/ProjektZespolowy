package projekt.zespolowy.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.zespolowy.service.TrainingService;
import projekt.zespolowy.web.dto.TrainingDTO;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by matexo on 21.05.16.
 */
@RestController
@RequestMapping(value = "api/training")
public class TrainingCtrl {

    @Inject
    private TrainingService trainingService;

    @RequestMapping(value = "/{trainingId}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TrainingDTO> getTraining(@PathVariable Long trainingId) {
        return trainingService.getTraining(trainingId)
                .map(trainingDTO -> new ResponseEntity<>(trainingDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    // TODO do pomyslenia// URL: http://10.0.0.10:8080/api/exercise GET
    @RequestMapping(value = "/user/{userId}" , method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateTraining(@RequestBody TrainingDTO trainingDTO, @PathVariable Long userId)
    {
    return trainingService.editTraining(trainingDTO , userId)
            .map(training -> new ResponseEntity<>(training.getId() , HttpStatus.OK ))
            .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    @RequestMapping(value = "/user/{trainingId}" , method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTraining(@PathVariable Long trainingId)
    {
        return trainingService.deleteTraining(trainingId)
                .map(training -> new ResponseEntity<>(training.getId() ,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    @RequestMapping(value = "/user/{userId}" , method = RequestMethod.GET)
    public ResponseEntity<?> getAllTrainingForUser(@PathVariable Long userId)
    {
        return new ResponseEntity<>(trainingService.getAllTrainingForUser(userId).get(),HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{userId}/active" , method = RequestMethod.GET)
    public ResponseEntity<List<TrainingDTO>> getActiveTrainingForUser(@PathVariable Long userId)
    {
        return new ResponseEntity<>(trainingService.getAllActiveTrainingForUser(userId).get(),HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{userId}" , method = RequestMethod.POST)
    public ResponseEntity<?> addTrainingForUser(@RequestBody TrainingDTO trainingDTO , @PathVariable Long userId)
    {
        return trainingService.saveTrainingForUser(trainingDTO , userId)
                .map(training -> new ResponseEntity<>(training.getId() , HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    @RequestMapping(value = "/user/{userId}")
    public ResponseEntity<TrainingDTO> getTraining(@PathVariable Long trainingId , @PathVariable Long userId) {
        return trainingService.getTraining(trainingId)
                .map(trainingDTO -> new ResponseEntity<>(trainingDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }
}
