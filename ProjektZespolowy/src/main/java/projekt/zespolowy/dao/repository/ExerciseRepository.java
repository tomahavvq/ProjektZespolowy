package projekt.zespolowy.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;
import projekt.zespolowy.domain.training.Exercise;

/**
 * Created by matexo on 21.05.16.
 */
@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long>, QueryDslPredicateExecutor<Exercise> {
}
