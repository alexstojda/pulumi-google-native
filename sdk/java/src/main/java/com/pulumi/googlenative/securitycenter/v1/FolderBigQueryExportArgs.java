// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderBigQueryExportArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderBigQueryExportArgs Empty = new FolderBigQueryExportArgs();

    /**
     * Required. Unique identifier provided by the client within the parent scope. It must consist of lower case letters, numbers, and hyphen, with the first character a letter, the last a letter or a number, and a 63 character maximum.
     * 
     */
    @Import(name="bigQueryExportId", required=true)
    private Output<String> bigQueryExportId;

    /**
     * @return Required. Unique identifier provided by the client within the parent scope. It must consist of lower case letters, numbers, and hyphen, with the first character a letter, the last a letter or a number, and a 63 character maximum.
     * 
     */
    public Output<String> bigQueryExportId() {
        return this.bigQueryExportId;
    }

    /**
     * The dataset to write findings&#39; updates to. Its format is &#34;projects/[project_id]/datasets/[bigquery_dataset_id]&#34;. BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    /**
     * @return The dataset to write findings&#39; updates to. Its format is &#34;projects/[project_id]/datasets/[bigquery_dataset_id]&#34;. BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
     * 
     */
    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * The description of the export (max of 1024 characters).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the export (max of 1024 characters).
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Expression that defines the filter to apply across create/update events of findings. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the corresponding resource. The supported operators are: * `=` for all value types. * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return Expression that defines the filter to apply across create/update events of findings. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the corresponding resource. The supported operators are: * `=` for all value types. * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    @Import(name="folderId", required=true)
    private Output<String> folderId;

    public Output<String> folderId() {
        return this.folderId;
    }

    /**
     * The relative resource name of this export. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name. Example format: &#34;organizations/{organization_id}/bigQueryExports/{export_id}&#34; Example format: &#34;folders/{folder_id}/bigQueryExports/{export_id}&#34; Example format: &#34;projects/{project_id}/bigQueryExports/{export_id}&#34; This field is provided in responses, and is ignored when provided in create requests.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The relative resource name of this export. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name. Example format: &#34;organizations/{organization_id}/bigQueryExports/{export_id}&#34; Example format: &#34;folders/{folder_id}/bigQueryExports/{export_id}&#34; Example format: &#34;projects/{project_id}/bigQueryExports/{export_id}&#34; This field is provided in responses, and is ignored when provided in create requests.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FolderBigQueryExportArgs() {}

    private FolderBigQueryExportArgs(FolderBigQueryExportArgs $) {
        this.bigQueryExportId = $.bigQueryExportId;
        this.dataset = $.dataset;
        this.description = $.description;
        this.filter = $.filter;
        this.folderId = $.folderId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderBigQueryExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderBigQueryExportArgs $;

        public Builder() {
            $ = new FolderBigQueryExportArgs();
        }

        public Builder(FolderBigQueryExportArgs defaults) {
            $ = new FolderBigQueryExportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigQueryExportId Required. Unique identifier provided by the client within the parent scope. It must consist of lower case letters, numbers, and hyphen, with the first character a letter, the last a letter or a number, and a 63 character maximum.
         * 
         * @return builder
         * 
         */
        public Builder bigQueryExportId(Output<String> bigQueryExportId) {
            $.bigQueryExportId = bigQueryExportId;
            return this;
        }

        /**
         * @param bigQueryExportId Required. Unique identifier provided by the client within the parent scope. It must consist of lower case letters, numbers, and hyphen, with the first character a letter, the last a letter or a number, and a 63 character maximum.
         * 
         * @return builder
         * 
         */
        public Builder bigQueryExportId(String bigQueryExportId) {
            return bigQueryExportId(Output.of(bigQueryExportId));
        }

        /**
         * @param dataset The dataset to write findings&#39; updates to. Its format is &#34;projects/[project_id]/datasets/[bigquery_dataset_id]&#34;. BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset The dataset to write findings&#39; updates to. Its format is &#34;projects/[project_id]/datasets/[bigquery_dataset_id]&#34;. BigQuery Dataset unique ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param description The description of the export (max of 1024 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the export (max of 1024 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param filter Expression that defines the filter to apply across create/update events of findings. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the corresponding resource. The supported operators are: * `=` for all value types. * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Expression that defines the filter to apply across create/update events of findings. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the corresponding resource. The supported operators are: * `=` for all value types. * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder folderId(Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        /**
         * @param name The relative resource name of this export. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name. Example format: &#34;organizations/{organization_id}/bigQueryExports/{export_id}&#34; Example format: &#34;folders/{folder_id}/bigQueryExports/{export_id}&#34; Example format: &#34;projects/{project_id}/bigQueryExports/{export_id}&#34; This field is provided in responses, and is ignored when provided in create requests.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The relative resource name of this export. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name. Example format: &#34;organizations/{organization_id}/bigQueryExports/{export_id}&#34; Example format: &#34;folders/{folder_id}/bigQueryExports/{export_id}&#34; Example format: &#34;projects/{project_id}/bigQueryExports/{export_id}&#34; This field is provided in responses, and is ignored when provided in create requests.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FolderBigQueryExportArgs build() {
            $.bigQueryExportId = Objects.requireNonNull($.bigQueryExportId, "expected parameter 'bigQueryExportId' to be non-null");
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            return $;
        }
    }

}