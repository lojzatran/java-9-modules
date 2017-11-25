import com.commercetools.importer.product.graphql.impl.ProductGraphQLQueryServiceImpl;

module product.grapql.query {
    requires product.api;

    provides com.commercetools.importer.product.ProductsQueryService
            with ProductGraphQLQueryServiceImpl;
}