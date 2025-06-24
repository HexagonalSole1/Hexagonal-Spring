package org.devquality.hexagonaltemplate.application.port.in;

import org.devquality.hexagonaltemplate.application.port.in.request.CreateProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.response.ProductResponse;
import org.devquality.hexagonaltemplate.domain.Product;

public interface CreateProductUseCase {


    ProductResponse create(CreateProductRequest product);
}
