// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class MemcacheParametersResponse {
    /**
     * @return User defined set of parameters to use in the memcached process.
     * 
     */
    private Map<String,String> params;

    private MemcacheParametersResponse() {}
    /**
     * @return User defined set of parameters to use in the memcached process.
     * 
     */
    public Map<String,String> params() {
        return this.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemcacheParametersResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> params;
        public Builder() {}
        public Builder(MemcacheParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.params = defaults.params;
        }

        @CustomType.Setter
        public Builder params(Map<String,String> params) {
            this.params = Objects.requireNonNull(params);
            return this;
        }
        public MemcacheParametersResponse build() {
            final var o = new MemcacheParametersResponse();
            o.params = params;
            return o;
        }
    }
}