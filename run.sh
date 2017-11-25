#!/usr/bin/env bash
/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/javac -d out/production/domain  /Users/ltran/Projects/ctp-java-9-modules/src/domain/com/commercetools/importer/domains/Product.java   /Users/ltran/Projects/ctp-java-9-modules/src/domain/module-info.java

/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/javac -d out/production/product-api  /Users/ltran/Projects/ctp-java-9-modules/src/product-api/com/commercetools/importer/product/ProductsQueryService.java   /Users/ltran/Projects/ctp-java-9-modules/src/product-api/module-info.java -p out/production/domain

/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/javac -d out/production/product-projections-query   /Users/ltran/Projects/ctp-java-9-modules/src/product-projections-query/com/commercetools/importer/product/projections/impl/ProductProjectionsQueryServiceImpl.java /Users/ltran/Projects/ctp-java-9-modules/src/product-projections-query/com/commercetools/importer/product/projections/provider/ProductProjectionsQueryServiceImplProvider.java  /Users/ltran/Projects/ctp-java-9-modules/src/product-projections-query/module-info.java  -p out/production/product-api:out/production/domain

/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/javac -d out/production/product-graphql-query   /Users/ltran/Projects/ctp-java-9-modules/src/product-graphql-query/com/commercetools/importer/product/graphql/impl/ProductGraphQLQueryServiceImpl.java /Users/ltran/Projects/ctp-java-9-modules/src/product-graphql-query/module-info.java  -p out/production/product-api:out/production/domain

/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/javac -d out/production/runner /Users/ltran/Projects/ctp-java-9-modules/src/runner/com/commercetools/importer/Main.java -p out/production/product-api:out/production/domain /Users/ltran/Projects/ctp-java-9-modules/src/runner/module-info.java

/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/java -p /Users/ltran/Projects/ctp-java-9-modules/out/production/runner:/Users/ltran/Projects/ctp-java-9-modules/out/production/product-api:runner:/Users/ltran/Projects/ctp-java-9-modules/out/production/product-projections-query:/Users/ltran/Projects/ctp-java-9-modules/out/production/product-graphql-query:out/production/domain -m com.commercetools.importer/com.commercetools.importer.Main
