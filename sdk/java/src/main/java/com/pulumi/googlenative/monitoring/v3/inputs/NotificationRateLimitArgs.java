// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Control over the rate of notifications sent to this alert policy&#39;s notification channels.
 * 
 */
public final class NotificationRateLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRateLimitArgs Empty = new NotificationRateLimitArgs();

    /**
     * Not more than one notification per period.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return Not more than one notification per period.
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    private NotificationRateLimitArgs() {}

    private NotificationRateLimitArgs(NotificationRateLimitArgs $) {
        this.period = $.period;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRateLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRateLimitArgs $;

        public Builder() {
            $ = new NotificationRateLimitArgs();
        }

        public Builder(NotificationRateLimitArgs defaults) {
            $ = new NotificationRateLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param period Not more than one notification per period.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period Not more than one notification per period.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        public NotificationRateLimitArgs build() {
            return $;
        }
    }

}