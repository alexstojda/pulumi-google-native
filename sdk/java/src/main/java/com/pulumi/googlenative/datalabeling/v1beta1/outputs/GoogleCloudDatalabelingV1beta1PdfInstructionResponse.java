// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatalabelingV1beta1PdfInstructionResponse {
    /**
     * @return PDF file for the instruction. Only gcs path is allowed.
     * 
     */
    private String gcsFileUri;

    private GoogleCloudDatalabelingV1beta1PdfInstructionResponse() {}
    /**
     * @return PDF file for the instruction. Only gcs path is allowed.
     * 
     */
    public String gcsFileUri() {
        return this.gcsFileUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1PdfInstructionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gcsFileUri;
        public Builder() {}
        public Builder(GoogleCloudDatalabelingV1beta1PdfInstructionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsFileUri = defaults.gcsFileUri;
        }

        @CustomType.Setter
        public Builder gcsFileUri(String gcsFileUri) {
            this.gcsFileUri = Objects.requireNonNull(gcsFileUri);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1PdfInstructionResponse build() {
            final var o = new GoogleCloudDatalabelingV1beta1PdfInstructionResponse();
            o.gcsFileUri = gcsFileUri;
            return o;
        }
    }
}