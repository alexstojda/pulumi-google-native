// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1.inputs.EnvironmentConfigArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.PySparkBatchArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.RuntimeConfigArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.SparkBatchArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.SparkRBatchArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.SparkSqlBatchArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final BatchArgs Empty = new BatchArgs();

    /**
     * Optional. The ID to use for the batch, which will become the final component of the batch&#39;s resource name.This value must be 4-63 characters. Valid characters are /[a-z][0-9]-/.
     * 
     */
    @Import(name="batchId")
    private @Nullable Output<String> batchId;

    /**
     * @return Optional. The ID to use for the batch, which will become the final component of the batch&#39;s resource name.This value must be 4-63 characters. Valid characters are /[a-z][0-9]-/.
     * 
     */
    public Optional<Output<String>> batchId() {
        return Optional.ofNullable(this.batchId);
    }

    /**
     * Optional. Environment configuration for the batch execution.
     * 
     */
    @Import(name="environmentConfig")
    private @Nullable Output<EnvironmentConfigArgs> environmentConfig;

    /**
     * @return Optional. Environment configuration for the batch execution.
     * 
     */
    public Optional<Output<EnvironmentConfigArgs>> environmentConfig() {
        return Optional.ofNullable(this.environmentConfig);
    }

    /**
     * Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
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
     * Optional. PySpark batch config.
     * 
     */
    @Import(name="pysparkBatch")
    private @Nullable Output<PySparkBatchArgs> pysparkBatch;

    /**
     * @return Optional. PySpark batch config.
     * 
     */
    public Optional<Output<PySparkBatchArgs>> pysparkBatch() {
        return Optional.ofNullable(this.pysparkBatch);
    }

    /**
     * Optional. A unique ID used to identify the request. If the service receives two CreateBatchRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.CreateBatchRequest)s with the same request_id, the second request is ignored and the Operation that corresponds to the first Batch created and stored in the backend is returned.Recommendation: Set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The value must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return Optional. A unique ID used to identify the request. If the service receives two CreateBatchRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.CreateBatchRequest)s with the same request_id, the second request is ignored and the Operation that corresponds to the first Batch created and stored in the backend is returned.Recommendation: Set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The value must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Optional. Runtime configuration for the batch execution.
     * 
     */
    @Import(name="runtimeConfig")
    private @Nullable Output<RuntimeConfigArgs> runtimeConfig;

    /**
     * @return Optional. Runtime configuration for the batch execution.
     * 
     */
    public Optional<Output<RuntimeConfigArgs>> runtimeConfig() {
        return Optional.ofNullable(this.runtimeConfig);
    }

    /**
     * Optional. Spark batch config.
     * 
     */
    @Import(name="sparkBatch")
    private @Nullable Output<SparkBatchArgs> sparkBatch;

    /**
     * @return Optional. Spark batch config.
     * 
     */
    public Optional<Output<SparkBatchArgs>> sparkBatch() {
        return Optional.ofNullable(this.sparkBatch);
    }

    /**
     * Optional. SparkR batch config.
     * 
     */
    @Import(name="sparkRBatch")
    private @Nullable Output<SparkRBatchArgs> sparkRBatch;

    /**
     * @return Optional. SparkR batch config.
     * 
     */
    public Optional<Output<SparkRBatchArgs>> sparkRBatch() {
        return Optional.ofNullable(this.sparkRBatch);
    }

    /**
     * Optional. SparkSql batch config.
     * 
     */
    @Import(name="sparkSqlBatch")
    private @Nullable Output<SparkSqlBatchArgs> sparkSqlBatch;

    /**
     * @return Optional. SparkSql batch config.
     * 
     */
    public Optional<Output<SparkSqlBatchArgs>> sparkSqlBatch() {
        return Optional.ofNullable(this.sparkSqlBatch);
    }

    private BatchArgs() {}

    private BatchArgs(BatchArgs $) {
        this.batchId = $.batchId;
        this.environmentConfig = $.environmentConfig;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.pysparkBatch = $.pysparkBatch;
        this.requestId = $.requestId;
        this.runtimeConfig = $.runtimeConfig;
        this.sparkBatch = $.sparkBatch;
        this.sparkRBatch = $.sparkRBatch;
        this.sparkSqlBatch = $.sparkSqlBatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BatchArgs $;

        public Builder() {
            $ = new BatchArgs();
        }

        public Builder(BatchArgs defaults) {
            $ = new BatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchId Optional. The ID to use for the batch, which will become the final component of the batch&#39;s resource name.This value must be 4-63 characters. Valid characters are /[a-z][0-9]-/.
         * 
         * @return builder
         * 
         */
        public Builder batchId(@Nullable Output<String> batchId) {
            $.batchId = batchId;
            return this;
        }

        /**
         * @param batchId Optional. The ID to use for the batch, which will become the final component of the batch&#39;s resource name.This value must be 4-63 characters. Valid characters are /[a-z][0-9]-/.
         * 
         * @return builder
         * 
         */
        public Builder batchId(String batchId) {
            return batchId(Output.of(batchId));
        }

        /**
         * @param environmentConfig Optional. Environment configuration for the batch execution.
         * 
         * @return builder
         * 
         */
        public Builder environmentConfig(@Nullable Output<EnvironmentConfigArgs> environmentConfig) {
            $.environmentConfig = environmentConfig;
            return this;
        }

        /**
         * @param environmentConfig Optional. Environment configuration for the batch execution.
         * 
         * @return builder
         * 
         */
        public Builder environmentConfig(EnvironmentConfigArgs environmentConfig) {
            return environmentConfig(Output.of(environmentConfig));
        }

        /**
         * @param labels Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
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
         * @param pysparkBatch Optional. PySpark batch config.
         * 
         * @return builder
         * 
         */
        public Builder pysparkBatch(@Nullable Output<PySparkBatchArgs> pysparkBatch) {
            $.pysparkBatch = pysparkBatch;
            return this;
        }

        /**
         * @param pysparkBatch Optional. PySpark batch config.
         * 
         * @return builder
         * 
         */
        public Builder pysparkBatch(PySparkBatchArgs pysparkBatch) {
            return pysparkBatch(Output.of(pysparkBatch));
        }

        /**
         * @param requestId Optional. A unique ID used to identify the request. If the service receives two CreateBatchRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.CreateBatchRequest)s with the same request_id, the second request is ignored and the Operation that corresponds to the first Batch created and stored in the backend is returned.Recommendation: Set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The value must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId Optional. A unique ID used to identify the request. If the service receives two CreateBatchRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.CreateBatchRequest)s with the same request_id, the second request is ignored and the Operation that corresponds to the first Batch created and stored in the backend is returned.Recommendation: Set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The value must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param runtimeConfig Optional. Runtime configuration for the batch execution.
         * 
         * @return builder
         * 
         */
        public Builder runtimeConfig(@Nullable Output<RuntimeConfigArgs> runtimeConfig) {
            $.runtimeConfig = runtimeConfig;
            return this;
        }

        /**
         * @param runtimeConfig Optional. Runtime configuration for the batch execution.
         * 
         * @return builder
         * 
         */
        public Builder runtimeConfig(RuntimeConfigArgs runtimeConfig) {
            return runtimeConfig(Output.of(runtimeConfig));
        }

        /**
         * @param sparkBatch Optional. Spark batch config.
         * 
         * @return builder
         * 
         */
        public Builder sparkBatch(@Nullable Output<SparkBatchArgs> sparkBatch) {
            $.sparkBatch = sparkBatch;
            return this;
        }

        /**
         * @param sparkBatch Optional. Spark batch config.
         * 
         * @return builder
         * 
         */
        public Builder sparkBatch(SparkBatchArgs sparkBatch) {
            return sparkBatch(Output.of(sparkBatch));
        }

        /**
         * @param sparkRBatch Optional. SparkR batch config.
         * 
         * @return builder
         * 
         */
        public Builder sparkRBatch(@Nullable Output<SparkRBatchArgs> sparkRBatch) {
            $.sparkRBatch = sparkRBatch;
            return this;
        }

        /**
         * @param sparkRBatch Optional. SparkR batch config.
         * 
         * @return builder
         * 
         */
        public Builder sparkRBatch(SparkRBatchArgs sparkRBatch) {
            return sparkRBatch(Output.of(sparkRBatch));
        }

        /**
         * @param sparkSqlBatch Optional. SparkSql batch config.
         * 
         * @return builder
         * 
         */
        public Builder sparkSqlBatch(@Nullable Output<SparkSqlBatchArgs> sparkSqlBatch) {
            $.sparkSqlBatch = sparkSqlBatch;
            return this;
        }

        /**
         * @param sparkSqlBatch Optional. SparkSql batch config.
         * 
         * @return builder
         * 
         */
        public Builder sparkSqlBatch(SparkSqlBatchArgs sparkSqlBatch) {
            return sparkSqlBatch(Output.of(sparkSqlBatch));
        }

        public BatchArgs build() {
            return $;
        }
    }

}