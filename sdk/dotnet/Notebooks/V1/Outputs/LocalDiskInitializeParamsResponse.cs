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
    /// Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new runtime. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
    /// </summary>
    [OutputType]
    public sealed class LocalDiskInitializeParamsResponse
    {
        /// <summary>
        /// Optional. Provide this property when creating the disk.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated.
        /// </summary>
        public readonly string DiskName;
        /// <summary>
        /// Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB.
        /// </summary>
        public readonly string DiskSizeGb;
        /// <summary>
        /// Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
        /// </summary>
        public readonly string DiskType;
        /// <summary>
        /// Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;

        [OutputConstructor]
        private LocalDiskInitializeParamsResponse(
            string description,

            string diskName,

            string diskSizeGb,

            string diskType,

            ImmutableDictionary<string, string> labels)
        {
            Description = description;
            DiskName = diskName;
            DiskSizeGb = diskSizeGb;
            DiskType = diskType;
            Labels = labels;
        }
    }
}