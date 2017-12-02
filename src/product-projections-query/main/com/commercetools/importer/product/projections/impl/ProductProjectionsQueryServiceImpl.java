package com.commercetools.importer.product.projections.impl;

import com.commercetools.importer.domains.Product;
import com.commercetools.importer.product.ProductsQueryService;

public class ProductProjectionsQueryServiceImpl implements ProductsQueryService {

    @Override
    public Product getProductByKey(String key) {
        return new Product("product " +  key + " from ProductsProjections endpoint");
    }

    protected String testThisMethod(String test) {
        return test;
    }

    @Override
    public Product getProductByQuery(String query) {
        return null;
    }
}