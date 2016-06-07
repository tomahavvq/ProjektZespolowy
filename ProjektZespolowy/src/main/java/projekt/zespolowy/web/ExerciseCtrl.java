package projekt.zespolowy.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.zespolowy.domain.training.BodyPart;
import projekt.zespolowy.domain.training.Exercise;
import projekt.zespolowy.service.ExerciseService;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

/**
 * Created by matexo on 21.05.16.
 */
@RestController
@RequestMapping(value = "api/exercise")
public class ExerciseCtrl {

    @Inject
    private ExerciseService exerciseService;

    //tylko dla admina
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> saveExercise(@RequestBody Exercise exercise) {
        return exerciseService.saveExercise(exercise)
                .map(addedExercise -> new ResponseEntity<>(addedExercise.getId() , HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    @RequestMapping(value = "")
    public ResponseEntity<List<Exercise>> getAllExercises() {
        return new ResponseEntity<>( exerciseService.getAllExercise() , HttpStatus.OK);
    }

    // TODO do modyfikacji w pozniejszym czasie
    @RequestMapping(value = "/{bodyPart}")
    public List<Exercise> getAllExercisesByBodyPart(@PathVariable String bodyPart) {
        // cos zrobic z wyjatkiem(najprawdopodobniej zamiana na tabele slownikowa)
        BodyPart bp = BodyPart.valueOf(bodyPart);
        return exerciseService.getExerciseByBodyPart(bp);
    }

    @RequestMapping(value = "/{exerciseId}" , method = RequestMethod.GET)
    public ResponseEntity<Exercise> getExerciseById(@PathVariable Long exerciseId)
    {
        return exerciseService.getExerciseById(exerciseId)
                .map(exercise -> new ResponseEntity<>(exercise , HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
