package com.commercetools.importer;

import com.commercetools.importer.product.ProductsQueryService;
import com.commercetools.importer.product.ProductsQueryServiceImpl;
import com.commercetools.importer.product.impl.Product;

class Main {
    public static void main(String[] args) {
        ProductsQueryService service = new ProductsQueryServiceImpl();
        Product product = service.getProductByKey("test");
        System.out.println(product.getName());
    }
}