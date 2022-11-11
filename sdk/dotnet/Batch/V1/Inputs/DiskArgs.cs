// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Batch.V1.Inputs
{

    /// <summary>
    /// A new persistent disk or a local ssd. A VM can only have one local SSD setting but multiple local SSD partitions. https://cloud.google.com/compute/docs/disks#pdspecs. https://cloud.google.com/compute/docs/disks#localssds.
    /// </summary>
    public sealed class DiskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Local SSDs are available through both "SCSI" and "NVMe" interfaces. If not indicated, "NVMe" will be the default one for local ssds. We only support "SCSI" for persistent disks now.
        /// </summary>
        [Input("diskInterface")]
        public Input<string>? DiskInterface { get; set; }

        /// <summary>
        /// Name of a public or custom image used as the data source.
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// Disk size in GB. This field is ignored if `data_source` is `disk` or `image`. If `type` is `local-ssd`, size_gb should be a multiple of 375GB, otherwise, the final size will be the next greater multiple of 375 GB.
        /// </summary>
        [Input("sizeGb")]
        public Input<string>? SizeGb { get; set; }

        /// <summary>
        /// Name of a snapshot used as the data source.
        /// </summary>
        [Input("snapshot")]
        public Input<string>? Snapshot { get; set; }

        /// <summary>
        /// Disk type as shown in `gcloud compute disk-types list` For example, "pd-ssd", "pd-standard", "pd-balanced", "local-ssd".
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DiskArgs()
        {
        }
        public static new DiskArgs Empty => new DiskArgs();
    }
}