// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SparkChartViewResponse {
    /**
     * @return The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
     * 
     */
    private String minAlignmentPeriod;
    /**
     * @return The type of sparkchart to show in this chartView.
     * 
     */
    private String sparkChartType;

    private SparkChartViewResponse() {}
    /**
     * @return The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
     * 
     */
    public String minAlignmentPeriod() {
        return this.minAlignmentPeriod;
    }
    /**
     * @return The type of sparkchart to show in this chartView.
     * 
     */
    public String sparkChartType() {
        return this.sparkChartType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkChartViewResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String minAlignmentPeriod;
        private String sparkChartType;
        public Builder() {}
        public Builder(SparkChartViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minAlignmentPeriod = defaults.minAlignmentPeriod;
    	      this.sparkChartType = defaults.sparkChartType;
        }

        @CustomType.Setter
        public Builder minAlignmentPeriod(String minAlignmentPeriod) {
            this.minAlignmentPeriod = Objects.requireNonNull(minAlignmentPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder sparkChartType(String sparkChartType) {
            this.sparkChartType = Objects.requireNonNull(sparkChartType);
            return this;
        }
        public SparkChartViewResponse build() {
            final var o = new SparkChartViewResponse();
            o.minAlignmentPeriod = minAlignmentPeriod;
            o.sparkChartType = sparkChartType;
            return o;
        }
    }
}