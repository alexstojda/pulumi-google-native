// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataplex.v1.inputs.GoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResourcesArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntimeArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GoogleCloudDataplexV1TaskInfrastructureSpecVpcNetworkArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for the underlying infrastructure used to run workloads.
 * 
 */
public final class GoogleCloudDataplexV1TaskInfrastructureSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1TaskInfrastructureSpecArgs Empty = new GoogleCloudDataplexV1TaskInfrastructureSpecArgs();

    /**
     * Compute resources needed for a Task when using Dataproc Serverless.
     * 
     */
    @Import(name="batch")
    private @Nullable Output<GoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResourcesArgs> batch;

    /**
     * @return Compute resources needed for a Task when using Dataproc Serverless.
     * 
     */
    public Optional<Output<GoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResourcesArgs>> batch() {
        return Optional.ofNullable(this.batch);
    }

    /**
     * Container Image Runtime Configuration.
     * 
     */
    @Import(name="containerImage")
    private @Nullable Output<GoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntimeArgs> containerImage;

    /**
     * @return Container Image Runtime Configuration.
     * 
     */
    public Optional<Output<GoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntimeArgs>> containerImage() {
        return Optional.ofNullable(this.containerImage);
    }

    /**
     * Vpc network.
     * 
     */
    @Import(name="vpcNetwork")
    private @Nullable Output<GoogleCloudDataplexV1TaskInfrastructureSpecVpcNetworkArgs> vpcNetwork;

    /**
     * @return Vpc network.
     * 
     */
    public Optional<Output<GoogleCloudDataplexV1TaskInfrastructureSpecVpcNetworkArgs>> vpcNetwork() {
        return Optional.ofNullable(this.vpcNetwork);
    }

    private GoogleCloudDataplexV1TaskInfrastructureSpecArgs() {}

    private GoogleCloudDataplexV1TaskInfrastructureSpecArgs(GoogleCloudDataplexV1TaskInfrastructureSpecArgs $) {
        this.batch = $.batch;
        this.containerImage = $.containerImage;
        this.vpcNetwork = $.vpcNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1TaskInfrastructureSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1TaskInfrastructureSpecArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1TaskInfrastructureSpecArgs();
        }

        public Builder(GoogleCloudDataplexV1TaskInfrastructureSpecArgs defaults) {
            $ = new GoogleCloudDataplexV1TaskInfrastructureSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batch Compute resources needed for a Task when using Dataproc Serverless.
         * 
         * @return builder
         * 
         */
        public Builder batch(@Nullable Output<GoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResourcesArgs> batch) {
            $.batch = batch;
            return this;
        }

        /**
         * @param batch Compute resources needed for a Task when using Dataproc Serverless.
         * 
         * @return builder
         * 
         */
        public Builder batch(GoogleCloudDataplexV1TaskInfrastructureSpecBatchComputeResourcesArgs batch) {
            return batch(Output.of(batch));
        }

        /**
         * @param containerImage Container Image Runtime Configuration.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(@Nullable Output<GoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntimeArgs> containerImage) {
            $.containerImage = containerImage;
            return this;
        }

        /**
         * @param containerImage Container Image Runtime Configuration.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(GoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntimeArgs containerImage) {
            return containerImage(Output.of(containerImage));
        }

        /**
         * @param vpcNetwork Vpc network.
         * 
         * @return builder
         * 
         */
        public Builder vpcNetwork(@Nullable Output<GoogleCloudDataplexV1TaskInfrastructureSpecVpcNetworkArgs> vpcNetwork) {
            $.vpcNetwork = vpcNetwork;
            return this;
        }

        /**
         * @param vpcNetwork Vpc network.
         * 
         * @return builder
         * 
         */
        public Builder vpcNetwork(GoogleCloudDataplexV1TaskInfrastructureSpecVpcNetworkArgs vpcNetwork) {
            return vpcNetwork(Output.of(vpcNetwork));
        }

        public GoogleCloudDataplexV1TaskInfrastructureSpecArgs build() {
            return $;
        }
    }

}