// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2ValueResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ReplaceValueConfigResponse {
    /**
     * @return Value to replace it with.
     * 
     */
    private GooglePrivacyDlpV2ValueResponse newValue;

    private GooglePrivacyDlpV2ReplaceValueConfigResponse() {}
    /**
     * @return Value to replace it with.
     * 
     */
    public GooglePrivacyDlpV2ValueResponse newValue() {
        return this.newValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ReplaceValueConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GooglePrivacyDlpV2ValueResponse newValue;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2ReplaceValueConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newValue = defaults.newValue;
        }

        @CustomType.Setter
        public Builder newValue(GooglePrivacyDlpV2ValueResponse newValue) {
            this.newValue = Objects.requireNonNull(newValue);
            return this;
        }
        public GooglePrivacyDlpV2ReplaceValueConfigResponse build() {
            final var o = new GooglePrivacyDlpV2ReplaceValueConfigResponse();
            o.newValue = newValue;
            return o;
        }
    }
}