// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification of how client requests are delayed as part of fault injection before being sent to a destination.
 * 
 */
public final class HttpRouteFaultInjectionPolicyDelayArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteFaultInjectionPolicyDelayArgs Empty = new HttpRouteFaultInjectionPolicyDelayArgs();

    /**
     * Specify a fixed delay before forwarding the request.
     * 
     */
    @Import(name="fixedDelay")
    private @Nullable Output<String> fixedDelay;

    /**
     * @return Specify a fixed delay before forwarding the request.
     * 
     */
    public Optional<Output<String>> fixedDelay() {
        return Optional.ofNullable(this.fixedDelay);
    }

    /**
     * The percentage of traffic on which delay will be injected. The value must be between [0, 100]
     * 
     */
    @Import(name="percentage")
    private @Nullable Output<Integer> percentage;

    /**
     * @return The percentage of traffic on which delay will be injected. The value must be between [0, 100]
     * 
     */
    public Optional<Output<Integer>> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    private HttpRouteFaultInjectionPolicyDelayArgs() {}

    private HttpRouteFaultInjectionPolicyDelayArgs(HttpRouteFaultInjectionPolicyDelayArgs $) {
        this.fixedDelay = $.fixedDelay;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteFaultInjectionPolicyDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteFaultInjectionPolicyDelayArgs $;

        public Builder() {
            $ = new HttpRouteFaultInjectionPolicyDelayArgs();
        }

        public Builder(HttpRouteFaultInjectionPolicyDelayArgs defaults) {
            $ = new HttpRouteFaultInjectionPolicyDelayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixedDelay Specify a fixed delay before forwarding the request.
         * 
         * @return builder
         * 
         */
        public Builder fixedDelay(@Nullable Output<String> fixedDelay) {
            $.fixedDelay = fixedDelay;
            return this;
        }

        /**
         * @param fixedDelay Specify a fixed delay before forwarding the request.
         * 
         * @return builder
         * 
         */
        public Builder fixedDelay(String fixedDelay) {
            return fixedDelay(Output.of(fixedDelay));
        }

        /**
         * @param percentage The percentage of traffic on which delay will be injected. The value must be between [0, 100]
         * 
         * @return builder
         * 
         */
        public Builder percentage(@Nullable Output<Integer> percentage) {
            $.percentage = percentage;
            return this;
        }

        /**
         * @param percentage The percentage of traffic on which delay will be injected. The value must be between [0, 100]
         * 
         * @return builder
         * 
         */
        public Builder percentage(Integer percentage) {
            return percentage(Output.of(percentage));
        }

        public HttpRouteFaultInjectionPolicyDelayArgs build() {
            return $;
        }
    }

}