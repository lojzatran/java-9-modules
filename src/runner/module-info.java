module com.commercetools.importer {
    requires java.logging;
    requires product.api;
    requires jackson.databind;
    requires jackson.annotations;

    uses com.commercetools.importer.product.ProductsQueryService;
    opens com.commercetools.importer.utils to jackson.databind;
}