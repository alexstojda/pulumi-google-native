// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse {
    /**
     * @return The resource name of the KMS CryptoKey to use for unwrapping.
     * 
     */
    private String cryptoKeyName;
    /**
     * @return The wrapped data crypto key.
     * 
     */
    private String wrappedKey;

    private GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse() {}
    /**
     * @return The resource name of the KMS CryptoKey to use for unwrapping.
     * 
     */
    public String cryptoKeyName() {
        return this.cryptoKeyName;
    }
    /**
     * @return The wrapped data crypto key.
     * 
     */
    public String wrappedKey() {
        return this.wrappedKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cryptoKeyName;
        private String wrappedKey;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKeyName = defaults.cryptoKeyName;
    	      this.wrappedKey = defaults.wrappedKey;
        }

        @CustomType.Setter
        public Builder cryptoKeyName(String cryptoKeyName) {
            this.cryptoKeyName = Objects.requireNonNull(cryptoKeyName);
            return this;
        }
        @CustomType.Setter
        public Builder wrappedKey(String wrappedKey) {
            this.wrappedKey = Objects.requireNonNull(wrappedKey);
            return this;
        }
        public GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse build() {
            final var o = new GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse();
            o.cryptoKeyName = cryptoKeyName;
            o.wrappedKey = wrappedKey;
            return o;
        }
    }
}