// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2TransientCryptoKeyResponse;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2UnwrappedCryptoKeyResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2CryptoKeyResponse {
    /**
     * @return Key wrapped using Cloud KMS
     * 
     */
    private GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse kmsWrapped;
    /**
     * @return Transient crypto key
     * 
     */
    private GooglePrivacyDlpV2TransientCryptoKeyResponse transient_;
    /**
     * @return Unwrapped crypto key
     * 
     */
    private GooglePrivacyDlpV2UnwrappedCryptoKeyResponse unwrapped;

    private GooglePrivacyDlpV2CryptoKeyResponse() {}
    /**
     * @return Key wrapped using Cloud KMS
     * 
     */
    public GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse kmsWrapped() {
        return this.kmsWrapped;
    }
    /**
     * @return Transient crypto key
     * 
     */
    public GooglePrivacyDlpV2TransientCryptoKeyResponse transient_() {
        return this.transient_;
    }
    /**
     * @return Unwrapped crypto key
     * 
     */
    public GooglePrivacyDlpV2UnwrappedCryptoKeyResponse unwrapped() {
        return this.unwrapped;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoKeyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse kmsWrapped;
        private GooglePrivacyDlpV2TransientCryptoKeyResponse transient_;
        private GooglePrivacyDlpV2UnwrappedCryptoKeyResponse unwrapped;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2CryptoKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsWrapped = defaults.kmsWrapped;
    	      this.transient_ = defaults.transient_;
    	      this.unwrapped = defaults.unwrapped;
        }

        @CustomType.Setter
        public Builder kmsWrapped(GooglePrivacyDlpV2KmsWrappedCryptoKeyResponse kmsWrapped) {
            this.kmsWrapped = Objects.requireNonNull(kmsWrapped);
            return this;
        }
        @CustomType.Setter("transient")
        public Builder transient_(GooglePrivacyDlpV2TransientCryptoKeyResponse transient_) {
            this.transient_ = Objects.requireNonNull(transient_);
            return this;
        }
        @CustomType.Setter
        public Builder unwrapped(GooglePrivacyDlpV2UnwrappedCryptoKeyResponse unwrapped) {
            this.unwrapped = Objects.requireNonNull(unwrapped);
            return this;
        }
        public GooglePrivacyDlpV2CryptoKeyResponse build() {
            final var o = new GooglePrivacyDlpV2CryptoKeyResponse();
            o.kmsWrapped = kmsWrapped;
            o.transient_ = transient_;
            o.unwrapped = unwrapped;
            return o;
        }
    }
}