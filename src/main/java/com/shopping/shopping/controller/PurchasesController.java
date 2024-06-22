package com.shopping.shopping.controller;

import com.shopping.shopping.model.Product;
import com.shopping.shopping.model.Purchasing;
import com.shopping.shopping.service.IReturnPurchasing;
import com.shopping.shopping.service.impl.PurchasingService;
import com.shopping.shopping.service.impl.ReturnPurchasingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchasesController {

    @Autowired
    private PurchasingService purchasingService;

    @Autowired
    private ReturnPurchasingService returnPurchasingService;

    @PostMapping("/add")
    public void addPurchasing(@RequestBody Product product){
        purchasingService.addPurchasing(product);
    };

    @PostMapping("/delete")
    public void deletePurchasing(@RequestBody Product product){

        purchasingService.deletePurchasing(product);
    };

    @GetMapping("/list")
    public List<Purchasing> listPurchases(PurchasingService purchasingService){
        return purchasingService.listPurchases();
    }



}
