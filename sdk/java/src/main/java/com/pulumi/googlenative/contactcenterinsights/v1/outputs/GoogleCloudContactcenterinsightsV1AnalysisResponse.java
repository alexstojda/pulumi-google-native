// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1AnalysisResultResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1AnalysisResponse {
    /**
     * @return The result of the analysis, which is populated when the analysis finishes.
     * 
     */
    private GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult;
    /**
     * @return The time at which the analysis was created, which occurs when the long-running operation completes.
     * 
     */
    private String createTime;
    /**
     * @return Immutable. The resource name of the analysis. Format: projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
     * 
     */
    private String name;
    /**
     * @return The time at which the analysis was requested.
     * 
     */
    private String requestTime;

    private GoogleCloudContactcenterinsightsV1AnalysisResponse() {}
    /**
     * @return The result of the analysis, which is populated when the analysis finishes.
     * 
     */
    public GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult() {
        return this.analysisResult;
    }
    /**
     * @return The time at which the analysis was created, which occurs when the long-running operation completes.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Immutable. The resource name of the analysis. Format: projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The time at which the analysis was requested.
     * 
     */
    public String requestTime() {
        return this.requestTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1AnalysisResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult;
        private String createTime;
        private String name;
        private String requestTime;
        public Builder() {}
        public Builder(GoogleCloudContactcenterinsightsV1AnalysisResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisResult = defaults.analysisResult;
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.requestTime = defaults.requestTime;
        }

        @CustomType.Setter
        public Builder analysisResult(GoogleCloudContactcenterinsightsV1AnalysisResultResponse analysisResult) {
            this.analysisResult = Objects.requireNonNull(analysisResult);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder requestTime(String requestTime) {
            this.requestTime = Objects.requireNonNull(requestTime);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1AnalysisResponse build() {
            final var o = new GoogleCloudContactcenterinsightsV1AnalysisResponse();
            o.analysisResult = analysisResult;
            o.createTime = createTime;
            o.name = name;
            o.requestTime = requestTime;
            return o;
        }
    }
}