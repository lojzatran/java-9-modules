package com.commercetools.importer.product;

import com.commercetools.importer.domains.Product;

public interface ProductsQueryService {
    Product getProductByKey(String key);

    Product getProductByQuery(String query);
}