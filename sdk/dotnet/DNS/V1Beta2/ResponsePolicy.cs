// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.DNS.V1Beta2
{
    /// <summary>
    /// Creates a new Response Policy
    /// Auto-naming is currently not supported for this resource.
    /// </summary>
    [GoogleNativeResourceType("google-native:dns/v1beta2:ResponsePolicy")]
    public partial class ResponsePolicy : Pulumi.CustomResource
    {
        /// <summary>
        /// User-provided description for this Response Policy.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The list of Google Kubernetes Engine clusters to which this response policy is applied.
        /// </summary>
        [Output("gkeClusters")]
        public Output<ImmutableArray<Outputs.ResponsePolicyGKEClusterResponse>> GkeClusters { get; private set; } = null!;

        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// List of network names specifying networks to which this policy is applied.
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.ResponsePolicyNetworkResponse>> Networks { get; private set; } = null!;

        /// <summary>
        /// User assigned name for this Response Policy.
        /// </summary>
        [Output("responsePolicyName")]
        public Output<string> ResponsePolicyName { get; private set; } = null!;


        /// <summary>
        /// Create a ResponsePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResponsePolicy(string name, ResponsePolicyArgs? args = null, CustomResourceOptions? options = null)
            : base("google-native:dns/v1beta2:ResponsePolicy", name, args ?? new ResponsePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResponsePolicy(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("google-native:dns/v1beta2:ResponsePolicy", name, null, MakeResourceOptions(options, id))
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
        /// Get an existing ResponsePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResponsePolicy Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new ResponsePolicy(name, id, options);
        }
    }

    public sealed class ResponsePolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
        /// </summary>
        [Input("clientOperationId")]
        public Input<string>? ClientOperationId { get; set; }

        /// <summary>
        /// User-provided description for this Response Policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("gkeClusters")]
        private InputList<Inputs.ResponsePolicyGKEClusterArgs>? _gkeClusters;

        /// <summary>
        /// The list of Google Kubernetes Engine clusters to which this response policy is applied.
        /// </summary>
        public InputList<Inputs.ResponsePolicyGKEClusterArgs> GkeClusters
        {
            get => _gkeClusters ?? (_gkeClusters = new InputList<Inputs.ResponsePolicyGKEClusterArgs>());
            set => _gkeClusters = value;
        }

        /// <summary>
        /// Unique identifier for the resource; defined by the server (output only).
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("kind")]
        public Input<string>? Kind { get; set; }

        [Input("networks")]
        private InputList<Inputs.ResponsePolicyNetworkArgs>? _networks;

        /// <summary>
        /// List of network names specifying networks to which this policy is applied.
        /// </summary>
        public InputList<Inputs.ResponsePolicyNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ResponsePolicyNetworkArgs>());
            set => _networks = value;
        }

        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// User assigned name for this Response Policy.
        /// </summary>
        [Input("responsePolicyName")]
        public Input<string>? ResponsePolicyName { get; set; }

        public ResponsePolicyArgs()
        {
        }
    }
}