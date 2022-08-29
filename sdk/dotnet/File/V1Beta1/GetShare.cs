// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.File.V1Beta1
{
    public static class GetShare
    {
        /// <summary>
        /// Gets the details of a specific share.
        /// </summary>
        public static Task<GetShareResult> InvokeAsync(GetShareArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetShareResult>("google-native:file/v1beta1:getShare", args ?? new GetShareArgs(), options.WithDefaults());

        /// <summary>
        /// Gets the details of a specific share.
        /// </summary>
        public static Output<GetShareResult> Invoke(GetShareInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetShareResult>("google-native:file/v1beta1:getShare", args ?? new GetShareInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetShareArgs : global::Pulumi.InvokeArgs
    {
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        [Input("project")]
        public string? Project { get; set; }

        [Input("shareId", required: true)]
        public string ShareId { get; set; } = null!;

        public GetShareArgs()
        {
        }
        public static new GetShareArgs Empty => new GetShareArgs();
    }

    public sealed class GetShareInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("shareId", required: true)]
        public Input<string> ShareId { get; set; } = null!;

        public GetShareInvokeArgs()
        {
        }
        public static new GetShareInvokeArgs Empty => new GetShareInvokeArgs();
    }


    [OutputType]
    public sealed class GetShareResult
    {
        /// <summary>
        /// File share capacity in gigabytes (GB). Filestore defines 1 GB as 1024^3 bytes. Must be greater than 0.
        /// </summary>
        public readonly string CapacityGb;
        /// <summary>
        /// The time when the share was created.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// A description of the share with 2048 characters or less. Requests with longer descriptions will be rejected.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Resource labels to represent user provided metadata.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// The mount name of the share. Must be 63 characters or less and consist of uppercase or lowercase letters, numbers, and underscores.
        /// </summary>
        public readonly string MountName;
        /// <summary>
        /// The resource name of the share, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}/shares/{share_id}`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Nfs Export Options. There is a limit of 10 export options per file share.
        /// </summary>
        public readonly ImmutableArray<Outputs.NfsExportOptionsResponse> NfsExportOptions;
        /// <summary>
        /// The share state.
        /// </summary>
        public readonly string State;

        [OutputConstructor]
        private GetShareResult(
            string capacityGb,

            string createTime,

            string description,

            ImmutableDictionary<string, string> labels,

            string mountName,

            string name,

            ImmutableArray<Outputs.NfsExportOptionsResponse> nfsExportOptions,

            string state)
        {
            CapacityGb = capacityGb;
            CreateTime = createTime;
            Description = description;
            Labels = labels;
            MountName = mountName;
            Name = name;
            NfsExportOptions = nfsExportOptions;
            State = state;
        }
    }
}