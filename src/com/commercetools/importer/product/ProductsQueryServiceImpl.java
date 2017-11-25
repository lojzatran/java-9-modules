package com.commercetools.importer.product;

import com.commercetools.importer.product.impl.Product;

/**
 * TODO: add class description
 */
public class ProductsQueryServiceImpl implements ProductsQueryService {

    @Override
    public Product getProductByKey(String key) {
        return new Product("product from ProductsQueryServiceImpl");
    }

    @Override
    public Product getProductByQuery(String query) {
        return null;
    }
}