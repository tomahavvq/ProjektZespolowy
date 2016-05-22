package projekt.zespolowy.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.zespolowy.service.TrainingService;
import projekt.zespolowy.web.dto.TrainingDTO;

import javax.inject.Inject;

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
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    // w poznijeszym czasie przypisanie do usera
    @RequestMapping(value = "" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveTraining(@RequestBody TrainingDTO trainingDTO)
    {
        return trainingService.saveTraining(trainingDTO)
                .map(training -> new ResponseEntity<>(training.getId(), HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    // TODO do pomyslenia// URL: http://10.0.0.10:8080/api/exercise GET
    @RequestMapping(value = "/{trainingId}" , method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateTraining(@RequestBody TrainingDTO trainingDTO, @PathVariable Long id)
    {
    return null;
    }

    @RequestMapping(value = "/{trainingId}" , method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTraining(@PathVariable Long trainingId)
    {
        return trainingService.deleteTraining(trainingId)
                .map(training -> new ResponseEntity<>(training.getId() ,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

}
