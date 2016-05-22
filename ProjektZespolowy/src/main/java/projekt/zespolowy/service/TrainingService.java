package projekt.zespolowy.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projekt.zespolowy.dao.repository.ExerciseDetailsRepository;
import projekt.zespolowy.dao.repository.ExerciseRepository;
import projekt.zespolowy.dao.repository.TrainingRepository;
import projekt.zespolowy.domain.training.ExerciseDetails;
import projekt.zespolowy.domain.training.Training;
import projekt.zespolowy.mappers.TrainingMapper;
import projekt.zespolowy.web.dto.ExersiseDTO;
import projekt.zespolowy.web.dto.TrainingDTO;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by matexo on 21.05.16.
 */
@Service
@Transactional
public class TrainingService {

    @Inject
    private TrainingRepository trainingRepository;

    @Inject
    private ExerciseDetailsRepository exerciseDetailsRepository;

    @Inject
    private ExerciseRepository exerciseRepository;

    //narazie trainingid pozniej userid
    public Optional<TrainingDTO> getTraining(Long trainingId) {
        Training training = trainingRepository.getOne(trainingId);
        return Optional.of(TrainingMapper.mapTrainingEntityToDTO(training));
    }

    public Optional<Training> saveTraining(TrainingDTO trainingDTO)
    {
        Training training = new Training();
        training.setDone(trainingDTO.getDone());
        training.setDate(trainingDTO.getTrainingDate());
        training.setStrength(trainingDTO.getStrength());
        training = trainingRepository.save(training);

        List<ExerciseDetails> exerciseDetailsList = new ArrayList<>();
        for(ExersiseDTO exersiseDTO : trainingDTO.getExersiseDTOList())
        {
            ExerciseDetails exerciseDetails = new ExerciseDetails();
            exerciseDetails.setTraining(training);
            exerciseDetails.setSeries(exersiseDTO.getSeries());
            exerciseDetails.setDone(exersiseDTO.getDone());
            exerciseDetails.setRepeatation(exersiseDTO.getRepeatation());
            exerciseDetails.setWeight(exersiseDTO.getWeight());
            exerciseDetails.setExercise(exerciseRepository.getOne(exersiseDTO.getExerciseId())); // sprawdzac null jakby rzucalo
            exerciseDetails = exerciseDetailsRepository.save(exerciseDetails);
            exerciseDetailsList.add(exerciseDetails);
        }
        training.setExercises(exerciseDetailsList);
        return Optional.of(training);
    }

    //TODO Pomyslec jak ma dzialac edycja
    public Optional<Training> editTraining(TrainingDTO trainingDTO , Long id)
    {
        Training training = null;
        if(trainingRepository.exists(id))
            {
                training = trainingRepository.getOne(id);
                training.setDone(trainingDTO.getDone());
                training.setDate(trainingDTO.getTrainingDate());
                for(ExersiseDTO exersiseDTO : trainingDTO.getExersiseDTOList())
                    {
                        if(exersiseDTO.getId() == null) ;//dodac
                        else if(exerciseDetailsRepository.exists(id)) //edycja
                            {

                            }
                        else ;//usuniecie
                    }
            }
        return Optional.of(training);
    }

    public Optional<Training> deleteTraining(Long id)
    {
        Training training = null;
        if(trainingRepository.exists(id)){
        training = trainingRepository.getOne(id);
            for (ExerciseDetails exerciseDetails : training.getExercises())
                exerciseDetailsRepository.delete(exerciseDetails.getId());
            trainingRepository.delete(id);
        }
        return Optional.of(training);
    }
}
