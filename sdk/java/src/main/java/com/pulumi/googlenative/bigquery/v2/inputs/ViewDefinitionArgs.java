// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery.v2.inputs.UserDefinedFunctionResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ViewDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewDefinitionArgs Empty = new ViewDefinitionArgs();

    /**
     * [Required] A query that BigQuery executes when the view is referenced.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return [Required] A query that BigQuery executes when the view is referenced.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * True if the column names are explicitly specified. For example by using the &#39;CREATE VIEW v(c1, c2) AS ...&#39; syntax. Can only be set using BigQuery&#39;s standard SQL: https://cloud.google.com/bigquery/sql-reference/
     * 
     */
    @Import(name="useExplicitColumnNames")
    private @Nullable Output<Boolean> useExplicitColumnNames;

    /**
     * @return True if the column names are explicitly specified. For example by using the &#39;CREATE VIEW v(c1, c2) AS ...&#39; syntax. Can only be set using BigQuery&#39;s standard SQL: https://cloud.google.com/bigquery/sql-reference/
     * 
     */
    public Optional<Output<Boolean>> useExplicitColumnNames() {
        return Optional.ofNullable(this.useExplicitColumnNames);
    }

    /**
     * Specifies whether to use BigQuery&#39;s legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery&#39;s standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
     * 
     */
    @Import(name="useLegacySql")
    private @Nullable Output<Boolean> useLegacySql;

    /**
     * @return Specifies whether to use BigQuery&#39;s legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery&#39;s standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
     * 
     */
    public Optional<Output<Boolean>> useLegacySql() {
        return Optional.ofNullable(this.useLegacySql);
    }

    /**
     * Describes user-defined function resources used in the query.
     * 
     */
    @Import(name="userDefinedFunctionResources")
    private @Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources;

    /**
     * @return Describes user-defined function resources used in the query.
     * 
     */
    public Optional<Output<List<UserDefinedFunctionResourceArgs>>> userDefinedFunctionResources() {
        return Optional.ofNullable(this.userDefinedFunctionResources);
    }

    private ViewDefinitionArgs() {}

    private ViewDefinitionArgs(ViewDefinitionArgs $) {
        this.query = $.query;
        this.useExplicitColumnNames = $.useExplicitColumnNames;
        this.useLegacySql = $.useLegacySql;
        this.userDefinedFunctionResources = $.userDefinedFunctionResources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewDefinitionArgs $;

        public Builder() {
            $ = new ViewDefinitionArgs();
        }

        public Builder(ViewDefinitionArgs defaults) {
            $ = new ViewDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query [Required] A query that BigQuery executes when the view is referenced.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query [Required] A query that BigQuery executes when the view is referenced.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param useExplicitColumnNames True if the column names are explicitly specified. For example by using the &#39;CREATE VIEW v(c1, c2) AS ...&#39; syntax. Can only be set using BigQuery&#39;s standard SQL: https://cloud.google.com/bigquery/sql-reference/
         * 
         * @return builder
         * 
         */
        public Builder useExplicitColumnNames(@Nullable Output<Boolean> useExplicitColumnNames) {
            $.useExplicitColumnNames = useExplicitColumnNames;
            return this;
        }

        /**
         * @param useExplicitColumnNames True if the column names are explicitly specified. For example by using the &#39;CREATE VIEW v(c1, c2) AS ...&#39; syntax. Can only be set using BigQuery&#39;s standard SQL: https://cloud.google.com/bigquery/sql-reference/
         * 
         * @return builder
         * 
         */
        public Builder useExplicitColumnNames(Boolean useExplicitColumnNames) {
            return useExplicitColumnNames(Output.of(useExplicitColumnNames));
        }

        /**
         * @param useLegacySql Specifies whether to use BigQuery&#39;s legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery&#39;s standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
         * 
         * @return builder
         * 
         */
        public Builder useLegacySql(@Nullable Output<Boolean> useLegacySql) {
            $.useLegacySql = useLegacySql;
            return this;
        }

        /**
         * @param useLegacySql Specifies whether to use BigQuery&#39;s legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery&#39;s standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
         * 
         * @return builder
         * 
         */
        public Builder useLegacySql(Boolean useLegacySql) {
            return useLegacySql(Output.of(useLegacySql));
        }

        /**
         * @param userDefinedFunctionResources Describes user-defined function resources used in the query.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFunctionResources(@Nullable Output<List<UserDefinedFunctionResourceArgs>> userDefinedFunctionResources) {
            $.userDefinedFunctionResources = userDefinedFunctionResources;
            return this;
        }

        /**
         * @param userDefinedFunctionResources Describes user-defined function resources used in the query.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFunctionResources(List<UserDefinedFunctionResourceArgs> userDefinedFunctionResources) {
            return userDefinedFunctionResources(Output.of(userDefinedFunctionResources));
        }

        /**
         * @param userDefinedFunctionResources Describes user-defined function resources used in the query.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFunctionResources(UserDefinedFunctionResourceArgs... userDefinedFunctionResources) {
            return userDefinedFunctionResources(List.of(userDefinedFunctionResources));
        }

        public ViewDefinitionArgs build() {
            return $;
        }
    }

}