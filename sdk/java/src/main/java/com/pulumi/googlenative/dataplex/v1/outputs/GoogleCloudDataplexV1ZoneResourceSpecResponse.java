// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1ZoneResourceSpecResponse {
    /**
     * @return Immutable. The location type of the resources that are allowed to be attached to the assets within this zone.
     * 
     */
    private String locationType;

    private GoogleCloudDataplexV1ZoneResourceSpecResponse() {}
    /**
     * @return Immutable. The location type of the resources that are allowed to be attached to the assets within this zone.
     * 
     */
    public String locationType() {
        return this.locationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1ZoneResourceSpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String locationType;
        public Builder() {}
        public Builder(GoogleCloudDataplexV1ZoneResourceSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationType = defaults.locationType;
        }

        @CustomType.Setter
        public Builder locationType(String locationType) {
            this.locationType = Objects.requireNonNull(locationType);
            return this;
        }
        public GoogleCloudDataplexV1ZoneResourceSpecResponse build() {
            final var o = new GoogleCloudDataplexV1ZoneResourceSpecResponse();
            o.locationType = locationType;
            return o;
        }
    }
}