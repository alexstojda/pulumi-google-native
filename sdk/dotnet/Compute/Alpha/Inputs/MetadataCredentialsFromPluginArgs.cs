// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Compute.Alpha.Inputs
{

    /// <summary>
    /// [Deprecated] Custom authenticator credentials. Custom authenticator credentials.
    /// </summary>
    public sealed class MetadataCredentialsFromPluginArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Plugin name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A text proto that conforms to a Struct type definition interpreted by the plugin.
        /// </summary>
        [Input("structConfig")]
        public Input<string>? StructConfig { get; set; }

        public MetadataCredentialsFromPluginArgs()
        {
        }
    }
}