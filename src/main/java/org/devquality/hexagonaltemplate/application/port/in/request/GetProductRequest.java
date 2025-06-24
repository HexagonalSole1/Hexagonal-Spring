package org.devquality.hexagonaltemplate.application.port.in.request;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class GetProductRequest {

    private Long id;
    private String name;

    private BigDecimal price;
}
