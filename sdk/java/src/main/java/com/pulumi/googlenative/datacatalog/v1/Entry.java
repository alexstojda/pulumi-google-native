// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datacatalog.v1.EntryArgs;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1BigQueryTableSpecResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1BusinessContextResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1DataSourceResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1DatabaseTableSpecResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1FilesetSpecResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1GcsFilesetSpecResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1PersonalDetailsResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1RoutineSpecResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1SchemaResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1SystemTimestampsResponse;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1UsageSignalResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an entry. You can create entries only with &#39;FILESET&#39;, &#39;CLUSTER&#39;, &#39;DATA_STREAM&#39;, or custom types. Data Catalog automatically creates entries with other types during metadata ingestion from integrated systems. You must enable the Data Catalog API in the project identified by the `parent` parameter. For more information, see [Data Catalog resource project](https://cloud.google.com/data-catalog/docs/concepts/resource-project). An entry group can have a maximum of 100,000 entries.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datacatalog/v1:Entry")
public class Entry extends com.pulumi.resources.CustomResource {
    /**
     * Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name pattern. For more information, see [Introduction to partitioned tables] (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
     * 
     */
    @Export(name="bigqueryDateShardedSpec", type=GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse> bigqueryDateShardedSpec;

    /**
     * @return Specification for a group of BigQuery tables with the `[prefix]YYYYMMDD` name pattern. For more information, see [Introduction to partitioned tables] (https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding).
     * 
     */
    public Output<GoogleCloudDatacatalogV1BigQueryDateShardedSpecResponse> bigqueryDateShardedSpec() {
        return this.bigqueryDateShardedSpec;
    }
    /**
     * Specification that applies to a BigQuery table. Valid only for entries with the `TABLE` type.
     * 
     */
    @Export(name="bigqueryTableSpec", type=GoogleCloudDatacatalogV1BigQueryTableSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1BigQueryTableSpecResponse> bigqueryTableSpec;

    /**
     * @return Specification that applies to a BigQuery table. Valid only for entries with the `TABLE` type.
     * 
     */
    public Output<GoogleCloudDatacatalogV1BigQueryTableSpecResponse> bigqueryTableSpec() {
        return this.bigqueryTableSpec;
    }
    /**
     * Business Context of the entry. Not supported for BigQuery datasets
     * 
     */
    @Export(name="businessContext", type=GoogleCloudDatacatalogV1BusinessContextResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1BusinessContextResponse> businessContext;

    /**
     * @return Business Context of the entry. Not supported for BigQuery datasets
     * 
     */
    public Output<GoogleCloudDatacatalogV1BusinessContextResponse> businessContext() {
        return this.businessContext;
    }
    /**
     * Physical location of the entry.
     * 
     */
    @Export(name="dataSource", type=GoogleCloudDatacatalogV1DataSourceResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1DataSourceResponse> dataSource;

    /**
     * @return Physical location of the entry.
     * 
     */
    public Output<GoogleCloudDatacatalogV1DataSourceResponse> dataSource() {
        return this.dataSource;
    }
    /**
     * Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
     * 
     */
    @Export(name="dataSourceConnectionSpec", type=GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse> dataSourceConnectionSpec;

    /**
     * @return Specification that applies to a data source connection. Valid only for entries with the `DATA_SOURCE_CONNECTION` type.
     * 
     */
    public Output<GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse> dataSourceConnectionSpec() {
        return this.dataSourceConnectionSpec;
    }
    /**
     * Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
     * 
     */
    @Export(name="databaseTableSpec", type=GoogleCloudDatacatalogV1DatabaseTableSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1DatabaseTableSpecResponse> databaseTableSpec;

    /**
     * @return Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
     * 
     */
    public Output<GoogleCloudDatacatalogV1DatabaseTableSpecResponse> databaseTableSpec() {
        return this.databaseTableSpec;
    }
    /**
     * Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Entry description that can consist of several sentences or paragraphs that describe entry contents. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). The maximum size is 2000 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum size is 200 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name of an entry. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum size is 200 bytes when encoded in UTF-8. Default value is an empty string.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    @Export(name="entryGroupId", type=String.class, parameters={})
    private Output<String> entryGroupId;

    public Output<String> entryGroupId() {
        return this.entryGroupId;
    }
    /**
     * Required. The ID of the entry to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), and underscores (_). The maximum size is 64 bytes when encoded in UTF-8.
     * 
     */
    @Export(name="entryId", type=String.class, parameters={})
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
    @Export(name="filesetSpec", type=GoogleCloudDatacatalogV1FilesetSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1FilesetSpecResponse> filesetSpec;

    /**
     * @return Specification that applies to a fileset resource. Valid only for entries with the `FILESET` type.
     * 
     */
    public Output<GoogleCloudDatacatalogV1FilesetSpecResponse> filesetSpec() {
        return this.filesetSpec;
    }
    /**
     * Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
     * 
     */
    @Export(name="fullyQualifiedName", type=String.class, parameters={})
    private Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name (FQN) of the resource. Set automatically for entries representing resources from synced systems. Settable only during creation and read-only afterwards. Can be used for search and lookup of the entries. FQNs take two forms: * For non-regionalized resources: `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` * For regionalized resources: `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID}.{LOCATION_ID}.{INSTANCE_ID}.{DATABASE_ID}.{TABLE_ID}`
     * 
     */
    public Output<String> fullyQualifiedName() {
        return this.fullyQualifiedName;
    }
    /**
     * Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type.
     * 
     */
    @Export(name="gcsFilesetSpec", type=GoogleCloudDatacatalogV1GcsFilesetSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1GcsFilesetSpecResponse> gcsFilesetSpec;

    /**
     * @return Specification that applies to a Cloud Storage fileset. Valid only for entries with the `FILESET` type.
     * 
     */
    public Output<GoogleCloudDatacatalogV1GcsFilesetSpecResponse> gcsFilesetSpec() {
        return this.gcsFilesetSpec;
    }
    /**
     * Indicates the entry&#39;s source system that Data Catalog integrates with, such as BigQuery, Pub/Sub, or Dataproc Metastore.
     * 
     */
    @Export(name="integratedSystem", type=String.class, parameters={})
    private Output<String> integratedSystem;

    /**
     * @return Indicates the entry&#39;s source system that Data Catalog integrates with, such as BigQuery, Pub/Sub, or Dataproc Metastore.
     * 
     */
    public Output<String> integratedSystem() {
        return this.integratedSystem;
    }
    /**
     * Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the source system.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Cloud labels attached to the entry. In Data Catalog, you can create and modify labels attached only to custom entries. Synced entries have unmodifiable labels that come from the source system.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.), colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
     * 
     */
    @Export(name="linkedResource", type=String.class, parameters={})
    private Output<String> linkedResource;

    /**
     * @return The resource this metadata entry refers to. For Google Cloud Platform resources, `linked_resource` is the [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). For example, the `linked_resource` for a table resource from BigQuery is: `//bigquery.googleapis.com/projects/{PROJECT_ID}/datasets/{DATASET_ID}/tables/{TABLE_ID}` Output only when the entry is one of the types in the `EntryType` enum. For entries with a `user_specified_type`, this field is optional and defaults to an empty string. The resource string must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), periods (.), colons (:), slashes (/), dashes (-), and hashes (#). The maximum size is 200 bytes when encoded in UTF-8.
     * 
     */
    public Output<String> linkedResource() {
        return this.linkedResource;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of an entry in URL format. Note: The entry itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of an entry in URL format. Note: The entry itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Additional information related to the entry. Private to the current user.
     * 
     */
    @Export(name="personalDetails", type=GoogleCloudDatacatalogV1PersonalDetailsResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1PersonalDetailsResponse> personalDetails;

    /**
     * @return Additional information related to the entry. Private to the current user.
     * 
     */
    public Output<GoogleCloudDatacatalogV1PersonalDetailsResponse> personalDetails() {
        return this.personalDetails;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type.
     * 
     */
    @Export(name="routineSpec", type=GoogleCloudDatacatalogV1RoutineSpecResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1RoutineSpecResponse> routineSpec;

    /**
     * @return Specification that applies to a user-defined function or procedure. Valid only for entries with the `ROUTINE` type.
     * 
     */
    public Output<GoogleCloudDatacatalogV1RoutineSpecResponse> routineSpec() {
        return this.routineSpec;
    }
    /**
     * Schema of the entry. An entry might not have any schema attached to it.
     * 
     */
    @Export(name="schema", type=GoogleCloudDatacatalogV1SchemaResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1SchemaResponse> schema;

    /**
     * @return Schema of the entry. An entry might not have any schema attached to it.
     * 
     */
    public Output<GoogleCloudDatacatalogV1SchemaResponse> schema() {
        return this.schema;
    }
    /**
     * Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this field is optional and defaults to an empty timestamp.
     * 
     */
    @Export(name="sourceSystemTimestamps", type=GoogleCloudDatacatalogV1SystemTimestampsResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1SystemTimestampsResponse> sourceSystemTimestamps;

    /**
     * @return Timestamps from the underlying resource, not from the Data Catalog entry. Output only when the entry has a type listed in the `EntryType` enum. For entries with `user_specified_type`, this field is optional and defaults to an empty timestamp.
     * 
     */
    public Output<GoogleCloudDatacatalogV1SystemTimestampsResponse> sourceSystemTimestamps() {
        return this.sourceSystemTimestamps;
    }
    /**
     * The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must use the `user_specified_type`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the entry. Only used for entries with types listed in the `EntryType` enum. Currently, only `FILESET` enum value is allowed. All other entries created in Data Catalog must use the `user_specified_type`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Resource usage statistics.
     * 
     */
    @Export(name="usageSignal", type=GoogleCloudDatacatalogV1UsageSignalResponse.class, parameters={})
    private Output<GoogleCloudDatacatalogV1UsageSignalResponse> usageSignal;

    /**
     * @return Resource usage statistics.
     * 
     */
    public Output<GoogleCloudDatacatalogV1UsageSignalResponse> usageSignal() {
        return this.usageSignal;
    }
    /**
     * Indicates the entry&#39;s source system that Data Catalog doesn&#39;t automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    @Export(name="userSpecifiedSystem", type=String.class, parameters={})
    private Output<String> userSpecifiedSystem;

    /**
     * @return Indicates the entry&#39;s source system that Data Catalog doesn&#39;t automatically integrate with. The `user_specified_system` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    public Output<String> userSpecifiedSystem() {
        return this.userSpecifiedSystem;
    }
    /**
     * Custom entry type that doesn&#39;t match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    @Export(name="userSpecifiedType", type=String.class, parameters={})
    private Output<String> userSpecifiedType;

    /**
     * @return Custom entry type that doesn&#39;t match any of the values allowed for input and listed in the `EntryType` enum. When creating an entry, first check the type values in the enum. If there are no appropriate types for the new entry, provide a custom value, for example, `my_special_type`. The `user_specified_type` string has the following limitations: * Is case insensitive. * Must begin with a letter or underscore. * Can only contain letters, numbers, and underscores. * Must be at least 1 character and at most 64 characters long.
     * 
     */
    public Output<String> userSpecifiedType() {
        return this.userSpecifiedType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Entry(String name) {
        this(name, EntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Entry(String name, EntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Entry(String name, EntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1:Entry", name, args == null ? EntryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Entry(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datacatalog/v1:Entry", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Entry get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Entry(name, id, options);
    }
}