// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.BackupConfigurationResponse;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.DatabaseFlagsResponse;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.DenyMaintenancePeriodResponse;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.InsightsConfigResponse;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.IpConfigurationResponse;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.LocationPreferenceResponse;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.MaintenanceWindowResponse;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.PasswordValidationPolicyResponse;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.SqlActiveDirectoryConfigResponse;
import com.pulumi.googlenative.sqladmin.v1beta4.outputs.SqlServerAuditConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SettingsResponse {
    /**
     * @return The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: * `ALWAYS`: The instance is on, and remains so even in the absence of connection requests. * `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    private String activationPolicy;
    /**
     * @return Active Directory configuration, relevant only for Cloud SQL for SQL Server.
     * 
     */
    private SqlActiveDirectoryConfigResponse activeDirectoryConfig;
    /**
     * @return The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only.
     * 
     * @deprecated
     * The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only.
     * 
     */
    @Deprecated /* The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only. */
    private List<String> authorizedGaeApplications;
    /**
     * @return Availability type. Potential values: * `ZONAL`: The instance serves data from only one zone. Outages in that zone affect data accessibility. * `REGIONAL`: The instance can serve data from more than one zone in a region (it is highly available)./ For more information, see [Overview of the High Availability Configuration](https://cloud.google.com/sql/docs/mysql/high-availability).
     * 
     */
    private String availabilityType;
    /**
     * @return The daily backup configuration for the instance.
     * 
     */
    private BackupConfigurationResponse backupConfiguration;
    /**
     * @return The name of server Instance collation.
     * 
     */
    private String collation;
    /**
     * @return Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation instances.
     * 
     */
    private Boolean crashSafeReplicationEnabled;
    /**
     * @return The size of data disk, in GB. The data disk size minimum is 10GB.
     * 
     */
    private String dataDiskSizeGb;
    /**
     * @return The type of data disk: `PD_SSD` (default) or `PD_HDD`. Not used for First Generation instances.
     * 
     */
    private String dataDiskType;
    /**
     * @return The database flags passed to the instance at startup.
     * 
     */
    private List<DatabaseFlagsResponse> databaseFlags;
    /**
     * @return Configuration specific to read replica instances. Indicates whether replication is enabled or not. WARNING: Changing this restarts the instance.
     * 
     */
    private Boolean databaseReplicationEnabled;
    /**
     * @return Deny maintenance periods
     * 
     */
    private List<DenyMaintenancePeriodResponse> denyMaintenancePeriods;
    /**
     * @return Insights configuration, for now relevant only for Postgres.
     * 
     */
    private InsightsConfigResponse insightsConfig;
    /**
     * @return The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled for Second Generation instances.
     * 
     */
    private IpConfigurationResponse ipConfiguration;
    /**
     * @return This is always `sql#settings`.
     * 
     */
    private String kind;
    /**
     * @return The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine co-location was only applicable to First Generation instances.
     * 
     */
    private LocationPreferenceResponse locationPreference;
    /**
     * @return The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes.
     * 
     */
    private MaintenanceWindowResponse maintenanceWindow;
    /**
     * @return The local user password validation policy of the instance.
     * 
     */
    private PasswordValidationPolicyResponse passwordValidationPolicy;
    /**
     * @return The pricing plan for this instance. This can be either `PER_USE` or `PACKAGE`. Only `PER_USE` is supported for Second Generation instances.
     * 
     */
    private String pricingPlan;
    /**
     * @return The type of replication this instance uses. This can be either `ASYNCHRONOUS` or `SYNCHRONOUS`. (Deprecated) This property was only applicable to First Generation instances.
     * 
     * @deprecated
     * The type of replication this instance uses. This can be either `ASYNCHRONOUS` or `SYNCHRONOUS`. (Deprecated) This property was only applicable to First Generation instances.
     * 
     */
    @Deprecated /* The type of replication this instance uses. This can be either `ASYNCHRONOUS` or `SYNCHRONOUS`. (Deprecated) This property was only applicable to First Generation instances. */
    private String replicationType;
    /**
     * @return The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion value for this instance and do not try to update this value.
     * 
     */
    private String settingsVersion;
    /**
     * @return SQL Server specific audit configuration.
     * 
     */
    private SqlServerAuditConfigResponse sqlServerAuditConfig;
    /**
     * @return Configuration to increase storage size automatically. The default value is true.
     * 
     */
    private Boolean storageAutoResize;
    /**
     * @return The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    private String storageAutoResizeLimit;
    /**
     * @return The tier (or machine type) for this instance, for example `db-custom-1-3840`. WARNING: Changing this restarts the instance.
     * 
     */
    private String tier;
    /**
     * @return User-provided labels, represented as a dictionary where each label is a single key value pair.
     * 
     */
    private Map<String,String> userLabels;

    private SettingsResponse() {}
    /**
     * @return The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: * `ALWAYS`: The instance is on, and remains so even in the absence of connection requests. * `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    public String activationPolicy() {
        return this.activationPolicy;
    }
    /**
     * @return Active Directory configuration, relevant only for Cloud SQL for SQL Server.
     * 
     */
    public SqlActiveDirectoryConfigResponse activeDirectoryConfig() {
        return this.activeDirectoryConfig;
    }
    /**
     * @return The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only.
     * 
     * @deprecated
     * The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only.
     * 
     */
    @Deprecated /* The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only. */
    public List<String> authorizedGaeApplications() {
        return this.authorizedGaeApplications;
    }
    /**
     * @return Availability type. Potential values: * `ZONAL`: The instance serves data from only one zone. Outages in that zone affect data accessibility. * `REGIONAL`: The instance can serve data from more than one zone in a region (it is highly available)./ For more information, see [Overview of the High Availability Configuration](https://cloud.google.com/sql/docs/mysql/high-availability).
     * 
     */
    public String availabilityType() {
        return this.availabilityType;
    }
    /**
     * @return The daily backup configuration for the instance.
     * 
     */
    public BackupConfigurationResponse backupConfiguration() {
        return this.backupConfiguration;
    }
    /**
     * @return The name of server Instance collation.
     * 
     */
    public String collation() {
        return this.collation;
    }
    /**
     * @return Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation instances.
     * 
     */
    public Boolean crashSafeReplicationEnabled() {
        return this.crashSafeReplicationEnabled;
    }
    /**
     * @return The size of data disk, in GB. The data disk size minimum is 10GB.
     * 
     */
    public String dataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }
    /**
     * @return The type of data disk: `PD_SSD` (default) or `PD_HDD`. Not used for First Generation instances.
     * 
     */
    public String dataDiskType() {
        return this.dataDiskType;
    }
    /**
     * @return The database flags passed to the instance at startup.
     * 
     */
    public List<DatabaseFlagsResponse> databaseFlags() {
        return this.databaseFlags;
    }
    /**
     * @return Configuration specific to read replica instances. Indicates whether replication is enabled or not. WARNING: Changing this restarts the instance.
     * 
     */
    public Boolean databaseReplicationEnabled() {
        return this.databaseReplicationEnabled;
    }
    /**
     * @return Deny maintenance periods
     * 
     */
    public List<DenyMaintenancePeriodResponse> denyMaintenancePeriods() {
        return this.denyMaintenancePeriods;
    }
    /**
     * @return Insights configuration, for now relevant only for Postgres.
     * 
     */
    public InsightsConfigResponse insightsConfig() {
        return this.insightsConfig;
    }
    /**
     * @return The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled for Second Generation instances.
     * 
     */
    public IpConfigurationResponse ipConfiguration() {
        return this.ipConfiguration;
    }
    /**
     * @return This is always `sql#settings`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine co-location was only applicable to First Generation instances.
     * 
     */
    public LocationPreferenceResponse locationPreference() {
        return this.locationPreference;
    }
    /**
     * @return The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes.
     * 
     */
    public MaintenanceWindowResponse maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * @return The local user password validation policy of the instance.
     * 
     */
    public PasswordValidationPolicyResponse passwordValidationPolicy() {
        return this.passwordValidationPolicy;
    }
    /**
     * @return The pricing plan for this instance. This can be either `PER_USE` or `PACKAGE`. Only `PER_USE` is supported for Second Generation instances.
     * 
     */
    public String pricingPlan() {
        return this.pricingPlan;
    }
    /**
     * @return The type of replication this instance uses. This can be either `ASYNCHRONOUS` or `SYNCHRONOUS`. (Deprecated) This property was only applicable to First Generation instances.
     * 
     * @deprecated
     * The type of replication this instance uses. This can be either `ASYNCHRONOUS` or `SYNCHRONOUS`. (Deprecated) This property was only applicable to First Generation instances.
     * 
     */
    @Deprecated /* The type of replication this instance uses. This can be either `ASYNCHRONOUS` or `SYNCHRONOUS`. (Deprecated) This property was only applicable to First Generation instances. */
    public String replicationType() {
        return this.replicationType;
    }
    /**
     * @return The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion value for this instance and do not try to update this value.
     * 
     */
    public String settingsVersion() {
        return this.settingsVersion;
    }
    /**
     * @return SQL Server specific audit configuration.
     * 
     */
    public SqlServerAuditConfigResponse sqlServerAuditConfig() {
        return this.sqlServerAuditConfig;
    }
    /**
     * @return Configuration to increase storage size automatically. The default value is true.
     * 
     */
    public Boolean storageAutoResize() {
        return this.storageAutoResize;
    }
    /**
     * @return The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    public String storageAutoResizeLimit() {
        return this.storageAutoResizeLimit;
    }
    /**
     * @return The tier (or machine type) for this instance, for example `db-custom-1-3840`. WARNING: Changing this restarts the instance.
     * 
     */
    public String tier() {
        return this.tier;
    }
    /**
     * @return User-provided labels, represented as a dictionary where each label is a single key value pair.
     * 
     */
    public Map<String,String> userLabels() {
        return this.userLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activationPolicy;
        private SqlActiveDirectoryConfigResponse activeDirectoryConfig;
        private List<String> authorizedGaeApplications;
        private String availabilityType;
        private BackupConfigurationResponse backupConfiguration;
        private String collation;
        private Boolean crashSafeReplicationEnabled;
        private String dataDiskSizeGb;
        private String dataDiskType;
        private List<DatabaseFlagsResponse> databaseFlags;
        private Boolean databaseReplicationEnabled;
        private List<DenyMaintenancePeriodResponse> denyMaintenancePeriods;
        private InsightsConfigResponse insightsConfig;
        private IpConfigurationResponse ipConfiguration;
        private String kind;
        private LocationPreferenceResponse locationPreference;
        private MaintenanceWindowResponse maintenanceWindow;
        private PasswordValidationPolicyResponse passwordValidationPolicy;
        private String pricingPlan;
        private String replicationType;
        private String settingsVersion;
        private SqlServerAuditConfigResponse sqlServerAuditConfig;
        private Boolean storageAutoResize;
        private String storageAutoResizeLimit;
        private String tier;
        private Map<String,String> userLabels;
        public Builder() {}
        public Builder(SettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.activeDirectoryConfig = defaults.activeDirectoryConfig;
    	      this.authorizedGaeApplications = defaults.authorizedGaeApplications;
    	      this.availabilityType = defaults.availabilityType;
    	      this.backupConfiguration = defaults.backupConfiguration;
    	      this.collation = defaults.collation;
    	      this.crashSafeReplicationEnabled = defaults.crashSafeReplicationEnabled;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.databaseReplicationEnabled = defaults.databaseReplicationEnabled;
    	      this.denyMaintenancePeriods = defaults.denyMaintenancePeriods;
    	      this.insightsConfig = defaults.insightsConfig;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kind = defaults.kind;
    	      this.locationPreference = defaults.locationPreference;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.passwordValidationPolicy = defaults.passwordValidationPolicy;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.replicationType = defaults.replicationType;
    	      this.settingsVersion = defaults.settingsVersion;
    	      this.sqlServerAuditConfig = defaults.sqlServerAuditConfig;
    	      this.storageAutoResize = defaults.storageAutoResize;
    	      this.storageAutoResizeLimit = defaults.storageAutoResizeLimit;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
        }

        @CustomType.Setter
        public Builder activationPolicy(String activationPolicy) {
            this.activationPolicy = Objects.requireNonNull(activationPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder activeDirectoryConfig(SqlActiveDirectoryConfigResponse activeDirectoryConfig) {
            this.activeDirectoryConfig = Objects.requireNonNull(activeDirectoryConfig);
            return this;
        }
        @CustomType.Setter
        public Builder authorizedGaeApplications(List<String> authorizedGaeApplications) {
            this.authorizedGaeApplications = Objects.requireNonNull(authorizedGaeApplications);
            return this;
        }
        public Builder authorizedGaeApplications(String... authorizedGaeApplications) {
            return authorizedGaeApplications(List.of(authorizedGaeApplications));
        }
        @CustomType.Setter
        public Builder availabilityType(String availabilityType) {
            this.availabilityType = Objects.requireNonNull(availabilityType);
            return this;
        }
        @CustomType.Setter
        public Builder backupConfiguration(BackupConfigurationResponse backupConfiguration) {
            this.backupConfiguration = Objects.requireNonNull(backupConfiguration);
            return this;
        }
        @CustomType.Setter
        public Builder collation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }
        @CustomType.Setter
        public Builder crashSafeReplicationEnabled(Boolean crashSafeReplicationEnabled) {
            this.crashSafeReplicationEnabled = Objects.requireNonNull(crashSafeReplicationEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder dataDiskSizeGb(String dataDiskSizeGb) {
            this.dataDiskSizeGb = Objects.requireNonNull(dataDiskSizeGb);
            return this;
        }
        @CustomType.Setter
        public Builder dataDiskType(String dataDiskType) {
            this.dataDiskType = Objects.requireNonNull(dataDiskType);
            return this;
        }
        @CustomType.Setter
        public Builder databaseFlags(List<DatabaseFlagsResponse> databaseFlags) {
            this.databaseFlags = Objects.requireNonNull(databaseFlags);
            return this;
        }
        public Builder databaseFlags(DatabaseFlagsResponse... databaseFlags) {
            return databaseFlags(List.of(databaseFlags));
        }
        @CustomType.Setter
        public Builder databaseReplicationEnabled(Boolean databaseReplicationEnabled) {
            this.databaseReplicationEnabled = Objects.requireNonNull(databaseReplicationEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder denyMaintenancePeriods(List<DenyMaintenancePeriodResponse> denyMaintenancePeriods) {
            this.denyMaintenancePeriods = Objects.requireNonNull(denyMaintenancePeriods);
            return this;
        }
        public Builder denyMaintenancePeriods(DenyMaintenancePeriodResponse... denyMaintenancePeriods) {
            return denyMaintenancePeriods(List.of(denyMaintenancePeriods));
        }
        @CustomType.Setter
        public Builder insightsConfig(InsightsConfigResponse insightsConfig) {
            this.insightsConfig = Objects.requireNonNull(insightsConfig);
            return this;
        }
        @CustomType.Setter
        public Builder ipConfiguration(IpConfigurationResponse ipConfiguration) {
            this.ipConfiguration = Objects.requireNonNull(ipConfiguration);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder locationPreference(LocationPreferenceResponse locationPreference) {
            this.locationPreference = Objects.requireNonNull(locationPreference);
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceWindow(MaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        @CustomType.Setter
        public Builder passwordValidationPolicy(PasswordValidationPolicyResponse passwordValidationPolicy) {
            this.passwordValidationPolicy = Objects.requireNonNull(passwordValidationPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder pricingPlan(String pricingPlan) {
            this.pricingPlan = Objects.requireNonNull(pricingPlan);
            return this;
        }
        @CustomType.Setter
        public Builder replicationType(String replicationType) {
            this.replicationType = Objects.requireNonNull(replicationType);
            return this;
        }
        @CustomType.Setter
        public Builder settingsVersion(String settingsVersion) {
            this.settingsVersion = Objects.requireNonNull(settingsVersion);
            return this;
        }
        @CustomType.Setter
        public Builder sqlServerAuditConfig(SqlServerAuditConfigResponse sqlServerAuditConfig) {
            this.sqlServerAuditConfig = Objects.requireNonNull(sqlServerAuditConfig);
            return this;
        }
        @CustomType.Setter
        public Builder storageAutoResize(Boolean storageAutoResize) {
            this.storageAutoResize = Objects.requireNonNull(storageAutoResize);
            return this;
        }
        @CustomType.Setter
        public Builder storageAutoResizeLimit(String storageAutoResizeLimit) {
            this.storageAutoResizeLimit = Objects.requireNonNull(storageAutoResizeLimit);
            return this;
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        @CustomType.Setter
        public Builder userLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }
        public SettingsResponse build() {
            final var o = new SettingsResponse();
            o.activationPolicy = activationPolicy;
            o.activeDirectoryConfig = activeDirectoryConfig;
            o.authorizedGaeApplications = authorizedGaeApplications;
            o.availabilityType = availabilityType;
            o.backupConfiguration = backupConfiguration;
            o.collation = collation;
            o.crashSafeReplicationEnabled = crashSafeReplicationEnabled;
            o.dataDiskSizeGb = dataDiskSizeGb;
            o.dataDiskType = dataDiskType;
            o.databaseFlags = databaseFlags;
            o.databaseReplicationEnabled = databaseReplicationEnabled;
            o.denyMaintenancePeriods = denyMaintenancePeriods;
            o.insightsConfig = insightsConfig;
            o.ipConfiguration = ipConfiguration;
            o.kind = kind;
            o.locationPreference = locationPreference;
            o.maintenanceWindow = maintenanceWindow;
            o.passwordValidationPolicy = passwordValidationPolicy;
            o.pricingPlan = pricingPlan;
            o.replicationType = replicationType;
            o.settingsVersion = settingsVersion;
            o.sqlServerAuditConfig = sqlServerAuditConfig;
            o.storageAutoResize = storageAutoResize;
            o.storageAutoResizeLimit = storageAutoResizeLimit;
            o.tier = tier;
            o.userLabels = userLabels;
            return o;
        }
    }
}