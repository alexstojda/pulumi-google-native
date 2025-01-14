// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.NetworkManagement.V1.Outputs
{

    /// <summary>
    /// Representation of a network edge location as per https://cloud.google.com/vpc/docs/edge-locations.
    /// </summary>
    [OutputType]
    public sealed class EdgeLocationResponse
    {
        /// <summary>
        /// Name of the metropolitan area.
        /// </summary>
        public readonly string MetropolitanArea;

        [OutputConstructor]
        private EdgeLocationResponse(string metropolitanArea)
        {
            MetropolitanArea = metropolitanArea;
        }
    }
}
