// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse {
    /**
     * @return Segments this audio response is composed of.
     * 
     */
    private List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments;

    private GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse() {}
    /**
     * @return Segments this audio response is composed of.
     * 
     */
    public List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments() {
        return this.segments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments;
        public Builder() {}
        public Builder(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segments = defaults.segments;
        }

        @CustomType.Setter
        public Builder segments(List<GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse> segments) {
            this.segments = Objects.requireNonNull(segments);
            return this;
        }
        public Builder segments(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegmentResponse... segments) {
            return segments(List.of(segments));
        }
        public GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse build() {
            final var o = new GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse();
            o.segments = segments;
            return o;
        }
    }
}