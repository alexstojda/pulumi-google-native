// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog.v1.enums.GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Column info specific to Looker System.
 * 
 */
public final class GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs Empty = new GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs();

    /**
     * Looker specific column type of this column.
     * 
     */
    @Import(name="type")
    private @Nullable Output<GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecType> type;

    /**
     * @return Looker specific column type of this column.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecType>> type() {
        return Optional.ofNullable(this.type);
    }

    private GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs() {}

    private GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs(GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs();
        }

        public Builder(GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs defaults) {
            $ = new GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Looker specific column type of this column.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Looker specific column type of this column.
         * 
         * @return builder
         * 
         */
        public Builder type(GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecType type) {
            return type(Output.of(type));
        }

        public GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs build() {
            return $;
        }
    }

}