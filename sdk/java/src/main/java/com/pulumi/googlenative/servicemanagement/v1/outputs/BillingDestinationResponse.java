// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BillingDestinationResponse {
    /**
     * @return Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
     * 
     */
    private List<String> metrics;
    /**
     * @return The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    private String monitoredResource;

    private BillingDestinationResponse() {}
    /**
     * @return Names of the metrics to report to this billing destination. Each name must be defined in Service.metrics section.
     * 
     */
    public List<String> metrics() {
        return this.metrics;
    }
    /**
     * @return The monitored resource type. The type must be defined in Service.monitored_resources section.
     * 
     */
    public String monitoredResource() {
        return this.monitoredResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingDestinationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> metrics;
        private String monitoredResource;
        public Builder() {}
        public Builder(BillingDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metrics = defaults.metrics;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        @CustomType.Setter
        public Builder metrics(List<String> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }
        @CustomType.Setter
        public Builder monitoredResource(String monitoredResource) {
            this.monitoredResource = Objects.requireNonNull(monitoredResource);
            return this;
        }
        public BillingDestinationResponse build() {
            final var o = new BillingDestinationResponse();
            o.metrics = metrics;
            o.monitoredResource = monitoredResource;
            return o;
        }
    }
}