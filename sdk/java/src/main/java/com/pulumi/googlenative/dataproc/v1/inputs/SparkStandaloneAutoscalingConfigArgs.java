// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Basic autoscaling configurations for Spark Standalone.
 * 
 */
public final class SparkStandaloneAutoscalingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkStandaloneAutoscalingConfigArgs Empty = new SparkStandaloneAutoscalingConfigArgs();

    /**
     * Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    @Import(name="gracefulDecommissionTimeout", required=true)
    private Output<String> gracefulDecommissionTimeout;

    /**
     * @return Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    public Output<String> gracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }

    /**
     * Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleDownFactor", required=true)
    private Output<Double> scaleDownFactor;

    /**
     * @return Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    public Output<Double> scaleDownFactor() {
        return this.scaleDownFactor;
    }

    /**
     * Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleDownMinWorkerFraction")
    private @Nullable Output<Double> scaleDownMinWorkerFraction;

    /**
     * @return Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    public Optional<Output<Double>> scaleDownMinWorkerFraction() {
        return Optional.ofNullable(this.scaleDownMinWorkerFraction);
    }

    /**
     * Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    @Import(name="scaleUpFactor", required=true)
    private Output<Double> scaleUpFactor;

    /**
     * @return Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    public Output<Double> scaleUpFactor() {
        return this.scaleUpFactor;
    }

    /**
     * Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    @Import(name="scaleUpMinWorkerFraction")
    private @Nullable Output<Double> scaleUpMinWorkerFraction;

    /**
     * @return Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    public Optional<Output<Double>> scaleUpMinWorkerFraction() {
        return Optional.ofNullable(this.scaleUpMinWorkerFraction);
    }

    private SparkStandaloneAutoscalingConfigArgs() {}

    private SparkStandaloneAutoscalingConfigArgs(SparkStandaloneAutoscalingConfigArgs $) {
        this.gracefulDecommissionTimeout = $.gracefulDecommissionTimeout;
        this.scaleDownFactor = $.scaleDownFactor;
        this.scaleDownMinWorkerFraction = $.scaleDownMinWorkerFraction;
        this.scaleUpFactor = $.scaleUpFactor;
        this.scaleUpMinWorkerFraction = $.scaleUpMinWorkerFraction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkStandaloneAutoscalingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkStandaloneAutoscalingConfigArgs $;

        public Builder() {
            $ = new SparkStandaloneAutoscalingConfigArgs();
        }

        public Builder(SparkStandaloneAutoscalingConfigArgs defaults) {
            $ = new SparkStandaloneAutoscalingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gracefulDecommissionTimeout Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
         * 
         * @return builder
         * 
         */
        public Builder gracefulDecommissionTimeout(Output<String> gracefulDecommissionTimeout) {
            $.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
            return this;
        }

        /**
         * @param gracefulDecommissionTimeout Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
         * 
         * @return builder
         * 
         */
        public Builder gracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            return gracefulDecommissionTimeout(Output.of(gracefulDecommissionTimeout));
        }

        /**
         * @param scaleDownFactor Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownFactor(Output<Double> scaleDownFactor) {
            $.scaleDownFactor = scaleDownFactor;
            return this;
        }

        /**
         * @param scaleDownFactor Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownFactor(Double scaleDownFactor) {
            return scaleDownFactor(Output.of(scaleDownFactor));
        }

        /**
         * @param scaleDownMinWorkerFraction Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownMinWorkerFraction(@Nullable Output<Double> scaleDownMinWorkerFraction) {
            $.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
            return this;
        }

        /**
         * @param scaleDownMinWorkerFraction Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownMinWorkerFraction(Double scaleDownMinWorkerFraction) {
            return scaleDownMinWorkerFraction(Output.of(scaleDownMinWorkerFraction));
        }

        /**
         * @param scaleUpFactor Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleUpFactor(Output<Double> scaleUpFactor) {
            $.scaleUpFactor = scaleUpFactor;
            return this;
        }

        /**
         * @param scaleUpFactor Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleUpFactor(Double scaleUpFactor) {
            return scaleUpFactor(Output.of(scaleUpFactor));
        }

        /**
         * @param scaleUpMinWorkerFraction Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleUpMinWorkerFraction(@Nullable Output<Double> scaleUpMinWorkerFraction) {
            $.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
            return this;
        }

        /**
         * @param scaleUpMinWorkerFraction Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
         * 
         * @return builder
         * 
         */
        public Builder scaleUpMinWorkerFraction(Double scaleUpMinWorkerFraction) {
            return scaleUpMinWorkerFraction(Output.of(scaleUpMinWorkerFraction));
        }

        public SparkStandaloneAutoscalingConfigArgs build() {
            $.gracefulDecommissionTimeout = Objects.requireNonNull($.gracefulDecommissionTimeout, "expected parameter 'gracefulDecommissionTimeout' to be non-null");
            $.scaleDownFactor = Objects.requireNonNull($.scaleDownFactor, "expected parameter 'scaleDownFactor' to be non-null");
            $.scaleUpFactor = Objects.requireNonNull($.scaleUpFactor, "expected parameter 'scaleUpFactor' to be non-null");
            return $;
        }
    }

}