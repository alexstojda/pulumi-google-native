// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1.inputs.GkeNodePoolTargetArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.NamespacedGkeDeploymentTargetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The cluster&#39;s GKE config.
 * 
 */
public final class GkeClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GkeClusterConfigArgs Empty = new GkeClusterConfigArgs();

    /**
     * Optional. A target GKE cluster to deploy to. It must be in the same project and region as the Dataproc cluster (the GKE cluster can be zonal or regional). Format: &#39;projects/{project}/locations/{location}/clusters/{cluster_id}&#39;
     * 
     */
    @Import(name="gkeClusterTarget")
    private @Nullable Output<String> gkeClusterTarget;

    /**
     * @return Optional. A target GKE cluster to deploy to. It must be in the same project and region as the Dataproc cluster (the GKE cluster can be zonal or regional). Format: &#39;projects/{project}/locations/{location}/clusters/{cluster_id}&#39;
     * 
     */
    public Optional<Output<String>> gkeClusterTarget() {
        return Optional.ofNullable(this.gkeClusterTarget);
    }

    /**
     * Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment.
     * 
     * @deprecated
     * Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment.
     * 
     */
    @Deprecated /* Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment. */
    @Import(name="namespacedGkeDeploymentTarget")
    private @Nullable Output<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget;

    /**
     * @return Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment.
     * 
     * @deprecated
     * Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment.
     * 
     */
    @Deprecated /* Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment. */
    public Optional<Output<NamespacedGkeDeploymentTargetArgs>> namespacedGkeDeploymentTarget() {
        return Optional.ofNullable(this.namespacedGkeDeploymentTarget);
    }

    /**
     * Optional. GKE node pools where workloads will be scheduled. At least one node pool must be assigned the DEFAULT GkeNodePoolTarget.Role. If a GkeNodePoolTarget is not specified, Dataproc constructs a DEFAULT GkeNodePoolTarget. Each role can be given to only one GkeNodePoolTarget. All node pools must have the same location settings.
     * 
     */
    @Import(name="nodePoolTarget")
    private @Nullable Output<List<GkeNodePoolTargetArgs>> nodePoolTarget;

    /**
     * @return Optional. GKE node pools where workloads will be scheduled. At least one node pool must be assigned the DEFAULT GkeNodePoolTarget.Role. If a GkeNodePoolTarget is not specified, Dataproc constructs a DEFAULT GkeNodePoolTarget. Each role can be given to only one GkeNodePoolTarget. All node pools must have the same location settings.
     * 
     */
    public Optional<Output<List<GkeNodePoolTargetArgs>>> nodePoolTarget() {
        return Optional.ofNullable(this.nodePoolTarget);
    }

    private GkeClusterConfigArgs() {}

    private GkeClusterConfigArgs(GkeClusterConfigArgs $) {
        this.gkeClusterTarget = $.gkeClusterTarget;
        this.namespacedGkeDeploymentTarget = $.namespacedGkeDeploymentTarget;
        this.nodePoolTarget = $.nodePoolTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GkeClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeClusterConfigArgs $;

        public Builder() {
            $ = new GkeClusterConfigArgs();
        }

        public Builder(GkeClusterConfigArgs defaults) {
            $ = new GkeClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gkeClusterTarget Optional. A target GKE cluster to deploy to. It must be in the same project and region as the Dataproc cluster (the GKE cluster can be zonal or regional). Format: &#39;projects/{project}/locations/{location}/clusters/{cluster_id}&#39;
         * 
         * @return builder
         * 
         */
        public Builder gkeClusterTarget(@Nullable Output<String> gkeClusterTarget) {
            $.gkeClusterTarget = gkeClusterTarget;
            return this;
        }

        /**
         * @param gkeClusterTarget Optional. A target GKE cluster to deploy to. It must be in the same project and region as the Dataproc cluster (the GKE cluster can be zonal or regional). Format: &#39;projects/{project}/locations/{location}/clusters/{cluster_id}&#39;
         * 
         * @return builder
         * 
         */
        public Builder gkeClusterTarget(String gkeClusterTarget) {
            return gkeClusterTarget(Output.of(gkeClusterTarget));
        }

        /**
         * @param namespacedGkeDeploymentTarget Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment.
         * 
         * @return builder
         * 
         * @deprecated
         * Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment.
         * 
         */
        @Deprecated /* Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment. */
        public Builder namespacedGkeDeploymentTarget(@Nullable Output<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget) {
            $.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
            return this;
        }

        /**
         * @param namespacedGkeDeploymentTarget Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment.
         * 
         * @return builder
         * 
         * @deprecated
         * Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment.
         * 
         */
        @Deprecated /* Optional. Deprecated. Use gkeClusterTarget. Used only for the deprecated beta. A target for the deployment. */
        public Builder namespacedGkeDeploymentTarget(NamespacedGkeDeploymentTargetArgs namespacedGkeDeploymentTarget) {
            return namespacedGkeDeploymentTarget(Output.of(namespacedGkeDeploymentTarget));
        }

        /**
         * @param nodePoolTarget Optional. GKE node pools where workloads will be scheduled. At least one node pool must be assigned the DEFAULT GkeNodePoolTarget.Role. If a GkeNodePoolTarget is not specified, Dataproc constructs a DEFAULT GkeNodePoolTarget. Each role can be given to only one GkeNodePoolTarget. All node pools must have the same location settings.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolTarget(@Nullable Output<List<GkeNodePoolTargetArgs>> nodePoolTarget) {
            $.nodePoolTarget = nodePoolTarget;
            return this;
        }

        /**
         * @param nodePoolTarget Optional. GKE node pools where workloads will be scheduled. At least one node pool must be assigned the DEFAULT GkeNodePoolTarget.Role. If a GkeNodePoolTarget is not specified, Dataproc constructs a DEFAULT GkeNodePoolTarget. Each role can be given to only one GkeNodePoolTarget. All node pools must have the same location settings.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolTarget(List<GkeNodePoolTargetArgs> nodePoolTarget) {
            return nodePoolTarget(Output.of(nodePoolTarget));
        }

        /**
         * @param nodePoolTarget Optional. GKE node pools where workloads will be scheduled. At least one node pool must be assigned the DEFAULT GkeNodePoolTarget.Role. If a GkeNodePoolTarget is not specified, Dataproc constructs a DEFAULT GkeNodePoolTarget. Each role can be given to only one GkeNodePoolTarget. All node pools must have the same location settings.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolTarget(GkeNodePoolTargetArgs... nodePoolTarget) {
            return nodePoolTarget(List.of(nodePoolTarget));
        }

        public GkeClusterConfigArgs build() {
            return $;
        }
    }

}