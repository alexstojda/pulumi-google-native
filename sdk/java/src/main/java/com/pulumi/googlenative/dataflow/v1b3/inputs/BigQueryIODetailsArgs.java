// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata for a BigQuery connector used by the job.
 * 
 */
public final class BigQueryIODetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BigQueryIODetailsArgs Empty = new BigQueryIODetailsArgs();

    /**
     * Dataset accessed in the connection.
     * 
     */
    @Import(name="dataset")
    private @Nullable Output<String> dataset;

    /**
     * @return Dataset accessed in the connection.
     * 
     */
    public Optional<Output<String>> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * Project accessed in the connection.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Project accessed in the connection.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Query used to access data in the connection.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return Query used to access data in the connection.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Table accessed in the connection.
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return Table accessed in the connection.
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    private BigQueryIODetailsArgs() {}

    private BigQueryIODetailsArgs(BigQueryIODetailsArgs $) {
        this.dataset = $.dataset;
        this.project = $.project;
        this.query = $.query;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BigQueryIODetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BigQueryIODetailsArgs $;

        public Builder() {
            $ = new BigQueryIODetailsArgs();
        }

        public Builder(BigQueryIODetailsArgs defaults) {
            $ = new BigQueryIODetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset Dataset accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder dataset(@Nullable Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset Dataset accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        /**
         * @param project Project accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param query Query used to access data in the connection.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Query used to access data in the connection.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param table Table accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Table accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public BigQueryIODetailsArgs build() {
            return $;
        }
    }

}