package com.commercetools.importer.product.projections.provider;

import com.commercetools.importer.product.projections.impl.ProductProjectionsQueryServiceImpl;

/**
 * TODO: add class description
 */
public class ProductProjectionsQueryServiceImplProvider {
    public static ProductProjectionsQueryServiceImpl provider(){
        System.out.println("calling provider ProductProjectionsQueryServiceImplProvider");
        return new ProductProjectionsQueryServiceImpl();
    }
    
}