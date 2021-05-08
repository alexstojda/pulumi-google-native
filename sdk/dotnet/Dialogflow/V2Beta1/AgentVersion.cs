// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Dialogflow.V2Beta1
{
    /// <summary>
    /// Creates an agent version. The new version points to the agent instance in the "default" environment.
    /// </summary>
    [GoogleNativeResourceType("google-native:dialogflow/v2beta1:AgentVersion")]
    public partial class AgentVersion : Pulumi.CustomResource
    {
        /// <summary>
        /// The creation time of this version. This field is read-only, i.e., it cannot be set by create and update methods.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Optional. The developer-provided description of this version.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of this agent version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The status of this version. This field is read-only and cannot be set by create and update methods.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The sequential number of this version. This field is read-only which means it cannot be set by create and update methods.
        /// </summary>
        [Output("versionNumber")]
        public Output<int> VersionNumber { get; private set; } = null!;


        /// <summary>
        /// Create a AgentVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AgentVersion(string name, AgentVersionArgs args, CustomResourceOptions? options = null)
            : base("google-native:dialogflow/v2beta1:AgentVersion", name, args ?? new AgentVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AgentVersion(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("google-native:dialogflow/v2beta1:AgentVersion", name, null, MakeResourceOptions(options, id))
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
        /// Get an existing AgentVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AgentVersion Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new AgentVersion(name, id, options);
        }
    }

    public sealed class AgentVersionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. The developer-provided description of this version.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("locationsId", required: true)]
        public Input<string> LocationsId { get; set; } = null!;

        [Input("projectsId", required: true)]
        public Input<string> ProjectsId { get; set; } = null!;

        [Input("versionsId", required: true)]
        public Input<string> VersionsId { get; set; } = null!;

        public AgentVersionArgs()
        {
        }
    }
}