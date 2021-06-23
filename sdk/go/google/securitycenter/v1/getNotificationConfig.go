// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets a notification config.
func LookupNotificationConfig(ctx *pulumi.Context, args *LookupNotificationConfigArgs, opts ...pulumi.InvokeOption) (*LookupNotificationConfigResult, error) {
	var rv LookupNotificationConfigResult
	err := ctx.Invoke("google-native:securitycenter/v1:getNotificationConfig", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupNotificationConfigArgs struct {
	NotificationConfigId string `pulumi:"notificationConfigId"`
	OrganizationId       string `pulumi:"organizationId"`
}

type LookupNotificationConfigResult struct {
	// The description of the notification config (max of 1024 characters).
	Description string `pulumi:"description"`
	// The relative resource name of this notification config. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id}/notificationConfigs/notify_public_bucket".
	Name string `pulumi:"name"`
	// The Pub/Sub topic to send notifications to. Its format is "projects/[project_id]/topics/[topic]".
	PubsubTopic string `pulumi:"pubsubTopic"`
	// The service account that needs "pubsub.topics.publish" permission to publish to the Pub/Sub topic.
	ServiceAccount string `pulumi:"serviceAccount"`
	// The config for triggering streaming-based notifications.
	StreamingConfig StreamingConfigResponse `pulumi:"streamingConfig"`
}