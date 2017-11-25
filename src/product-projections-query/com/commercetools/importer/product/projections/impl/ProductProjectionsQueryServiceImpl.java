package com.commercetools.importer.product.projections.impl;

import com.commercetools.importer.domains.Product;
import com.commercetools.importer.product.ProductsQueryService;

/**
 * TODO: add class description
 */
public class ProductProjectionsQueryServiceImpl implements ProductsQueryService {

    @Override
    public Product getProductByKey(String key) {
        return new Product("product " +  key + " from ProductsProjections endpoint");
    }

    @Override
    public Product getProductByQuery(String query) {
        return null;
    }
}