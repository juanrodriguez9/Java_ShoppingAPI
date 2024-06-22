package com.shopping.shopping.service;

import com.shopping.shopping.model.Product;
import com.shopping.shopping.model.Purchasing;

import java.util.List;

public interface IPurchasing {

     void addPurchasing(Product product);
     void deletePurchasing(Product product);
     List<Purchasing> listPurchases();
}
