// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring.v1.outputs.AggregationResponse;
import com.pulumi.googlenative.monitoring.v1.outputs.PickTimeSeriesFilterResponse;
import com.pulumi.googlenative.monitoring.v1.outputs.RatioPartResponse;
import com.pulumi.googlenative.monitoring.v1.outputs.StatisticalTimeSeriesFilterResponse;
import java.util.Objects;

@CustomType
public final class TimeSeriesFilterRatioResponse {
    /**
     * @return The denominator of the ratio.
     * 
     */
    private RatioPartResponse denominator;
    /**
     * @return The numerator of the ratio.
     * 
     */
    private RatioPartResponse numerator;
    /**
     * @return Ranking based time series filter.
     * 
     */
    private PickTimeSeriesFilterResponse pickTimeSeriesFilter;
    /**
     * @return Apply a second aggregation after the ratio is computed.
     * 
     */
    private AggregationResponse secondaryAggregation;
    /**
     * @return Statistics based time series filter. Note: This field is deprecated and completely ignored by the API.
     * 
     * @deprecated
     * Statistics based time series filter. Note: This field is deprecated and completely ignored by the API.
     * 
     */
    @Deprecated /* Statistics based time series filter. Note: This field is deprecated and completely ignored by the API. */
    private StatisticalTimeSeriesFilterResponse statisticalTimeSeriesFilter;

    private TimeSeriesFilterRatioResponse() {}
    /**
     * @return The denominator of the ratio.
     * 
     */
    public RatioPartResponse denominator() {
        return this.denominator;
    }
    /**
     * @return The numerator of the ratio.
     * 
     */
    public RatioPartResponse numerator() {
        return this.numerator;
    }
    /**
     * @return Ranking based time series filter.
     * 
     */
    public PickTimeSeriesFilterResponse pickTimeSeriesFilter() {
        return this.pickTimeSeriesFilter;
    }
    /**
     * @return Apply a second aggregation after the ratio is computed.
     * 
     */
    public AggregationResponse secondaryAggregation() {
        return this.secondaryAggregation;
    }
    /**
     * @return Statistics based time series filter. Note: This field is deprecated and completely ignored by the API.
     * 
     * @deprecated
     * Statistics based time series filter. Note: This field is deprecated and completely ignored by the API.
     * 
     */
    @Deprecated /* Statistics based time series filter. Note: This field is deprecated and completely ignored by the API. */
    public StatisticalTimeSeriesFilterResponse statisticalTimeSeriesFilter() {
        return this.statisticalTimeSeriesFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesFilterRatioResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private RatioPartResponse denominator;
        private RatioPartResponse numerator;
        private PickTimeSeriesFilterResponse pickTimeSeriesFilter;
        private AggregationResponse secondaryAggregation;
        private StatisticalTimeSeriesFilterResponse statisticalTimeSeriesFilter;
        public Builder() {}
        public Builder(TimeSeriesFilterRatioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.denominator = defaults.denominator;
    	      this.numerator = defaults.numerator;
    	      this.pickTimeSeriesFilter = defaults.pickTimeSeriesFilter;
    	      this.secondaryAggregation = defaults.secondaryAggregation;
    	      this.statisticalTimeSeriesFilter = defaults.statisticalTimeSeriesFilter;
        }

        @CustomType.Setter
        public Builder denominator(RatioPartResponse denominator) {
            this.denominator = Objects.requireNonNull(denominator);
            return this;
        }
        @CustomType.Setter
        public Builder numerator(RatioPartResponse numerator) {
            this.numerator = Objects.requireNonNull(numerator);
            return this;
        }
        @CustomType.Setter
        public Builder pickTimeSeriesFilter(PickTimeSeriesFilterResponse pickTimeSeriesFilter) {
            this.pickTimeSeriesFilter = Objects.requireNonNull(pickTimeSeriesFilter);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryAggregation(AggregationResponse secondaryAggregation) {
            this.secondaryAggregation = Objects.requireNonNull(secondaryAggregation);
            return this;
        }
        @CustomType.Setter
        public Builder statisticalTimeSeriesFilter(StatisticalTimeSeriesFilterResponse statisticalTimeSeriesFilter) {
            this.statisticalTimeSeriesFilter = Objects.requireNonNull(statisticalTimeSeriesFilter);
            return this;
        }
        public TimeSeriesFilterRatioResponse build() {
            final var o = new TimeSeriesFilterRatioResponse();
            o.denominator = denominator;
            o.numerator = numerator;
            o.pickTimeSeriesFilter = pickTimeSeriesFilter;
            o.secondaryAggregation = secondaryAggregation;
            o.statisticalTimeSeriesFilter = statisticalTimeSeriesFilter;
            return o;
        }
    }
}