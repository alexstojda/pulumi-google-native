// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The bucket&#39;s Autoclass configuration.
 * 
 */
public final class BucketAutoclassArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketAutoclassArgs Empty = new BucketAutoclassArgs();

    /**
     * Whether or not Autoclass is enabled on this bucket
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether or not Autoclass is enabled on this bucket
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A date and time in RFC 3339 format representing the instant at which &#34;enabled&#34; was last toggled.
     * 
     */
    @Import(name="toggleTime")
    private @Nullable Output<String> toggleTime;

    /**
     * @return A date and time in RFC 3339 format representing the instant at which &#34;enabled&#34; was last toggled.
     * 
     */
    public Optional<Output<String>> toggleTime() {
        return Optional.ofNullable(this.toggleTime);
    }

    private BucketAutoclassArgs() {}

    private BucketAutoclassArgs(BucketAutoclassArgs $) {
        this.enabled = $.enabled;
        this.toggleTime = $.toggleTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAutoclassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAutoclassArgs $;

        public Builder() {
            $ = new BucketAutoclassArgs();
        }

        public Builder(BucketAutoclassArgs defaults) {
            $ = new BucketAutoclassArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether or not Autoclass is enabled on this bucket
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not Autoclass is enabled on this bucket
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param toggleTime A date and time in RFC 3339 format representing the instant at which &#34;enabled&#34; was last toggled.
         * 
         * @return builder
         * 
         */
        public Builder toggleTime(@Nullable Output<String> toggleTime) {
            $.toggleTime = toggleTime;
            return this;
        }

        /**
         * @param toggleTime A date and time in RFC 3339 format representing the instant at which &#34;enabled&#34; was last toggled.
         * 
         * @return builder
         * 
         */
        public Builder toggleTime(String toggleTime) {
            return toggleTime(Output.of(toggleTime));
        }

        public BucketAutoclassArgs build() {
            return $;
        }
    }

}