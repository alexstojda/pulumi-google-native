// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.servicemanagement.v1.outputs.BillingDestinationResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BillingResponse {
    /**
     * @return Billing configurations for sending metrics to the consumer project. There can be multiple consumer destinations per service, each one must have a different monitored resource type. A metric can be used in at most one consumer destination.
     * 
     */
    private List<BillingDestinationResponse> consumerDestinations;

    private BillingResponse() {}
    /**
     * @return Billing configurations for sending metrics to the consumer project. There can be multiple consumer destinations per service, each one must have a different monitored resource type. A metric can be used in at most one consumer destination.
     * 
     */
    public List<BillingDestinationResponse> consumerDestinations() {
        return this.consumerDestinations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BillingDestinationResponse> consumerDestinations;
        public Builder() {}
        public Builder(BillingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerDestinations = defaults.consumerDestinations;
        }

        @CustomType.Setter
        public Builder consumerDestinations(List<BillingDestinationResponse> consumerDestinations) {
            this.consumerDestinations = Objects.requireNonNull(consumerDestinations);
            return this;
        }
        public Builder consumerDestinations(BillingDestinationResponse... consumerDestinations) {
            return consumerDestinations(List.of(consumerDestinations));
        }
        public BillingResponse build() {
            final var o = new BillingResponse();
            o.consumerDestinations = consumerDestinations;
            return o;
        }
    }
}