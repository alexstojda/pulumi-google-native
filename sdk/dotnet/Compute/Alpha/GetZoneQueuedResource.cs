// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Compute.Alpha
{
    public static class GetZoneQueuedResource
    {
        /// <summary>
        /// Returns the specified QueuedResource resource.
        /// </summary>
        public static Task<GetZoneQueuedResourceResult> InvokeAsync(GetZoneQueuedResourceArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetZoneQueuedResourceResult>("google-native:compute/alpha:getZoneQueuedResource", args ?? new GetZoneQueuedResourceArgs(), options.WithDefaults());

        /// <summary>
        /// Returns the specified QueuedResource resource.
        /// </summary>
        public static Output<GetZoneQueuedResourceResult> Invoke(GetZoneQueuedResourceInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetZoneQueuedResourceResult>("google-native:compute/alpha:getZoneQueuedResource", args ?? new GetZoneQueuedResourceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZoneQueuedResourceArgs : global::Pulumi.InvokeArgs
    {
        [Input("project")]
        public string? Project { get; set; }

        [Input("queuedResource", required: true)]
        public string QueuedResource { get; set; } = null!;

        [Input("zone", required: true)]
        public string Zone { get; set; } = null!;

        public GetZoneQueuedResourceArgs()
        {
        }
        public static new GetZoneQueuedResourceArgs Empty => new GetZoneQueuedResourceArgs();
    }

    public sealed class GetZoneQueuedResourceInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("queuedResource", required: true)]
        public Input<string> QueuedResource { get; set; } = null!;

        [Input("zone", required: true)]
        public Input<string> Zone { get; set; } = null!;

        public GetZoneQueuedResourceInvokeArgs()
        {
        }
        public static new GetZoneQueuedResourceInvokeArgs Empty => new GetZoneQueuedResourceInvokeArgs();
    }


    [OutputType]
    public sealed class GetZoneQueuedResourceResult
    {
        /// <summary>
        /// Specification of VM instances to create.
        /// </summary>
        public readonly Outputs.BulkInsertInstanceResourceResponse BulkInsertInstanceResource;
        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        public readonly string CreationTimestamp;
        /// <summary>
        /// An optional description of this resource. Provide this property when you create the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Type of the resource. Always compute#queuedResource for QueuedResources.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Queuing parameters for the requested capacity.
        /// </summary>
        public readonly Outputs.QueuingPolicyResponse QueuingPolicy;
        /// <summary>
        /// URL of the region where the resource resides. Only applicable for regional resources. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// [Output only] Server-defined URL for the resource.
        /// </summary>
        public readonly string SelfLink;
        /// <summary>
        /// Server-defined URL for this resource with the resource id.
        /// </summary>
        public readonly string SelfLinkWithId;
        /// <summary>
        /// [Output only] High-level status of the request.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// [Output only] Result of queuing and provisioning based on deferred capacity.
        /// </summary>
        public readonly Outputs.QueuedResourceStatusResponse Status;
        /// <summary>
        /// URL of the zone where the resource resides. Only applicable for zonal resources. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
        /// </summary>
        public readonly string Zone;

        [OutputConstructor]
        private GetZoneQueuedResourceResult(
            Outputs.BulkInsertInstanceResourceResponse bulkInsertInstanceResource,

            string creationTimestamp,

            string description,

            string kind,

            string name,

            Outputs.QueuingPolicyResponse queuingPolicy,

            string region,

            string selfLink,

            string selfLinkWithId,

            string state,

            Outputs.QueuedResourceStatusResponse status,

            string zone)
        {
            BulkInsertInstanceResource = bulkInsertInstanceResource;
            CreationTimestamp = creationTimestamp;
            Description = description;
            Kind = kind;
            Name = name;
            QueuingPolicy = queuingPolicy;
            Region = region;
            SelfLink = selfLink;
            SelfLinkWithId = selfLinkWithId;
            State = state;
            Status = status;
            Zone = zone;
        }
    }
}