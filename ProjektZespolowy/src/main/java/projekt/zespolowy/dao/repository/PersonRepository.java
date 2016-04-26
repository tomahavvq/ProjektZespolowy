package projekt.zespolowy.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;
import projekt.zespolowy.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>, QueryDslPredicateExecutor<Person> {
}
