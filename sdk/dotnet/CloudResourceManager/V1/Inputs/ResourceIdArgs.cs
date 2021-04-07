// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.CloudResourceManager.V1.Inputs
{

    /// <summary>
    /// A container to reference an id for any resource type. A `resource` in Google Cloud Platform is a generic term for something you (a developer) may want to interact with through one of our API's. Some examples are an App Engine app, a Compute Engine instance, a Cloud SQL database, and so on.
    /// </summary>
    public sealed class ResourceIdArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type-specific id. This should correspond to the id used in the type-specific API's.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The resource type this id is for. At present, the valid types are: "organization", "folder", and "project".
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ResourceIdArgs()
        {
        }
    }
}