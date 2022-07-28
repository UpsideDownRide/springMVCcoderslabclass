package pl.coderslab.repositories;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Product;
import java.util.Optional;

public interface ProductRepository {
    Optional<Product> get(Long id);
    void add(Product product);
    void update(Product product);
    void remove(Product product);
    Iterable<Product> listAll();
}
