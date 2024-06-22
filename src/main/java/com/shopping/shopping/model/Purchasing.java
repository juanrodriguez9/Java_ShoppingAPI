package com.shopping.shopping.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class Purchasing {

    private Product product;
    private int quantity;

    public Purchasing(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
