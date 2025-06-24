package org.devquality.hexagonaltemplate.application.services;

import org.devquality.hexagonaltemplate.application.port.in.CreateProductUseCase;
import org.devquality.hexagonaltemplate.application.port.in.GetProductUseCase;
import org.devquality.hexagonaltemplate.application.port.in.UpdateProductUseCase;
import org.devquality.hexagonaltemplate.application.port.in.request.CreateProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.request.GetProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.request.UpdateProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.response.ProductResponse;
import org.devquality.hexagonaltemplate.application.port.out.ProductRepository;

public class ProductApplicationService implements CreateProductUseCase, GetProductUseCase , UpdateProductUseCase {

    private final ProductRepository productRepository;

    public ProductApplicationService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponse create(CreateProductRequest product) {
        return null;
    }

    @Override
    public ProductResponse get(GetProductRequest product) {
        return null;
    }

    @Override
    public ProductResponse update(UpdateProductRequest product) {
        return null;
    }
}
