// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices.v1beta1.outputs.GrpcRouteDestinationResponse;
import com.pulumi.googlenative.networkservices.v1beta1.outputs.GrpcRouteFaultInjectionPolicyResponse;
import com.pulumi.googlenative.networkservices.v1beta1.outputs.GrpcRouteRetryPolicyResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GrpcRouteRouteActionResponse {
    /**
     * @return Optional. The destination services to which traffic should be forwarded. If multiple destinations are specified, traffic will be split between Backend Service(s) according to the weight field of these destinations.
     * 
     */
    private List<GrpcRouteDestinationResponse> destinations;
    /**
     * @return Optional. The specification for fault injection introduced into traffic to test the resiliency of clients to destination service failure. As part of fault injection, when clients send requests to a destination, delays can be introduced on a percentage of requests before sending those requests to the destination service. Similarly requests from clients can be aborted by for a percentage of requests. timeout and retry_policy will be ignored by clients that are configured with a fault_injection_policy
     * 
     */
    private GrpcRouteFaultInjectionPolicyResponse faultInjectionPolicy;
    /**
     * @return Optional. Specifies the retry policy associated with this route.
     * 
     */
    private GrpcRouteRetryPolicyResponse retryPolicy;
    /**
     * @return Optional. Specifies the timeout for selected route. Timeout is computed from the time the request has been fully processed (i.e. end of stream) up until the response has been completely processed. Timeout includes all retries.
     * 
     */
    private String timeout;

    private GrpcRouteRouteActionResponse() {}
    /**
     * @return Optional. The destination services to which traffic should be forwarded. If multiple destinations are specified, traffic will be split between Backend Service(s) according to the weight field of these destinations.
     * 
     */
    public List<GrpcRouteDestinationResponse> destinations() {
        return this.destinations;
    }
    /**
     * @return Optional. The specification for fault injection introduced into traffic to test the resiliency of clients to destination service failure. As part of fault injection, when clients send requests to a destination, delays can be introduced on a percentage of requests before sending those requests to the destination service. Similarly requests from clients can be aborted by for a percentage of requests. timeout and retry_policy will be ignored by clients that are configured with a fault_injection_policy
     * 
     */
    public GrpcRouteFaultInjectionPolicyResponse faultInjectionPolicy() {
        return this.faultInjectionPolicy;
    }
    /**
     * @return Optional. Specifies the retry policy associated with this route.
     * 
     */
    public GrpcRouteRetryPolicyResponse retryPolicy() {
        return this.retryPolicy;
    }
    /**
     * @return Optional. Specifies the timeout for selected route. Timeout is computed from the time the request has been fully processed (i.e. end of stream) up until the response has been completely processed. Timeout includes all retries.
     * 
     */
    public String timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteRouteActionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GrpcRouteDestinationResponse> destinations;
        private GrpcRouteFaultInjectionPolicyResponse faultInjectionPolicy;
        private GrpcRouteRetryPolicyResponse retryPolicy;
        private String timeout;
        public Builder() {}
        public Builder(GrpcRouteRouteActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder destinations(List<GrpcRouteDestinationResponse> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(GrpcRouteDestinationResponse... destinations) {
            return destinations(List.of(destinations));
        }
        @CustomType.Setter
        public Builder faultInjectionPolicy(GrpcRouteFaultInjectionPolicyResponse faultInjectionPolicy) {
            this.faultInjectionPolicy = Objects.requireNonNull(faultInjectionPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder retryPolicy(GrpcRouteRetryPolicyResponse retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public GrpcRouteRouteActionResponse build() {
            final var o = new GrpcRouteRouteActionResponse();
            o.destinations = destinations;
            o.faultInjectionPolicy = faultInjectionPolicy;
            o.retryPolicy = retryPolicy;
            o.timeout = timeout;
            return o;
        }
    }
}