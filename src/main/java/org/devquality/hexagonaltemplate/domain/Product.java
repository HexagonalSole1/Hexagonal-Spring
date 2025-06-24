package org.devquality.hexagonaltemplate.domain;

import java.math.BigDecimal;

public class Product {

    private Long id;
    private String name;

    private BigDecimal price;


    public Product() {
    }

    public Product(BigDecimal price, String name, Long id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }
}
