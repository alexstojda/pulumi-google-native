// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Aiplatform.V1Beta1
{
    /// <summary>
    /// Creates a new Featurestore in a given project and location.
    /// Auto-naming is currently not supported for this resource.
    /// </summary>
    [GoogleNativeResourceType("google-native:aiplatform/v1beta1:Featurestore")]
    public partial class Featurestore : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Timestamp when this Featurestore was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Optional. Customer-managed encryption key spec for data storage. If set, both of the online and offline data storage will be secured by this key.
        /// </summary>
        [Output("encryptionSpec")]
        public Output<Outputs.GoogleCloudAiplatformV1beta1EncryptionSpecResponse> EncryptionSpec { get; private set; } = null!;

        /// <summary>
        /// Optional. Used to perform consistent read-modify-write updates. If not set, a blind "overwrite" update happens.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Required. The ID to use for this Featurestore, which will become the final component of the Featurestore's resource name. This value may be up to 60 characters, and valid characters are `[a-z0-9_]`. The first character cannot be a number. The value must be unique within the project and location.
        /// </summary>
        [Output("featurestoreId")]
        public Output<string> FeaturestoreId { get; private set; } = null!;

        /// <summary>
        /// Optional. The labels with user-defined metadata to organize your Featurestore. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user labels can be associated with one Featurestore(System labels are excluded)." System reserved label keys are prefixed with "aiplatform.googleapis.com/" and are immutable.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>> Labels { get; private set; } = null!;

        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Name of the Featurestore. Format: `projects/{project}/locations/{location}/featurestores/{featurestore}`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Optional. Config for online storage resources. The field should not co-exist with the field of `OnlineStoreReplicationConfig`. If both of it and OnlineStoreReplicationConfig are unset, the feature store will not have an online store and cannot be used for online serving.
        /// </summary>
        [Output("onlineServingConfig")]
        public Output<Outputs.GoogleCloudAiplatformV1beta1FeaturestoreOnlineServingConfigResponse> OnlineServingConfig { get; private set; } = null!;

        /// <summary>
        /// Optional. TTL in days for feature values that will be stored in online serving storage. The Feature Store online storage periodically removes obsolete feature values older than `online_storage_ttl_days` since the feature generation time. Note that `online_storage_ttl_days` should be less than or equal to `offline_storage_ttl_days` for each EntityType under a featurestore. If not set, default to 4000 days
        /// </summary>
        [Output("onlineStorageTtlDays")]
        public Output<int> OnlineStorageTtlDays { get; private set; } = null!;

        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// State of the featurestore.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Timestamp when this Featurestore was last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Featurestore resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Featurestore(string name, FeaturestoreArgs args, CustomResourceOptions? options = null)
            : base("google-native:aiplatform/v1beta1:Featurestore", name, args ?? new FeaturestoreArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Featurestore(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("google-native:aiplatform/v1beta1:Featurestore", name, null, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                ReplaceOnChanges =
                {
                    "featurestoreId",
                    "location",
                    "project",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Featurestore resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Featurestore Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new Featurestore(name, id, options);
        }
    }

    public sealed class FeaturestoreArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Customer-managed encryption key spec for data storage. If set, both of the online and offline data storage will be secured by this key.
        /// </summary>
        [Input("encryptionSpec")]
        public Input<Inputs.GoogleCloudAiplatformV1beta1EncryptionSpecArgs>? EncryptionSpec { get; set; }

        /// <summary>
        /// Optional. Used to perform consistent read-modify-write updates. If not set, a blind "overwrite" update happens.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Required. The ID to use for this Featurestore, which will become the final component of the Featurestore's resource name. This value may be up to 60 characters, and valid characters are `[a-z0-9_]`. The first character cannot be a number. The value must be unique within the project and location.
        /// </summary>
        [Input("featurestoreId", required: true)]
        public Input<string> FeaturestoreId { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. The labels with user-defined metadata to organize your Featurestore. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information on and examples of labels. No more than 64 user labels can be associated with one Featurestore(System labels are excluded)." System reserved label keys are prefixed with "aiplatform.googleapis.com/" and are immutable.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Optional. Config for online storage resources. The field should not co-exist with the field of `OnlineStoreReplicationConfig`. If both of it and OnlineStoreReplicationConfig are unset, the feature store will not have an online store and cannot be used for online serving.
        /// </summary>
        [Input("onlineServingConfig")]
        public Input<Inputs.GoogleCloudAiplatformV1beta1FeaturestoreOnlineServingConfigArgs>? OnlineServingConfig { get; set; }

        /// <summary>
        /// Optional. TTL in days for feature values that will be stored in online serving storage. The Feature Store online storage periodically removes obsolete feature values older than `online_storage_ttl_days` since the feature generation time. Note that `online_storage_ttl_days` should be less than or equal to `offline_storage_ttl_days` for each EntityType under a featurestore. If not set, default to 4000 days
        /// </summary>
        [Input("onlineStorageTtlDays")]
        public Input<int>? OnlineStorageTtlDays { get; set; }

        [Input("project")]
        public Input<string>? Project { get; set; }

        public FeaturestoreArgs()
        {
        }
        public static new FeaturestoreArgs Empty => new FeaturestoreArgs();
    }
}
