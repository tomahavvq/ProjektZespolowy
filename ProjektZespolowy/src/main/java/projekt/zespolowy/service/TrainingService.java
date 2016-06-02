package projekt.zespolowy.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projekt.zespolowy.dao.repository.ExerciseDetailsRepository;
import projekt.zespolowy.dao.repository.ExerciseRepository;
import projekt.zespolowy.dao.repository.TrainingRepository;
import projekt.zespolowy.dao.repository.UserRepository;
import projekt.zespolowy.domain.training.ExerciseDetails;
import projekt.zespolowy.domain.training.QTraining;
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

    @Inject
    private UserRepository userRepository;

    public Optional<TrainingDTO> getTraining(Long trainingId) {
        Training training = trainingRepository.getOne(trainingId);
        return Optional.of(TrainingMapper.mapTrainingEntityToDTO(training));
    }


    public Optional<Training> editTraining(TrainingDTO trainingDTO , Long userId)
    {
        //szpachla
        deleteTraining(trainingDTO.getId());
        return saveTrainingForUser(trainingDTO,userId);
    }

    //do testow
    public Optional<Training> deleteTraining(Long id)
    {
        Training training = null;
        if(trainingRepository.exists(id)){
        training = trainingRepository.getOne(id);
            //for (ExerciseDetails exerciseDetails : training.getExercises())
            //    exerciseDetailsRepository.delete(exerciseDetails.getId());
            trainingRepository.delete(id);
        } //else return false;
        return Optional.of(training);
    }

    public Optional<List<TrainingDTO>> getAllTrainingForUser(Long userId)
    {
        Iterable<Training> list = trainingRepository.findAll(QTraining.training.user.id.eq(userId));
        return Optional.of(TrainingMapper.mapTrainingListToTrainingDTOList(list));
    }

    public Optional<List<TrainingDTO>> getAllActiveTrainingForUser(Long userId)
    {
        Iterable<Training> list = trainingRepository.findAll
                (QTraining.training.user.id.eq(userId).and(QTraining.training.isDone.eq(false)));
        return Optional.of(TrainingMapper.mapTrainingListToTrainingDTOList(list));
    }

    public Optional<Training> saveTrainingForUser(TrainingDTO trainingDTO , Long userId)
    {
        Training training = new Training();
        training.setDone(trainingDTO.getDone());
        training.setDateTime(trainingDTO.getTrainingDate());
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
            exerciseDetails.setExercise(exerciseRepository.getOne(exersiseDTO.getExerciseId()));
            exerciseDetails = exerciseDetailsRepository.save(exerciseDetails);
            exerciseDetailsList.add(exerciseDetails);
        }
        training.setUser(userRepository.getOne(userId));
        return Optional.of(trainingRepository.save(training));
    }
}
