// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.file.v1beta1.outputs.FileShareConfigResponse;
import com.pulumi.googlenative.file.v1beta1.outputs.NetworkConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    /**
     * @return The storage capacity of the instance in gigabytes (GB = 1024^3 bytes). This capacity can be increased up to `max_capacity_gb` GB in multipliers of `capacity_step_size_gb` GB.
     * 
     */
    private String capacityGb;
    /**
     * @return The increase/decrease capacity step size.
     * 
     */
    private String capacityStepSizeGb;
    /**
     * @return The time when the instance was created.
     * 
     */
    private String createTime;
    /**
     * @return The description of the instance (2048 characters or less).
     * 
     */
    private String description;
    /**
     * @return Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    private String etag;
    /**
     * @return File system shares on the instance. For this version, only a single file share is supported.
     * 
     */
    private List<FileShareConfigResponse> fileShares;
    /**
     * @return KMS key name used for data encryption.
     * 
     */
    private String kmsKeyName;
    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The max capacity of the instance.
     * 
     */
    private String maxCapacityGb;
    /**
     * @return The max number of shares allowed.
     * 
     */
    private String maxShareCount;
    /**
     * @return Indicates whether this instance uses a multi-share configuration with which it can have more than one file-share or none at all. File-shares are added, updated and removed through the separate file-share APIs.
     * 
     */
    private Boolean multiShareEnabled;
    /**
     * @return The resource name of the instance, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
     * 
     */
    private String name;
    /**
     * @return VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
     */
    private List<NetworkConfigResponse> networks;
    /**
     * @return Reserved for future use.
     * 
     */
    private Boolean satisfiesPzs;
    /**
     * @return The instance state.
     * 
     */
    private String state;
    /**
     * @return Additional information about the instance state, if available.
     * 
     */
    private String statusMessage;
    /**
     * @return Field indicates all the reasons the instance is in &#34;SUSPENDED&#34; state.
     * 
     */
    private List<String> suspensionReasons;
    /**
     * @return The service tier of the instance.
     * 
     */
    private String tier;

    private GetInstanceResult() {}
    /**
     * @return The storage capacity of the instance in gigabytes (GB = 1024^3 bytes). This capacity can be increased up to `max_capacity_gb` GB in multipliers of `capacity_step_size_gb` GB.
     * 
     */
    public String capacityGb() {
        return this.capacityGb;
    }
    /**
     * @return The increase/decrease capacity step size.
     * 
     */
    public String capacityStepSizeGb() {
        return this.capacityStepSizeGb;
    }
    /**
     * @return The time when the instance was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the instance (2048 characters or less).
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return File system shares on the instance. For this version, only a single file share is supported.
     * 
     */
    public List<FileShareConfigResponse> fileShares() {
        return this.fileShares;
    }
    /**
     * @return KMS key name used for data encryption.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The max capacity of the instance.
     * 
     */
    public String maxCapacityGb() {
        return this.maxCapacityGb;
    }
    /**
     * @return The max number of shares allowed.
     * 
     */
    public String maxShareCount() {
        return this.maxShareCount;
    }
    /**
     * @return Indicates whether this instance uses a multi-share configuration with which it can have more than one file-share or none at all. File-shares are added, updated and removed through the separate file-share APIs.
     * 
     */
    public Boolean multiShareEnabled() {
        return this.multiShareEnabled;
    }
    /**
     * @return The resource name of the instance, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
     */
    public List<NetworkConfigResponse> networks() {
        return this.networks;
    }
    /**
     * @return Reserved for future use.
     * 
     */
    public Boolean satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * @return The instance state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Additional information about the instance state, if available.
     * 
     */
    public String statusMessage() {
        return this.statusMessage;
    }
    /**
     * @return Field indicates all the reasons the instance is in &#34;SUSPENDED&#34; state.
     * 
     */
    public List<String> suspensionReasons() {
        return this.suspensionReasons;
    }
    /**
     * @return The service tier of the instance.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String capacityGb;
        private String capacityStepSizeGb;
        private String createTime;
        private String description;
        private String etag;
        private List<FileShareConfigResponse> fileShares;
        private String kmsKeyName;
        private Map<String,String> labels;
        private String maxCapacityGb;
        private String maxShareCount;
        private Boolean multiShareEnabled;
        private String name;
        private List<NetworkConfigResponse> networks;
        private Boolean satisfiesPzs;
        private String state;
        private String statusMessage;
        private List<String> suspensionReasons;
        private String tier;
        public Builder() {}
        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityGb = defaults.capacityGb;
    	      this.capacityStepSizeGb = defaults.capacityStepSizeGb;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.fileShares = defaults.fileShares;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.maxCapacityGb = defaults.maxCapacityGb;
    	      this.maxShareCount = defaults.maxShareCount;
    	      this.multiShareEnabled = defaults.multiShareEnabled;
    	      this.name = defaults.name;
    	      this.networks = defaults.networks;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
    	      this.suspensionReasons = defaults.suspensionReasons;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder capacityGb(String capacityGb) {
            this.capacityGb = Objects.requireNonNull(capacityGb);
            return this;
        }
        @CustomType.Setter
        public Builder capacityStepSizeGb(String capacityStepSizeGb) {
            this.capacityStepSizeGb = Objects.requireNonNull(capacityStepSizeGb);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder fileShares(List<FileShareConfigResponse> fileShares) {
            this.fileShares = Objects.requireNonNull(fileShares);
            return this;
        }
        public Builder fileShares(FileShareConfigResponse... fileShares) {
            return fileShares(List.of(fileShares));
        }
        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder maxCapacityGb(String maxCapacityGb) {
            this.maxCapacityGb = Objects.requireNonNull(maxCapacityGb);
            return this;
        }
        @CustomType.Setter
        public Builder maxShareCount(String maxShareCount) {
            this.maxShareCount = Objects.requireNonNull(maxShareCount);
            return this;
        }
        @CustomType.Setter
        public Builder multiShareEnabled(Boolean multiShareEnabled) {
            this.multiShareEnabled = Objects.requireNonNull(multiShareEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<NetworkConfigResponse> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(NetworkConfigResponse... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        @CustomType.Setter
        public Builder suspensionReasons(List<String> suspensionReasons) {
            this.suspensionReasons = Objects.requireNonNull(suspensionReasons);
            return this;
        }
        public Builder suspensionReasons(String... suspensionReasons) {
            return suspensionReasons(List.of(suspensionReasons));
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public GetInstanceResult build() {
            final var o = new GetInstanceResult();
            o.capacityGb = capacityGb;
            o.capacityStepSizeGb = capacityStepSizeGb;
            o.createTime = createTime;
            o.description = description;
            o.etag = etag;
            o.fileShares = fileShares;
            o.kmsKeyName = kmsKeyName;
            o.labels = labels;
            o.maxCapacityGb = maxCapacityGb;
            o.maxShareCount = maxShareCount;
            o.multiShareEnabled = multiShareEnabled;
            o.name = name;
            o.networks = networks;
            o.satisfiesPzs = satisfiesPzs;
            o.state = state;
            o.statusMessage = statusMessage;
            o.suspensionReasons = suspensionReasons;
            o.tier = tier;
            return o;
        }
    }
}