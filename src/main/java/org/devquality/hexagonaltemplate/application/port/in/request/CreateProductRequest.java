package org.devquality.hexagonaltemplate.application.port.in.request;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class CreateProductRequest {

    private String name;

    private BigDecimal price;
}
