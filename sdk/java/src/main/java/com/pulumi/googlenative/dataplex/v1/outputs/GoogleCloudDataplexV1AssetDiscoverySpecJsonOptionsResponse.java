// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsResponse {
    /**
     * @return Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
     * 
     */
    private Boolean disableTypeInference;
    /**
     * @return Optional. The character encoding of the data. The default is UTF-8.
     * 
     */
    private String encoding;

    private GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsResponse() {}
    /**
     * @return Optional. Whether to disable the inference of data type for Json data. If true, all columns will be registered as their primitive types (strings, number or boolean).
     * 
     */
    public Boolean disableTypeInference() {
        return this.disableTypeInference;
    }
    /**
     * @return Optional. The character encoding of the data. The default is UTF-8.
     * 
     */
    public String encoding() {
        return this.encoding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disableTypeInference;
        private String encoding;
        public Builder() {}
        public Builder(GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableTypeInference = defaults.disableTypeInference;
    	      this.encoding = defaults.encoding;
        }

        @CustomType.Setter
        public Builder disableTypeInference(Boolean disableTypeInference) {
            this.disableTypeInference = Objects.requireNonNull(disableTypeInference);
            return this;
        }
        @CustomType.Setter
        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }
        public GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsResponse build() {
            final var o = new GoogleCloudDataplexV1AssetDiscoverySpecJsonOptionsResponse();
            o.disableTypeInference = disableTypeInference;
            o.encoding = encoding;
            return o;
        }
    }
}