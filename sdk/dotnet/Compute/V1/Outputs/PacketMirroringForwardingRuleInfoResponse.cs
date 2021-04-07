// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Compute.V1.Outputs
{

    [OutputType]
    public sealed class PacketMirroringForwardingRuleInfoResponse
    {
        /// <summary>
        /// [Output Only] Unique identifier for the forwarding rule; defined by the server.
        /// </summary>
        public readonly string CanonicalUrl;
        /// <summary>
        /// Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private PacketMirroringForwardingRuleInfoResponse(
            string canonicalUrl,

            string url)
        {
            CanonicalUrl = canonicalUrl;
            Url = url;
        }
    }
}