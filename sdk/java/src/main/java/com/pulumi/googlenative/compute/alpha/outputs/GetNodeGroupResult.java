// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.NodeGroupAutoscalingPolicyResponse;
import com.pulumi.googlenative.compute.alpha.outputs.NodeGroupMaintenanceWindowResponse;
import com.pulumi.googlenative.compute.alpha.outputs.ShareSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNodeGroupResult {
    /**
     * @return Specifies how autoscaling should behave.
     * 
     */
    private NodeGroupAutoscalingPolicyResponse autoscalingPolicy;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private String description;
    private String fingerprint;
    /**
     * @return The type of the resource. Always compute#nodeGroup for node group.
     * 
     */
    private String kind;
    /**
     * @return An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
     */
    private String locationHint;
    /**
     * @return Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    private String maintenancePolicy;
    private NodeGroupMaintenanceWindowResponse maintenanceWindow;
    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private String name;
    /**
     * @return URL of the node template to create the node group from.
     * 
     */
    private String nodeTemplate;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private String selfLink;
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    private String selfLinkWithId;
    /**
     * @return Share-settings for the node group
     * 
     */
    private ShareSettingsResponse shareSettings;
    /**
     * @return The total number of nodes in the node group.
     * 
     */
    private Integer size;
    private String status;
    /**
     * @return The name of the zone where the node group resides, such as us-central1-a.
     * 
     */
    private String zone;

    private GetNodeGroupResult() {}
    /**
     * @return Specifies how autoscaling should behave.
     * 
     */
    public NodeGroupAutoscalingPolicyResponse autoscalingPolicy() {
        return this.autoscalingPolicy;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return The type of the resource. Always compute#nodeGroup for node group.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
     */
    public String locationHint() {
        return this.locationHint;
    }
    /**
     * @return Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    public String maintenancePolicy() {
        return this.maintenancePolicy;
    }
    public NodeGroupMaintenanceWindowResponse maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return URL of the node template to create the node group from.
     * 
     */
    public String nodeTemplate() {
        return this.nodeTemplate;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * @return Share-settings for the node group
     * 
     */
    public ShareSettingsResponse shareSettings() {
        return this.shareSettings;
    }
    /**
     * @return The total number of nodes in the node group.
     * 
     */
    public Integer size() {
        return this.size;
    }
    public String status() {
        return this.status;
    }
    /**
     * @return The name of the zone where the node group resides, such as us-central1-a.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private NodeGroupAutoscalingPolicyResponse autoscalingPolicy;
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String kind;
        private String locationHint;
        private String maintenancePolicy;
        private NodeGroupMaintenanceWindowResponse maintenanceWindow;
        private String name;
        private String nodeTemplate;
        private String selfLink;
        private String selfLinkWithId;
        private ShareSettingsResponse shareSettings;
        private Integer size;
        private String status;
        private String zone;
        public Builder() {}
        public Builder(GetNodeGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeTemplate = defaults.nodeTemplate;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.shareSettings = defaults.shareSettings;
    	      this.size = defaults.size;
    	      this.status = defaults.status;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder autoscalingPolicy(NodeGroupAutoscalingPolicyResponse autoscalingPolicy) {
            this.autoscalingPolicy = Objects.requireNonNull(autoscalingPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder locationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }
        @CustomType.Setter
        public Builder maintenancePolicy(String maintenancePolicy) {
            this.maintenancePolicy = Objects.requireNonNull(maintenancePolicy);
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceWindow(NodeGroupMaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodeTemplate(String nodeTemplate) {
            this.nodeTemplate = Objects.requireNonNull(nodeTemplate);
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        @CustomType.Setter
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        @CustomType.Setter
        public Builder shareSettings(ShareSettingsResponse shareSettings) {
            this.shareSettings = Objects.requireNonNull(shareSettings);
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetNodeGroupResult build() {
            final var o = new GetNodeGroupResult();
            o.autoscalingPolicy = autoscalingPolicy;
            o.creationTimestamp = creationTimestamp;
            o.description = description;
            o.fingerprint = fingerprint;
            o.kind = kind;
            o.locationHint = locationHint;
            o.maintenancePolicy = maintenancePolicy;
            o.maintenanceWindow = maintenanceWindow;
            o.name = name;
            o.nodeTemplate = nodeTemplate;
            o.selfLink = selfLink;
            o.selfLinkWithId = selfLinkWithId;
            o.shareSettings = shareSettings;
            o.size = size;
            o.status = status;
            o.zone = zone;
            return o;
        }
    }
}