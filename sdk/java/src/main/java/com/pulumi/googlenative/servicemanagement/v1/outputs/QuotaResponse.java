// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.servicemanagement.v1.outputs.MetricRuleResponse;
import com.pulumi.googlenative.servicemanagement.v1.outputs.QuotaLimitResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class QuotaResponse {
    /**
     * @return List of `QuotaLimit` definitions for the service.
     * 
     */
    private List<QuotaLimitResponse> limits;
    /**
     * @return List of `MetricRule` definitions, each one mapping a selected method to one or more metrics.
     * 
     */
    private List<MetricRuleResponse> metricRules;

    private QuotaResponse() {}
    /**
     * @return List of `QuotaLimit` definitions for the service.
     * 
     */
    public List<QuotaLimitResponse> limits() {
        return this.limits;
    }
    /**
     * @return List of `MetricRule` definitions, each one mapping a selected method to one or more metrics.
     * 
     */
    public List<MetricRuleResponse> metricRules() {
        return this.metricRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<QuotaLimitResponse> limits;
        private List<MetricRuleResponse> metricRules;
        public Builder() {}
        public Builder(QuotaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.metricRules = defaults.metricRules;
        }

        @CustomType.Setter
        public Builder limits(List<QuotaLimitResponse> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public Builder limits(QuotaLimitResponse... limits) {
            return limits(List.of(limits));
        }
        @CustomType.Setter
        public Builder metricRules(List<MetricRuleResponse> metricRules) {
            this.metricRules = Objects.requireNonNull(metricRules);
            return this;
        }
        public Builder metricRules(MetricRuleResponse... metricRules) {
            return metricRules(List.of(metricRules));
        }
        public QuotaResponse build() {
            final var o = new QuotaResponse();
            o.limits = limits;
            o.metricRules = metricRules;
            return o;
        }
    }
}