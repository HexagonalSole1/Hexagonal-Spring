package org.devquality.hexagonaltemplate.infrastructure.adapter.out.persistence;

import org.devquality.hexagonaltemplate.application.port.out.ProductRepository;
import org.devquality.hexagonaltemplate.domain.Product;
import org.devquality.hexagonaltemplate.infrastructure.adapter.out.persistence.repositories.IProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductPersistenceAdapter implements ProductRepository {

    private final IProductRepository jpaRepository;

    public ProductPersistenceAdapter(IProductRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    // Implementar todos los métodos usando jpaRepository y mapper
}

