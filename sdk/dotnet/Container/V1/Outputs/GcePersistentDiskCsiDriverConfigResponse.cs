// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Container.V1.Outputs
{

    /// <summary>
    /// Configuration for the Compute Engine PD CSI driver.
    /// </summary>
    [OutputType]
    public sealed class GcePersistentDiskCsiDriverConfigResponse
    {
        /// <summary>
        /// Whether the Compute Engine PD CSI driver is enabled for this cluster.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private GcePersistentDiskCsiDriverConfigResponse(bool enabled)
        {
            Enabled = enabled;
        }
    }
}