package projekt.zespolowy.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import projekt.zespolowy.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>, QueryDslPredicateExecutor<Person> {
}
