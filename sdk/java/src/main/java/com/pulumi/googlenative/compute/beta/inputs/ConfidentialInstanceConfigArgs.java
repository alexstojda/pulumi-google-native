// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A set of Confidential Instance options.
 * 
 */
public final class ConfidentialInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfidentialInstanceConfigArgs Empty = new ConfidentialInstanceConfigArgs();

    /**
     * Defines whether the instance should have confidential compute enabled.
     * 
     */
    @Import(name="enableConfidentialCompute")
    private @Nullable Output<Boolean> enableConfidentialCompute;

    /**
     * @return Defines whether the instance should have confidential compute enabled.
     * 
     */
    public Optional<Output<Boolean>> enableConfidentialCompute() {
        return Optional.ofNullable(this.enableConfidentialCompute);
    }

    private ConfidentialInstanceConfigArgs() {}

    private ConfidentialInstanceConfigArgs(ConfidentialInstanceConfigArgs $) {
        this.enableConfidentialCompute = $.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfidentialInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfidentialInstanceConfigArgs $;

        public Builder() {
            $ = new ConfidentialInstanceConfigArgs();
        }

        public Builder(ConfidentialInstanceConfigArgs defaults) {
            $ = new ConfidentialInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableConfidentialCompute Defines whether the instance should have confidential compute enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableConfidentialCompute(@Nullable Output<Boolean> enableConfidentialCompute) {
            $.enableConfidentialCompute = enableConfidentialCompute;
            return this;
        }

        /**
         * @param enableConfidentialCompute Defines whether the instance should have confidential compute enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            return enableConfidentialCompute(Output.of(enableConfidentialCompute));
        }

        public ConfidentialInstanceConfigArgs build() {
            return $;
        }
    }

}