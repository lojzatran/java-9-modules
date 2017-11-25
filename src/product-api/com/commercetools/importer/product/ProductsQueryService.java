package com.commercetools.importer.product;

public interface ProductsQueryService {
    Product getProductByKey(String key);

    Product getProductByQuery(String query);
}