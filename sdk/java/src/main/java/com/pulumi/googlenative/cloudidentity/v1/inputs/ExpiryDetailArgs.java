// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The `MembershipRole` expiry details.
 * 
 */
public final class ExpiryDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExpiryDetailArgs Empty = new ExpiryDetailArgs();

    /**
     * The time at which the `MembershipRole` will expire.
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<String> expireTime;

    /**
     * @return The time at which the `MembershipRole` will expire.
     * 
     */
    public Optional<Output<String>> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    private ExpiryDetailArgs() {}

    private ExpiryDetailArgs(ExpiryDetailArgs $) {
        this.expireTime = $.expireTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpiryDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpiryDetailArgs $;

        public Builder() {
            $ = new ExpiryDetailArgs();
        }

        public Builder(ExpiryDetailArgs defaults) {
            $ = new ExpiryDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expireTime The time at which the `MembershipRole` will expire.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime The time at which the `MembershipRole` will expire.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        public ExpiryDetailArgs build() {
            return $;
        }
    }

}