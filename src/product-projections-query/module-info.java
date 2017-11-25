module product.projections.query {

    requires product.api;

    provides com.commercetools.importer.product.ProductsQueryService
            with com.commercetools.importer.product.projections.provider.ProductProjectionsQueryServiceImplProvider;
}