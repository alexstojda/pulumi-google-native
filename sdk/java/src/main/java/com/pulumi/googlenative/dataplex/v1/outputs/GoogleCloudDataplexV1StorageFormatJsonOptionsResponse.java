// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1StorageFormatJsonOptionsResponse {
    /**
     * @return Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34; and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if not specified.
     * 
     */
    private String encoding;

    private GoogleCloudDataplexV1StorageFormatJsonOptionsResponse() {}
    /**
     * @return Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34; and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if not specified.
     * 
     */
    public String encoding() {
        return this.encoding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1StorageFormatJsonOptionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String encoding;
        public Builder() {}
        public Builder(GoogleCloudDataplexV1StorageFormatJsonOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
        }

        @CustomType.Setter
        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }
        public GoogleCloudDataplexV1StorageFormatJsonOptionsResponse build() {
            final var o = new GoogleCloudDataplexV1StorageFormatJsonOptionsResponse();
            o.encoding = encoding;
            return o;
        }
    }
}