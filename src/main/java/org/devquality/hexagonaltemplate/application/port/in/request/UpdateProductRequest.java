package org.devquality.hexagonaltemplate.application.port.in.request;

import lombok.Data;

import java.math.BigDecimal;



@Data
public class UpdateProductRequest {
    private final Long productId;
    private final String name;
    private final BigDecimal price;

    public UpdateProductRequest(Long productId, String name, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }



}
