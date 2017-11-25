/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/javac -d out/ctp-java-9-modules /Users/ltran/Projects/ctp-java-9-modules/src/com/commercetools/importer/Main.java /Users/ltran/Projects/ctp-java-9-modules/src/com/commercetools/importer/product/ProductsQueryServiceImpl.java /Users/ltran/Projects/ctp-java-9-modules/src/com/commercetools/importer/product/ProductsQueryService.java /Users/ltran/Projects/ctp-java-9-modules/src/com/commercetools/importer/product/impl/Product.java /Users/ltran/Projects/ctp-java-9-modules/src/module-info.java

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/java --module-path /Users/ltran/Projects/ctp-java-9-modules/out/ctp-java-9-modules --module com.commercetools.importer/com.commercetools.importer.Main

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar -cfe mods/ctp-java-9-modules.jar com.commercetools.importer.Main -C out/ctp-java-9-modules .

/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/java -jar mods/ctp-java-9-modules.jar

