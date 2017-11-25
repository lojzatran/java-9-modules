package com.commercetools.importer;

import com.commercetools.importer.domains.Product;
import com.commercetools.importer.product.ProductsQueryService;

import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

class Main {

    public static void main(String[] args) {
        ServiceLoader<ProductsQueryService> serviceLoader = ServiceLoader.load(ProductsQueryService.class);
        serviceLoader.forEach(productsQueryService -> {
            Product product = productsQueryService.getProductByKey("testKey");
            Logger logger = Logger.getGlobal();
            logger.log(Level.INFO, product.getName());
        });


    }
}