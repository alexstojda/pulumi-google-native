// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.runtimeconfig.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CardinalityResponse {
    /**
     * @return The number variables under the `path` that must exist to meet this condition. Defaults to 1 if not specified.
     * 
     */
    private Integer number;
    /**
     * @return The root of the variable subtree to monitor. For example, `/foo`.
     * 
     */
    private String path;

    private CardinalityResponse() {}
    /**
     * @return The number variables under the `path` that must exist to meet this condition. Defaults to 1 if not specified.
     * 
     */
    public Integer number() {
        return this.number;
    }
    /**
     * @return The root of the variable subtree to monitor. For example, `/foo`.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CardinalityResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer number;
        private String path;
        public Builder() {}
        public Builder(CardinalityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.number = defaults.number;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public CardinalityResponse build() {
            final var o = new CardinalityResponse();
            o.number = number;
            o.path = path;
            return o;
        }
    }
}