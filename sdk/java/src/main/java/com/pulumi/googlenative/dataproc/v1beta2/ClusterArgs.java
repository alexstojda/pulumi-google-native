// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1beta2.inputs.ClusterConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The cluster config. Note that Dataproc may set default values, and values may change when clusters are updated.
     * 
     */
    @Import(name="config", required=true)
    private Output<ClusterConfigArgs> config;

    /**
     * @return The cluster config. Note that Dataproc may set default values, and values may change when clusters are updated.
     * 
     */
    public Output<ClusterConfigArgs> config() {
        return this.config;
    }

    /**
     * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The Google Cloud Platform project ID that the cluster belongs to.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The Google Cloud Platform project ID that the cluster belongs to.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    /**
     * Optional. A unique id used to identify the request. If the server receives two CreateClusterRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1beta2#google.cloud.dataproc.v1beta2.CreateClusterRequest)s with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return Optional. A unique id used to identify the request. If the server receives two CreateClusterRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1beta2#google.cloud.dataproc.v1beta2.CreateClusterRequest)s with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.clusterName = $.clusterName;
        this.config = $.config;
        this.labels = $.labels;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param config The cluster config. Note that Dataproc may set default values, and values may change when clusters are updated.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<ClusterConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The cluster config. Note that Dataproc may set default values, and values may change when clusters are updated.
         * 
         * @return builder
         * 
         */
        public Builder config(ClusterConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param labels Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param project The Google Cloud Platform project ID that the cluster belongs to.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The Google Cloud Platform project ID that the cluster belongs to.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestId Optional. A unique id used to identify the request. If the server receives two CreateClusterRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1beta2#google.cloud.dataproc.v1beta2.CreateClusterRequest)s with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId Optional. A unique id used to identify the request. If the server receives two CreateClusterRequest (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1beta2#google.cloud.dataproc.v1beta2.CreateClusterRequest)s with the same id, then the second request will be ignored and the first google.longrunning.Operation created and stored in the backend is returned.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public ClusterArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}