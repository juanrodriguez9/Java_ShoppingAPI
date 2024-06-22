package com.shopping.shopping.service.impl;

import com.shopping.shopping.model.Product;
import com.shopping.shopping.model.Purchasing;
import com.shopping.shopping.service.IPurchasing;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchasingService implements IPurchasing {

    private List<Purchasing> purchases = new ArrayList<>();

    @Override
    public void addPurchasing(Product product) {
        purchases.add(new Purchasing(product, 1));
    };

    @Override
    public void deletePurchasing(Product product) {
        purchases.removeIf(purchasing -> purchasing.getProduct().equals(product) );
    };

    @Override
    public List<Purchasing> listPurchases(){
        return purchases;
    };

}
