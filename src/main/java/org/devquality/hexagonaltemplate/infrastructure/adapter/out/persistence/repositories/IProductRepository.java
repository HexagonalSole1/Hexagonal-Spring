package org.devquality.hexagonaltemplate.infrastructure.adapter.out.persistence.repositories;

import org.devquality.hexagonaltemplate.infrastructure.adapter.out.persistence.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
