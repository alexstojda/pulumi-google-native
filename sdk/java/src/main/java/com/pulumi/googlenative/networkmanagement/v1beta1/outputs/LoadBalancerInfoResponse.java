// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkmanagement.v1beta1.outputs.LoadBalancerBackendResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LoadBalancerInfoResponse {
    /**
     * @return Type of load balancer&#39;s backend configuration.
     * 
     */
    private String backendType;
    /**
     * @return Backend configuration URI.
     * 
     */
    private String backendUri;
    /**
     * @return Information for the loadbalancer backends.
     * 
     */
    private List<LoadBalancerBackendResponse> backends;
    /**
     * @return URI of the health check for the load balancer.
     * 
     */
    private String healthCheckUri;
    /**
     * @return Type of the load balancer.
     * 
     */
    private String loadBalancerType;

    private LoadBalancerInfoResponse() {}
    /**
     * @return Type of load balancer&#39;s backend configuration.
     * 
     */
    public String backendType() {
        return this.backendType;
    }
    /**
     * @return Backend configuration URI.
     * 
     */
    public String backendUri() {
        return this.backendUri;
    }
    /**
     * @return Information for the loadbalancer backends.
     * 
     */
    public List<LoadBalancerBackendResponse> backends() {
        return this.backends;
    }
    /**
     * @return URI of the health check for the load balancer.
     * 
     */
    public String healthCheckUri() {
        return this.healthCheckUri;
    }
    /**
     * @return Type of the load balancer.
     * 
     */
    public String loadBalancerType() {
        return this.loadBalancerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerInfoResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backendType;
        private String backendUri;
        private List<LoadBalancerBackendResponse> backends;
        private String healthCheckUri;
        private String loadBalancerType;
        public Builder() {}
        public Builder(LoadBalancerInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendType = defaults.backendType;
    	      this.backendUri = defaults.backendUri;
    	      this.backends = defaults.backends;
    	      this.healthCheckUri = defaults.healthCheckUri;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        @CustomType.Setter
        public Builder backendType(String backendType) {
            this.backendType = Objects.requireNonNull(backendType);
            return this;
        }
        @CustomType.Setter
        public Builder backendUri(String backendUri) {
            this.backendUri = Objects.requireNonNull(backendUri);
            return this;
        }
        @CustomType.Setter
        public Builder backends(List<LoadBalancerBackendResponse> backends) {
            this.backends = Objects.requireNonNull(backends);
            return this;
        }
        public Builder backends(LoadBalancerBackendResponse... backends) {
            return backends(List.of(backends));
        }
        @CustomType.Setter
        public Builder healthCheckUri(String healthCheckUri) {
            this.healthCheckUri = Objects.requireNonNull(healthCheckUri);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerType(String loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }
        public LoadBalancerInfoResponse build() {
            final var o = new LoadBalancerInfoResponse();
            o.backendType = backendType;
            o.backendUri = backendUri;
            o.backends = backends;
            o.healthCheckUri = healthCheckUri;
            o.loadBalancerType = loadBalancerType;
            return o;
        }
    }
}