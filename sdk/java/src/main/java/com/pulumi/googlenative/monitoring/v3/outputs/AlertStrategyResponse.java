// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring.v3.outputs.NotificationRateLimitResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AlertStrategyResponse {
    /**
     * @return If an alert policy that was active has no data for this long, any open incidents will close
     * 
     */
    private String autoClose;
    /**
     * @return Required for alert policies with a LogMatch condition.This limit is not implemented for alert policies that are not log-based.
     * 
     */
    private NotificationRateLimitResponse notificationRateLimit;

    private AlertStrategyResponse() {}
    /**
     * @return If an alert policy that was active has no data for this long, any open incidents will close
     * 
     */
    public String autoClose() {
        return this.autoClose;
    }
    /**
     * @return Required for alert policies with a LogMatch condition.This limit is not implemented for alert policies that are not log-based.
     * 
     */
    public NotificationRateLimitResponse notificationRateLimit() {
        return this.notificationRateLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertStrategyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoClose;
        private NotificationRateLimitResponse notificationRateLimit;
        public Builder() {}
        public Builder(AlertStrategyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoClose = defaults.autoClose;
    	      this.notificationRateLimit = defaults.notificationRateLimit;
        }

        @CustomType.Setter
        public Builder autoClose(String autoClose) {
            this.autoClose = Objects.requireNonNull(autoClose);
            return this;
        }
        @CustomType.Setter
        public Builder notificationRateLimit(NotificationRateLimitResponse notificationRateLimit) {
            this.notificationRateLimit = Objects.requireNonNull(notificationRateLimit);
            return this;
        }
        public AlertStrategyResponse build() {
            final var o = new AlertStrategyResponse();
            o.autoClose = autoClose;
            o.notificationRateLimit = notificationRateLimit;
            return o;
        }
    }
}