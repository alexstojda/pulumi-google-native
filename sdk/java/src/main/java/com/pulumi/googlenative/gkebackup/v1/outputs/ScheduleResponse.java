// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduleResponse {
    /**
     * @return A standard [cron](https://wikipedia.com/wiki/cron) string that defines a repeating schedule for creating Backups via this BackupPlan. Default (empty): no automatic backup creation will occur.
     * 
     */
    private String cronSchedule;
    /**
     * @return This flag denotes whether automatic Backup creation is paused for this BackupPlan. Default: False
     * 
     */
    private Boolean paused;

    private ScheduleResponse() {}
    /**
     * @return A standard [cron](https://wikipedia.com/wiki/cron) string that defines a repeating schedule for creating Backups via this BackupPlan. Default (empty): no automatic backup creation will occur.
     * 
     */
    public String cronSchedule() {
        return this.cronSchedule;
    }
    /**
     * @return This flag denotes whether automatic Backup creation is paused for this BackupPlan. Default: False
     * 
     */
    public Boolean paused() {
        return this.paused;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cronSchedule;
        private Boolean paused;
        public Builder() {}
        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronSchedule = defaults.cronSchedule;
    	      this.paused = defaults.paused;
        }

        @CustomType.Setter
        public Builder cronSchedule(String cronSchedule) {
            this.cronSchedule = Objects.requireNonNull(cronSchedule);
            return this;
        }
        @CustomType.Setter
        public Builder paused(Boolean paused) {
            this.paused = Objects.requireNonNull(paused);
            return this;
        }
        public ScheduleResponse build() {
            final var o = new ScheduleResponse();
            o.cronSchedule = cronSchedule;
            o.paused = paused;
            return o;
        }
    }
}