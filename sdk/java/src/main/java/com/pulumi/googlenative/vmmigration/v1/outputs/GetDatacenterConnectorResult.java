// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration.v1.outputs.AvailableUpdatesResponse;
import com.pulumi.googlenative.vmmigration.v1.outputs.StatusResponse;
import com.pulumi.googlenative.vmmigration.v1.outputs.UpgradeStatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatacenterConnectorResult {
    /**
     * @return Appliance OVA version. This is the OVA which is manually installed by the user and contains the infrastructure for the automatically updatable components on the appliance.
     * 
     */
    private String applianceInfrastructureVersion;
    /**
     * @return Appliance last installed update bundle version. This is the version of the automatically updatable components on the appliance.
     * 
     */
    private String applianceSoftwareVersion;
    /**
     * @return The available versions for updating this appliance.
     * 
     */
    private AvailableUpdatesResponse availableVersions;
    /**
     * @return The communication channel between the datacenter connector and GCP.
     * 
     */
    private String bucket;
    /**
     * @return The time the connector was created (as an API call, not when it was actually installed).
     * 
     */
    private String createTime;
    /**
     * @return Provides details on the state of the Datacenter Connector in case of an error.
     * 
     */
    private StatusResponse error;
    /**
     * @return The connector&#39;s name.
     * 
     */
    private String name;
    /**
     * @return Immutable. A unique key for this connector. This key is internal to the OVA connector and is supplied with its creation during the registration process and can not be modified.
     * 
     */
    private String registrationId;
    /**
     * @return The service account to use in the connector when communicating with the cloud.
     * 
     */
    private String serviceAccount;
    /**
     * @return State of the DatacenterConnector, as determined by the health checks.
     * 
     */
    private String state;
    /**
     * @return The time the state was last set.
     * 
     */
    private String stateTime;
    /**
     * @return The last time the connector was updated with an API call.
     * 
     */
    private String updateTime;
    /**
     * @return The status of the current / last upgradeAppliance operation.
     * 
     */
    private UpgradeStatusResponse upgradeStatus;
    /**
     * @return The version running in the DatacenterConnector. This is supplied by the OVA connector during the registration process and can not be modified.
     * 
     */
    private String version;

    private GetDatacenterConnectorResult() {}
    /**
     * @return Appliance OVA version. This is the OVA which is manually installed by the user and contains the infrastructure for the automatically updatable components on the appliance.
     * 
     */
    public String applianceInfrastructureVersion() {
        return this.applianceInfrastructureVersion;
    }
    /**
     * @return Appliance last installed update bundle version. This is the version of the automatically updatable components on the appliance.
     * 
     */
    public String applianceSoftwareVersion() {
        return this.applianceSoftwareVersion;
    }
    /**
     * @return The available versions for updating this appliance.
     * 
     */
    public AvailableUpdatesResponse availableVersions() {
        return this.availableVersions;
    }
    /**
     * @return The communication channel between the datacenter connector and GCP.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return The time the connector was created (as an API call, not when it was actually installed).
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Provides details on the state of the Datacenter Connector in case of an error.
     * 
     */
    public StatusResponse error() {
        return this.error;
    }
    /**
     * @return The connector&#39;s name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Immutable. A unique key for this connector. This key is internal to the OVA connector and is supplied with its creation during the registration process and can not be modified.
     * 
     */
    public String registrationId() {
        return this.registrationId;
    }
    /**
     * @return The service account to use in the connector when communicating with the cloud.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return State of the DatacenterConnector, as determined by the health checks.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The time the state was last set.
     * 
     */
    public String stateTime() {
        return this.stateTime;
    }
    /**
     * @return The last time the connector was updated with an API call.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return The status of the current / last upgradeAppliance operation.
     * 
     */
    public UpgradeStatusResponse upgradeStatus() {
        return this.upgradeStatus;
    }
    /**
     * @return The version running in the DatacenterConnector. This is supplied by the OVA connector during the registration process and can not be modified.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatacenterConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applianceInfrastructureVersion;
        private String applianceSoftwareVersion;
        private AvailableUpdatesResponse availableVersions;
        private String bucket;
        private String createTime;
        private StatusResponse error;
        private String name;
        private String registrationId;
        private String serviceAccount;
        private String state;
        private String stateTime;
        private String updateTime;
        private UpgradeStatusResponse upgradeStatus;
        private String version;
        public Builder() {}
        public Builder(GetDatacenterConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applianceInfrastructureVersion = defaults.applianceInfrastructureVersion;
    	      this.applianceSoftwareVersion = defaults.applianceSoftwareVersion;
    	      this.availableVersions = defaults.availableVersions;
    	      this.bucket = defaults.bucket;
    	      this.createTime = defaults.createTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.registrationId = defaults.registrationId;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.state = defaults.state;
    	      this.stateTime = defaults.stateTime;
    	      this.updateTime = defaults.updateTime;
    	      this.upgradeStatus = defaults.upgradeStatus;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder applianceInfrastructureVersion(String applianceInfrastructureVersion) {
            this.applianceInfrastructureVersion = Objects.requireNonNull(applianceInfrastructureVersion);
            return this;
        }
        @CustomType.Setter
        public Builder applianceSoftwareVersion(String applianceSoftwareVersion) {
            this.applianceSoftwareVersion = Objects.requireNonNull(applianceSoftwareVersion);
            return this;
        }
        @CustomType.Setter
        public Builder availableVersions(AvailableUpdatesResponse availableVersions) {
            this.availableVersions = Objects.requireNonNull(availableVersions);
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder registrationId(String registrationId) {
            this.registrationId = Objects.requireNonNull(registrationId);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        @CustomType.Setter
        public Builder upgradeStatus(UpgradeStatusResponse upgradeStatus) {
            this.upgradeStatus = Objects.requireNonNull(upgradeStatus);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetDatacenterConnectorResult build() {
            final var o = new GetDatacenterConnectorResult();
            o.applianceInfrastructureVersion = applianceInfrastructureVersion;
            o.applianceSoftwareVersion = applianceSoftwareVersion;
            o.availableVersions = availableVersions;
            o.bucket = bucket;
            o.createTime = createTime;
            o.error = error;
            o.name = name;
            o.registrationId = registrationId;
            o.serviceAccount = serviceAccount;
            o.state = state;
            o.stateTime = stateTime;
            o.updateTime = updateTime;
            o.upgradeStatus = upgradeStatus;
            o.version = version;
            return o;
        }
    }
}