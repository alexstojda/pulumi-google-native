// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNatAddressResult {
    /**
     * @return The static IPV4 address.
     * 
     */
    private String ipAddress;
    /**
     * @return Resource ID of the NAT address.
     * 
     */
    private String name;
    /**
     * @return State of the nat address.
     * 
     */
    private String state;

    private GetNatAddressResult() {}
    /**
     * @return The static IPV4 address.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return Resource ID of the NAT address.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return State of the nat address.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatAddressResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipAddress;
        private String name;
        private String state;
        public Builder() {}
        public Builder(GetNatAddressResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetNatAddressResult build() {
            final var o = new GetNatAddressResult();
            o.ipAddress = ipAddress;
            o.name = name;
            o.state = state;
            return o;
        }
    }
}