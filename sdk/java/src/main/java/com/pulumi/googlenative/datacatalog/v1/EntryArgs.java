// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog.v1.enums.EntryType;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1BusinessContextArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1DatabaseTableSpecArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1FilesetSpecArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1GcsFilesetSpecArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1RoutineSpecArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1SchemaArgs;
import com.pulumi.googlenative.datacatalog.v1.inputs.GoogleCloudDatacatalogV1SystemTimestampsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final EntryArgs Empty = new EntryArgs();

    /**
     * Business Context of the entry. Not supported for BigQuery datasets
     * 
     */
    @Import(name="businessContext")
    private @Nullable Output<GoogleCloudDatacatalogV1BusinessContextArgs> businessContext;

    /**
     * @return Business Context of the entry. Not supported for BigQuery datasets
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1BusinessContextArgs>> businessContext() {
        return Optional.ofNullable(this.businessContext);
    }

    /**
     * Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
     * 
     */
    @Import(name="dataSourceConnectionSpec")
    private @Nullable Output<GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs> dataSourceConnectionSpec;

    /**
     * @return Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs>> dataSourceConnectionSpec() {
        return Optional.ofNullable(this.dataSourceConnectionSpec);
    }

    /**
     * Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
     * 
     */
    @Import(name="databaseTableSpec")
    private @Nullable Output<GoogleCloudDatacatalogV1DatabaseTableSpecArgs> databaseTableSpec;

    /**
     * @return Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1DatabaseTableSpecArgs>> databaseTableSpec() {
        return Optional.ofNullable(this.databaseTableSpec);
    }

    /**
     * Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum size is 200 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum size is 200 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="entryGroupId", required=true)
    private Output<String> entryGroupId;

    public Output<String> entryGroupId() {
        return this.entryGroupId;
    }

    /**
     * Required. The ID of the entry to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), and underscores (_). The maximum size is 64 bytes when encoded in UTF-8.
     * 
     */
    @Import(name="entryId", required=true)
    private Output<String> entryId;

    /**
     * @return Required. The ID of the entry to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), and underscores (_). The maximum size is 64 bytes when encoded in UTF-8.
     * 
     */
    public Output<String> entryId() {
        return this.entryId;
    }

    /**
     * Specification that applies to a fileset resource. Valid only for entries with the `FILESET` type.
     * 
     */
    @Import(name="filesetSpec")
    private @Nullable Output<GoogleCloudDatacatalogV1FilesetSpecArgs> filesetSpec;

    /**
     * @return Specification that applies to a fileset resource. Valid only for entries with the `FILESET` type.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1FilesetSpecArgs>> filesetSpec() {
        return Optional.ofNullable(this.filesetSpec);
    }

    /**
     * Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
     * 
     */
    @Import(name="fullyQualifiedName")
    private @Nullable Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
     * 
     */
    public Optional<Output<String>> fullyQualifiedName() {
        return Optional.ofNullable(this.fullyQualifiedName);
    }

    /**
     * Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type.
     * 
     */
    @Import(name="gcsFilesetSpec")
    private @Nullable Output<GoogleCloudDatacatalogV1GcsFilesetSpecArgs> gcsFilesetSpec;

    /**
     * @return Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1GcsFilesetSpecArgs>> gcsFilesetSpec() {
        return Optional.ofNullable(this.gcsFilesetSpec);
    }

    /**
     * Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the source system.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the source system.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.), colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
     * 
     */
    @Import(name="linkedResource")
    private @Nullable Output<String> linkedResource;

    /**
     * @return The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.), colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
     * 
     */
    public Optional<Output<String>> linkedResource() {
        return Optional.ofNullable(this.linkedResource);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type.
     * 
     */
    @Import(name="routineSpec")
    private @Nullable Output<GoogleCloudDatacatalogV1RoutineSpecArgs> routineSpec;

    /**
     * @return Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1RoutineSpecArgs>> routineSpec() {
        return Optional.ofNullable(this.routineSpec);
    }

    /**
     * Schema of the entry. An entry might not have any schema attached to it.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<GoogleCloudDatacatalogV1SchemaArgs> schema;

    /**
     * @return Schema of the entry. An entry might not have any schema attached to it.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1SchemaArgs>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this field is optional and defaults to an empty timestamp.
     * 
     */
    @Import(name="sourceSystemTimestamps")
    private @Nullable Output<GoogleCloudDatacatalogV1SystemTimestampsArgs> sourceSystemTimestamps;

    /**
     * @return Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this field is optional and defaults to an empty timestamp.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1SystemTimestampsArgs>> sourceSystemTimestamps() {
        return Optional.ofNullable(this.sourceSystemTimestamps);
    }

    /**
     * The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must use the `user_specified_type`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<EntryType> type;

    /**
     * @return The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must use the `user_specified_type`.
     * 
     */
    public Optional<Output<EntryType>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Indicates the entry&#39;s source system that Data Catalog doesn&#39;t automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    @Import(name="userSpecifiedSystem")
    private @Nullable Output<String> userSpecifiedSystem;

    /**
     * @return Indicates the entry&#39;s source system that Data Catalog doesn&#39;t automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    public Optional<Output<String>> userSpecifiedSystem() {
        return Optional.ofNullable(this.userSpecifiedSystem);
    }

    /**
     * Custom entry type that doesn&#39;t match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    @Import(name="userSpecifiedType")
    private @Nullable Output<String> userSpecifiedType;

    /**
     * @return Custom entry type that doesn&#39;t match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    public Optional<Output<String>> userSpecifiedType() {
        return Optional.ofNullable(this.userSpecifiedType);
    }

    private EntryArgs() {}

    private EntryArgs(EntryArgs $) {
        this.businessContext = $.businessContext;
        this.dataSourceConnectionSpec = $.dataSourceConnectionSpec;
        this.databaseTableSpec = $.databaseTableSpec;
        this.description = $.description;
        this.displayName = $.displayName;
        this.entryGroupId = $.entryGroupId;
        this.entryId = $.entryId;
        this.filesetSpec = $.filesetSpec;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.gcsFilesetSpec = $.gcsFilesetSpec;
        this.labels = $.labels;
        this.linkedResource = $.linkedResource;
        this.location = $.location;
        this.project = $.project;
        this.routineSpec = $.routineSpec;
        this.schema = $.schema;
        this.sourceSystemTimestamps = $.sourceSystemTimestamps;
        this.type = $.type;
        this.userSpecifiedSystem = $.userSpecifiedSystem;
        this.userSpecifiedType = $.userSpecifiedType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryArgs $;

        public Builder() {
            $ = new EntryArgs();
        }

        public Builder(EntryArgs defaults) {
            $ = new EntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param businessContext Business Context of the entry. Not supported for BigQuery datasets
         * 
         * @return builder
         * 
         */
        public Builder businessContext(@Nullable Output<GoogleCloudDatacatalogV1BusinessContextArgs> businessContext) {
            $.businessContext = businessContext;
            return this;
        }

        /**
         * @param businessContext Business Context of the entry. Not supported for BigQuery datasets
         * 
         * @return builder
         * 
         */
        public Builder businessContext(GoogleCloudDatacatalogV1BusinessContextArgs businessContext) {
            return businessContext(Output.of(businessContext));
        }

        /**
         * @param dataSourceConnectionSpec Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceConnectionSpec(@Nullable Output<GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs> dataSourceConnectionSpec) {
            $.dataSourceConnectionSpec = dataSourceConnectionSpec;
            return this;
        }

        /**
         * @param dataSourceConnectionSpec Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceConnectionSpec(GoogleCloudDatacatalogV1DataSourceConnectionSpecArgs dataSourceConnectionSpec) {
            return dataSourceConnectionSpec(Output.of(dataSourceConnectionSpec));
        }

        /**
         * @param databaseTableSpec Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
         * 
         * @return builder
         * 
         */
        public Builder databaseTableSpec(@Nullable Output<GoogleCloudDatacatalogV1DatabaseTableSpecArgs> databaseTableSpec) {
            $.databaseTableSpec = databaseTableSpec;
            return this;
        }

        /**
         * @param databaseTableSpec Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
         * 
         * @return builder
         * 
         */
        public Builder databaseTableSpec(GoogleCloudDatacatalogV1DatabaseTableSpecArgs databaseTableSpec) {
            return databaseTableSpec(Output.of(databaseTableSpec));
        }

        /**
         * @param description Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum size is 200 bytes when encoded in UTF-8. Default value is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum size is 200 bytes when encoded in UTF-8. Default value is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder entryGroupId(Output<String> entryGroupId) {
            $.entryGroupId = entryGroupId;
            return this;
        }

        public Builder entryGroupId(String entryGroupId) {
            return entryGroupId(Output.of(entryGroupId));
        }

        /**
         * @param entryId Required. The ID of the entry to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), and underscores (_). The maximum size is 64 bytes when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder entryId(Output<String> entryId) {
            $.entryId = entryId;
            return this;
        }

        /**
         * @param entryId Required. The ID of the entry to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), and underscores (_). The maximum size is 64 bytes when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder entryId(String entryId) {
            return entryId(Output.of(entryId));
        }

        /**
         * @param filesetSpec Specification that applies to a fileset resource. Valid only for entries with the `FILESET` type.
         * 
         * @return builder
         * 
         */
        public Builder filesetSpec(@Nullable Output<GoogleCloudDatacatalogV1FilesetSpecArgs> filesetSpec) {
            $.filesetSpec = filesetSpec;
            return this;
        }

        /**
         * @param filesetSpec Specification that applies to a fileset resource. Valid only for entries with the `FILESET` type.
         * 
         * @return builder
         * 
         */
        public Builder filesetSpec(GoogleCloudDatacatalogV1FilesetSpecArgs filesetSpec) {
            return filesetSpec(Output.of(filesetSpec));
        }

        /**
         * @param fullyQualifiedName Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(@Nullable Output<String> fullyQualifiedName) {
            $.fullyQualifiedName = fullyQualifiedName;
            return this;
        }

        /**
         * @param fullyQualifiedName Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(String fullyQualifiedName) {
            return fullyQualifiedName(Output.of(fullyQualifiedName));
        }

        /**
         * @param gcsFilesetSpec Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type.
         * 
         * @return builder
         * 
         */
        public Builder gcsFilesetSpec(@Nullable Output<GoogleCloudDatacatalogV1GcsFilesetSpecArgs> gcsFilesetSpec) {
            $.gcsFilesetSpec = gcsFilesetSpec;
            return this;
        }

        /**
         * @param gcsFilesetSpec Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type.
         * 
         * @return builder
         * 
         */
        public Builder gcsFilesetSpec(GoogleCloudDatacatalogV1GcsFilesetSpecArgs gcsFilesetSpec) {
            return gcsFilesetSpec(Output.of(gcsFilesetSpec));
        }

        /**
         * @param labels Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the source system.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the source system.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param linkedResource The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.), colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder linkedResource(@Nullable Output<String> linkedResource) {
            $.linkedResource = linkedResource;
            return this;
        }

        /**
         * @param linkedResource The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.), colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder linkedResource(String linkedResource) {
            return linkedResource(Output.of(linkedResource));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param routineSpec Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type.
         * 
         * @return builder
         * 
         */
        public Builder routineSpec(@Nullable Output<GoogleCloudDatacatalogV1RoutineSpecArgs> routineSpec) {
            $.routineSpec = routineSpec;
            return this;
        }

        /**
         * @param routineSpec Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type.
         * 
         * @return builder
         * 
         */
        public Builder routineSpec(GoogleCloudDatacatalogV1RoutineSpecArgs routineSpec) {
            return routineSpec(Output.of(routineSpec));
        }

        /**
         * @param schema Schema of the entry. An entry might not have any schema attached to it.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<GoogleCloudDatacatalogV1SchemaArgs> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Schema of the entry. An entry might not have any schema attached to it.
         * 
         * @return builder
         * 
         */
        public Builder schema(GoogleCloudDatacatalogV1SchemaArgs schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param sourceSystemTimestamps Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this field is optional and defaults to an empty timestamp.
         * 
         * @return builder
         * 
         */
        public Builder sourceSystemTimestamps(@Nullable Output<GoogleCloudDatacatalogV1SystemTimestampsArgs> sourceSystemTimestamps) {
            $.sourceSystemTimestamps = sourceSystemTimestamps;
            return this;
        }

        /**
         * @param sourceSystemTimestamps Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this field is optional and defaults to an empty timestamp.
         * 
         * @return builder
         * 
         */
        public Builder sourceSystemTimestamps(GoogleCloudDatacatalogV1SystemTimestampsArgs sourceSystemTimestamps) {
            return sourceSystemTimestamps(Output.of(sourceSystemTimestamps));
        }

        /**
         * @param type The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must use the `user_specified_type`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<EntryType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must use the `user_specified_type`.
         * 
         * @return builder
         * 
         */
        public Builder type(EntryType type) {
            return type(Output.of(type));
        }

        /**
         * @param userSpecifiedSystem Indicates the entry&#39;s source system that Data Catalog doesn&#39;t automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
         * 
         * @return builder
         * 
         */
        public Builder userSpecifiedSystem(@Nullable Output<String> userSpecifiedSystem) {
            $.userSpecifiedSystem = userSpecifiedSystem;
            return this;
        }

        /**
         * @param userSpecifiedSystem Indicates the entry&#39;s source system that Data Catalog doesn&#39;t automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
         * 
         * @return builder
         * 
         */
        public Builder userSpecifiedSystem(String userSpecifiedSystem) {
            return userSpecifiedSystem(Output.of(userSpecifiedSystem));
        }

        /**
         * @param userSpecifiedType Custom entry type that doesn&#39;t match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
         * 
         * @return builder
         * 
         */
        public Builder userSpecifiedType(@Nullable Output<String> userSpecifiedType) {
            $.userSpecifiedType = userSpecifiedType;
            return this;
        }

        /**
         * @param userSpecifiedType Custom entry type that doesn&#39;t match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
         * 
         * @return builder
         * 
         */
        public Builder userSpecifiedType(String userSpecifiedType) {
            return userSpecifiedType(Output.of(userSpecifiedType));
        }

        public EntryArgs build() {
            $.entryGroupId = Objects.requireNonNull($.entryGroupId, "expected parameter 'entryGroupId' to be non-null");
            $.entryId = Objects.requireNonNull($.entryId, "expected parameter 'entryId' to be non-null");
            return $;
        }
    }

}