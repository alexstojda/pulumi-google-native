// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Firebasedatabase.V1Beta
{
    public static class GetInstance
    {
        /// <summary>
        /// Gets the DatabaseInstance identified by the specified resource name.
        /// </summary>
        public static Task<GetInstanceResult> InvokeAsync(GetInstanceArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetInstanceResult>("google-native:firebasedatabase/v1beta:getInstance", args ?? new GetInstanceArgs(), options.WithDefaults());

        /// <summary>
        /// Gets the DatabaseInstance identified by the specified resource name.
        /// </summary>
        public static Output<GetInstanceResult> Invoke(GetInstanceInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetInstanceResult>("google-native:firebasedatabase/v1beta:getInstance", args ?? new GetInstanceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceArgs : Pulumi.InvokeArgs
    {
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        [Input("project")]
        public string? Project { get; set; }

        public GetInstanceArgs()
        {
        }
    }

    public sealed class GetInstanceInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetInstanceInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetInstanceResult
    {
        /// <summary>
        /// Immutable. The globally unique hostname of the database.
        /// </summary>
        public readonly string DatabaseUrl;
        /// <summary>
        /// The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The resource name of the project this instance belongs to. For example: `projects/{project-number}`.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// The database's lifecycle state. Read-only.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetInstanceResult(
            string databaseUrl,

            string name,

            string project,

            string state,

            string type)
        {
            DatabaseUrl = databaseUrl;
            Name = name;
            Project = project;
            State = state;
            Type = type;
        }
    }
}