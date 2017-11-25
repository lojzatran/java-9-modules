package com.commercetools.importer.product.provider;

import com.commercetools.importer.product.impl.ProductProjectionsQueryServiceImpl;

/**
 * TODO: add class description
 */
public class ProductProjectionsQueryServiceImplProvider {
    public static ProductProjectionsQueryServiceImpl provider(){
        System.out.println("calling provider ProductProjectionsQueryServiceImplProvider");
        return new ProductProjectionsQueryServiceImpl();
    }
    
}