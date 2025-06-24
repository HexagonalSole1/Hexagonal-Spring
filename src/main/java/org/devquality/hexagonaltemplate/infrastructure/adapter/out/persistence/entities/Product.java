package org.devquality.hexagonaltemplate.infrastructure.adapter.out.persistence.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;



@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false,length = 100)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
}
