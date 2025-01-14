// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

/**
 * Gets a notification config.
 */
export function getFolderNotificationConfig(args: GetFolderNotificationConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetFolderNotificationConfigResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("google-native:securitycenter/v1:getFolderNotificationConfig", {
        "folderId": args.folderId,
        "notificationConfigId": args.notificationConfigId,
    }, opts);
}

export interface GetFolderNotificationConfigArgs {
    folderId: string;
    notificationConfigId: string;
}

export interface GetFolderNotificationConfigResult {
    /**
     * The description of the notification config (max of 1024 characters).
     */
    readonly description: string;
    /**
     * The relative resource name of this notification config. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id}/notificationConfigs/notify_public_bucket", "folders/{folder_id}/notificationConfigs/notify_public_bucket", or "projects/{project_id}/notificationConfigs/notify_public_bucket".
     */
    readonly name: string;
    /**
     * The Pub/Sub topic to send notifications to. Its format is "projects/[project_id]/topics/[topic]".
     */
    readonly pubsubTopic: string;
    /**
     * The service account that needs "pubsub.topics.publish" permission to publish to the Pub/Sub topic.
     */
    readonly serviceAccount: string;
    /**
     * The config for triggering streaming-based notifications.
     */
    readonly streamingConfig: outputs.securitycenter.v1.StreamingConfigResponse;
}
/**
 * Gets a notification config.
 */
export function getFolderNotificationConfigOutput(args: GetFolderNotificationConfigOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFolderNotificationConfigResult> {
    return pulumi.output(args).apply((a: any) => getFolderNotificationConfig(a, opts))
}

export interface GetFolderNotificationConfigOutputArgs {
    folderId: pulumi.Input<string>;
    notificationConfigId: pulumi.Input<string>;
}
