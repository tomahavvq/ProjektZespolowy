package projekt.zespolowy.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import projekt.zespolowy.domain.training.ExerciseDetails;

/**
 * Created by matexo on 21.05.16.
 */
public interface ExerciseDetailsRepository extends JpaRepository<ExerciseDetails , Long> , QueryDslPredicateExecutor<ExerciseDetails> {
}
