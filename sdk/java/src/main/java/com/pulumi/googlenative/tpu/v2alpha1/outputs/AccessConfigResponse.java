// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu.v2alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessConfigResponse {
    /**
     * @return An external IP address associated with the TPU worker.
     * 
     */
    private String externalIp;

    private AccessConfigResponse() {}
    /**
     * @return An external IP address associated with the TPU worker.
     * 
     */
    public String externalIp() {
        return this.externalIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String externalIp;
        public Builder() {}
        public Builder(AccessConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalIp = defaults.externalIp;
        }

        @CustomType.Setter
        public Builder externalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }
        public AccessConfigResponse build() {
            final var o = new AccessConfigResponse();
            o.externalIp = externalIp;
            return o;
        }
    }
}