// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WrappingPublicKeyResponse {
    /**
     * @return The public key, encoded in PEM format. For more information, see the [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
     * 
     */
    private String pem;

    private WrappingPublicKeyResponse() {}
    /**
     * @return The public key, encoded in PEM format. For more information, see the [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
     * 
     */
    public String pem() {
        return this.pem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WrappingPublicKeyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String pem;
        public Builder() {}
        public Builder(WrappingPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pem = defaults.pem;
        }

        @CustomType.Setter
        public Builder pem(String pem) {
            this.pem = Objects.requireNonNull(pem);
            return this;
        }
        public WrappingPublicKeyResponse build() {
            final var o = new WrappingPublicKeyResponse();
            o.pem = pem;
            return o;
        }
    }
}