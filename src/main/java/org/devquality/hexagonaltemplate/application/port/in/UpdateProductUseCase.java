package org.devquality.hexagonaltemplate.application.port.in;

import org.devquality.hexagonaltemplate.application.port.in.request.UpdateProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.response.ProductResponse;

public interface UpdateProductUseCase {

    ProductResponse update(UpdateProductRequest product);
}
