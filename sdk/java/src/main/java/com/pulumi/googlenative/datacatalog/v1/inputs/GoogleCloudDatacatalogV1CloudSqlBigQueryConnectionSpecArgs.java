// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog.v1.enums.GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification for the BigQuery connection to a Cloud SQL instance.
 * 
 */
public final class GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs Empty = new GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs();

    /**
     * Database name.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Database name.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Cloud SQL instance ID in the format of `project:location:instance`.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Cloud SQL instance ID in the format of `project:location:instance`.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Type of the Cloud SQL database.
     * 
     */
    @Import(name="type")
    private @Nullable Output<GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecType> type;

    /**
     * @return Type of the Cloud SQL database.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecType>> type() {
        return Optional.ofNullable(this.type);
    }

    private GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs() {}

    private GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs $) {
        this.database = $.database;
        this.instanceId = $.instanceId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs();
        }

        public Builder(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs defaults) {
            $ = new GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Database name.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Database name.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param instanceId Cloud SQL instance ID in the format of `project:location:instance`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Cloud SQL instance ID in the format of `project:location:instance`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param type Type of the Cloud SQL database.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the Cloud SQL database.
         * 
         * @return builder
         * 
         */
        public Builder type(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecType type) {
            return type(Output.of(type));
        }

        public GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecArgs build() {
            return $;
        }
    }

}