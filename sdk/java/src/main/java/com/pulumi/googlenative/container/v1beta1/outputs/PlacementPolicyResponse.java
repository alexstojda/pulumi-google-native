// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PlacementPolicyResponse {
    /**
     * @return The type of placement.
     * 
     */
    private String type;

    private PlacementPolicyResponse() {}
    /**
     * @return The type of placement.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlacementPolicyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(PlacementPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PlacementPolicyResponse build() {
            final var o = new PlacementPolicyResponse();
            o.type = type;
            return o;
        }
    }
}