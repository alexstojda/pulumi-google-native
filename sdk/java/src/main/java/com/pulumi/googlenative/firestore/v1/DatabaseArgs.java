// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.firestore.v1.enums.DatabaseAppEngineIntegrationMode;
import com.pulumi.googlenative.firestore.v1.enums.DatabaseConcurrencyMode;
import com.pulumi.googlenative.firestore.v1.enums.DatabaseType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * The App Engine integration mode to use for this database.
     * 
     */
    @Import(name="appEngineIntegrationMode")
    private @Nullable Output<DatabaseAppEngineIntegrationMode> appEngineIntegrationMode;

    /**
     * @return The App Engine integration mode to use for this database.
     * 
     */
    public Optional<Output<DatabaseAppEngineIntegrationMode>> appEngineIntegrationMode() {
        return Optional.ofNullable(this.appEngineIntegrationMode);
    }

    /**
     * The concurrency control mode to use for this database.
     * 
     */
    @Import(name="concurrencyMode")
    private @Nullable Output<DatabaseConcurrencyMode> concurrencyMode;

    /**
     * @return The concurrency control mode to use for this database.
     * 
     */
    public Optional<Output<DatabaseConcurrencyMode>> concurrencyMode() {
        return Optional.ofNullable(this.concurrencyMode);
    }

    /**
     * Required. The ID to use for the database, which will become the final component of the database&#39;s resource name. This value should be 4-63 characters. Valid characters are /a-z-/ with first character a letter and the last a letter or a number. Must not be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/. &#34;(default)&#34; database id is also valid.
     * 
     */
    @Import(name="databaseId", required=true)
    private Output<String> databaseId;

    /**
     * @return Required. The ID to use for the database, which will become the final component of the database&#39;s resource name. This value should be 4-63 characters. Valid characters are /a-z-/ with first character a letter and the last a letter or a number. Must not be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/. &#34;(default)&#34; database id is also valid.
     * 
     */
    public Output<String> databaseId() {
        return this.databaseId;
    }

    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The location of the database. Available databases are listed at https://cloud.google.com/firestore/docs/locations.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the database. Available databases are listed at https://cloud.google.com/firestore/docs/locations.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the Database. Format: `projects/{project}/databases/{database}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the Database. Format: `projects/{project}/databases/{database}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The type of the database. See https://cloud.google.com/datastore/docs/firestore-or-datastore for information about how to choose.
     * 
     */
    @Import(name="type")
    private @Nullable Output<DatabaseType> type;

    /**
     * @return The type of the database. See https://cloud.google.com/datastore/docs/firestore-or-datastore for information about how to choose.
     * 
     */
    public Optional<Output<DatabaseType>> type() {
        return Optional.ofNullable(this.type);
    }

    private DatabaseArgs() {}

    private DatabaseArgs(DatabaseArgs $) {
        this.appEngineIntegrationMode = $.appEngineIntegrationMode;
        this.concurrencyMode = $.concurrencyMode;
        this.databaseId = $.databaseId;
        this.etag = $.etag;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseArgs $;

        public Builder() {
            $ = new DatabaseArgs();
        }

        public Builder(DatabaseArgs defaults) {
            $ = new DatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appEngineIntegrationMode The App Engine integration mode to use for this database.
         * 
         * @return builder
         * 
         */
        public Builder appEngineIntegrationMode(@Nullable Output<DatabaseAppEngineIntegrationMode> appEngineIntegrationMode) {
            $.appEngineIntegrationMode = appEngineIntegrationMode;
            return this;
        }

        /**
         * @param appEngineIntegrationMode The App Engine integration mode to use for this database.
         * 
         * @return builder
         * 
         */
        public Builder appEngineIntegrationMode(DatabaseAppEngineIntegrationMode appEngineIntegrationMode) {
            return appEngineIntegrationMode(Output.of(appEngineIntegrationMode));
        }

        /**
         * @param concurrencyMode The concurrency control mode to use for this database.
         * 
         * @return builder
         * 
         */
        public Builder concurrencyMode(@Nullable Output<DatabaseConcurrencyMode> concurrencyMode) {
            $.concurrencyMode = concurrencyMode;
            return this;
        }

        /**
         * @param concurrencyMode The concurrency control mode to use for this database.
         * 
         * @return builder
         * 
         */
        public Builder concurrencyMode(DatabaseConcurrencyMode concurrencyMode) {
            return concurrencyMode(Output.of(concurrencyMode));
        }

        /**
         * @param databaseId Required. The ID to use for the database, which will become the final component of the database&#39;s resource name. This value should be 4-63 characters. Valid characters are /a-z-/ with first character a letter and the last a letter or a number. Must not be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/. &#34;(default)&#34; database id is also valid.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId Required. The ID to use for the database, which will become the final component of the database&#39;s resource name. This value should be 4-63 characters. Valid characters are /a-z-/ with first character a letter and the last a letter or a number. Must not be UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/. &#34;(default)&#34; database id is also valid.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param etag This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param location The location of the database. Available databases are listed at https://cloud.google.com/firestore/docs/locations.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the database. Available databases are listed at https://cloud.google.com/firestore/docs/locations.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the Database. Format: `projects/{project}/databases/{database}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the Database. Format: `projects/{project}/databases/{database}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param type The type of the database. See https://cloud.google.com/datastore/docs/firestore-or-datastore for information about how to choose.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<DatabaseType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the database. See https://cloud.google.com/datastore/docs/firestore-or-datastore for information about how to choose.
         * 
         * @return builder
         * 
         */
        public Builder type(DatabaseType type) {
            return type(Output.of(type));
        }

        public DatabaseArgs build() {
            $.databaseId = Objects.requireNonNull($.databaseId, "expected parameter 'databaseId' to be non-null");
            return $;
        }
    }

}