// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BasicScalingResponse {
    /**
     * @return Duration of time after the last request that an instance must wait before the instance is shut down.
     * 
     */
    private String idleTimeout;
    /**
     * @return Maximum number of instances to create for this version.
     * 
     */
    private Integer maxInstances;

    private BasicScalingResponse() {}
    /**
     * @return Duration of time after the last request that an instance must wait before the instance is shut down.
     * 
     */
    public String idleTimeout() {
        return this.idleTimeout;
    }
    /**
     * @return Maximum number of instances to create for this version.
     * 
     */
    public Integer maxInstances() {
        return this.maxInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicScalingResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String idleTimeout;
        private Integer maxInstances;
        public Builder() {}
        public Builder(BasicScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.maxInstances = defaults.maxInstances;
        }

        @CustomType.Setter
        public Builder idleTimeout(String idleTimeout) {
            this.idleTimeout = Objects.requireNonNull(idleTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder maxInstances(Integer maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }
        public BasicScalingResponse build() {
            final var o = new BasicScalingResponse();
            o.idleTimeout = idleTimeout;
            o.maxInstances = maxInstances;
            return o;
        }
    }
}