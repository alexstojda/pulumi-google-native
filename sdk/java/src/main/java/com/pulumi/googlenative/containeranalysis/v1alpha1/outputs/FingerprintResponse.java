// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FingerprintResponse {
    /**
     * @return The layer-id of the final layer in the Docker image&#39;s v1 representation. This field can be used as a filter in list requests.
     * 
     */
    private String v1Name;
    /**
     * @return The ordered list of v2 blobs that represent a given image.
     * 
     */
    private List<String> v2Blob;
    /**
     * @return The name of the image&#39;s v2 blobs computed via: [bottom] := v2_blobbottom := sha256(v2_blob[N] + &#34; &#34; + v2_name[N+1]) Only the name of the final blob is kept. This field can be used as a filter in list requests.
     * 
     */
    private String v2Name;

    private FingerprintResponse() {}
    /**
     * @return The layer-id of the final layer in the Docker image&#39;s v1 representation. This field can be used as a filter in list requests.
     * 
     */
    public String v1Name() {
        return this.v1Name;
    }
    /**
     * @return The ordered list of v2 blobs that represent a given image.
     * 
     */
    public List<String> v2Blob() {
        return this.v2Blob;
    }
    /**
     * @return The name of the image&#39;s v2 blobs computed via: [bottom] := v2_blobbottom := sha256(v2_blob[N] + &#34; &#34; + v2_name[N+1]) Only the name of the final blob is kept. This field can be used as a filter in list requests.
     * 
     */
    public String v2Name() {
        return this.v2Name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FingerprintResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String v1Name;
        private List<String> v2Blob;
        private String v2Name;
        public Builder() {}
        public Builder(FingerprintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.v1Name = defaults.v1Name;
    	      this.v2Blob = defaults.v2Blob;
    	      this.v2Name = defaults.v2Name;
        }

        @CustomType.Setter
        public Builder v1Name(String v1Name) {
            this.v1Name = Objects.requireNonNull(v1Name);
            return this;
        }
        @CustomType.Setter
        public Builder v2Blob(List<String> v2Blob) {
            this.v2Blob = Objects.requireNonNull(v2Blob);
            return this;
        }
        public Builder v2Blob(String... v2Blob) {
            return v2Blob(List.of(v2Blob));
        }
        @CustomType.Setter
        public Builder v2Name(String v2Name) {
            this.v2Name = Objects.requireNonNull(v2Name);
            return this;
        }
        public FingerprintResponse build() {
            final var o = new FingerprintResponse();
            o.v1Name = v1Name;
            o.v2Blob = v2Blob;
            o.v2Name = v2Name;
            return o;
        }
    }
}