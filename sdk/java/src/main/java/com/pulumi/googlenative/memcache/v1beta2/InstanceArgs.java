// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.memcache.v1beta2.enums.InstanceMemcacheVersion;
import com.pulumi.googlenative.memcache.v1beta2.inputs.GoogleCloudMemcacheV1beta2MaintenancePolicyArgs;
import com.pulumi.googlenative.memcache.v1beta2.inputs.InstanceMessageArgs;
import com.pulumi.googlenative.memcache.v1beta2.inputs.MemcacheParametersArgs;
import com.pulumi.googlenative.memcache.v1beta2.inputs.NodeConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    @Import(name="authorizedNetwork")
    private @Nullable Output<String> authorizedNetwork;

    /**
     * @return The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    public Optional<Output<String>> authorizedNetwork() {
        return Optional.ofNullable(this.authorizedNetwork);
    }

    /**
     * User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Required. The logical name of the Memcached instance in the user project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the user project / location. If any of the above are not met, the API raises an invalid argument error.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return Required. The logical name of the Memcached instance in the user project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the user project / location. If any of the above are not met, the API raises an invalid argument error.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * List of messages that describe the current state of the Memcached instance.
     * 
     */
    @Import(name="instanceMessages")
    private @Nullable Output<List<InstanceMessageArgs>> instanceMessages;

    /**
     * @return List of messages that describe the current state of the Memcached instance.
     * 
     */
    public Optional<Output<List<InstanceMessageArgs>>> instanceMessages() {
        return Optional.ofNullable(this.instanceMessages);
    }

    /**
     * Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
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
     * The maintenance policy for the instance. If not provided, the maintenance event will be performed based on Memorystore internal rollout schedule.
     * 
     */
    @Import(name="maintenancePolicy")
    private @Nullable Output<GoogleCloudMemcacheV1beta2MaintenancePolicyArgs> maintenancePolicy;

    /**
     * @return The maintenance policy for the instance. If not provided, the maintenance event will be performed based on Memorystore internal rollout schedule.
     * 
     */
    public Optional<Output<GoogleCloudMemcacheV1beta2MaintenancePolicyArgs>> maintenancePolicy() {
        return Optional.ofNullable(this.maintenancePolicy);
    }

    /**
     * The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
     */
    @Import(name="memcacheVersion")
    private @Nullable Output<InstanceMemcacheVersion> memcacheVersion;

    /**
     * @return The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
     */
    public Optional<Output<InstanceMemcacheVersion>> memcacheVersion() {
        return Optional.ofNullable(this.memcacheVersion);
    }

    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration for Memcached nodes.
     * 
     */
    @Import(name="nodeConfig", required=true)
    private Output<NodeConfigArgs> nodeConfig;

    /**
     * @return Configuration for Memcached nodes.
     * 
     */
    public Output<NodeConfigArgs> nodeConfig() {
        return this.nodeConfig;
    }

    /**
     * Number of nodes in the Memcached instance.
     * 
     */
    @Import(name="nodeCount", required=true)
    private Output<Integer> nodeCount;

    /**
     * @return Number of nodes in the Memcached instance.
     * 
     */
    public Output<Integer> nodeCount() {
        return this.nodeCount;
    }

    /**
     * User defined parameters to apply to the memcached process on each node.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<MemcacheParametersArgs> parameters;

    /**
     * @return User defined parameters to apply to the memcached process on each node.
     * 
     */
    public Optional<Output<MemcacheParametersArgs>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.authorizedNetwork = $.authorizedNetwork;
        this.displayName = $.displayName;
        this.instanceId = $.instanceId;
        this.instanceMessages = $.instanceMessages;
        this.labels = $.labels;
        this.location = $.location;
        this.maintenancePolicy = $.maintenancePolicy;
        this.memcacheVersion = $.memcacheVersion;
        this.name = $.name;
        this.nodeConfig = $.nodeConfig;
        this.nodeCount = $.nodeCount;
        this.parameters = $.parameters;
        this.project = $.project;
        this.zones = $.zones;
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
         * @param authorizedNetwork The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            $.authorizedNetwork = authorizedNetwork;
            return this;
        }

        /**
         * @param authorizedNetwork The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(String authorizedNetwork) {
            return authorizedNetwork(Output.of(authorizedNetwork));
        }

        /**
         * @param displayName User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param instanceId Required. The logical name of the Memcached instance in the user project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the user project / location. If any of the above are not met, the API raises an invalid argument error.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Required. The logical name of the Memcached instance in the user project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the user project / location. If any of the above are not met, the API raises an invalid argument error.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceMessages List of messages that describe the current state of the Memcached instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceMessages(@Nullable Output<List<InstanceMessageArgs>> instanceMessages) {
            $.instanceMessages = instanceMessages;
            return this;
        }

        /**
         * @param instanceMessages List of messages that describe the current state of the Memcached instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceMessages(List<InstanceMessageArgs> instanceMessages) {
            return instanceMessages(Output.of(instanceMessages));
        }

        /**
         * @param instanceMessages List of messages that describe the current state of the Memcached instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceMessages(InstanceMessageArgs... instanceMessages) {
            return instanceMessages(List.of(instanceMessages));
        }

        /**
         * @param labels Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
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
         * @param maintenancePolicy The maintenance policy for the instance. If not provided, the maintenance event will be performed based on Memorystore internal rollout schedule.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(@Nullable Output<GoogleCloudMemcacheV1beta2MaintenancePolicyArgs> maintenancePolicy) {
            $.maintenancePolicy = maintenancePolicy;
            return this;
        }

        /**
         * @param maintenancePolicy The maintenance policy for the instance. If not provided, the maintenance event will be performed based on Memorystore internal rollout schedule.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(GoogleCloudMemcacheV1beta2MaintenancePolicyArgs maintenancePolicy) {
            return maintenancePolicy(Output.of(maintenancePolicy));
        }

        /**
         * @param memcacheVersion The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
         * 
         * @return builder
         * 
         */
        public Builder memcacheVersion(@Nullable Output<InstanceMemcacheVersion> memcacheVersion) {
            $.memcacheVersion = memcacheVersion;
            return this;
        }

        /**
         * @param memcacheVersion The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
         * 
         * @return builder
         * 
         */
        public Builder memcacheVersion(InstanceMemcacheVersion memcacheVersion) {
            return memcacheVersion(Output.of(memcacheVersion));
        }

        /**
         * @param name Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeConfig Configuration for Memcached nodes.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfig(Output<NodeConfigArgs> nodeConfig) {
            $.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * @param nodeConfig Configuration for Memcached nodes.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfig(NodeConfigArgs nodeConfig) {
            return nodeConfig(Output.of(nodeConfig));
        }

        /**
         * @param nodeCount Number of nodes in the Memcached instance.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount Number of nodes in the Memcached instance.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        /**
         * @param parameters User defined parameters to apply to the memcached process on each node.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<MemcacheParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters User defined parameters to apply to the memcached process on each node.
         * 
         * @return builder
         * 
         */
        public Builder parameters(MemcacheParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param zones Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public InstanceArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.nodeConfig = Objects.requireNonNull($.nodeConfig, "expected parameter 'nodeConfig' to be non-null");
            $.nodeCount = Objects.requireNonNull($.nodeCount, "expected parameter 'nodeCount' to be non-null");
            return $;
        }
    }

}