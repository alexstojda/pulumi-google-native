// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.BackupRetentionSettingsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackupConfigurationResponse {
    /**
     * @return Backup retention settings.
     * 
     */
    private BackupRetentionSettingsResponse backupRetentionSettings;
    /**
     * @return (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
     * 
     */
    private Boolean binaryLogEnabled;
    /**
     * @return Whether this configuration is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return This is always `sql#backupConfiguration`.
     * 
     */
    private String kind;
    /**
     * @return Location of the backup
     * 
     */
    private String location;
    /**
     * @return (Postgres only) Whether point in time recovery is enabled.
     * 
     */
    private Boolean pointInTimeRecoveryEnabled;
    /**
     * @return Reserved for future use.
     * 
     */
    private Boolean replicationLogArchivingEnabled;
    /**
     * @return Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
     * 
     */
    private String startTime;
    /**
     * @return The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    private Integer transactionLogRetentionDays;

    private BackupConfigurationResponse() {}
    /**
     * @return Backup retention settings.
     * 
     */
    public BackupRetentionSettingsResponse backupRetentionSettings() {
        return this.backupRetentionSettings;
    }
    /**
     * @return (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
     * 
     */
    public Boolean binaryLogEnabled() {
        return this.binaryLogEnabled;
    }
    /**
     * @return Whether this configuration is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return This is always `sql#backupConfiguration`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Location of the backup
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return (Postgres only) Whether point in time recovery is enabled.
     * 
     */
    public Boolean pointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }
    /**
     * @return Reserved for future use.
     * 
     */
    public Boolean replicationLogArchivingEnabled() {
        return this.replicationLogArchivingEnabled;
    }
    /**
     * @return Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    public Integer transactionLogRetentionDays() {
        return this.transactionLogRetentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupConfigurationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private BackupRetentionSettingsResponse backupRetentionSettings;
        private Boolean binaryLogEnabled;
        private Boolean enabled;
        private String kind;
        private String location;
        private Boolean pointInTimeRecoveryEnabled;
        private Boolean replicationLogArchivingEnabled;
        private String startTime;
        private Integer transactionLogRetentionDays;
        public Builder() {}
        public Builder(BackupConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionSettings = defaults.backupRetentionSettings;
    	      this.binaryLogEnabled = defaults.binaryLogEnabled;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.replicationLogArchivingEnabled = defaults.replicationLogArchivingEnabled;
    	      this.startTime = defaults.startTime;
    	      this.transactionLogRetentionDays = defaults.transactionLogRetentionDays;
        }

        @CustomType.Setter
        public Builder backupRetentionSettings(BackupRetentionSettingsResponse backupRetentionSettings) {
            this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings);
            return this;
        }
        @CustomType.Setter
        public Builder binaryLogEnabled(Boolean binaryLogEnabled) {
            this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder pointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder replicationLogArchivingEnabled(Boolean replicationLogArchivingEnabled) {
            this.replicationLogArchivingEnabled = Objects.requireNonNull(replicationLogArchivingEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder transactionLogRetentionDays(Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays);
            return this;
        }
        public BackupConfigurationResponse build() {
            final var o = new BackupConfigurationResponse();
            o.backupRetentionSettings = backupRetentionSettings;
            o.binaryLogEnabled = binaryLogEnabled;
            o.enabled = enabled;
            o.kind = kind;
            o.location = location;
            o.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            o.replicationLogArchivingEnabled = replicationLogArchivingEnabled;
            o.startTime = startTime;
            o.transactionLogRetentionDays = transactionLogRetentionDays;
            return o;
        }
    }
}