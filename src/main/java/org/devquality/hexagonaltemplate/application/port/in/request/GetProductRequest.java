package org.devquality.hexagonaltemplate.application.port.in.request;

import lombok.Data;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

@Data
public class GetProductRequest {

    @NotNull(message = "Product ID cannot be null")
    @Positive(message = "Product ID must be positive")
    private Long id;

    private String name;
    private BigDecimal price;
}