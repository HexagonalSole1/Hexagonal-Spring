package org.devquality.hexagonaltemplate.application.port.in.request;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;



@Data
public class UpdateProductRequest {

    @NotNull(message = "Product ID cannot be null")
    @Positive(message = "Product ID must be positive")
    private final Long productId;

    @NotBlank(message = "Product name cannot be blank")
    @Size(max = 100, message = "Product name cannot exceed 100 characters")
    private final String name;

    @NotNull(message = "Product price cannot be null")
    @DecimalMin(value = "0.01", message = "Product price must be positive")
    @Digits(integer = 8, fraction = 2, message = "Invalid price format")
    private final BigDecimal price;

    public UpdateProductRequest(Long productId, String name, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}