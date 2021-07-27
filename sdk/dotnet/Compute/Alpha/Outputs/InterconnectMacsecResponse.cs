// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Compute.Alpha.Outputs
{

    [OutputType]
    public sealed class InterconnectMacsecResponse
    {
        /// <summary>
        /// If set to true, the Interconnect will be configured with a should-secure MACsec security policy, that allows the Google router to fallback to cleartext traffic if the MKA session cannot be established. By default, the Interconnect will be configured with a must-secure security policy that drops all traffic if the MKA session cannot be established with your router.
        /// </summary>
        public readonly bool FailOpen;
        /// <summary>
        /// A keychain placeholder describing a set of named key objects along with their start times. A MACsec CKN/CAK will be generated for each key in the key chain. Google router will automatically pick the key with the most recent startTime when establishing or re-establishing a MACsec secure link.
        /// </summary>
        public readonly ImmutableArray<Outputs.InterconnectMacsecPreSharedKeyResponse> PreSharedKeys;

        [OutputConstructor]
        private InterconnectMacsecResponse(
            bool failOpen,

            ImmutableArray<Outputs.InterconnectMacsecPreSharedKeyResponse> preSharedKeys)
        {
            FailOpen = failOpen;
            PreSharedKeys = preSharedKeys;
        }
    }
}