// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ExperimentResultMetricResponse {
    /**
     * @return The probability that the treatment is better than all other treatments in the experiment
     * 
     */
    private GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse confidenceInterval;
    /**
     * @return Count value of a metric.
     * 
     */
    private Double count;
    /**
     * @return Count-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    private String countType;
    /**
     * @return Ratio value of a metric.
     * 
     */
    private Double ratio;
    /**
     * @return Ratio-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    private String type;

    private GoogleCloudDialogflowCxV3ExperimentResultMetricResponse() {}
    /**
     * @return The probability that the treatment is better than all other treatments in the experiment
     * 
     */
    public GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse confidenceInterval() {
        return this.confidenceInterval;
    }
    /**
     * @return Count value of a metric.
     * 
     */
    public Double count() {
        return this.count;
    }
    /**
     * @return Count-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    public String countType() {
        return this.countType;
    }
    /**
     * @return Ratio value of a metric.
     * 
     */
    public Double ratio() {
        return this.ratio;
    }
    /**
     * @return Ratio-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultMetricResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse confidenceInterval;
        private Double count;
        private String countType;
        private Double ratio;
        private String type;
        public Builder() {}
        public Builder(GoogleCloudDialogflowCxV3ExperimentResultMetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceInterval = defaults.confidenceInterval;
    	      this.count = defaults.count;
    	      this.countType = defaults.countType;
    	      this.ratio = defaults.ratio;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder confidenceInterval(GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse confidenceInterval) {
            this.confidenceInterval = Objects.requireNonNull(confidenceInterval);
            return this;
        }
        @CustomType.Setter
        public Builder count(Double count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        @CustomType.Setter
        public Builder countType(String countType) {
            this.countType = Objects.requireNonNull(countType);
            return this;
        }
        @CustomType.Setter
        public Builder ratio(Double ratio) {
            this.ratio = Objects.requireNonNull(ratio);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDialogflowCxV3ExperimentResultMetricResponse build() {
            final var o = new GoogleCloudDialogflowCxV3ExperimentResultMetricResponse();
            o.confidenceInterval = confidenceInterval;
            o.count = count;
            o.countType = countType;
            o.ratio = ratio;
            o.type = type;
            return o;
        }
    }
}