// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1AssetResourceSpecResponse {
    /**
     * @return Immutable. Relative name of the cloud resource that contains the data that is being managed within a lake. For example: projects/{project_number}/buckets/{bucket_id} projects/{project_number}/datasets/{dataset_id}
     * 
     */
    private String name;
    /**
     * @return Immutable. Type of resource.
     * 
     */
    private String type;

    private GoogleCloudDataplexV1AssetResourceSpecResponse() {}
    /**
     * @return Immutable. Relative name of the cloud resource that contains the data that is being managed within a lake. For example: projects/{project_number}/buckets/{bucket_id} projects/{project_number}/datasets/{dataset_id}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Immutable. Type of resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1AssetResourceSpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        public Builder() {}
        public Builder(GoogleCloudDataplexV1AssetResourceSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDataplexV1AssetResourceSpecResponse build() {
            final var o = new GoogleCloudDataplexV1AssetResourceSpecResponse();
            o.name = name;
            o.type = type;
            return o;
        }
    }
}