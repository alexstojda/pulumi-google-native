// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1InterruptionDataResponse {
    private GoogleCloudContactcenterinsightsV1InterruptionDataResponse() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1InterruptionDataResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GoogleCloudContactcenterinsightsV1InterruptionDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GoogleCloudContactcenterinsightsV1InterruptionDataResponse build() {
            final var o = new GoogleCloudContactcenterinsightsV1InterruptionDataResponse();
            return o;
        }
    }
}