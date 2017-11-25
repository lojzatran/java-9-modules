package com.commercetools.importer.product.graphql.impl;

import com.commercetools.importer.product.Product;
import com.commercetools.importer.product.ProductsQueryService;

/**
 * TODO: add class description
 */
public class ProductGraphQLQueryServiceImpl implements ProductsQueryService {
    @Override
    public Product getProductByKey(String key) {
        return new Product("product " +  key + " from GraphQL endpoint");
    }

    @Override
    public Product getProductByQuery(String query) {
        return null;
    }
}