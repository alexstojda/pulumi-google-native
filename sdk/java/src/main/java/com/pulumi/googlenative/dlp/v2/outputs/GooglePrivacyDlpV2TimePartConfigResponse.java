// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2TimePartConfigResponse {
    /**
     * @return The part of the time to keep.
     * 
     */
    private String partToExtract;

    private GooglePrivacyDlpV2TimePartConfigResponse() {}
    /**
     * @return The part of the time to keep.
     * 
     */
    public String partToExtract() {
        return this.partToExtract;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TimePartConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String partToExtract;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2TimePartConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partToExtract = defaults.partToExtract;
        }

        @CustomType.Setter
        public Builder partToExtract(String partToExtract) {
            this.partToExtract = Objects.requireNonNull(partToExtract);
            return this;
        }
        public GooglePrivacyDlpV2TimePartConfigResponse build() {
            final var o = new GooglePrivacyDlpV2TimePartConfigResponse();
            o.partToExtract = partToExtract;
            return o;
        }
    }
}