package projekt.zespolowy.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;
import projekt.zespolowy.domain.Product;

/**
 * Created by matexo on 22.05.16.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> , QueryDslPredicateExecutor<Product> {
}
