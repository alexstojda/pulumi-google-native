// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SparkStandaloneAutoscalingConfigResponse {
    /**
     * @return Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    private String gracefulDecommissionTimeout;
    /**
     * @return Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    private Double scaleDownFactor;
    /**
     * @return Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    private Double scaleDownMinWorkerFraction;
    /**
     * @return Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    private Double scaleUpFactor;
    /**
     * @return Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    private Double scaleUpMinWorkerFraction;

    private SparkStandaloneAutoscalingConfigResponse() {}
    /**
     * @return Timeout for Spark graceful decommissioning of spark workers. Specifies the duration to wait for spark worker to complete spark decomissioning tasks before forcefully removing workers. Only applicable to downscaling operations.Bounds: 0s, 1d.
     * 
     */
    public String gracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }
    /**
     * @return Fraction of required executors to remove from Spark Serverless clusters. A scale-down factor of 1.0 will result in scaling down so that there are no more executors for the Spark Job.(more aggressive scaling). A scale-down factor closer to 0 will result in a smaller magnitude of scaling donw (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    public Double scaleDownFactor() {
        return this.scaleDownFactor;
    }
    /**
     * @return Optional. Minimum scale-down threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0 means the autoscaler will scale down on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    public Double scaleDownMinWorkerFraction() {
        return this.scaleDownMinWorkerFraction;
    }
    /**
     * @return Fraction of required workers to add to Spark Standalone clusters. A scale-up factor of 1.0 will result in scaling up so that there are no more required workers for the Spark Job (more aggressive scaling). A scale-up factor closer to 0 will result in a smaller magnitude of scaling up (less aggressive scaling).Bounds: 0.0, 1.0.
     * 
     */
    public Double scaleUpFactor() {
        return this.scaleUpFactor;
    }
    /**
     * @return Optional. Minimum scale-up threshold as a fraction of total cluster size before scaling occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of 0 means the autoscaler will scale up on any recommended change.Bounds: 0.0, 1.0. Default: 0.0.
     * 
     */
    public Double scaleUpMinWorkerFraction() {
        return this.scaleUpMinWorkerFraction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkStandaloneAutoscalingConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gracefulDecommissionTimeout;
        private Double scaleDownFactor;
        private Double scaleDownMinWorkerFraction;
        private Double scaleUpFactor;
        private Double scaleUpMinWorkerFraction;
        public Builder() {}
        public Builder(SparkStandaloneAutoscalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracefulDecommissionTimeout = defaults.gracefulDecommissionTimeout;
    	      this.scaleDownFactor = defaults.scaleDownFactor;
    	      this.scaleDownMinWorkerFraction = defaults.scaleDownMinWorkerFraction;
    	      this.scaleUpFactor = defaults.scaleUpFactor;
    	      this.scaleUpMinWorkerFraction = defaults.scaleUpMinWorkerFraction;
        }

        @CustomType.Setter
        public Builder gracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder scaleDownFactor(Double scaleDownFactor) {
            this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor);
            return this;
        }
        @CustomType.Setter
        public Builder scaleDownMinWorkerFraction(Double scaleDownMinWorkerFraction) {
            this.scaleDownMinWorkerFraction = Objects.requireNonNull(scaleDownMinWorkerFraction);
            return this;
        }
        @CustomType.Setter
        public Builder scaleUpFactor(Double scaleUpFactor) {
            this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor);
            return this;
        }
        @CustomType.Setter
        public Builder scaleUpMinWorkerFraction(Double scaleUpMinWorkerFraction) {
            this.scaleUpMinWorkerFraction = Objects.requireNonNull(scaleUpMinWorkerFraction);
            return this;
        }
        public SparkStandaloneAutoscalingConfigResponse build() {
            final var o = new SparkStandaloneAutoscalingConfigResponse();
            o.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
            o.scaleDownFactor = scaleDownFactor;
            o.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
            o.scaleUpFactor = scaleUpFactor;
            o.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
            return o;
        }
    }
}