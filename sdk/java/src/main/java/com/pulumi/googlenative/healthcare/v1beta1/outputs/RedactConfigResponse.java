// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class RedactConfigResponse {
    private RedactConfigResponse() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedactConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(RedactConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public RedactConfigResponse build() {
            final var o = new RedactConfigResponse();
            return o;
        }
    }
}