package org.devquality.hexagonaltemplate.application.services;

import org.devquality.hexagonaltemplate.application.port.in.CreateProductUseCase;
import org.devquality.hexagonaltemplate.application.port.in.GetProductUseCase;
import org.devquality.hexagonaltemplate.application.port.in.UpdateProductUseCase;
import org.devquality.hexagonaltemplate.application.port.in.request.CreateProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.request.GetProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.request.UpdateProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.response.ProductResponse;
import org.devquality.hexagonaltemplate.application.port.out.ProductRepository;
import org.devquality.hexagonaltemplate.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductApplicationService implements CreateProductUseCase, GetProductUseCase, UpdateProductUseCase {

    private final ProductRepository productRepository;

    public ProductApplicationService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponse create(CreateProductRequest request) {
        Product product = new Product(null, request.getName(), request.getPrice());

        Product savedProduct = productRepository.save(product);

        return ProductResponse.from(savedProduct);
    }

    @Override
    public ProductResponse get(GetProductRequest request) {
        Product product = productRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + request.getId()));

        return ProductResponse.from(product);
    }

    @Override
    public ProductResponse update(UpdateProductRequest request) {
        Product existingProduct = productRepository.findById(request.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + request.getProductId()));

        // Update domain object (validation happens in update methods)
        existingProduct.updateName(request.getName());
        existingProduct.updatePrice(request.getPrice());

        // Save updated product
        Product updatedProduct = productRepository.save(existingProduct);

        return ProductResponse.from(updatedProduct);
    }
}