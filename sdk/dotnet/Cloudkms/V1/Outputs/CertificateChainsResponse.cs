// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Cloudkms.V1.Outputs
{

    [OutputType]
    public sealed class CertificateChainsResponse
    {
        /// <summary>
        /// Cavium certificate chain corresponding to the attestation.
        /// </summary>
        public readonly ImmutableArray<string> CaviumCerts;
        /// <summary>
        /// Google card certificate chain corresponding to the attestation.
        /// </summary>
        public readonly ImmutableArray<string> GoogleCardCerts;
        /// <summary>
        /// Google partition certificate chain corresponding to the attestation.
        /// </summary>
        public readonly ImmutableArray<string> GooglePartitionCerts;

        [OutputConstructor]
        private CertificateChainsResponse(
            ImmutableArray<string> caviumCerts,

            ImmutableArray<string> googleCardCerts,

            ImmutableArray<string> googlePartitionCerts)
        {
            CaviumCerts = caviumCerts;
            GoogleCardCerts = googleCardCerts;
            GooglePartitionCerts = googlePartitionCerts;
        }
    }
}