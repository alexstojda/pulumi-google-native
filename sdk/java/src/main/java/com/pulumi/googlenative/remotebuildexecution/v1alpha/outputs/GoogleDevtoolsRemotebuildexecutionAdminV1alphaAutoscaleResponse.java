// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse {
    /**
     * @return The maximal number of workers. Must be equal to or greater than min_size.
     * 
     */
    private String maxSize;
    /**
     * @return The minimal number of workers. Must be greater than 0.
     * 
     */
    private String minSize;

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse() {}
    /**
     * @return The maximal number of workers. Must be equal to or greater than min_size.
     * 
     */
    public String maxSize() {
        return this.maxSize;
    }
    /**
     * @return The minimal number of workers. Must be greater than 0.
     * 
     */
    public String minSize() {
        return this.minSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String maxSize;
        private String minSize;
        public Builder() {}
        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
        }

        @CustomType.Setter
        public Builder maxSize(String maxSize) {
            this.maxSize = Objects.requireNonNull(maxSize);
            return this;
        }
        @CustomType.Setter
        public Builder minSize(String minSize) {
            this.minSize = Objects.requireNonNull(minSize);
            return this;
        }
        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse build() {
            final var o = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscaleResponse();
            o.maxSize = maxSize;
            o.minSize = minSize;
            return o;
        }
    }
}