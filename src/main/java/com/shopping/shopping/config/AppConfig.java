package com.shopping.shopping.config;

import com.shopping.shopping.service.impl.PurchasingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PurchasingService purchasingService(){
        return new PurchasingService();
    }
}
