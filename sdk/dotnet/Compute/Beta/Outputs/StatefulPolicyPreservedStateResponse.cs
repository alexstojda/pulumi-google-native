// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Compute.Beta.Outputs
{

    [OutputType]
    public sealed class StatefulPolicyPreservedStateResponse
    {
        /// <summary>
        /// Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Disks;

        [OutputConstructor]
        private StatefulPolicyPreservedStateResponse(ImmutableDictionary<string, string> disks)
        {
            Disks = disks;
        }
    }
}