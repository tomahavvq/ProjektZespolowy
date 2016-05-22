package projekt.zespolowy.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;
import projekt.zespolowy.domain.training.Training;

/**
 * Created by matexo on 21.05.16.
 */
@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>, QueryDslPredicateExecutor<Training> {
}
