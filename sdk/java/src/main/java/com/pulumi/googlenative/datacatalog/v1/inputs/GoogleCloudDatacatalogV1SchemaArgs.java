// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1ColumnSchemaArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a schema, for example, a BigQuery, GoogleSQL, or Avro schema.
 * 
 */
public final class GoogleCloudDatacatalogV1SchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1SchemaArgs Empty = new GoogleCloudDatacatalogV1SchemaArgs();

    /**
     * The unified GoogleSQL-like schema of columns. The overall maximum number of columns and nested columns is 10,000. The maximum nested depth is 15 levels.
     * 
     */
    @Import(name="columns")
    private @Nullable Output<List<GoogleCloudDatacatalogV1ColumnSchemaArgs>> columns;

    /**
     * @return The unified GoogleSQL-like schema of columns. The overall maximum number of columns and nested columns is 10,000. The maximum nested depth is 15 levels.
     * 
     */
    public Optional<Output<List<GoogleCloudDatacatalogV1ColumnSchemaArgs>>> columns() {
        return Optional.ofNullable(this.columns);
    }

    private GoogleCloudDatacatalogV1SchemaArgs() {}

    private GoogleCloudDatacatalogV1SchemaArgs(GoogleCloudDatacatalogV1SchemaArgs $) {
        this.columns = $.columns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1SchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1SchemaArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1SchemaArgs();
        }

        public Builder(GoogleCloudDatacatalogV1SchemaArgs defaults) {
            $ = new GoogleCloudDatacatalogV1SchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columns The unified GoogleSQL-like schema of columns. The overall maximum number of columns and nested columns is 10,000. The maximum nested depth is 15 levels.
         * 
         * @return builder
         * 
         */
        public Builder columns(@Nullable Output<List<GoogleCloudDatacatalogV1ColumnSchemaArgs>> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns The unified GoogleSQL-like schema of columns. The overall maximum number of columns and nested columns is 10,000. The maximum nested depth is 15 levels.
         * 
         * @return builder
         * 
         */
        public Builder columns(List<GoogleCloudDatacatalogV1ColumnSchemaArgs> columns) {
            return columns(Output.of(columns));
        }

        /**
         * @param columns The unified GoogleSQL-like schema of columns. The overall maximum number of columns and nested columns is 10,000. The maximum nested depth is 15 levels.
         * 
         * @return builder
         * 
         */
        public Builder columns(GoogleCloudDatacatalogV1ColumnSchemaArgs... columns) {
            return columns(List.of(columns));
        }

        public GoogleCloudDatacatalogV1SchemaArgs build() {
            return $;
        }
    }

}