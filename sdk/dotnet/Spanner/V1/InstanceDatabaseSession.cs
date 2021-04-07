// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Spanner.V1
{
    /// <summary>
    /// Creates a new session. A session can be used to perform transactions that read and/or modify data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive transactions. Sessions can only execute one transaction at a time. To execute multiple concurrent read-write/write-only transactions, create multiple sessions. Note that standalone reads and queries use a transaction internally, and count toward the one transaction limit. Active sessions use additional server resources, so it is a good idea to delete idle and unneeded sessions. Aside from explicit deletes, Cloud Spanner may delete sessions for which no operations are sent for more than an hour. If a session is deleted, requests to it return `NOT_FOUND`. Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `"SELECT 1"`.
    /// </summary>
    [GcpNativeResourceType("gcp-native:spanner/v1:InstanceDatabaseSession")]
    public partial class InstanceDatabaseSession : Pulumi.CustomResource
    {
        /// <summary>
        /// The approximate timestamp when the session is last used. It is typically earlier than the actual last use time.
        /// </summary>
        [Output("approximateLastUseTime")]
        public Output<string> ApproximateLastUseTime { get; private set; } = null!;

        /// <summary>
        /// The timestamp when the session is created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The labels for the session. * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. * No more than 64 labels can be associated with a given session. See https://goo.gl/xmQnxf for more information on and examples of labels.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// The name of the session. This is always system-assigned.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceDatabaseSession resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceDatabaseSession(string name, InstanceDatabaseSessionArgs args, CustomResourceOptions? options = null)
            : base("gcp-native:spanner/v1:InstanceDatabaseSession", name, args ?? new InstanceDatabaseSessionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceDatabaseSession(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("gcp-native:spanner/v1:InstanceDatabaseSession", name, null, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing InstanceDatabaseSession resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceDatabaseSession Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new InstanceDatabaseSession(name, id, options);
        }
    }

    public sealed class InstanceDatabaseSessionArgs : Pulumi.ResourceArgs
    {
        [Input("databasesId", required: true)]
        public Input<string> DatabasesId { get; set; } = null!;

        [Input("instancesId", required: true)]
        public Input<string> InstancesId { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// The labels for the session. * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. * No more than 64 labels can be associated with a given session. See https://goo.gl/xmQnxf for more information on and examples of labels.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("projectsId", required: true)]
        public Input<string> ProjectsId { get; set; } = null!;

        [Input("sessionsId", required: true)]
        public Input<string> SessionsId { get; set; } = null!;

        public InstanceDatabaseSessionArgs()
        {
        }
    }
}