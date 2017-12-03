package com.commercetools.importer;

import com.commercetools.importer.domains.Product;
import com.commercetools.importer.product.ProductsQueryService;

import java.io.IOException;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

class Main {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getGlobal();
        logger.log(Level.INFO, "Starting the importer module");

        ServiceLoader<ProductsQueryService> serviceLoader = ServiceLoader.load(ProductsQueryService.class);
        serviceLoader.forEach(productsQueryService -> {
            Product product = productsQueryService.getProductByKey("testKey");
            logger.log(Level.INFO, product.getName());
        });
    }
}