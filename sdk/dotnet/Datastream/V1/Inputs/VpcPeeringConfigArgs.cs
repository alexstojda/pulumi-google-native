// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Datastream.V1.Inputs
{

    /// <summary>
    /// The VPC Peering configuration is used to create VPC peering between Datastream and the consumer's VPC.
    /// </summary>
    public sealed class VpcPeeringConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A free subnet for peering. (CIDR of /29) TODO(b/172995841) add validators.
        /// </summary>
        [Input("subnet", required: true)]
        public Input<string> Subnet { get; set; } = null!;

        /// <summary>
        /// Fully qualified name of the VPC that Datastream will peer to. Format: `projects/{project}/global/{networks}/{name}`
        /// </summary>
        [Input("vpc", required: true)]
        public Input<string> Vpc { get; set; } = null!;

        public VpcPeeringConfigArgs()
        {
        }
    }
}