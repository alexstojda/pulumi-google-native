// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Aiplatform.V1
{
    public static class GetSpecialistPool
    {
        /// <summary>
        /// Gets a SpecialistPool.
        /// </summary>
        public static Task<GetSpecialistPoolResult> InvokeAsync(GetSpecialistPoolArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSpecialistPoolResult>("google-native:aiplatform/v1:getSpecialistPool", args ?? new GetSpecialistPoolArgs(), options.WithDefaults());

        /// <summary>
        /// Gets a SpecialistPool.
        /// </summary>
        public static Output<GetSpecialistPoolResult> Invoke(GetSpecialistPoolInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSpecialistPoolResult>("google-native:aiplatform/v1:getSpecialistPool", args ?? new GetSpecialistPoolInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSpecialistPoolArgs : global::Pulumi.InvokeArgs
    {
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        [Input("project")]
        public string? Project { get; set; }

        [Input("specialistPoolId", required: true)]
        public string SpecialistPoolId { get; set; } = null!;

        public GetSpecialistPoolArgs()
        {
        }
        public static new GetSpecialistPoolArgs Empty => new GetSpecialistPoolArgs();
    }

    public sealed class GetSpecialistPoolInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("specialistPoolId", required: true)]
        public Input<string> SpecialistPoolId { get; set; } = null!;

        public GetSpecialistPoolInvokeArgs()
        {
        }
        public static new GetSpecialistPoolInvokeArgs Empty => new GetSpecialistPoolInvokeArgs();
    }


    [OutputType]
    public sealed class GetSpecialistPoolResult
    {
        /// <summary>
        /// The user-defined name of the SpecialistPool. The name can be up to 128 characters long and can consist of any UTF-8 characters. This field should be unique on project-level.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// The resource name of the SpecialistPool.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The resource name of the pending data labeling jobs.
        /// </summary>
        public readonly ImmutableArray<string> PendingDataLabelingJobs;
        /// <summary>
        /// The email addresses of the managers in the SpecialistPool.
        /// </summary>
        public readonly ImmutableArray<string> SpecialistManagerEmails;
        /// <summary>
        /// The number of managers in this SpecialistPool.
        /// </summary>
        public readonly int SpecialistManagersCount;
        /// <summary>
        /// The email addresses of workers in the SpecialistPool.
        /// </summary>
        public readonly ImmutableArray<string> SpecialistWorkerEmails;

        [OutputConstructor]
        private GetSpecialistPoolResult(
            string displayName,

            string name,

            ImmutableArray<string> pendingDataLabelingJobs,

            ImmutableArray<string> specialistManagerEmails,

            int specialistManagersCount,

            ImmutableArray<string> specialistWorkerEmails)
        {
            DisplayName = displayName;
            Name = name;
            PendingDataLabelingJobs = pendingDataLabelingJobs;
            SpecialistManagerEmails = specialistManagerEmails;
            SpecialistManagersCount = specialistManagersCount;
            SpecialistWorkerEmails = specialistWorkerEmails;
        }
    }
}
