// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouterAdvertisedIpRangeResponse {
    /**
     * @return User-specified description for the IP range.
     * 
     */
    private String description;
    /**
     * @return The IP range to advertise. The value must be a CIDR-formatted string.
     * 
     */
    private String range;

    private RouterAdvertisedIpRangeResponse() {}
    /**
     * @return User-specified description for the IP range.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The IP range to advertise. The value must be a CIDR-formatted string.
     * 
     */
    public String range() {
        return this.range;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterAdvertisedIpRangeResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String range;
        public Builder() {}
        public Builder(RouterAdvertisedIpRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder range(String range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public RouterAdvertisedIpRangeResponse build() {
            final var o = new RouterAdvertisedIpRangeResponse();
            o.description = description;
            o.range = range;
            return o;
        }
    }
}