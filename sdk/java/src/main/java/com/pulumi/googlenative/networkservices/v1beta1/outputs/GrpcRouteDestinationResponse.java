// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GrpcRouteDestinationResponse {
    /**
     * @return The URL of a destination service to which to route traffic. Must refer to either a BackendService or ServiceDirectoryService.
     * 
     */
    private String serviceName;
    /**
     * @return Optional. Specifies the proportion of requests forwarded to the backend referenced by the serviceName field. This is computed as: weight/Sum(weights in this destination list). For non-zero values, there may be some epsilon from the exact proportion defined here depending on the precision an implementation supports. If only one serviceName is specified and it has a weight greater than 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one service name, they need to be specified for all of them. If weights are unspecified for all services, then, traffic is distributed in equal proportions to all of them.
     * 
     */
    private Integer weight;

    private GrpcRouteDestinationResponse() {}
    /**
     * @return The URL of a destination service to which to route traffic. Must refer to either a BackendService or ServiceDirectoryService.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return Optional. Specifies the proportion of requests forwarded to the backend referenced by the serviceName field. This is computed as: weight/Sum(weights in this destination list). For non-zero values, there may be some epsilon from the exact proportion defined here depending on the precision an implementation supports. If only one serviceName is specified and it has a weight greater than 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one service name, they need to be specified for all of them. If weights are unspecified for all services, then, traffic is distributed in equal proportions to all of them.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteDestinationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String serviceName;
        private Integer weight;
        public Builder() {}
        public Builder(GrpcRouteDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceName = defaults.serviceName;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        @CustomType.Setter
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public GrpcRouteDestinationResponse build() {
            final var o = new GrpcRouteDestinationResponse();
            o.serviceName = serviceName;
            o.weight = weight;
            return o;
        }
    }
}