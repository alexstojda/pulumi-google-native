// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vision.v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProductSetResult {
    /**
     * @return The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    private String displayName;
    /**
     * @return If there was an error with indexing the product set, the field is populated. This field is ignored when creating a ProductSet.
     * 
     */
    private StatusResponse indexError;
    /**
     * @return The time at which this ProductSet was last indexed. Query results will reflect all updates before this time. If this ProductSet has never been indexed, this timestamp is the default value &#34;1970-01-01T00:00:00Z&#34;. This field is ignored when creating a ProductSet.
     * 
     */
    private String indexTime;
    /**
     * @return The resource name of the ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`. This field is ignored when creating a ProductSet.
     * 
     */
    private String name;

    private GetProductSetResult() {}
    /**
     * @return The user-provided name for this ProductSet. Must not be empty. Must be at most 4096 characters long.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return If there was an error with indexing the product set, the field is populated. This field is ignored when creating a ProductSet.
     * 
     */
    public StatusResponse indexError() {
        return this.indexError;
    }
    /**
     * @return The time at which this ProductSet was last indexed. Query results will reflect all updates before this time. If this ProductSet has never been indexed, this timestamp is the default value &#34;1970-01-01T00:00:00Z&#34;. This field is ignored when creating a ProductSet.
     * 
     */
    public String indexTime() {
        return this.indexTime;
    }
    /**
     * @return The resource name of the ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`. This field is ignored when creating a ProductSet.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductSetResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private StatusResponse indexError;
        private String indexTime;
        private String name;
        public Builder() {}
        public Builder(GetProductSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.indexError = defaults.indexError;
    	      this.indexTime = defaults.indexTime;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder indexError(StatusResponse indexError) {
            this.indexError = Objects.requireNonNull(indexError);
            return this;
        }
        @CustomType.Setter
        public Builder indexTime(String indexTime) {
            this.indexTime = Objects.requireNonNull(indexTime);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetProductSetResult build() {
            final var o = new GetProductSetResult();
            o.displayName = displayName;
            o.indexError = indexError;
            o.indexTime = indexTime;
            o.name = name;
            return o;
        }
    }
}