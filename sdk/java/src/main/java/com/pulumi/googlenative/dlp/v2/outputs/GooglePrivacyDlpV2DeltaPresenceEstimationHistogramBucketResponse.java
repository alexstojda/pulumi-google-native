// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse {
    /**
     * @return Number of records within these probability bounds.
     * 
     */
    private String bucketSize;
    /**
     * @return Total number of distinct quasi-identifier tuple values in this bucket.
     * 
     */
    private String bucketValueCount;
    /**
     * @return Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    private List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse> bucketValues;
    /**
     * @return Always greater than or equal to min_probability.
     * 
     */
    private Double maxProbability;
    /**
     * @return Between 0 and 1.
     * 
     */
    private Double minProbability;

    private GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse() {}
    /**
     * @return Number of records within these probability bounds.
     * 
     */
    public String bucketSize() {
        return this.bucketSize;
    }
    /**
     * @return Total number of distinct quasi-identifier tuple values in this bucket.
     * 
     */
    public String bucketValueCount() {
        return this.bucketValueCount;
    }
    /**
     * @return Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    public List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse> bucketValues() {
        return this.bucketValues;
    }
    /**
     * @return Always greater than or equal to min_probability.
     * 
     */
    public Double maxProbability() {
        return this.maxProbability;
    }
    /**
     * @return Between 0 and 1.
     * 
     */
    public Double minProbability() {
        return this.minProbability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketSize;
        private String bucketValueCount;
        private List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse> bucketValues;
        private Double maxProbability;
        private Double minProbability;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.bucketValueCount = defaults.bucketValueCount;
    	      this.bucketValues = defaults.bucketValues;
    	      this.maxProbability = defaults.maxProbability;
    	      this.minProbability = defaults.minProbability;
        }

        @CustomType.Setter
        public Builder bucketSize(String bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }
        @CustomType.Setter
        public Builder bucketValueCount(String bucketValueCount) {
            this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
            return this;
        }
        @CustomType.Setter
        public Builder bucketValues(List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse> bucketValues) {
            this.bucketValues = Objects.requireNonNull(bucketValues);
            return this;
        }
        public Builder bucketValues(GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse... bucketValues) {
            return bucketValues(List.of(bucketValues));
        }
        @CustomType.Setter
        public Builder maxProbability(Double maxProbability) {
            this.maxProbability = Objects.requireNonNull(maxProbability);
            return this;
        }
        @CustomType.Setter
        public Builder minProbability(Double minProbability) {
            this.minProbability = Objects.requireNonNull(minProbability);
            return this;
        }
        public GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse build() {
            final var o = new GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse();
            o.bucketSize = bucketSize;
            o.bucketValueCount = bucketValueCount;
            o.bucketValues = bucketValues;
            o.maxProbability = maxProbability;
            o.minProbability = minProbability;
            return o;
        }
    }
}