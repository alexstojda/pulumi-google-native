// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class StatefulPolicyPreservedStateResponse {
    /**
     * @return Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
     */
    private Map<String,String> disks;
    /**
     * @return External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    private Map<String,String> externalIPs;
    /**
     * @return Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    private Map<String,String> internalIPs;

    private StatefulPolicyPreservedStateResponse() {}
    /**
     * @return Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
     */
    public Map<String,String> disks() {
        return this.disks;
    }
    /**
     * @return External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    public Map<String,String> externalIPs() {
        return this.externalIPs;
    }
    /**
     * @return Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    public Map<String,String> internalIPs() {
        return this.internalIPs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulPolicyPreservedStateResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> disks;
        private Map<String,String> externalIPs;
        private Map<String,String> internalIPs;
        public Builder() {}
        public Builder(StatefulPolicyPreservedStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.externalIPs = defaults.externalIPs;
    	      this.internalIPs = defaults.internalIPs;
        }

        @CustomType.Setter
        public Builder disks(Map<String,String> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }
        @CustomType.Setter
        public Builder externalIPs(Map<String,String> externalIPs) {
            this.externalIPs = Objects.requireNonNull(externalIPs);
            return this;
        }
        @CustomType.Setter
        public Builder internalIPs(Map<String,String> internalIPs) {
            this.internalIPs = Objects.requireNonNull(internalIPs);
            return this;
        }
        public StatefulPolicyPreservedStateResponse build() {
            final var o = new StatefulPolicyPreservedStateResponse();
            o.disks = disks;
            o.externalIPs = externalIPs;
            o.internalIPs = internalIPs;
            return o;
        }
    }
}