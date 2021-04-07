// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.FirebaseHosting.V1Beta1
{
    /// <summary>
    /// Creates a new release, which makes the content of the specified version actively display on the appropriate URL(s).
    /// </summary>
    [GcpNativeResourceType("gcp-native:firebasehosting/v1beta1:SiteRelease")]
    public partial class SiteRelease : Pulumi.CustomResource
    {
        /// <summary>
        /// Create a SiteRelease resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SiteRelease(string name, SiteReleaseArgs args, CustomResourceOptions? options = null)
            : base("gcp-native:firebasehosting/v1beta1:SiteRelease", name, args ?? new SiteReleaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SiteRelease(string name, Input<string> id, CustomResourceOptions? options = null)
            : base("gcp-native:firebasehosting/v1beta1:SiteRelease", name, null, MakeResourceOptions(options, id))
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
        /// Get an existing SiteRelease resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SiteRelease Get(string name, Input<string> id, CustomResourceOptions? options = null)
        {
            return new SiteRelease(name, id, options);
        }
    }

    public sealed class SiteReleaseArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The deploy description when the release was created. The value can be up to 512 characters.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// The unique identifier for the release, in either of the following formats: - sites/SITE_ID/releases/RELEASE_ID - sites/SITE_ID/channels/CHANNEL_ID/releases/RELEASE_ID This name is provided in the response body when you call [`releases.create`](sites.releases/create) or [`channels.releases.create`](sites.channels.releases/create).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The time at which the version is set to be public.
        /// </summary>
        [Input("releaseTime")]
        public Input<string>? ReleaseTime { get; set; }

        /// <summary>
        /// Identifies the user who created the release.
        /// </summary>
        [Input("releaseUser")]
        public Input<Inputs.ActingUserArgs>? ReleaseUser { get; set; }

        [Input("sitesId", required: true)]
        public Input<string> SitesId { get; set; } = null!;

        /// <summary>
        /// Explains the reason for the release. Specify a value for this field only when creating a `SITE_DISABLE` type release.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The configuration and content that was released.
        /// </summary>
        [Input("version")]
        public Input<Inputs.VersionArgs>? Version { get; set; }

        public SiteReleaseArgs()
        {
        }
    }
}