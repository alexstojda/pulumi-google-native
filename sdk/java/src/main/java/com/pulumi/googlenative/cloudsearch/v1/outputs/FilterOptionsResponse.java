// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudsearch.v1.outputs.FilterResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FilterOptionsResponse {
    /**
     * @return Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
     * 
     */
    private FilterResponse filter;
    /**
     * @return If object_type is set, only objects of that type are returned. This should correspond to the name of the object that was registered within the definition of schema. The maximum length is 256 characters.
     * 
     */
    private String objectType;

    private FilterOptionsResponse() {}
    /**
     * @return Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
     * 
     */
    public FilterResponse filter() {
        return this.filter;
    }
    /**
     * @return If object_type is set, only objects of that type are returned. This should correspond to the name of the object that was registered within the definition of schema. The maximum length is 256 characters.
     * 
     */
    public String objectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterOptionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private FilterResponse filter;
        private String objectType;
        public Builder() {}
        public Builder(FilterOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.objectType = defaults.objectType;
        }

        @CustomType.Setter
        public Builder filter(FilterResponse filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        @CustomType.Setter
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public FilterOptionsResponse build() {
            final var o = new FilterOptionsResponse();
            o.filter = filter;
            o.objectType = objectType;
            return o;
        }
    }
}