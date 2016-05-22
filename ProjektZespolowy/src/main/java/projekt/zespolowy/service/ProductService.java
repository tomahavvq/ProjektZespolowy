package projekt.zespolowy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projekt.zespolowy.dao.repository.ProductRepository;
import projekt.zespolowy.domain.Product;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

/**
 * Created by matexo on 22.05.16.
 */
@Service
@Transactional
public class ProductService {

    @Inject
    private ProductRepository productRepository;

    public List<Product> getProductsList()
    {
        return productRepository.findAll();
    }

    public Optional<Product> addProduct(Product product)
    {
        return Optional.of(productRepository.save(product));
    }
}
