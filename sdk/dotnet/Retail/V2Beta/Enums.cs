// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.ComponentModel;
using Pulumi;

namespace Pulumi.GoogleNative.Retail.V2Beta
{
    [EnumType]
    public readonly struct ControlSearchSolutionUseCaseItem : IEquatable<ControlSearchSolutionUseCaseItem>
    {
        private readonly string _value;

        private ControlSearchSolutionUseCaseItem(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// The value when it's unspecified. Defaults to SEARCH.
        /// </summary>
        public static ControlSearchSolutionUseCaseItem SearchSolutionUseCaseUnspecified { get; } = new ControlSearchSolutionUseCaseItem("SEARCH_SOLUTION_USE_CASE_UNSPECIFIED");
        /// <summary>
        /// Search use case. Expects the traffic has a non-empty query.
        /// </summary>
        public static ControlSearchSolutionUseCaseItem SearchSolutionUseCaseSearch { get; } = new ControlSearchSolutionUseCaseItem("SEARCH_SOLUTION_USE_CASE_SEARCH");
        /// <summary>
        /// Browse use case. Expects the traffic has an empty query.
        /// </summary>
        public static ControlSearchSolutionUseCaseItem SearchSolutionUseCaseBrowse { get; } = new ControlSearchSolutionUseCaseItem("SEARCH_SOLUTION_USE_CASE_BROWSE");

        public static bool operator ==(ControlSearchSolutionUseCaseItem left, ControlSearchSolutionUseCaseItem right) => left.Equals(right);
        public static bool operator !=(ControlSearchSolutionUseCaseItem left, ControlSearchSolutionUseCaseItem right) => !left.Equals(right);

        public static explicit operator string(ControlSearchSolutionUseCaseItem value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ControlSearchSolutionUseCaseItem other && Equals(other);
        public bool Equals(ControlSearchSolutionUseCaseItem other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct ControlSolutionTypesItem : IEquatable<ControlSolutionTypesItem>
    {
        private readonly string _value;

        private ControlSolutionTypesItem(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Default value.
        /// </summary>
        public static ControlSolutionTypesItem SolutionTypeUnspecified { get; } = new ControlSolutionTypesItem("SOLUTION_TYPE_UNSPECIFIED");
        /// <summary>
        /// Used for Recommendations AI.
        /// </summary>
        public static ControlSolutionTypesItem SolutionTypeRecommendation { get; } = new ControlSolutionTypesItem("SOLUTION_TYPE_RECOMMENDATION");
        /// <summary>
        /// Used for Retail Search.
        /// </summary>
        public static ControlSolutionTypesItem SolutionTypeSearch { get; } = new ControlSolutionTypesItem("SOLUTION_TYPE_SEARCH");

        public static bool operator ==(ControlSolutionTypesItem left, ControlSolutionTypesItem right) => left.Equals(right);
        public static bool operator !=(ControlSolutionTypesItem left, ControlSolutionTypesItem right) => !left.Equals(right);

        public static explicit operator string(ControlSolutionTypesItem value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ControlSolutionTypesItem other && Equals(other);
        public bool Equals(ControlSolutionTypesItem other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    /// <summary>
    /// Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
    /// </summary>
    [EnumType]
    public readonly struct GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode : IEquatable<GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode>
    {
        private readonly string _value;

        private GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Default value.
        /// </summary>
        public static GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode ModeUnspecified { get; } = new GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode("MODE_UNSPECIFIED");
        /// <summary>
        /// Disable Dynamic Facet.
        /// </summary>
        public static GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode Disabled { get; } = new GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode("DISABLED");
        /// <summary>
        /// Automatic mode built by Google Retail Search.
        /// </summary>
        public static GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode Enabled { get; } = new GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode("ENABLED");

        public static bool operator ==(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode left, GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode right) => left.Equals(right);
        public static bool operator !=(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode left, GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode right) => !left.Equals(right);

        public static explicit operator string(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode other && Equals(other);
        public bool Equals(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpecMode other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    /// <summary>
    /// The online availability of the Product. Default to Availability.IN_STOCK. Corresponding properties: Google Merchant Center property [availability](https://support.google.com/merchants/answer/6324448). Schema.org property [Offer.availability](https://schema.org/availability).
    /// </summary>
    [EnumType]
    public readonly struct ProductAvailability : IEquatable<ProductAvailability>
    {
        private readonly string _value;

        private ProductAvailability(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Default product availability. Default to Availability.IN_STOCK if unset.
        /// </summary>
        public static ProductAvailability AvailabilityUnspecified { get; } = new ProductAvailability("AVAILABILITY_UNSPECIFIED");
        /// <summary>
        /// Product in stock.
        /// </summary>
        public static ProductAvailability InStock { get; } = new ProductAvailability("IN_STOCK");
        /// <summary>
        /// Product out of stock.
        /// </summary>
        public static ProductAvailability OutOfStock { get; } = new ProductAvailability("OUT_OF_STOCK");
        /// <summary>
        /// Product that is in pre-order state.
        /// </summary>
        public static ProductAvailability Preorder { get; } = new ProductAvailability("PREORDER");
        /// <summary>
        /// Product that is back-ordered (i.e. temporarily out of stock).
        /// </summary>
        public static ProductAvailability Backorder { get; } = new ProductAvailability("BACKORDER");

        public static bool operator ==(ProductAvailability left, ProductAvailability right) => left.Equals(right);
        public static bool operator !=(ProductAvailability left, ProductAvailability right) => !left.Equals(right);

        public static explicit operator string(ProductAvailability value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ProductAvailability other && Equals(other);
        public bool Equals(ProductAvailability other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    /// <summary>
    /// Immutable. The type of the product. Default to Catalog.product_level_config.ingestion_product_type if unset.
    /// </summary>
    [EnumType]
    public readonly struct ProductType : IEquatable<ProductType>
    {
        private readonly string _value;

        private ProductType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Default value. Default to Catalog.product_level_config.ingestion_product_type if unset.
        /// </summary>
        public static ProductType TypeUnspecified { get; } = new ProductType("TYPE_UNSPECIFIED");
        /// <summary>
        /// The primary type. As the primary unit for predicting, indexing and search serving, a Type.PRIMARY Product is grouped with multiple Type.VARIANT Products.
        /// </summary>
        public static ProductType Primary { get; } = new ProductType("PRIMARY");
        /// <summary>
        /// The variant type. Type.VARIANT Products usually share some common attributes on the same Type.PRIMARY Products, but they have variant attributes like different colors, sizes and prices, etc.
        /// </summary>
        public static ProductType Variant { get; } = new ProductType("VARIANT");
        /// <summary>
        /// The collection type. Collection products are bundled Type.PRIMARY Products or Type.VARIANT Products that are sold together, such as a jewelry set with necklaces, earrings and rings, etc.
        /// </summary>
        public static ProductType Collection { get; } = new ProductType("COLLECTION");

        public static bool operator ==(ProductType left, ProductType right) => left.Equals(right);
        public static bool operator !=(ProductType left, ProductType right) => !left.Equals(right);

        public static explicit operator string(ProductType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ProductType other && Equals(other);
        public bool Equals(ProductType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct ServingConfigSolutionTypesItem : IEquatable<ServingConfigSolutionTypesItem>
    {
        private readonly string _value;

        private ServingConfigSolutionTypesItem(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Default value.
        /// </summary>
        public static ServingConfigSolutionTypesItem SolutionTypeUnspecified { get; } = new ServingConfigSolutionTypesItem("SOLUTION_TYPE_UNSPECIFIED");
        /// <summary>
        /// Used for Recommendations AI.
        /// </summary>
        public static ServingConfigSolutionTypesItem SolutionTypeRecommendation { get; } = new ServingConfigSolutionTypesItem("SOLUTION_TYPE_RECOMMENDATION");
        /// <summary>
        /// Used for Retail Search.
        /// </summary>
        public static ServingConfigSolutionTypesItem SolutionTypeSearch { get; } = new ServingConfigSolutionTypesItem("SOLUTION_TYPE_SEARCH");

        public static bool operator ==(ServingConfigSolutionTypesItem left, ServingConfigSolutionTypesItem right) => left.Equals(right);
        public static bool operator !=(ServingConfigSolutionTypesItem left, ServingConfigSolutionTypesItem right) => !left.Equals(right);

        public static explicit operator string(ServingConfigSolutionTypesItem value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ServingConfigSolutionTypesItem other && Equals(other);
        public bool Equals(ServingConfigSolutionTypesItem other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }
}