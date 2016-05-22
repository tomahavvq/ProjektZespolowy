package projekt.zespolowy.mappers;

import projekt.zespolowy.domain.training.Exercise;
import projekt.zespolowy.domain.training.ExerciseDetails;
import projekt.zespolowy.domain.training.Training;
import projekt.zespolowy.web.dto.ExersiseDTO;
import projekt.zespolowy.web.dto.TrainingDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matexo on 21.05.16.
 */
public class TrainingMapper {

    public static TrainingDTO mapTrainingEntityToDTO(Training training)
    {
        TrainingDTO trainingDTO = getTrainingDTO(training);
        trainingDTO.setExersiseDTOList(getExersiseDTOList(training));
        return trainingDTO;
    }

    private static TrainingDTO getTrainingDTO(Training training) {
        TrainingDTO trainingDTO = new TrainingDTO();
        trainingDTO.setDone(training.getDone());
        trainingDTO.setId(training.getId());
        trainingDTO.setStrength(training.getStrength());
        trainingDTO.setTrainingDate(training.getDate());
        return trainingDTO;
    }

    private static List<ExersiseDTO> getExersiseDTOList(Training training) {
        List<ExersiseDTO> exersiseDTOList = new ArrayList<>();
        for(ExerciseDetails ed : training.getExercises())
        {
            ExersiseDTO exersiseDTO = new ExersiseDTO();
            exersiseDTO.setId(ed.getId());
            exersiseDTO.setDone(ed.getDone());
            exersiseDTO.setRepeatation(ed.getRepeatation());
            exersiseDTO.setSeries(ed.getSeries());
            exersiseDTO.setWeight(ed.getWeight());

            Exercise exercise = ed.getExercise();
            exersiseDTO.setBodyPart(exercise.getBodyPart().toString());
            exersiseDTO.setDescription(exercise.getDescription());
            exersiseDTO.setName(exercise.getName());
            exersiseDTO.setExerciseId(exercise.getId());
            exersiseDTOList.add(exersiseDTO);
        }
        return exersiseDTOList;
    }

}
