// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomHttpPatternResponse {
    /**
     * @return The name of this custom HTTP verb.
     * 
     */
    private String kind;
    /**
     * @return The path matched by this custom verb.
     * 
     */
    private String path;

    private CustomHttpPatternResponse() {}
    /**
     * @return The name of this custom HTTP verb.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The path matched by this custom verb.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHttpPatternResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kind;
        private String path;
        public Builder() {}
        public Builder(CustomHttpPatternResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public CustomHttpPatternResponse build() {
            final var o = new CustomHttpPatternResponse();
            o.kind = kind;
            o.path = path;
            return o;
        }
    }
}