// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. The type of sparkchart to show in this chartView.
     * 
     */
    @EnumType
    public enum SparkChartViewSparkChartType {
        /**
         * Not allowed in well-formed requests.
         * 
         */
        SparkChartTypeUnspecified("SPARK_CHART_TYPE_UNSPECIFIED"),
        /**
         * The sparkline will be rendered as a small line chart.
         * 
         */
        SparkLine("SPARK_LINE"),
        /**
         * The sparkbar will be rendered as a small bar chart.
         * 
         */
        SparkBar("SPARK_BAR");

        private final String value;

        SparkChartViewSparkChartType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SparkChartViewSparkChartType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }