// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class BucketVersioningResponse {
    /**
     * @return While set to true, versioning is fully enabled for this bucket.
     * 
     */
    private Boolean enabled;

    private BucketVersioningResponse() {}
    /**
     * @return While set to true, versioning is fully enabled for this bucket.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketVersioningResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(BucketVersioningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public BucketVersioningResponse build() {
            final var o = new BucketVersioningResponse();
            o.enabled = enabled;
            return o;
        }
    }
}