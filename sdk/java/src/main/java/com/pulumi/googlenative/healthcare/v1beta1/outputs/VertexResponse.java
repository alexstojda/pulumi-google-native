// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class VertexResponse {
    /**
     * @return X coordinate.
     * 
     */
    private Double x;
    /**
     * @return Y coordinate.
     * 
     */
    private Double y;

    private VertexResponse() {}
    /**
     * @return X coordinate.
     * 
     */
    public Double x() {
        return this.x;
    }
    /**
     * @return Y coordinate.
     * 
     */
    public Double y() {
        return this.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VertexResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double x;
        private Double y;
        public Builder() {}
        public Builder(VertexResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        @CustomType.Setter
        public Builder x(Double x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }
        @CustomType.Setter
        public Builder y(Double y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }
        public VertexResponse build() {
            final var o = new VertexResponse();
            o.x = x;
            o.y = y;
            return o;
        }
    }
}