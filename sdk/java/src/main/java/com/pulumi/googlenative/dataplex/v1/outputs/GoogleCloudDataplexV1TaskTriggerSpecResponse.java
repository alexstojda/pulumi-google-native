// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1TaskTriggerSpecResponse {
    /**
     * @return Optional. Prevent the task from executing. This does not cancel already running tasks. It is intended to temporarily disable RECURRING tasks.
     * 
     */
    private Boolean disabled;
    /**
     * @return Optional. Number of retry attempts before aborting. Set to zero to never attempt to retry a failed task.
     * 
     */
    private Integer maxRetries;
    /**
     * @return Optional. Cron schedule (https://en.wikipedia.org/wiki/Cron) for running tasks periodically. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: &#34;CRON_TZ=${IANA_TIME_ZONE}&#34; or &#34;TZ=${IANA_TIME_ZONE}&#34;. The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone database. For example, &#34;CRON_TZ=America/New_York 1 * * * *&#34;, or &#34;TZ=America/New_York 1 * * * *&#34;. This field is required for RECURRING tasks.
     * 
     */
    private String schedule;
    /**
     * @return Optional. The first run of the task will be after this time. If not specified, the task will run shortly after being submitted if ON_DEMAND and based on the schedule if RECURRING.
     * 
     */
    private String startTime;
    /**
     * @return Immutable. Trigger type of the user-specified Task.
     * 
     */
    private String type;

    private GoogleCloudDataplexV1TaskTriggerSpecResponse() {}
    /**
     * @return Optional. Prevent the task from executing. This does not cancel already running tasks. It is intended to temporarily disable RECURRING tasks.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return Optional. Number of retry attempts before aborting. Set to zero to never attempt to retry a failed task.
     * 
     */
    public Integer maxRetries() {
        return this.maxRetries;
    }
    /**
     * @return Optional. Cron schedule (https://en.wikipedia.org/wiki/Cron) for running tasks periodically. To explicitly set a timezone to the cron tab, apply a prefix in the cron tab: &#34;CRON_TZ=${IANA_TIME_ZONE}&#34; or &#34;TZ=${IANA_TIME_ZONE}&#34;. The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone database. For example, &#34;CRON_TZ=America/New_York 1 * * * *&#34;, or &#34;TZ=America/New_York 1 * * * *&#34;. This field is required for RECURRING tasks.
     * 
     */
    public String schedule() {
        return this.schedule;
    }
    /**
     * @return Optional. The first run of the task will be after this time. If not specified, the task will run shortly after being submitted if ON_DEMAND and based on the schedule if RECURRING.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return Immutable. Trigger type of the user-specified Task.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1TaskTriggerSpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disabled;
        private Integer maxRetries;
        private String schedule;
        private String startTime;
        private String type;
        public Builder() {}
        public Builder(GoogleCloudDataplexV1TaskTriggerSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.maxRetries = defaults.maxRetries;
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        @CustomType.Setter
        public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }
        @CustomType.Setter
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDataplexV1TaskTriggerSpecResponse build() {
            final var o = new GoogleCloudDataplexV1TaskTriggerSpecResponse();
            o.disabled = disabled;
            o.maxRetries = maxRetries;
            o.schedule = schedule;
            o.startTime = startTime;
            o.type = type;
            return o;
        }
    }
}