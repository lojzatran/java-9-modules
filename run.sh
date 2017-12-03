#!/usr/bin/env bash
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/production/domain  src/domain/com/commercetools/importer/domains/Product.java   src/domain/module-info.java

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/production/product-api  src/product-api/com/commercetools/importer/product/ProductsQueryService.java   src/product-api/module-info.java -p out/production/domain

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/production/product-projections-query   src/product-projections-query/main/com/commercetools/importer/product/projections/impl/ProductProjectionsQueryServiceImpl.java src/product-projections-query/main/com/commercetools/importer/product/projections/provider/ProductProjectionsQueryServiceImplProvider.java  src/product-projections-query/module-info.java  -p out/production/product-api:out/production/domain

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/production/product-graphql-query   src/product-graphql-query/com/commercetools/importer/product/graphql/impl/ProductGraphQLQueryServiceImpl.java src/product-graphql-query/module-info.java  -p out/production/product-api:out/production/domain

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/production/runner -p out/production/product-api:out/production/domain:src/runner:mods src/runner/module-info.java src/runner/com/commercetools/importer/Main.java

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar -cf mods/domains.jar -C out/production/domain .

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar -cf mods/product-api.jar -C out/production/product-api .

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar -cf mods/product-projections.jar -C out/production/product-projections-query .

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar -cf mods/runner.jar  -C out/production/runner .

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jlink --module-path mods/:/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/jmods --add-modules com.commercetools.importer --add-modules product.projections.query --launcher importer=com.commercetools.importer/com.commercetools.importer.Main --output image