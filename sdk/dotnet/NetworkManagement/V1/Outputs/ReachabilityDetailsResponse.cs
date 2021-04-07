// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.NetworkManagement.V1.Outputs
{

    [OutputType]
    public sealed class ReachabilityDetailsResponse
    {
        /// <summary>
        /// The details of a failure or a cancellation of reachability analysis.
        /// </summary>
        public readonly Outputs.StatusResponse Error;
        /// <summary>
        /// The overall result of the test's configuration analysis.
        /// </summary>
        public readonly string Result;
        /// <summary>
        /// Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends.
        /// </summary>
        public readonly ImmutableArray<Outputs.TraceResponse> Traces;
        /// <summary>
        /// The time of the configuration analysis.
        /// </summary>
        public readonly string VerifyTime;

        [OutputConstructor]
        private ReachabilityDetailsResponse(
            Outputs.StatusResponse error,

            string result,

            ImmutableArray<Outputs.TraceResponse> traces,

            string verifyTime)
        {
            Error = error;
            Result = result;
            Traces = traces;
            VerifyTime = verifyTime;
        }
    }
}