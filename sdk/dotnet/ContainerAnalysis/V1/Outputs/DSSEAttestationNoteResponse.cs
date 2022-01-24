// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.ContainerAnalysis.V1.Outputs
{

    [OutputType]
    public sealed class DSSEAttestationNoteResponse
    {
        /// <summary>
        /// DSSEHint hints at the purpose of the attestation authority.
        /// </summary>
        public readonly Outputs.DSSEHintResponse Hint;

        [OutputConstructor]
        private DSSEAttestationNoteResponse(Outputs.DSSEHintResponse hint)
        {
            Hint = hint;
        }
    }
}