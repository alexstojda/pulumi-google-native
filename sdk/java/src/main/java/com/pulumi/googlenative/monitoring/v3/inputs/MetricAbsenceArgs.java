// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring.v3.inputs.AggregationArgs;
import com.pulumi.googlenative.monitoring.v3.inputs.TriggerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A condition type that checks that monitored resources are reporting data. The configuration defines a metric and a set of monitored resources. The predicate is considered in violation when a time series for the specified metric of a monitored resource does not include any data in the specified duration.
 * 
 */
public final class MetricAbsenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricAbsenceArgs Empty = new MetricAbsenceArgs();

    /**
     * Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
     * 
     */
    @Import(name="aggregations")
    private @Nullable Output<List<AggregationArgs>> aggregations;

    /**
     * @return Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
     * 
     */
    public Optional<Output<List<AggregationArgs>>> aggregations() {
        return Optional.ofNullable(this.aggregations);
    }

    /**
     * The amount of time that a time series must fail to report new data to be considered failing. The minimum value of this field is 120 seconds. Larger values that are a multiple of a minute--for example, 240 or 300 seconds--are supported. If an invalid value is given, an error will be returned. The Duration.nanos field is ignored.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return The amount of time that a time series must fail to report new data to be considered failing. The minimum value of this field is 120 seconds. Larger values that are a multiple of a minute--for example, 240 or 300 seconds--are supported. If an invalid value is given, an error will be returned. The Duration.nanos field is ignored.
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    /**
     * @return A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }

    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations.
     * 
     */
    @Import(name="trigger")
    private @Nullable Output<TriggerArgs> trigger;

    /**
     * @return The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations.
     * 
     */
    public Optional<Output<TriggerArgs>> trigger() {
        return Optional.ofNullable(this.trigger);
    }

    private MetricAbsenceArgs() {}

    private MetricAbsenceArgs(MetricAbsenceArgs $) {
        this.aggregations = $.aggregations;
        this.duration = $.duration;
        this.filter = $.filter;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricAbsenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricAbsenceArgs $;

        public Builder() {
            $ = new MetricAbsenceArgs();
        }

        public Builder(MetricAbsenceArgs defaults) {
            $ = new MetricAbsenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregations Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
         * 
         * @return builder
         * 
         */
        public Builder aggregations(@Nullable Output<List<AggregationArgs>> aggregations) {
            $.aggregations = aggregations;
            return this;
        }

        /**
         * @param aggregations Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
         * 
         * @return builder
         * 
         */
        public Builder aggregations(List<AggregationArgs> aggregations) {
            return aggregations(Output.of(aggregations));
        }

        /**
         * @param aggregations Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
         * 
         * @return builder
         * 
         */
        public Builder aggregations(AggregationArgs... aggregations) {
            return aggregations(List.of(aggregations));
        }

        /**
         * @param duration The amount of time that a time series must fail to report new data to be considered failing. The minimum value of this field is 120 seconds. Larger values that are a multiple of a minute--for example, 240 or 300 seconds--are supported. If an invalid value is given, an error will be returned. The Duration.nanos field is ignored.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The amount of time that a time series must fail to report new data to be considered failing. The minimum value of this field is 120 seconds. Larger values that are a multiple of a minute--for example, 240 or 300 seconds--are supported. If an invalid value is given, an error will be returned. The Duration.nanos field is ignored.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param filter A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param trigger The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations.
         * 
         * @return builder
         * 
         */
        public Builder trigger(@Nullable Output<TriggerArgs> trigger) {
            $.trigger = trigger;
            return this;
        }

        /**
         * @param trigger The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations.
         * 
         * @return builder
         * 
         */
        public Builder trigger(TriggerArgs trigger) {
            return trigger(Output.of(trigger));
        }

        public MetricAbsenceArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            return $;
        }
    }

}