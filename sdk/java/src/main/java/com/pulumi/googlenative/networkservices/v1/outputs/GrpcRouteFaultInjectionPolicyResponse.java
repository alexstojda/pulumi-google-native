// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices.v1.outputs.GrpcRouteFaultInjectionPolicyAbortResponse;
import com.pulumi.googlenative.networkservices.v1.outputs.GrpcRouteFaultInjectionPolicyDelayResponse;
import java.util.Objects;

@CustomType
public final class GrpcRouteFaultInjectionPolicyResponse {
    /**
     * @return The specification for aborting to client requests.
     * 
     */
    private GrpcRouteFaultInjectionPolicyAbortResponse abort;
    /**
     * @return The specification for injecting delay to client requests.
     * 
     */
    private GrpcRouteFaultInjectionPolicyDelayResponse delay;

    private GrpcRouteFaultInjectionPolicyResponse() {}
    /**
     * @return The specification for aborting to client requests.
     * 
     */
    public GrpcRouteFaultInjectionPolicyAbortResponse abort() {
        return this.abort;
    }
    /**
     * @return The specification for injecting delay to client requests.
     * 
     */
    public GrpcRouteFaultInjectionPolicyDelayResponse delay() {
        return this.delay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrpcRouteFaultInjectionPolicyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GrpcRouteFaultInjectionPolicyAbortResponse abort;
        private GrpcRouteFaultInjectionPolicyDelayResponse delay;
        public Builder() {}
        public Builder(GrpcRouteFaultInjectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abort = defaults.abort;
    	      this.delay = defaults.delay;
        }

        @CustomType.Setter
        public Builder abort(GrpcRouteFaultInjectionPolicyAbortResponse abort) {
            this.abort = Objects.requireNonNull(abort);
            return this;
        }
        @CustomType.Setter
        public Builder delay(GrpcRouteFaultInjectionPolicyDelayResponse delay) {
            this.delay = Objects.requireNonNull(delay);
            return this;
        }
        public GrpcRouteFaultInjectionPolicyResponse build() {
            final var o = new GrpcRouteFaultInjectionPolicyResponse();
            o.abort = abort;
            o.delay = delay;
            return o;
        }
    }
}