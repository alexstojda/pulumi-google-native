// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AutoscalingPolicyCustomMetricUtilizationResponse {
    /**
     * @return A filter string, compatible with a Stackdriver Monitoring filter string for TimeSeries.list API call. This filter is used to select a specific TimeSeries for the purpose of autoscaling and to determine whether the metric is exporting per-instance or per-group data. For the filter to be valid for autoscaling purposes, the following rules apply: - You can only use the AND operator for joining selectors. - You can only use direct equality comparison operator (=) without any functions for each selector. - You can specify the metric in both the filter string and in the metric field. However, if specified in both places, the metric must be identical. - The monitored resource type determines what kind of values are expected for the metric. If it is a gce_instance, the autoscaler expects the metric to include a separate TimeSeries for each instance in a group. In such a case, you cannot filter on resource labels. If the resource type is any other value, the autoscaler expects this metric to contain values that apply to the entire autoscaled instance group and resource label filtering can be performed to point autoscaler at the correct TimeSeries to scale upon. This is called a *per-group metric* for the purpose of autoscaling. If not specified, the type defaults to gce_instance. Try to provide a filter that is selective enough to pick just one TimeSeries for the autoscaled group or for each of the instances (if you are using gce_instance resource type). If multiple TimeSeries are returned upon the query execution, the autoscaler will sum their respective values to obtain its scaling value.
     * 
     */
    private String filter;
    /**
     * @return The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values. The metric must have a value type of INT64 or DOUBLE.
     * 
     */
    private String metric;
    /**
     * @return If scaling is based on a per-group metric value that represents the total amount of work to be done or resource usage, set this value to an amount assigned for a single instance of the scaled group. Autoscaler keeps the number of instances proportional to the value of this metric. The metric itself does not change value due to group resizing. A good metric to use with the target is for example pubsub.googleapis.com/subscription/num_undelivered_messages or a custom metric exporting the total number of requests coming to your instances. A bad example would be a metric exporting an average or median latency, since this value can&#39;t include a chunk assignable to a single instance, it could be better used with utilization_target instead.
     * 
     */
    private Double singleInstanceAssignment;
    /**
     * @return The target value of the metric that autoscaler maintains. This must be a positive value. A utilization metric scales number of virtual machines handling requests to increase or decrease proportionally to the metric. For example, a good metric to use as a utilization_target is https://www.googleapis.com/compute/v1/instance/network/received_bytes_count. The autoscaler works to keep this value constant for each of the instances.
     * 
     */
    private Double utilizationTarget;
    /**
     * @return Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
     * 
     */
    private String utilizationTargetType;

    private AutoscalingPolicyCustomMetricUtilizationResponse() {}
    /**
     * @return A filter string, compatible with a Stackdriver Monitoring filter string for TimeSeries.list API call. This filter is used to select a specific TimeSeries for the purpose of autoscaling and to determine whether the metric is exporting per-instance or per-group data. For the filter to be valid for autoscaling purposes, the following rules apply: - You can only use the AND operator for joining selectors. - You can only use direct equality comparison operator (=) without any functions for each selector. - You can specify the metric in both the filter string and in the metric field. However, if specified in both places, the metric must be identical. - The monitored resource type determines what kind of values are expected for the metric. If it is a gce_instance, the autoscaler expects the metric to include a separate TimeSeries for each instance in a group. In such a case, you cannot filter on resource labels. If the resource type is any other value, the autoscaler expects this metric to contain values that apply to the entire autoscaled instance group and resource label filtering can be performed to point autoscaler at the correct TimeSeries to scale upon. This is called a *per-group metric* for the purpose of autoscaling. If not specified, the type defaults to gce_instance. Try to provide a filter that is selective enough to pick just one TimeSeries for the autoscaled group or for each of the instances (if you are using gce_instance resource type). If multiple TimeSeries are returned upon the query execution, the autoscaler will sum their respective values to obtain its scaling value.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return The identifier (type) of the Stackdriver Monitoring metric. The metric cannot have negative values. The metric must have a value type of INT64 or DOUBLE.
     * 
     */
    public String metric() {
        return this.metric;
    }
    /**
     * @return If scaling is based on a per-group metric value that represents the total amount of work to be done or resource usage, set this value to an amount assigned for a single instance of the scaled group. Autoscaler keeps the number of instances proportional to the value of this metric. The metric itself does not change value due to group resizing. A good metric to use with the target is for example pubsub.googleapis.com/subscription/num_undelivered_messages or a custom metric exporting the total number of requests coming to your instances. A bad example would be a metric exporting an average or median latency, since this value can&#39;t include a chunk assignable to a single instance, it could be better used with utilization_target instead.
     * 
     */
    public Double singleInstanceAssignment() {
        return this.singleInstanceAssignment;
    }
    /**
     * @return The target value of the metric that autoscaler maintains. This must be a positive value. A utilization metric scales number of virtual machines handling requests to increase or decrease proportionally to the metric. For example, a good metric to use as a utilization_target is https://www.googleapis.com/compute/v1/instance/network/received_bytes_count. The autoscaler works to keep this value constant for each of the instances.
     * 
     */
    public Double utilizationTarget() {
        return this.utilizationTarget;
    }
    /**
     * @return Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
     * 
     */
    public String utilizationTargetType() {
        return this.utilizationTargetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyCustomMetricUtilizationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String filter;
        private String metric;
        private Double singleInstanceAssignment;
        private Double utilizationTarget;
        private String utilizationTargetType;
        public Builder() {}
        public Builder(AutoscalingPolicyCustomMetricUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.metric = defaults.metric;
    	      this.singleInstanceAssignment = defaults.singleInstanceAssignment;
    	      this.utilizationTarget = defaults.utilizationTarget;
    	      this.utilizationTargetType = defaults.utilizationTargetType;
        }

        @CustomType.Setter
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        @CustomType.Setter
        public Builder metric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        @CustomType.Setter
        public Builder singleInstanceAssignment(Double singleInstanceAssignment) {
            this.singleInstanceAssignment = Objects.requireNonNull(singleInstanceAssignment);
            return this;
        }
        @CustomType.Setter
        public Builder utilizationTarget(Double utilizationTarget) {
            this.utilizationTarget = Objects.requireNonNull(utilizationTarget);
            return this;
        }
        @CustomType.Setter
        public Builder utilizationTargetType(String utilizationTargetType) {
            this.utilizationTargetType = Objects.requireNonNull(utilizationTargetType);
            return this;
        }
        public AutoscalingPolicyCustomMetricUtilizationResponse build() {
            final var o = new AutoscalingPolicyCustomMetricUtilizationResponse();
            o.filter = filter;
            o.metric = metric;
            o.singleInstanceAssignment = singleInstanceAssignment;
            o.utilizationTarget = utilizationTarget;
            o.utilizationTargetType = utilizationTargetType;
            return o;
        }
    }
}