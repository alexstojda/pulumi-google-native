// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.file.v1beta1.enums.InstanceTier;
import com.pulumi.googlenative.file.v1beta1.inputs.FileShareConfigArgs;
import com.pulumi.googlenative.file.v1beta1.inputs.NetworkConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The storage capacity of the instance in gigabytes (GB = 1024^3 bytes). This capacity can be increased up to `max_capacity_gb` GB in multipliers of `capacity_step_size_gb` GB.
     * 
     */
    @Import(name="capacityGb")
    private @Nullable Output<String> capacityGb;

    /**
     * @return The storage capacity of the instance in gigabytes (GB = 1024^3 bytes). This capacity can be increased up to `max_capacity_gb` GB in multipliers of `capacity_step_size_gb` GB.
     * 
     */
    public Optional<Output<String>> capacityGb() {
        return Optional.ofNullable(this.capacityGb);
    }

    /**
     * The description of the instance (2048 characters or less).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the instance (2048 characters or less).
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * File system shares on the instance. For this version, only a single file share is supported.
     * 
     */
    @Import(name="fileShares")
    private @Nullable Output<List<FileShareConfigArgs>> fileShares;

    /**
     * @return File system shares on the instance. For this version, only a single file share is supported.
     * 
     */
    public Optional<Output<List<FileShareConfigArgs>>> fileShares() {
        return Optional.ofNullable(this.fileShares);
    }

    /**
     * Required. The ID of the instance to create. The ID must be unique within the specified project and location. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return Required. The ID of the instance to create. The ID must be unique within the specified project and location. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * KMS key name used for data encryption.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return KMS key name used for data encryption.
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Indicates whether this instance uses a multi-share configuration with which it can have more than one file-share or none at all. File-shares are added, updated and removed through the separate file-share APIs.
     * 
     */
    @Import(name="multiShareEnabled")
    private @Nullable Output<Boolean> multiShareEnabled;

    /**
     * @return Indicates whether this instance uses a multi-share configuration with which it can have more than one file-share or none at all. File-shares are added, updated and removed through the separate file-share APIs.
     * 
     */
    public Optional<Output<Boolean>> multiShareEnabled() {
        return Optional.ofNullable(this.multiShareEnabled);
    }

    /**
     * VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<NetworkConfigArgs>> networks;

    /**
     * @return VPC networks to which the instance is connected. For this version, only a single network is supported.
     * 
     */
    public Optional<Output<List<NetworkConfigArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The service tier of the instance.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<InstanceTier> tier;

    /**
     * @return The service tier of the instance.
     * 
     */
    public Optional<Output<InstanceTier>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.capacityGb = $.capacityGb;
        this.description = $.description;
        this.etag = $.etag;
        this.fileShares = $.fileShares;
        this.instanceId = $.instanceId;
        this.kmsKeyName = $.kmsKeyName;
        this.labels = $.labels;
        this.location = $.location;
        this.multiShareEnabled = $.multiShareEnabled;
        this.networks = $.networks;
        this.project = $.project;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityGb The storage capacity of the instance in gigabytes (GB = 1024^3 bytes). This capacity can be increased up to `max_capacity_gb` GB in multipliers of `capacity_step_size_gb` GB.
         * 
         * @return builder
         * 
         */
        public Builder capacityGb(@Nullable Output<String> capacityGb) {
            $.capacityGb = capacityGb;
            return this;
        }

        /**
         * @param capacityGb The storage capacity of the instance in gigabytes (GB = 1024^3 bytes). This capacity can be increased up to `max_capacity_gb` GB in multipliers of `capacity_step_size_gb` GB.
         * 
         * @return builder
         * 
         */
        public Builder capacityGb(String capacityGb) {
            return capacityGb(Output.of(capacityGb));
        }

        /**
         * @param description The description of the instance (2048 characters or less).
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the instance (2048 characters or less).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param etag Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param fileShares File system shares on the instance. For this version, only a single file share is supported.
         * 
         * @return builder
         * 
         */
        public Builder fileShares(@Nullable Output<List<FileShareConfigArgs>> fileShares) {
            $.fileShares = fileShares;
            return this;
        }

        /**
         * @param fileShares File system shares on the instance. For this version, only a single file share is supported.
         * 
         * @return builder
         * 
         */
        public Builder fileShares(List<FileShareConfigArgs> fileShares) {
            return fileShares(Output.of(fileShares));
        }

        /**
         * @param fileShares File system shares on the instance. For this version, only a single file share is supported.
         * 
         * @return builder
         * 
         */
        public Builder fileShares(FileShareConfigArgs... fileShares) {
            return fileShares(List.of(fileShares));
        }

        /**
         * @param instanceId Required. The ID of the instance to create. The ID must be unique within the specified project and location. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Required. The ID of the instance to create. The ID must be unique within the specified project and location. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param kmsKeyName KMS key name used for data encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName KMS key name used for data encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param labels Resource labels to represent user provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param multiShareEnabled Indicates whether this instance uses a multi-share configuration with which it can have more than one file-share or none at all. File-shares are added, updated and removed through the separate file-share APIs.
         * 
         * @return builder
         * 
         */
        public Builder multiShareEnabled(@Nullable Output<Boolean> multiShareEnabled) {
            $.multiShareEnabled = multiShareEnabled;
            return this;
        }

        /**
         * @param multiShareEnabled Indicates whether this instance uses a multi-share configuration with which it can have more than one file-share or none at all. File-shares are added, updated and removed through the separate file-share APIs.
         * 
         * @return builder
         * 
         */
        public Builder multiShareEnabled(Boolean multiShareEnabled) {
            return multiShareEnabled(Output.of(multiShareEnabled));
        }

        /**
         * @param networks VPC networks to which the instance is connected. For this version, only a single network is supported.
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<NetworkConfigArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks VPC networks to which the instance is connected. For this version, only a single network is supported.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<NetworkConfigArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks VPC networks to which the instance is connected. For this version, only a single network is supported.
         * 
         * @return builder
         * 
         */
        public Builder networks(NetworkConfigArgs... networks) {
            return networks(List.of(networks));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param tier The service tier of the instance.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<InstanceTier> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The service tier of the instance.
         * 
         * @return builder
         * 
         */
        public Builder tier(InstanceTier tier) {
            return tier(Output.of(tier));
        }

        public InstanceArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}