package projekt.zespolowy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projekt.zespolowy.dao.repository.RunRepository;
import projekt.zespolowy.dao.repository.TrainingRepository;
import projekt.zespolowy.domain.QRun;
import projekt.zespolowy.domain.Run;
import projekt.zespolowy.domain.training.Exercise;
import projekt.zespolowy.domain.training.ExerciseDetails;
import projekt.zespolowy.domain.training.QTraining;
import projekt.zespolowy.domain.training.Training;
import projekt.zespolowy.web.dto.StatisticDTO;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pysiek on 08.06.16.
 */
@Service
@Transactional
public class StatisticService {
    @Inject
    private RunRepository runRepository;

    @Inject
    private TrainingRepository trainingRepository;

    @Inject
    private ExerciseService exerciseService;

    public StatisticDTO getUserStatistics(Long userId) {
        StatisticDTO statistics = new StatisticDTO();
        statistics.setUserId(userId);
        statistics.setSumOfRepetitions(0);
        statistics.setSumOfSeries(0);
        statistics.setSumOfWeight(0);
        statistics.setRunDistance(0);
        statistics.setRunDuration(0);

        Map<Exercise, Integer> done, all;
        done = new HashMap<>();
        all = new HashMap<>();

        List<Exercise> exercises = exerciseService.getAllExercise();
        for (Exercise exercise : exercises) {
            done.put(exercise, 0);
            all.put(exercise, 0);
        }

        Iterable<Training> trainings = trainingRepository.findAll(QTraining.training.user.id.eq(userId));
        for (Training training : trainings) {
            for (ExerciseDetails exerciseDetails : training.getExercises()) {
                if (exerciseDetails.getDone()) {
                    done.put(exerciseDetails.getExercise(), done.get(exerciseDetails.getExercise()) + 1);
                    statistics.setSumOfRepetitions(statistics.getSumOfRepetitions() + exerciseDetails.getRepeatation());
                    statistics.setSumOfSeries(statistics.getSumOfSeries() + exerciseDetails.getSeries());
                    statistics.setSumOfWeight(statistics.getSumOfWeight() + exerciseDetails.getWeight());
                }
                all.put(exerciseDetails.getExercise(), all.get(exerciseDetails.getExercise()) + 1);
            }
        }

        statistics.setSumOfAllDoneExercises(done);
        statistics.setSumOfAllExercises(all);

        Iterable<Run> runs = runRepository.findAll(QRun.run.user.id.eq(userId));
        for (Run run : runs) {
            statistics.setRunDistance(statistics.getRunDistance() + run.getDistance());
            statistics.setRunDuration(statistics.getRunDuration() + run.getDuration());
            // TODO Statistics average run pace
        }

        return statistics;
    }
}
