// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Container.V1Beta1.Inputs
{

    /// <summary>
    /// EphemeralStorageConfig contains configuration for the ephemeral storage filesystem.
    /// </summary>
    public sealed class EphemeralStorageConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
        /// </summary>
        [Input("localSsdCount")]
        public Input<int>? LocalSsdCount { get; set; }

        public EphemeralStorageConfigArgs()
        {
        }
    }
}