// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dns.v1.outputs.ManagedZonePeeringConfigTargetNetworkResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedZonePeeringConfigResponse {
    private String kind;
    /**
     * @return The network with which to peer.
     * 
     */
    private ManagedZonePeeringConfigTargetNetworkResponse targetNetwork;

    private ManagedZonePeeringConfigResponse() {}
    public String kind() {
        return this.kind;
    }
    /**
     * @return The network with which to peer.
     * 
     */
    public ManagedZonePeeringConfigTargetNetworkResponse targetNetwork() {
        return this.targetNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kind;
        private ManagedZonePeeringConfigTargetNetworkResponse targetNetwork;
        public Builder() {}
        public Builder(ManagedZonePeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNetwork = defaults.targetNetwork;
        }

        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder targetNetwork(ManagedZonePeeringConfigTargetNetworkResponse targetNetwork) {
            this.targetNetwork = Objects.requireNonNull(targetNetwork);
            return this;
        }
        public ManagedZonePeeringConfigResponse build() {
            final var o = new ManagedZonePeeringConfigResponse();
            o.kind = kind;
            o.targetNetwork = targetNetwork;
            return o;
        }
    }
}