// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkconnectivity.v1.inputs.LinkedInterconnectAttachmentsArgs;
import com.pulumi.googlenative.networkconnectivity.v1.inputs.LinkedRouterApplianceInstancesArgs;
import com.pulumi.googlenative.networkconnectivity.v1.inputs.LinkedVpnTunnelsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpokeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpokeArgs Empty = new SpokeArgs();

    /**
     * An optional description of the spoke.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of the spoke.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Immutable. The name of the hub that this spoke is attached to.
     * 
     */
    @Import(name="hub")
    private @Nullable Output<String> hub;

    /**
     * @return Immutable. The name of the hub that this spoke is attached to.
     * 
     */
    public Optional<Output<String>> hub() {
        return Optional.ofNullable(this.hub);
    }

    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * VLAN attachments that are associated with the spoke.
     * 
     */
    @Import(name="linkedInterconnectAttachments")
    private @Nullable Output<LinkedInterconnectAttachmentsArgs> linkedInterconnectAttachments;

    /**
     * @return VLAN attachments that are associated with the spoke.
     * 
     */
    public Optional<Output<LinkedInterconnectAttachmentsArgs>> linkedInterconnectAttachments() {
        return Optional.ofNullable(this.linkedInterconnectAttachments);
    }

    /**
     * Router appliance instances that are associated with the spoke.
     * 
     */
    @Import(name="linkedRouterApplianceInstances")
    private @Nullable Output<LinkedRouterApplianceInstancesArgs> linkedRouterApplianceInstances;

    /**
     * @return Router appliance instances that are associated with the spoke.
     * 
     */
    public Optional<Output<LinkedRouterApplianceInstancesArgs>> linkedRouterApplianceInstances() {
        return Optional.ofNullable(this.linkedRouterApplianceInstances);
    }

    /**
     * VPN tunnels that are associated with the spoke.
     * 
     */
    @Import(name="linkedVpnTunnels")
    private @Nullable Output<LinkedVpnTunnelsArgs> linkedVpnTunnels;

    /**
     * @return VPN tunnels that are associated with the spoke.
     * 
     */
    public Optional<Output<LinkedVpnTunnelsArgs>> linkedVpnTunnels() {
        return Optional.ofNullable(this.linkedVpnTunnels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Immutable. The name of the spoke. Spoke names must be unique. They use the following form: `projects/{project_number}/locations/{region}/spokes/{spoke_id}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Immutable. The name of the spoke. Spoke names must be unique. They use the following form: `projects/{project_number}/locations/{region}/spokes/{spoke_id}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. A unique request ID (optional). If you specify this ID, you can use it in cases when you need to retry your request. When you need to retry, this ID lets the server know that it can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return Optional. A unique request ID (optional). If you specify this ID, you can use it in cases when you need to retry your request. When you need to retry, this ID lets the server know that it can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Required. Unique id for the spoke to create.
     * 
     */
    @Import(name="spokeId", required=true)
    private Output<String> spokeId;

    /**
     * @return Required. Unique id for the spoke to create.
     * 
     */
    public Output<String> spokeId() {
        return this.spokeId;
    }

    private SpokeArgs() {}

    private SpokeArgs(SpokeArgs $) {
        this.description = $.description;
        this.hub = $.hub;
        this.labels = $.labels;
        this.linkedInterconnectAttachments = $.linkedInterconnectAttachments;
        this.linkedRouterApplianceInstances = $.linkedRouterApplianceInstances;
        this.linkedVpnTunnels = $.linkedVpnTunnels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
        this.spokeId = $.spokeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpokeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpokeArgs $;

        public Builder() {
            $ = new SpokeArgs();
        }

        public Builder(SpokeArgs defaults) {
            $ = new SpokeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of the spoke.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of the spoke.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param hub Immutable. The name of the hub that this spoke is attached to.
         * 
         * @return builder
         * 
         */
        public Builder hub(@Nullable Output<String> hub) {
            $.hub = hub;
            return this;
        }

        /**
         * @param hub Immutable. The name of the hub that this spoke is attached to.
         * 
         * @return builder
         * 
         */
        public Builder hub(String hub) {
            return hub(Output.of(hub));
        }

        /**
         * @param labels Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param linkedInterconnectAttachments VLAN attachments that are associated with the spoke.
         * 
         * @return builder
         * 
         */
        public Builder linkedInterconnectAttachments(@Nullable Output<LinkedInterconnectAttachmentsArgs> linkedInterconnectAttachments) {
            $.linkedInterconnectAttachments = linkedInterconnectAttachments;
            return this;
        }

        /**
         * @param linkedInterconnectAttachments VLAN attachments that are associated with the spoke.
         * 
         * @return builder
         * 
         */
        public Builder linkedInterconnectAttachments(LinkedInterconnectAttachmentsArgs linkedInterconnectAttachments) {
            return linkedInterconnectAttachments(Output.of(linkedInterconnectAttachments));
        }

        /**
         * @param linkedRouterApplianceInstances Router appliance instances that are associated with the spoke.
         * 
         * @return builder
         * 
         */
        public Builder linkedRouterApplianceInstances(@Nullable Output<LinkedRouterApplianceInstancesArgs> linkedRouterApplianceInstances) {
            $.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
            return this;
        }

        /**
         * @param linkedRouterApplianceInstances Router appliance instances that are associated with the spoke.
         * 
         * @return builder
         * 
         */
        public Builder linkedRouterApplianceInstances(LinkedRouterApplianceInstancesArgs linkedRouterApplianceInstances) {
            return linkedRouterApplianceInstances(Output.of(linkedRouterApplianceInstances));
        }

        /**
         * @param linkedVpnTunnels VPN tunnels that are associated with the spoke.
         * 
         * @return builder
         * 
         */
        public Builder linkedVpnTunnels(@Nullable Output<LinkedVpnTunnelsArgs> linkedVpnTunnels) {
            $.linkedVpnTunnels = linkedVpnTunnels;
            return this;
        }

        /**
         * @param linkedVpnTunnels VPN tunnels that are associated with the spoke.
         * 
         * @return builder
         * 
         */
        public Builder linkedVpnTunnels(LinkedVpnTunnelsArgs linkedVpnTunnels) {
            return linkedVpnTunnels(Output.of(linkedVpnTunnels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Immutable. The name of the spoke. Spoke names must be unique. They use the following form: `projects/{project_number}/locations/{region}/spokes/{spoke_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Immutable. The name of the spoke. Spoke names must be unique. They use the following form: `projects/{project_number}/locations/{region}/spokes/{spoke_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId Optional. A unique request ID (optional). If you specify this ID, you can use it in cases when you need to retry your request. When you need to retry, this ID lets the server know that it can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId Optional. A unique request ID (optional). If you specify this ID, you can use it in cases when you need to retry your request. When you need to retry, this ID lets the server know that it can ignore the request if it has already been completed. The server guarantees that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check to see whether the original operation was received. If it was, the server ignores the second request. This behavior prevents clients from mistakenly creating duplicate commitments. The request ID must be a valid UUID, with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param spokeId Required. Unique id for the spoke to create.
         * 
         * @return builder
         * 
         */
        public Builder spokeId(Output<String> spokeId) {
            $.spokeId = spokeId;
            return this;
        }

        /**
         * @param spokeId Required. Unique id for the spoke to create.
         * 
         * @return builder
         * 
         */
        public Builder spokeId(String spokeId) {
            return spokeId(Output.of(spokeId));
        }

        public SpokeArgs build() {
            $.spokeId = Objects.requireNonNull($.spokeId, "expected parameter 'spokeId' to be non-null");
            return $;
        }
    }

}