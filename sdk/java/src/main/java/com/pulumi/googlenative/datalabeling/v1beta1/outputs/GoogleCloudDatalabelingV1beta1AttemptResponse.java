// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datalabeling.v1beta1.outputs.GoogleRpcStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatalabelingV1beta1AttemptResponse {
    private String attemptTime;
    /**
     * @return Details of errors that occurred.
     * 
     */
    private List<GoogleRpcStatusResponse> partialFailures;

    private GoogleCloudDatalabelingV1beta1AttemptResponse() {}
    public String attemptTime() {
        return this.attemptTime;
    }
    /**
     * @return Details of errors that occurred.
     * 
     */
    public List<GoogleRpcStatusResponse> partialFailures() {
        return this.partialFailures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1AttemptResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attemptTime;
        private List<GoogleRpcStatusResponse> partialFailures;
        public Builder() {}
        public Builder(GoogleCloudDatalabelingV1beta1AttemptResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attemptTime = defaults.attemptTime;
    	      this.partialFailures = defaults.partialFailures;
        }

        @CustomType.Setter
        public Builder attemptTime(String attemptTime) {
            this.attemptTime = Objects.requireNonNull(attemptTime);
            return this;
        }
        @CustomType.Setter
        public Builder partialFailures(List<GoogleRpcStatusResponse> partialFailures) {
            this.partialFailures = Objects.requireNonNull(partialFailures);
            return this;
        }
        public Builder partialFailures(GoogleRpcStatusResponse... partialFailures) {
            return partialFailures(List.of(partialFailures));
        }
        public GoogleCloudDatalabelingV1beta1AttemptResponse build() {
            final var o = new GoogleCloudDatalabelingV1beta1AttemptResponse();
            o.attemptTime = attemptTime;
            o.partialFailures = partialFailures;
            return o;
        }
    }
}