// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1.outputs.FingerprintResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ImageNoteResponse {
    /**
     * @return Immutable. The fingerprint of the base image.
     * 
     */
    private FingerprintResponse fingerprint;
    /**
     * @return Immutable. The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    private String resourceUrl;

    private ImageNoteResponse() {}
    /**
     * @return Immutable. The fingerprint of the base image.
     * 
     */
    public FingerprintResponse fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return Immutable. The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    public String resourceUrl() {
        return this.resourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageNoteResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private FingerprintResponse fingerprint;
        private String resourceUrl;
        public Builder() {}
        public Builder(ImageNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.resourceUrl = defaults.resourceUrl;
        }

        @CustomType.Setter
        public Builder fingerprint(FingerprintResponse fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        @CustomType.Setter
        public Builder resourceUrl(String resourceUrl) {
            this.resourceUrl = Objects.requireNonNull(resourceUrl);
            return this;
        }
        public ImageNoteResponse build() {
            final var o = new ImageNoteResponse();
            o.fingerprint = fingerprint;
            o.resourceUrl = resourceUrl;
            return o;
        }
    }
}