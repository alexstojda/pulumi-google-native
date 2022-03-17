// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.AppEngine.V1.Outputs
{

    /// <summary>
    /// Volumes mounted within the app container. Only applicable in the App Engine flexible environment.
    /// </summary>
    [OutputType]
    public sealed class VolumeResponse
    {
        /// <summary>
        /// Unique name for the volume.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Volume size in gigabytes.
        /// </summary>
        public readonly double SizeGb;
        /// <summary>
        /// Underlying volume type, e.g. 'tmpfs'.
        /// </summary>
        public readonly string VolumeType;

        [OutputConstructor]
        private VolumeResponse(
            string name,

            double sizeGb,

            string volumeType)
        {
            Name = name;
            SizeGb = sizeGb;
            VolumeType = volumeType;
        }
    }
}