// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.CloudDeploy.V1.Outputs
{

    /// <summary>
    /// Strategy contains deployment strategy information.
    /// </summary>
    [OutputType]
    public sealed class StrategyResponse
    {
        /// <summary>
        /// Standard deployment strategy executes a single deploy and allows verifying the deployment.
        /// </summary>
        public readonly Outputs.StandardResponse Standard;

        [OutputConstructor]
        private StrategyResponse(Outputs.StandardResponse standard)
        {
            Standard = standard;
        }
    }
}