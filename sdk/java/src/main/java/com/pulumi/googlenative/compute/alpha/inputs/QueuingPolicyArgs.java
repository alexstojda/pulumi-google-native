// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.inputs.DurationArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Queuing parameters for the requested deferred capacity.
 * 
 */
public final class QueuingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueuingPolicyArgs Empty = new QueuingPolicyArgs();

    /**
     * Relative deadline for waiting for capacity.
     * 
     */
    @Import(name="validUntilDuration")
    private @Nullable Output<DurationArgs> validUntilDuration;

    /**
     * @return Relative deadline for waiting for capacity.
     * 
     */
    public Optional<Output<DurationArgs>> validUntilDuration() {
        return Optional.ofNullable(this.validUntilDuration);
    }

    /**
     * Absolute deadline for waiting for capacity in RFC3339 text format.
     * 
     */
    @Import(name="validUntilTime")
    private @Nullable Output<String> validUntilTime;

    /**
     * @return Absolute deadline for waiting for capacity in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> validUntilTime() {
        return Optional.ofNullable(this.validUntilTime);
    }

    private QueuingPolicyArgs() {}

    private QueuingPolicyArgs(QueuingPolicyArgs $) {
        this.validUntilDuration = $.validUntilDuration;
        this.validUntilTime = $.validUntilTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueuingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueuingPolicyArgs $;

        public Builder() {
            $ = new QueuingPolicyArgs();
        }

        public Builder(QueuingPolicyArgs defaults) {
            $ = new QueuingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param validUntilDuration Relative deadline for waiting for capacity.
         * 
         * @return builder
         * 
         */
        public Builder validUntilDuration(@Nullable Output<DurationArgs> validUntilDuration) {
            $.validUntilDuration = validUntilDuration;
            return this;
        }

        /**
         * @param validUntilDuration Relative deadline for waiting for capacity.
         * 
         * @return builder
         * 
         */
        public Builder validUntilDuration(DurationArgs validUntilDuration) {
            return validUntilDuration(Output.of(validUntilDuration));
        }

        /**
         * @param validUntilTime Absolute deadline for waiting for capacity in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder validUntilTime(@Nullable Output<String> validUntilTime) {
            $.validUntilTime = validUntilTime;
            return this;
        }

        /**
         * @param validUntilTime Absolute deadline for waiting for capacity in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder validUntilTime(String validUntilTime) {
            return validUntilTime(Output.of(validUntilTime));
        }

        public QueuingPolicyArgs build() {
            return $;
        }
    }

}