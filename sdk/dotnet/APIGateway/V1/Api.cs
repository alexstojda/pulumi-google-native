// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.APIGateway.V1
{
    /// <summary>
    /// Creates a new Api in a given project and location.
    /// </summary>
    [GcpNativeResourceType("gcp-native:apigateway/v1:Api")]
    public partial class Api : Pulumi.CustomResource
    {
        /// <summary>
        /// Created time.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Optional. Display name.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        /// <summary>
        /// Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be created in the same project as this API.
        /// </summary>
        [Output("managedService")]
        public Output<string> ManagedService { get; private set; } = null!;

        /// <summary>
        /// Resource name of the API. Format: projects/{project}/locations/global/apis/{api}
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// State of the API.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Updated time.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Api resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Api(string name, ApiArgs args, CustomResourceOptions? options = null)
            : base("gcp-native:apigateway/v1:Api", name, args ?? new ApiArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Api(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("gcp-native:apigateway/v1:Api", name, null, MakeResourceOptions(options, id))
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
        /// Get an existing Api resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Api Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new Api(name, id, options);
        }
    }

    public sealed class ApiArgs : Pulumi.ResourceArgs
    {
        [Input("apisId", required: true)]
        public Input<string> ApisId { get; set; } = null!;

        /// <summary>
        /// Optional. Display name.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("locationsId", required: true)]
        public Input<string> LocationsId { get; set; } = null!;

        /// <summary>
        /// Optional. Immutable. The name of a Google Managed Service ( https://cloud.google.com/service-infrastructure/docs/glossary#managed). If not specified, a new Service will automatically be created in the same project as this API.
        /// </summary>
        [Input("managedService")]
        public Input<string>? ManagedService { get; set; }

        [Input("projectsId", required: true)]
        public Input<string> ProjectsId { get; set; } = null!;

        public ApiArgs()
        {
        }
    }
}