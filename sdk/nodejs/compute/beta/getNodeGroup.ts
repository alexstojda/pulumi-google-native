// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../../types";
import * as utilities from "../../utilities";

/**
 * Returns the specified NodeGroup. Get a list of available NodeGroups by making a list() request. Note: the "nodes" field should not be used. Use nodeGroups.listNodes instead.
 */
export function getNodeGroup(args: GetNodeGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetNodeGroupResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("google-native:compute/beta:getNodeGroup", {
        "nodeGroup": args.nodeGroup,
        "project": args.project,
        "zone": args.zone,
    }, opts);
}

export interface GetNodeGroupArgs {
    nodeGroup: string;
    project: string;
    zone: string;
}

export interface GetNodeGroupResult {
    /**
     * Specifies how autoscaling should behave.
     */
    readonly autoscalingPolicy: outputs.compute.beta.NodeGroupAutoscalingPolicyResponse;
    /**
     * [Output Only] Creation timestamp in RFC3339 text format.
     */
    readonly creationTimestamp: string;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    readonly description: string;
    readonly fingerprint: string;
    /**
     * [Output Only] The type of the resource. Always compute#nodeGroup for node group.
     */
    readonly kind: string;
    /**
     * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     */
    readonly locationHint: string;
    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see  Maintenance policies.
     */
    readonly maintenancePolicy: string;
    readonly maintenanceWindow: outputs.compute.beta.NodeGroupMaintenanceWindowResponse;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     */
    readonly name: string;
    /**
     * URL of the node template to create the node group from.
     */
    readonly nodeTemplate: string;
    /**
     * [Output Only] Server-defined URL for the resource.
     */
    readonly selfLink: string;
    /**
     * [Output Only] The total number of nodes in the node group.
     */
    readonly size: number;
    readonly status: string;
    /**
     * [Output Only] The name of the zone where the node group resides, such as us-central1-a.
     */
    readonly zone: string;
}