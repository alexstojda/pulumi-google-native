// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1PersonalDetailsResponse {
    /**
     * @return Set if the entry is starred; unset otherwise.
     * 
     */
    private String starTime;
    /**
     * @return True if the entry is starred by the user; false otherwise.
     * 
     */
    private Boolean starred;

    private GoogleCloudDatacatalogV1PersonalDetailsResponse() {}
    /**
     * @return Set if the entry is starred; unset otherwise.
     * 
     */
    public String starTime() {
        return this.starTime;
    }
    /**
     * @return True if the entry is starred by the user; false otherwise.
     * 
     */
    public Boolean starred() {
        return this.starred;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1PersonalDetailsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String starTime;
        private Boolean starred;
        public Builder() {}
        public Builder(GoogleCloudDatacatalogV1PersonalDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.starTime = defaults.starTime;
    	      this.starred = defaults.starred;
        }

        @CustomType.Setter
        public Builder starTime(String starTime) {
            this.starTime = Objects.requireNonNull(starTime);
            return this;
        }
        @CustomType.Setter
        public Builder starred(Boolean starred) {
            this.starred = Objects.requireNonNull(starred);
            return this;
        }
        public GoogleCloudDatacatalogV1PersonalDetailsResponse build() {
            final var o = new GoogleCloudDatacatalogV1PersonalDetailsResponse();
            o.starTime = starTime;
            o.starred = starred;
            return o;
        }
    }
}