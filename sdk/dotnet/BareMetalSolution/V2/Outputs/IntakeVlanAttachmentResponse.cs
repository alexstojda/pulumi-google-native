// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.BareMetalSolution.V2.Outputs
{

    /// <summary>
    /// A GCP vlan attachment.
    /// </summary>
    [OutputType]
    public sealed class IntakeVlanAttachmentResponse
    {
        /// <summary>
        /// Attachment pairing key.
        /// </summary>
        public readonly string PairingKey;

        [OutputConstructor]
        private IntakeVlanAttachmentResponse(string pairingKey)
        {
            PairingKey = pairingKey;
        }
    }
}