// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GoogleCloudBillingBudgetsV1LastPeriodAmountResponse {
    private GoogleCloudBillingBudgetsV1LastPeriodAmountResponse() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1LastPeriodAmountResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GoogleCloudBillingBudgetsV1LastPeriodAmountResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GoogleCloudBillingBudgetsV1LastPeriodAmountResponse build() {
            final var o = new GoogleCloudBillingBudgetsV1LastPeriodAmountResponse();
            return o;
        }
    }
}