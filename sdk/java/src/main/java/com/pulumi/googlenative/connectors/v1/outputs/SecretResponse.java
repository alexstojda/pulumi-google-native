// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecretResponse {
    /**
     * @return The resource name of the secret version in the format, format as: `projects/*{@literal /}secrets/*{@literal /}versions/*`.
     * 
     */
    private String secretVersion;

    private SecretResponse() {}
    /**
     * @return The resource name of the secret version in the format, format as: `projects/*{@literal /}secrets/*{@literal /}versions/*`.
     * 
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretVersion;
        public Builder() {}
        public Builder(SecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretVersion = defaults.secretVersion;
        }

        @CustomType.Setter
        public Builder secretVersion(String secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }
        public SecretResponse build() {
            final var o = new SecretResponse();
            o.secretVersion = secretVersion;
            return o;
        }
    }
}