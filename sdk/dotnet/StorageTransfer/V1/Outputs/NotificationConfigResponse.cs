// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.StorageTransfer.V1.Outputs
{

    /// <summary>
    /// Specification to configure notifications published to Pub/Sub. Notifications are published to the customer-provided topic using the following `PubsubMessage.attributes`: * `"eventType"`: one of the EventType values * `"payloadFormat"`: one of the PayloadFormat values * `"projectId"`: the project_id of the `TransferOperation` * `"transferJobName"`: the transfer_job_name of the `TransferOperation` * `"transferOperationName"`: the name of the `TransferOperation` The `PubsubMessage.data` contains a TransferOperation resource formatted according to the specified `PayloadFormat`.
    /// </summary>
    [OutputType]
    public sealed class NotificationConfigResponse
    {
        /// <summary>
        /// Event types for which a notification is desired. If empty, send notifications for all event types.
        /// </summary>
        public readonly ImmutableArray<string> EventTypes;
        /// <summary>
        /// The desired format of the notification message payloads.
        /// </summary>
        public readonly string PayloadFormat;
        /// <summary>
        /// The `Topic.name` of the Pub/Sub topic to which to publish notifications. Must be of the format: `projects/{project}/topics/{topic}`. Not matching this format results in an INVALID_ARGUMENT error.
        /// </summary>
        public readonly string PubsubTopic;

        [OutputConstructor]
        private NotificationConfigResponse(
            ImmutableArray<string> eventTypes,

            string payloadFormat,

            string pubsubTopic)
        {
            EventTypes = eventTypes;
            PayloadFormat = payloadFormat;
            PubsubTopic = pubsubTopic;
        }
    }
}