// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GrpcRouteFaultInjectionPolicyAbortResponse {
    /**
     * @return The HTTP status code used to abort the request. The value must be between 200 and 599 inclusive.
     * 
     */
    private Integer httpStatus;
    /**
     * @return The percentage of traffic which will be aborted. The value must be between [0, 100]
     * 
     */
    private Integer percentage;

    private GrpcRouteFaultInjectionPolicyAbortResponse() {}
    /**
     * @return The HTTP status code used to abort the request. The value must be between 200 and 599 inclusive.
     * 
     */
    public Integer httpStatus() {
        return this.httpStatus;
    }
    /**
     * @return The percentage of traffic which will be aborted. The value must be between [0, 100]
     * 
     */
    public Integer percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteFaultInjectionPolicyAbortResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer httpStatus;
        private Integer percentage;
        public Builder() {}
        public Builder(GrpcRouteFaultInjectionPolicyAbortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder httpStatus(Integer httpStatus) {
            this.httpStatus = Objects.requireNonNull(httpStatus);
            return this;
        }
        @CustomType.Setter
        public Builder percentage(Integer percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        public GrpcRouteFaultInjectionPolicyAbortResponse build() {
            final var o = new GrpcRouteFaultInjectionPolicyAbortResponse();
            o.httpStatus = httpStatus;
            o.percentage = percentage;
            return o;
        }
    }
}