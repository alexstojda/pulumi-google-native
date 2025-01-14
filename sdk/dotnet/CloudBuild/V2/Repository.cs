// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.CloudBuild.V2
{
    /// <summary>
    /// Creates a Repository.
    /// </summary>
    [GoogleNativeResourceType("google-native:cloudbuild/v2:Repository")]
    public partial class Repository : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Allows clients to store small amounts of arbitrary data.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>> Annotations { get; private set; } = null!;

        [Output("connectionId")]
        public Output<string> ConnectionId { get; private set; } = null!;

        /// <summary>
        /// Server assigned timestamp for when the connection was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Immutable. Resource name of the repository, in the format `projects/*/locations/*/connections/*/repositories/*`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Git Clone HTTPS URI.
        /// </summary>
        [Output("remoteUri")]
        public Output<string> RemoteUri { get; private set; } = null!;

        /// <summary>
        /// Required. The ID to use for the repository, which will become the final component of the repository's resource name. This ID should be unique in the connection. Allows alphanumeric characters and any of -._~%!$&amp;'()*+,;=@.
        /// </summary>
        [Output("repositoryId")]
        public Output<string> RepositoryId { get; private set; } = null!;

        /// <summary>
        /// Server assigned timestamp for when the connection was updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// External ID of the webhook created for the repository.
        /// </summary>
        [Output("webhookId")]
        public Output<string> WebhookId { get; private set; } = null!;


        /// <summary>
        /// Create a Repository resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Repository(string name, RepositoryArgs args, CustomResourceOptions? options = null)
            : base("google-native:cloudbuild/v2:Repository", name, args ?? new RepositoryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Repository(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("google-native:cloudbuild/v2:Repository", name, null, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                ReplaceOnChanges =
                {
                    "connectionId",
                    "location",
                    "project",
                    "repositoryId",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Repository resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Repository Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new Repository(name, id, options);
        }
    }

    public sealed class RepositoryArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Allows clients to store small amounts of arbitrary data.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("connectionId", required: true)]
        public Input<string> ConnectionId { get; set; } = null!;

        /// <summary>
        /// This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Immutable. Resource name of the repository, in the format `projects/*/locations/*/connections/*/repositories/*`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Git Clone HTTPS URI.
        /// </summary>
        [Input("remoteUri", required: true)]
        public Input<string> RemoteUri { get; set; } = null!;

        /// <summary>
        /// Required. The ID to use for the repository, which will become the final component of the repository's resource name. This ID should be unique in the connection. Allows alphanumeric characters and any of -._~%!$&amp;'()*+,;=@.
        /// </summary>
        [Input("repositoryId", required: true)]
        public Input<string> RepositoryId { get; set; } = null!;

        public RepositoryArgs()
        {
        }
        public static new RepositoryArgs Empty => new RepositoryArgs();
    }
}
