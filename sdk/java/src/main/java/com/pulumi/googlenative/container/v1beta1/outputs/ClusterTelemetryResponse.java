// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterTelemetryResponse {
    /**
     * @return Type of the integration.
     * 
     */
    private String type;

    private ClusterTelemetryResponse() {}
    /**
     * @return Type of the integration.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTelemetryResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(ClusterTelemetryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ClusterTelemetryResponse build() {
            final var o = new ClusterTelemetryResponse();
            o.type = type;
            return o;
        }
    }
}