// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudRunV2ResourceRequirementsResponse {
    /**
     * @return Determines whether CPU should be throttled or not outside of requests.
     * 
     */
    private Boolean cpuIdle;
    /**
     * @return Only memory and CPU are supported. Note: The only supported values for CPU are &#39;1&#39;, &#39;2&#39;, and &#39;4&#39;. Setting 4 CPU requires at least 2Gi of memory. The values of the map is string form of the &#39;quantity&#39; k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    private Map<String,String> limits;

    private GoogleCloudRunV2ResourceRequirementsResponse() {}
    /**
     * @return Determines whether CPU should be throttled or not outside of requests.
     * 
     */
    public Boolean cpuIdle() {
        return this.cpuIdle;
    }
    /**
     * @return Only memory and CPU are supported. Note: The only supported values for CPU are &#39;1&#39;, &#39;2&#39;, and &#39;4&#39;. Setting 4 CPU requires at least 2Gi of memory. The values of the map is string form of the &#39;quantity&#39; k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    public Map<String,String> limits() {
        return this.limits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunV2ResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean cpuIdle;
        private Map<String,String> limits;
        public Builder() {}
        public Builder(GoogleCloudRunV2ResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuIdle = defaults.cpuIdle;
    	      this.limits = defaults.limits;
        }

        @CustomType.Setter
        public Builder cpuIdle(Boolean cpuIdle) {
            this.cpuIdle = Objects.requireNonNull(cpuIdle);
            return this;
        }
        @CustomType.Setter
        public Builder limits(Map<String,String> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public GoogleCloudRunV2ResourceRequirementsResponse build() {
            final var o = new GoogleCloudRunV2ResourceRequirementsResponse();
            o.cpuIdle = cpuIdle;
            o.limits = limits;
            return o;
        }
    }
}