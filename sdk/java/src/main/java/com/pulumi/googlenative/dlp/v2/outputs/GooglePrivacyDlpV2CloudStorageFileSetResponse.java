// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2CloudStorageFileSetResponse {
    /**
     * @return The url, in the format `gs:///`. Trailing wildcard in the path is allowed.
     * 
     */
    private String url;

    private GooglePrivacyDlpV2CloudStorageFileSetResponse() {}
    /**
     * @return The url, in the format `gs:///`. Trailing wildcard in the path is allowed.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStorageFileSetResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String url;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2CloudStorageFileSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GooglePrivacyDlpV2CloudStorageFileSetResponse build() {
            final var o = new GooglePrivacyDlpV2CloudStorageFileSetResponse();
            o.url = url;
            return o;
        }
    }
}