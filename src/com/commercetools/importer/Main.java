package com.commercetools.importer;

import com.commercetools.importer.product.ProductsQueryService;
import com.commercetools.importer.product.ProductsQueryServiceImpl;
import com.commercetools.importer.product.impl.Product;

import java.util.logging.Level;
import java.util.logging.Logger;

class Main {

    public static void main(String[] args) {
        ProductsQueryService service = new ProductsQueryServiceImpl();
        Product product = service.getProductByKey("test");
        Logger logger = Logger.getGlobal();
        logger.log(Level.INFO, product.getName());
    }
}