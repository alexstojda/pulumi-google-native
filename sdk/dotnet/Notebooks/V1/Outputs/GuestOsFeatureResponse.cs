// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Notebooks.V1.Outputs
{

    /// <summary>
    /// Guest OS features for boot disk.
    /// </summary>
    [OutputType]
    public sealed class GuestOsFeatureResponse
    {
        /// <summary>
        /// The ID of a supported feature. Read Enabling guest operating system features to see a list of available options. Valid values: * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GuestOsFeatureResponse(string type)
        {
            Type = type;
        }
    }
}