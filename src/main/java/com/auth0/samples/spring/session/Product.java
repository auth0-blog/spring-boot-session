package com.auth0.samples.spring.session;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private String description;
    private BigDecimal price;

    public Product(String description, BigDecimal price) {
        this.description = description;
        this.price = price;
    }
}
