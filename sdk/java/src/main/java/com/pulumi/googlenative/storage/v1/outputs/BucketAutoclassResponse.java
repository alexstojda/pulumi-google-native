// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketAutoclassResponse {
    /**
     * @return Whether or not Autoclass is enabled on this bucket
     * 
     */
    private Boolean enabled;
    /**
     * @return A date and time in RFC 3339 format representing the instant at which &#34;enabled&#34; was last toggled.
     * 
     */
    private String toggleTime;

    private BucketAutoclassResponse() {}
    /**
     * @return Whether or not Autoclass is enabled on this bucket
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return A date and time in RFC 3339 format representing the instant at which &#34;enabled&#34; was last toggled.
     * 
     */
    public String toggleTime() {
        return this.toggleTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAutoclassResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String toggleTime;
        public Builder() {}
        public Builder(BucketAutoclassResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.toggleTime = defaults.toggleTime;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder toggleTime(String toggleTime) {
            this.toggleTime = Objects.requireNonNull(toggleTime);
            return this;
        }
        public BucketAutoclassResponse build() {
            final var o = new BucketAutoclassResponse();
            o.enabled = enabled;
            o.toggleTime = toggleTime;
            return o;
        }
    }
}