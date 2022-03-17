// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../../utilities";

/**
 * Gets a single group.
 */
export function getGroup(args: GetGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("google-native:monitoring/v3:getGroup", {
        "groupId": args.groupId,
        "project": args.project,
    }, opts);
}

export interface GetGroupArgs {
    groupId: string;
    project?: string;
}

export interface GetGroupResult {
    /**
     * A user-assigned name for this group, used only for display purposes.
     */
    readonly displayName: string;
    /**
     * The filter used to determine which monitored resources belong to this group.
     */
    readonly filter: string;
    /**
     * If true, the members of this group are considered to be a cluster. The system can perform additional analysis on groups that are clusters.
     */
    readonly isCluster: boolean;
    /**
     * The name of this group. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] When creating a group, this field is ignored and a new name is created consisting of the project specified in the call to CreateGroup and a unique [GROUP_ID] that is generated automatically.
     */
    readonly name: string;
    /**
     * The name of the group's parent, if it has one. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID] For groups with no parent, parent_name is the empty string, "".
     */
    readonly parentName: string;
}

export function getGroupOutput(args: GetGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGroupResult> {
    return pulumi.output(args).apply(a => getGroup(a, opts))
}

export interface GetGroupOutputArgs {
    groupId: pulumi.Input<string>;
    project?: pulumi.Input<string>;
}