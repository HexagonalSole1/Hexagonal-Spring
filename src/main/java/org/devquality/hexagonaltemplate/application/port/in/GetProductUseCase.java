package org.devquality.hexagonaltemplate.application.port.in;

import org.devquality.hexagonaltemplate.application.port.in.request.CreateProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.request.GetProductRequest;
import org.devquality.hexagonaltemplate.application.port.in.response.ProductResponse;

public interface GetProductUseCase {
ProductResponse get(GetProductRequest product);
}
