// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TelemetryResponse {
    /**
     * @return The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
     * 
     */
    private String resourceName;

    private TelemetryResponse() {}
    /**
     * @return The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TelemetryResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceName;
        public Builder() {}
        public Builder(TelemetryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceName = defaults.resourceName;
        }

        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public TelemetryResponse build() {
            final var o = new TelemetryResponse();
            o.resourceName = resourceName;
            return o;
        }
    }
}