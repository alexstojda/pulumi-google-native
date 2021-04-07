// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Dataproc.V1Beta2
{
    /// <summary>
    /// Creates new autoscaling policy.
    /// </summary>
    [GcpNativeResourceType("gcp-native:dataproc/v1beta2:AutoscalingPolicy")]
    public partial class AutoscalingPolicy : Pulumi.CustomResource
    {
        [Output("basicAlgorithm")]
        public Output<Outputs.BasicAutoscalingAlgorithmResponse> BasicAlgorithm { get; private set; } = null!;

        /// <summary>
        /// The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Optional. Describes how the autoscaler will operate for secondary workers.
        /// </summary>
        [Output("secondaryWorkerConfig")]
        public Output<Outputs.InstanceGroupAutoscalingPolicyConfigResponse> SecondaryWorkerConfig { get; private set; } = null!;

        /// <summary>
        /// Required. Describes how the autoscaler will operate for primary workers.
        /// </summary>
        [Output("workerConfig")]
        public Output<Outputs.InstanceGroupAutoscalingPolicyConfigResponse> WorkerConfig { get; private set; } = null!;


        /// <summary>
        /// Create a AutoscalingPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AutoscalingPolicy(string name, AutoscalingPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp-native:dataproc/v1beta2:AutoscalingPolicy", name, args ?? new AutoscalingPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AutoscalingPolicy(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("gcp-native:dataproc/v1beta2:AutoscalingPolicy", name, null, MakeResourceOptions(options, id))
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
        /// Get an existing AutoscalingPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AutoscalingPolicy Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new AutoscalingPolicy(name, id, options);
        }
    }

    public sealed class AutoscalingPolicyArgs : Pulumi.ResourceArgs
    {
        [Input("autoscalingPoliciesId", required: true)]
        public Input<string> AutoscalingPoliciesId { get; set; } = null!;

        [Input("basicAlgorithm")]
        public Input<Inputs.BasicAutoscalingAlgorithmArgs>? BasicAlgorithm { get; set; }

        /// <summary>
        /// Required. The policy id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("locationsId", required: true)]
        public Input<string> LocationsId { get; set; } = null!;

        [Input("projectsId", required: true)]
        public Input<string> ProjectsId { get; set; } = null!;

        /// <summary>
        /// Optional. Describes how the autoscaler will operate for secondary workers.
        /// </summary>
        [Input("secondaryWorkerConfig")]
        public Input<Inputs.InstanceGroupAutoscalingPolicyConfigArgs>? SecondaryWorkerConfig { get; set; }

        /// <summary>
        /// Required. Describes how the autoscaler will operate for primary workers.
        /// </summary>
        [Input("workerConfig")]
        public Input<Inputs.InstanceGroupAutoscalingPolicyConfigArgs>? WorkerConfig { get; set; }

        public AutoscalingPolicyArgs()
        {
        }
    }
}