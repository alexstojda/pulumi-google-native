// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class LinearResponse {
    /**
     * @return Must be greater than 0.
     * 
     */
    private Integer numFiniteBuckets;
    /**
     * @return Lower bound of the first bucket.
     * 
     */
    private Double offset;
    /**
     * @return Must be greater than 0.
     * 
     */
    private Double width;

    private LinearResponse() {}
    /**
     * @return Must be greater than 0.
     * 
     */
    public Integer numFiniteBuckets() {
        return this.numFiniteBuckets;
    }
    /**
     * @return Lower bound of the first bucket.
     * 
     */
    public Double offset() {
        return this.offset;
    }
    /**
     * @return Must be greater than 0.
     * 
     */
    public Double width() {
        return this.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinearResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer numFiniteBuckets;
        private Double offset;
        private Double width;
        public Builder() {}
        public Builder(LinearResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numFiniteBuckets = defaults.numFiniteBuckets;
    	      this.offset = defaults.offset;
    	      this.width = defaults.width;
        }

        @CustomType.Setter
        public Builder numFiniteBuckets(Integer numFiniteBuckets) {
            this.numFiniteBuckets = Objects.requireNonNull(numFiniteBuckets);
            return this;
        }
        @CustomType.Setter
        public Builder offset(Double offset) {
            this.offset = Objects.requireNonNull(offset);
            return this;
        }
        @CustomType.Setter
        public Builder width(Double width) {
            this.width = Objects.requireNonNull(width);
            return this;
        }
        public LinearResponse build() {
            final var o = new LinearResponse();
            o.numFiniteBuckets = numFiniteBuckets;
            o.offset = offset;
            o.width = width;
            return o;
        }
    }
}