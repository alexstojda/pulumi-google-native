// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.UpcomingMaintenanceTimeWindowResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UpcomingMaintenanceResponse {
    /**
     * @return Indicates if the maintenance can be customer triggered. From more detail, see go/sf-ctm-design.
     * 
     */
    private Boolean canReschedule;
    /**
     * @return The date when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
     * 
     * @deprecated
     * [Output Only] The date when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
     * 
     */
    @Deprecated /* [Output Only] The date when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead. */
    private String date;
    /**
     * @return The start time window of the maintenance disruption.
     * 
     */
    private UpcomingMaintenanceTimeWindowResponse startTimeWindow;
    /**
     * @return The time when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
     * 
     * @deprecated
     * [Output Only] The time when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
     * 
     */
    @Deprecated /* [Output Only] The time when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead. */
    private String time;
    /**
     * @return Defines the type of maintenance.
     * 
     */
    private String type;

    private UpcomingMaintenanceResponse() {}
    /**
     * @return Indicates if the maintenance can be customer triggered. From more detail, see go/sf-ctm-design.
     * 
     */
    public Boolean canReschedule() {
        return this.canReschedule;
    }
    /**
     * @return The date when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
     * 
     * @deprecated
     * [Output Only] The date when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
     * 
     */
    @Deprecated /* [Output Only] The date when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead. */
    public String date() {
        return this.date;
    }
    /**
     * @return The start time window of the maintenance disruption.
     * 
     */
    public UpcomingMaintenanceTimeWindowResponse startTimeWindow() {
        return this.startTimeWindow;
    }
    /**
     * @return The time when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
     * 
     * @deprecated
     * [Output Only] The time when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead.
     * 
     */
    @Deprecated /* [Output Only] The time when the maintenance will take place. This value is in RFC3339 text format. DEPRECATED: Use start_time_window instead. */
    public String time() {
        return this.time;
    }
    /**
     * @return Defines the type of maintenance.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpcomingMaintenanceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean canReschedule;
        private String date;
        private UpcomingMaintenanceTimeWindowResponse startTimeWindow;
        private String time;
        private String type;
        public Builder() {}
        public Builder(UpcomingMaintenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canReschedule = defaults.canReschedule;
    	      this.date = defaults.date;
    	      this.startTimeWindow = defaults.startTimeWindow;
    	      this.time = defaults.time;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder canReschedule(Boolean canReschedule) {
            this.canReschedule = Objects.requireNonNull(canReschedule);
            return this;
        }
        @CustomType.Setter
        public Builder date(String date) {
            this.date = Objects.requireNonNull(date);
            return this;
        }
        @CustomType.Setter
        public Builder startTimeWindow(UpcomingMaintenanceTimeWindowResponse startTimeWindow) {
            this.startTimeWindow = Objects.requireNonNull(startTimeWindow);
            return this;
        }
        @CustomType.Setter
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public UpcomingMaintenanceResponse build() {
            final var o = new UpcomingMaintenanceResponse();
            o.canReschedule = canReschedule;
            o.date = date;
            o.startTimeWindow = startTimeWindow;
            o.time = time;
            o.type = type;
            return o;
        }
    }
}