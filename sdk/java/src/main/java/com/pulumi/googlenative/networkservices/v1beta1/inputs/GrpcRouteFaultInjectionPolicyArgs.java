// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices.v1beta1.inputs.GrpcRouteFaultInjectionPolicyAbortArgs;
import com.pulumi.googlenative.networkservices.v1beta1.inputs.GrpcRouteFaultInjectionPolicyDelayArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The specification for fault injection introduced into traffic to test the resiliency of clients to destination service failure. As part of fault injection, when clients send requests to a destination, delays can be introduced on a percentage of requests before sending those requests to the destination service. Similarly requests from clients can be aborted by for a percentage of requests.
 * 
 */
public final class GrpcRouteFaultInjectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrpcRouteFaultInjectionPolicyArgs Empty = new GrpcRouteFaultInjectionPolicyArgs();

    /**
     * The specification for aborting to client requests.
     * 
     */
    @Import(name="abort")
    private @Nullable Output<GrpcRouteFaultInjectionPolicyAbortArgs> abort;

    /**
     * @return The specification for aborting to client requests.
     * 
     */
    public Optional<Output<GrpcRouteFaultInjectionPolicyAbortArgs>> abort() {
        return Optional.ofNullable(this.abort);
    }

    /**
     * The specification for injecting delay to client requests.
     * 
     */
    @Import(name="delay")
    private @Nullable Output<GrpcRouteFaultInjectionPolicyDelayArgs> delay;

    /**
     * @return The specification for injecting delay to client requests.
     * 
     */
    public Optional<Output<GrpcRouteFaultInjectionPolicyDelayArgs>> delay() {
        return Optional.ofNullable(this.delay);
    }

    private GrpcRouteFaultInjectionPolicyArgs() {}

    private GrpcRouteFaultInjectionPolicyArgs(GrpcRouteFaultInjectionPolicyArgs $) {
        this.abort = $.abort;
        this.delay = $.delay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrpcRouteFaultInjectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrpcRouteFaultInjectionPolicyArgs $;

        public Builder() {
            $ = new GrpcRouteFaultInjectionPolicyArgs();
        }

        public Builder(GrpcRouteFaultInjectionPolicyArgs defaults) {
            $ = new GrpcRouteFaultInjectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param abort The specification for aborting to client requests.
         * 
         * @return builder
         * 
         */
        public Builder abort(@Nullable Output<GrpcRouteFaultInjectionPolicyAbortArgs> abort) {
            $.abort = abort;
            return this;
        }

        /**
         * @param abort The specification for aborting to client requests.
         * 
         * @return builder
         * 
         */
        public Builder abort(GrpcRouteFaultInjectionPolicyAbortArgs abort) {
            return abort(Output.of(abort));
        }

        /**
         * @param delay The specification for injecting delay to client requests.
         * 
         * @return builder
         * 
         */
        public Builder delay(@Nullable Output<GrpcRouteFaultInjectionPolicyDelayArgs> delay) {
            $.delay = delay;
            return this;
        }

        /**
         * @param delay The specification for injecting delay to client requests.
         * 
         * @return builder
         * 
         */
        public Builder delay(GrpcRouteFaultInjectionPolicyDelayArgs delay) {
            return delay(Output.of(delay));
        }

        public GrpcRouteFaultInjectionPolicyArgs build() {
            return $;
        }
    }

}