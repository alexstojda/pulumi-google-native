// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HivePartitioningOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HivePartitioningOptionsArgs Empty = new HivePartitioningOptionsArgs();

    /**
     * [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2) STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2) STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
     * 
     */
    @Import(name="requirePartitionFilter")
    private @Nullable Output<Boolean> requirePartitionFilter;

    /**
     * @return [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
     * 
     */
    public Optional<Output<Boolean>> requirePartitionFilter() {
        return Optional.ofNullable(this.requirePartitionFilter);
    }

    /**
     * [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
     * 
     */
    @Import(name="sourceUriPrefix")
    private @Nullable Output<String> sourceUriPrefix;

    /**
     * @return [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
     * 
     */
    public Optional<Output<String>> sourceUriPrefix() {
        return Optional.ofNullable(this.sourceUriPrefix);
    }

    private HivePartitioningOptionsArgs() {}

    private HivePartitioningOptionsArgs(HivePartitioningOptionsArgs $) {
        this.mode = $.mode;
        this.requirePartitionFilter = $.requirePartitionFilter;
        this.sourceUriPrefix = $.sourceUriPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HivePartitioningOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HivePartitioningOptionsArgs $;

        public Builder() {
            $ = new HivePartitioningOptionsArgs();
        }

        public Builder(HivePartitioningOptionsArgs defaults) {
            $ = new HivePartitioningOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2) STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode [Optional] When set, what mode of hive partitioning to use when reading data. The following modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2) STRINGS: automatically infer partition key name(s). All types are interpreted as strings. (3) CUSTOM: partition key schema is encoded in the source URI prefix. Not all storage formats support hive partitioning. Requesting hive partitioning on an unsupported format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and Parquet.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param requirePartitionFilter [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
         * 
         * @return builder
         * 
         */
        public Builder requirePartitionFilter(@Nullable Output<Boolean> requirePartitionFilter) {
            $.requirePartitionFilter = requirePartitionFilter;
            return this;
        }

        /**
         * @param requirePartitionFilter [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified. Note that this field should only be true when creating a permanent external table or querying a temporary external table. Hive-partitioned loads with requirePartitionFilter explicitly set to true will fail.
         * 
         * @return builder
         * 
         */
        public Builder requirePartitionFilter(Boolean requirePartitionFilter) {
            return requirePartitionFilter(Output.of(requirePartitionFilter));
        }

        /**
         * @param sourceUriPrefix [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
         * 
         * @return builder
         * 
         */
        public Builder sourceUriPrefix(@Nullable Output<String> sourceUriPrefix) {
            $.sourceUriPrefix = sourceUriPrefix;
            return this;
        }

        /**
         * @param sourceUriPrefix [Optional] When hive partition detection is requested, a common prefix for all source uris should be supplied. The prefix must end immediately before the partition key encoding begins. For example, consider files following this data layout. gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is requested with either AUTO or STRINGS detection, the common prefix can be either of gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
         * 
         * @return builder
         * 
         */
        public Builder sourceUriPrefix(String sourceUriPrefix) {
            return sourceUriPrefix(Output.of(sourceUriPrefix));
        }

        public HivePartitioningOptionsArgs build() {
            return $;
        }
    }

}