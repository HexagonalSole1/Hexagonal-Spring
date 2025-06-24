package org.devquality.hexagonaltemplate.application.port.in.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    private Long id;
    private String name;
    private BigDecimal price;
    private boolean expensive;

    public static ProductResponse from(org.devquality.hexagonaltemplate.domain.Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.isExpensive()
        );
    }
}
