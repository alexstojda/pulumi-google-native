// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class VertexResponse {
    /**
     * @return X coordinate.
     * 
     */
    private Integer x;
    /**
     * @return Y coordinate.
     * 
     */
    private Integer y;

    private VertexResponse() {}
    /**
     * @return X coordinate.
     * 
     */
    public Integer x() {
        return this.x;
    }
    /**
     * @return Y coordinate.
     * 
     */
    public Integer y() {
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
        private Integer x;
        private Integer y;
        public Builder() {}
        public Builder(VertexResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        @CustomType.Setter
        public Builder x(Integer x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }
        @CustomType.Setter
        public Builder y(Integer y) {
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