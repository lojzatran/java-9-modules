#!/usr/bin/env bash
/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/javac -d out/production/product /Users/ltran/Projects/ctp-java-9-modules/src/product/com/commercetools/importer/product/impl/ProductsQueryServiceImpl.java /Users/ltran/Projects/ctp-java-9-modules/src/product/com/commercetools/importer/product/ProductsQueryService.java /Users/ltran/Projects/ctp-java-9-modules/src/product/com/commercetools/importer/product/impl/Product.java  /Users/ltran/Projects/ctp-java-9-modules/src/product/module-info.java

/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/javac -d out/production/runner /Users/ltran/Projects/ctp-java-9-modules/src/runner/com/commercetools/importer/Main.java --module-path out/production/product /Users/ltran/Projects/ctp-java-9-modules/src/runner/module-info.java

/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/java -p /Users/ltran/Projects/ctp-java-9-modules/out/production/runner:/Users/ltran/Projects/ctp-java-9-modules/out/production/product -m com.commercetools.importer/com.commercetools.importer.Main
