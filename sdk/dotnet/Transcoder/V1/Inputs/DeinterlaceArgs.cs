// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Transcoder.V1.Inputs
{

    /// <summary>
    /// Deinterlace configuration for input video.
    /// </summary>
    public sealed class DeinterlaceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Bob Weaver Deinterlacing Filter Configuration.
        /// </summary>
        [Input("bwdif")]
        public Input<Inputs.BwdifConfigArgs>? Bwdif { get; set; }

        /// <summary>
        /// Specifies the Yet Another Deinterlacing Filter Configuration.
        /// </summary>
        [Input("yadif")]
        public Input<Inputs.YadifConfigArgs>? Yadif { get; set; }

        public DeinterlaceArgs()
        {
        }
        public static new DeinterlaceArgs Empty => new DeinterlaceArgs();
    }
}
