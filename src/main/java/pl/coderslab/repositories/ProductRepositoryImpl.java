package pl.coderslab.repositories;

import org.springframework.stereotype.Repository;
import pl.coderslab.model.Product;

import java.util.*;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    Map<Long, Product> products = new HashMap<>();

    public Optional<Product> get(Long id){
        return Optional.ofNullable(products.get(id));
    }

    @Override
    public void add(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(Product product) {
        remove(product);
        add(product);
    }

    @Override
    public void remove(Product product) {
        products.remove(product.getId());
    }

    @Override
    public List<Product> listAll() {
        return new ArrayList<>(products.values());
    }
}
