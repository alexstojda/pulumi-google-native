// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring.v1.outputs.TimeSeriesFilterRatioResponse;
import com.pulumi.googlenative.monitoring.v1.outputs.TimeSeriesFilterResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TimeSeriesQueryResponse {
    /**
     * @return Filter parameters to fetch time series.
     * 
     */
    private TimeSeriesFilterResponse timeSeriesFilter;
    /**
     * @return Parameters to fetch a ratio between two time series filters.
     * 
     */
    private TimeSeriesFilterRatioResponse timeSeriesFilterRatio;
    /**
     * @return A query used to fetch time series with MQL.
     * 
     */
    private String timeSeriesQueryLanguage;
    /**
     * @return The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
     * 
     */
    private String unitOverride;

    private TimeSeriesQueryResponse() {}
    /**
     * @return Filter parameters to fetch time series.
     * 
     */
    public TimeSeriesFilterResponse timeSeriesFilter() {
        return this.timeSeriesFilter;
    }
    /**
     * @return Parameters to fetch a ratio between two time series filters.
     * 
     */
    public TimeSeriesFilterRatioResponse timeSeriesFilterRatio() {
        return this.timeSeriesFilterRatio;
    }
    /**
     * @return A query used to fetch time series with MQL.
     * 
     */
    public String timeSeriesQueryLanguage() {
        return this.timeSeriesQueryLanguage;
    }
    /**
     * @return The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
     * 
     */
    public String unitOverride() {
        return this.unitOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesQueryResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private TimeSeriesFilterResponse timeSeriesFilter;
        private TimeSeriesFilterRatioResponse timeSeriesFilterRatio;
        private String timeSeriesQueryLanguage;
        private String unitOverride;
        public Builder() {}
        public Builder(TimeSeriesQueryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeSeriesFilter = defaults.timeSeriesFilter;
    	      this.timeSeriesFilterRatio = defaults.timeSeriesFilterRatio;
    	      this.timeSeriesQueryLanguage = defaults.timeSeriesQueryLanguage;
    	      this.unitOverride = defaults.unitOverride;
        }

        @CustomType.Setter
        public Builder timeSeriesFilter(TimeSeriesFilterResponse timeSeriesFilter) {
            this.timeSeriesFilter = Objects.requireNonNull(timeSeriesFilter);
            return this;
        }
        @CustomType.Setter
        public Builder timeSeriesFilterRatio(TimeSeriesFilterRatioResponse timeSeriesFilterRatio) {
            this.timeSeriesFilterRatio = Objects.requireNonNull(timeSeriesFilterRatio);
            return this;
        }
        @CustomType.Setter
        public Builder timeSeriesQueryLanguage(String timeSeriesQueryLanguage) {
            this.timeSeriesQueryLanguage = Objects.requireNonNull(timeSeriesQueryLanguage);
            return this;
        }
        @CustomType.Setter
        public Builder unitOverride(String unitOverride) {
            this.unitOverride = Objects.requireNonNull(unitOverride);
            return this;
        }
        public TimeSeriesQueryResponse build() {
            final var o = new TimeSeriesQueryResponse();
            o.timeSeriesFilter = timeSeriesFilter;
            o.timeSeriesFilterRatio = timeSeriesFilterRatio;
            o.timeSeriesQueryLanguage = timeSeriesQueryLanguage;
            o.unitOverride = unitOverride;
            return o;
        }
    }
}