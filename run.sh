#!/usr/bin/env bash
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/production/domain  src/domain/com/commercetools/importer/domains/Product.java   src/domain/module-info.java

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/production/product-api  src/product-api/com/commercetools/importer/product/ProductsQueryService.java   src/product-api/module-info.java -p out/production/domain

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/production/product-projections-query   src/product-projections-query/main/com/commercetools/importer/product/projections/impl/ProductProjectionsQueryServiceImpl.java src/product-projections-query/main/com/commercetools/importer/product/projections/provider/ProductProjectionsQueryServiceImplProvider.java  src/product-projections-query/module-info.java  -p out/production/product-api:out/production/domain

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/production/product-graphql-query   src/product-graphql-query/com/commercetools/importer/product/graphql/impl/ProductGraphQLQueryServiceImpl.java src/product-graphql-query/module-info.java  -p out/production/product-api:out/production/domain

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -classpath lib/jackson-core-2.9.0.jar -d out/production/runner -p out/production/product-api:out/production/domain:src/runner:mods src/runner/module-info.java src/runner/com/commercetools/importer/Main.java src/runner/com/commercetools/importer/utils/ConfigurationUtils.java src/runner/com/commercetools/importer/utils/ProjectConfiguration.java src/runner/com/commercetools/importer/utils/TenantConfiguration.java

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac --patch-module product.projections.query=src/product-projections-query/test --module-path out/production/product-api:out/production/domain:out/production/product-projections-query:lib --add-modules junit --add-reads product.projections.query=junit -d out-test $(find src/product-projections-query/test -name *.java)

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/java --patch-module product.projections.query=out-test --add-reads product.projections.query=junit --module-path out/production/product-api:out/production/domain:out/production/product-projections-query:lib --add-modules product.projections.query --add-opens product.projections.query/com.commercetools.importer.product.projections.impl=junit -m junit/org.junit.runner.JUnitCore com.commercetools.importer.product.projections.impl.ProductProjectionsQueryServiceImplTest
