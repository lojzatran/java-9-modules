package com.commercetools.importer.product.projections.impl;

import org.junit.Assert;
import org.junit.Test;

public class ProductProjectionsQueryServiceImplTest {

    @Test
    public void testProtectedMethod() {
        ProductProjectionsQueryServiceImpl service = new ProductProjectionsQueryServiceImpl();
        String result = service.testThisMethod("test");
        Assert.assertEquals("test", result);
    }
}