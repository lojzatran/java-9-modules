package com.commercetools.importer.product;

import com.commercetools.importer.product.impl.Product;

public interface ProductsQueryService {
    Product getProductByKey(String key);

    Product getProductByQuery(String query);
}