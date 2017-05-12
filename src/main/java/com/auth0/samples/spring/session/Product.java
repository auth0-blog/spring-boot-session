package com.auth0.samples.spring.session;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Product implements Serializable {
    private String description;
    private BigDecimal price;
    private int oi = 1;

    public Product(String description, BigDecimal price) {
        this.description = description;
        this.price = price;
    }
}
