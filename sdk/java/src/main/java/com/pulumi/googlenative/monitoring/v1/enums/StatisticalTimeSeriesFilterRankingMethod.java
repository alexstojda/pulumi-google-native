// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * rankingMethod is applied to a set of time series, and then the produced value for each individual time series is used to compare a given time series to others. These are methods that cannot be applied stream-by-stream, but rather require the full context of a request to evaluate time series.
     * 
     */
    @EnumType
    public enum StatisticalTimeSeriesFilterRankingMethod {
        /**
         * Not allowed in well-formed requests.
         * 
         */
        MethodUnspecified("METHOD_UNSPECIFIED"),
        /**
         * Compute the outlier score of each stream.
         * 
         */
        MethodClusterOutlier("METHOD_CLUSTER_OUTLIER");

        private final String value;

        StatisticalTimeSeriesFilterRankingMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StatisticalTimeSeriesFilterRankingMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }