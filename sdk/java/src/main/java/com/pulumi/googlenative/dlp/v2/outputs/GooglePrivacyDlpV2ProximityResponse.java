// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ProximityResponse {
    /**
     * @return Number of characters after the finding to consider.
     * 
     */
    private Integer windowAfter;
    /**
     * @return Number of characters before the finding to consider. For tabular data, if you want to modify the likelihood of an entire column of findngs, set this to 1. For more information, see [Hotword example: Set the match likelihood of a table column] (https://cloud.google.com/dlp/docs/creating-custom-infotypes-likelihood#match-column-values).
     * 
     */
    private Integer windowBefore;

    private GooglePrivacyDlpV2ProximityResponse() {}
    /**
     * @return Number of characters after the finding to consider.
     * 
     */
    public Integer windowAfter() {
        return this.windowAfter;
    }
    /**
     * @return Number of characters before the finding to consider. For tabular data, if you want to modify the likelihood of an entire column of findngs, set this to 1. For more information, see [Hotword example: Set the match likelihood of a table column] (https://cloud.google.com/dlp/docs/creating-custom-infotypes-likelihood#match-column-values).
     * 
     */
    public Integer windowBefore() {
        return this.windowBefore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ProximityResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer windowAfter;
        private Integer windowBefore;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2ProximityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowAfter = defaults.windowAfter;
    	      this.windowBefore = defaults.windowBefore;
        }

        @CustomType.Setter
        public Builder windowAfter(Integer windowAfter) {
            this.windowAfter = Objects.requireNonNull(windowAfter);
            return this;
        }
        @CustomType.Setter
        public Builder windowBefore(Integer windowBefore) {
            this.windowBefore = Objects.requireNonNull(windowBefore);
            return this;
        }
        public GooglePrivacyDlpV2ProximityResponse build() {
            final var o = new GooglePrivacyDlpV2ProximityResponse();
            o.windowAfter = windowAfter;
            o.windowBefore = windowBefore;
            return o;
        }
    }
}