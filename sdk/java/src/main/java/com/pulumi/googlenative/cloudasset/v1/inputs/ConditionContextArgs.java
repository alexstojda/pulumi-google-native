// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The IAM conditions context.
 * 
 */
public final class ConditionContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionContextArgs Empty = new ConditionContextArgs();

    /**
     * The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned.
     * 
     */
    @Import(name="accessTime")
    private @Nullable Output<String> accessTime;

    /**
     * @return The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned.
     * 
     */
    public Optional<Output<String>> accessTime() {
        return Optional.ofNullable(this.accessTime);
    }

    private ConditionContextArgs() {}

    private ConditionContextArgs(ConditionContextArgs $) {
        this.accessTime = $.accessTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionContextArgs $;

        public Builder() {
            $ = new ConditionContextArgs();
        }

        public Builder(ConditionContextArgs defaults) {
            $ = new ConditionContextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessTime The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder accessTime(@Nullable Output<String> accessTime) {
            $.accessTime = accessTime;
            return this;
        }

        /**
         * @param accessTime The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder accessTime(String accessTime) {
            return accessTime(Output.of(accessTime));
        }

        public ConditionContextArgs build() {
            return $;
        }
    }

}