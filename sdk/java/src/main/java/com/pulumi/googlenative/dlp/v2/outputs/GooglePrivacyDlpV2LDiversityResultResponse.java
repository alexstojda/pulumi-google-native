// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2LDiversityHistogramBucketResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2LDiversityResultResponse {
    /**
     * @return Histogram of l-diversity equivalence class sensitive value frequencies.
     * 
     */
    private List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets;

    private GooglePrivacyDlpV2LDiversityResultResponse() {}
    /**
     * @return Histogram of l-diversity equivalence class sensitive value frequencies.
     * 
     */
    public List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets() {
        return this.sensitiveValueFrequencyHistogramBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LDiversityResultResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2LDiversityResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sensitiveValueFrequencyHistogramBuckets = defaults.sensitiveValueFrequencyHistogramBuckets;
        }

        @CustomType.Setter
        public Builder sensitiveValueFrequencyHistogramBuckets(List<GooglePrivacyDlpV2LDiversityHistogramBucketResponse> sensitiveValueFrequencyHistogramBuckets) {
            this.sensitiveValueFrequencyHistogramBuckets = Objects.requireNonNull(sensitiveValueFrequencyHistogramBuckets);
            return this;
        }
        public Builder sensitiveValueFrequencyHistogramBuckets(GooglePrivacyDlpV2LDiversityHistogramBucketResponse... sensitiveValueFrequencyHistogramBuckets) {
            return sensitiveValueFrequencyHistogramBuckets(List.of(sensitiveValueFrequencyHistogramBuckets));
        }
        public GooglePrivacyDlpV2LDiversityResultResponse build() {
            final var o = new GooglePrivacyDlpV2LDiversityResultResponse();
            o.sensitiveValueFrequencyHistogramBuckets = sensitiveValueFrequencyHistogramBuckets;
            return o;
        }
    }
}