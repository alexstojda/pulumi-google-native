// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class EmptyResponse {
    private EmptyResponse() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmptyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(EmptyResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public EmptyResponse build() {
            final var o = new EmptyResponse();
            return o;
        }
    }
}