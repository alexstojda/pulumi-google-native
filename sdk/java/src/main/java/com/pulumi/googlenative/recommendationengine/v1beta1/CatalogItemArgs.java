// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recommendationengine.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.recommendationengine.v1beta1.inputs.GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs;
import com.pulumi.googlenative.recommendationengine.v1beta1.inputs.GoogleCloudRecommendationengineV1beta1FeatureMapArgs;
import com.pulumi.googlenative.recommendationengine.v1beta1.inputs.GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogItemArgs Empty = new CatalogItemArgs();

    @Import(name="catalogId", required=true)
    private Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId;
    }

    /**
     * Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both [&#34;Shoes &amp; Accessories&#34; -&gt; &#34;Shoes&#34;] and [&#34;Sports &amp; Fitness&#34; -&gt; &#34;Athletic Clothing&#34; -&gt; &#34;Shoes&#34;], it could be represented as: &#34;categoryHierarchies&#34;: [ { &#34;categories&#34;: [&#34;Shoes &amp; Accessories&#34;, &#34;Shoes&#34;]}, { &#34;categories&#34;: [&#34;Sports &amp; Fitness&#34;, &#34;Athletic Clothing&#34;, &#34;Shoes&#34;] } ]
     * 
     */
    @Import(name="categoryHierarchies", required=true)
    private Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies;

    /**
     * @return Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both [&#34;Shoes &amp; Accessories&#34; -&gt; &#34;Shoes&#34;] and [&#34;Sports &amp; Fitness&#34; -&gt; &#34;Athletic Clothing&#34; -&gt; &#34;Shoes&#34;], it could be represented as: &#34;categoryHierarchies&#34;: [ { &#34;categories&#34;: [&#34;Shoes &amp; Accessories&#34;, &#34;Shoes&#34;]}, { &#34;categories&#34;: [&#34;Sports &amp; Fitness&#34;, &#34;Athletic Clothing&#34;, &#34;Shoes&#34;] } ]
     * 
     */
    public Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies() {
        return this.categoryHierarchies;
    }

    /**
     * Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This id must be unique among all catalog items within the same catalog. It should also be used when logging user events in order for the user events to be joined with the Catalog.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This id must be unique among all catalog items within the same catalog. It should also be used when logging user events in order for the user events to be joined with the Catalog.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
     * 
     */
    @Import(name="itemAttributes")
    private @Nullable Output<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes;

    /**
     * @return Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
     * 
     */
    public Optional<Output<GoogleCloudRecommendationengineV1beta1FeatureMapArgs>> itemAttributes() {
        return Optional.ofNullable(this.itemAttributes);
    }

    /**
     * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
     * 
     */
    @Import(name="itemGroupId")
    private @Nullable Output<String> itemGroupId;

    /**
     * @return Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
     * 
     */
    public Optional<Output<String>> itemGroupId() {
        return Optional.ofNullable(this.itemGroupId);
    }

    /**
     * Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance.
     * 
     * @deprecated
     * Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance.
     * 
     */
    @Deprecated /* Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance. */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance.
     * 
     * @deprecated
     * Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance.
     * 
     */
    @Deprecated /* Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance. */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. Metadata specific to retail products.
     * 
     */
    @Import(name="productMetadata")
    private @Nullable Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata;

    /**
     * @return Optional. Metadata specific to retail products.
     * 
     */
    public Optional<Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs>> productMetadata() {
        return Optional.ofNullable(this.productMetadata);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    private CatalogItemArgs() {}

    private CatalogItemArgs(CatalogItemArgs $) {
        this.catalogId = $.catalogId;
        this.categoryHierarchies = $.categoryHierarchies;
        this.description = $.description;
        this.id = $.id;
        this.itemAttributes = $.itemAttributes;
        this.itemGroupId = $.itemGroupId;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.productMetadata = $.productMetadata;
        this.project = $.project;
        this.tags = $.tags;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogItemArgs $;

        public Builder() {
            $ = new CatalogItemArgs();
        }

        public Builder(CatalogItemArgs defaults) {
            $ = new CatalogItemArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param categoryHierarchies Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both [&#34;Shoes &amp; Accessories&#34; -&gt; &#34;Shoes&#34;] and [&#34;Sports &amp; Fitness&#34; -&gt; &#34;Athletic Clothing&#34; -&gt; &#34;Shoes&#34;], it could be represented as: &#34;categoryHierarchies&#34;: [ { &#34;categories&#34;: [&#34;Shoes &amp; Accessories&#34;, &#34;Shoes&#34;]}, { &#34;categories&#34;: [&#34;Sports &amp; Fitness&#34;, &#34;Athletic Clothing&#34;, &#34;Shoes&#34;] } ]
         * 
         * @return builder
         * 
         */
        public Builder categoryHierarchies(Output<List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs>> categoryHierarchies) {
            $.categoryHierarchies = categoryHierarchies;
            return this;
        }

        /**
         * @param categoryHierarchies Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both [&#34;Shoes &amp; Accessories&#34; -&gt; &#34;Shoes&#34;] and [&#34;Sports &amp; Fitness&#34; -&gt; &#34;Athletic Clothing&#34; -&gt; &#34;Shoes&#34;], it could be represented as: &#34;categoryHierarchies&#34;: [ { &#34;categories&#34;: [&#34;Shoes &amp; Accessories&#34;, &#34;Shoes&#34;]}, { &#34;categories&#34;: [&#34;Sports &amp; Fitness&#34;, &#34;Athletic Clothing&#34;, &#34;Shoes&#34;] } ]
         * 
         * @return builder
         * 
         */
        public Builder categoryHierarchies(List<GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs> categoryHierarchies) {
            return categoryHierarchies(Output.of(categoryHierarchies));
        }

        /**
         * @param categoryHierarchies Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both [&#34;Shoes &amp; Accessories&#34; -&gt; &#34;Shoes&#34;] and [&#34;Sports &amp; Fitness&#34; -&gt; &#34;Athletic Clothing&#34; -&gt; &#34;Shoes&#34;], it could be represented as: &#34;categoryHierarchies&#34;: [ { &#34;categories&#34;: [&#34;Shoes &amp; Accessories&#34;, &#34;Shoes&#34;]}, { &#34;categories&#34;: [&#34;Sports &amp; Fitness&#34;, &#34;Athletic Clothing&#34;, &#34;Shoes&#34;] } ]
         * 
         * @return builder
         * 
         */
        public Builder categoryHierarchies(GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyArgs... categoryHierarchies) {
            return categoryHierarchies(List.of(categoryHierarchies));
        }

        /**
         * @param description Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param id Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This id must be unique among all catalog items within the same catalog. It should also be used when logging user events in order for the user events to be joined with the Catalog.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This id must be unique among all catalog items within the same catalog. It should also be used when logging user events in order for the user events to be joined with the Catalog.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param itemAttributes Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
         * 
         * @return builder
         * 
         */
        public Builder itemAttributes(@Nullable Output<GoogleCloudRecommendationengineV1beta1FeatureMapArgs> itemAttributes) {
            $.itemAttributes = itemAttributes;
            return this;
        }

        /**
         * @param itemAttributes Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
         * 
         * @return builder
         * 
         */
        public Builder itemAttributes(GoogleCloudRecommendationengineV1beta1FeatureMapArgs itemAttributes) {
            return itemAttributes(Output.of(itemAttributes));
        }

        /**
         * @param itemGroupId Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
         * 
         * @return builder
         * 
         */
        public Builder itemGroupId(@Nullable Output<String> itemGroupId) {
            $.itemGroupId = itemGroupId;
            return this;
        }

        /**
         * @param itemGroupId Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
         * 
         * @return builder
         * 
         */
        public Builder itemGroupId(String itemGroupId) {
            return itemGroupId(Output.of(itemGroupId));
        }

        /**
         * @param languageCode Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance.
         * 
         * @return builder
         * 
         * @deprecated
         * Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance.
         * 
         */
        @Deprecated /* Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance. */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance.
         * 
         * @return builder
         * 
         * @deprecated
         * Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance.
         * 
         */
        @Deprecated /* Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance. */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param productMetadata Optional. Metadata specific to retail products.
         * 
         * @return builder
         * 
         */
        public Builder productMetadata(@Nullable Output<GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs> productMetadata) {
            $.productMetadata = productMetadata;
            return this;
        }

        /**
         * @param productMetadata Optional. Metadata specific to retail products.
         * 
         * @return builder
         * 
         */
        public Builder productMetadata(GoogleCloudRecommendationengineV1beta1ProductCatalogItemArgs productMetadata) {
            return productMetadata(Output.of(productMetadata));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param tags Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param title Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public CatalogItemArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.categoryHierarchies = Objects.requireNonNull($.categoryHierarchies, "expected parameter 'categoryHierarchies' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}