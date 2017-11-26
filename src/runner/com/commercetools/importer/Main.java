package com.commercetools.importer;

import com.commercetools.importer.domains.Product;
import com.commercetools.importer.product.ProductsQueryService;
import com.commercetools.importer.utils.ConfigurationUtils;
import com.commercetools.importer.utils.ProjectConfiguration;

import java.io.IOException;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

class Main {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getGlobal();
        Optional<ProjectConfiguration> configuration = ConfigurationUtils.getConfiguration("/Users/ltran/Projects/ctp-java-9-modules/src/runner/com/commercetools/importer/config.json");

        logger.log(Level.INFO, "config is " + configuration.get().toString());

        ServiceLoader<ProductsQueryService> serviceLoader = ServiceLoader.load(ProductsQueryService.class);
        serviceLoader.forEach(productsQueryService -> {
            Product product = productsQueryService.getProductByKey("testKey");
            logger.log(Level.INFO, product.getName());
        });


    }
}