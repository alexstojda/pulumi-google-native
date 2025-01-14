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
    /// Standard represents the standard deployment strategy.
    /// </summary>
    [OutputType]
    public sealed class StandardResponse
    {
        /// <summary>
        /// Optional. Configuration for the postdeploy job. If this is not configured, postdeploy job will not be present.
        /// </summary>
        public readonly Outputs.PostdeployResponse Postdeploy;
        /// <summary>
        /// Optional. Configuration for the predeploy job. If this is not configured, predeploy job will not be present.
        /// </summary>
        public readonly Outputs.PredeployResponse Predeploy;
        /// <summary>
        /// Whether to verify a deployment.
        /// </summary>
        public readonly bool Verify;

        [OutputConstructor]
        private StandardResponse(
            Outputs.PostdeployResponse postdeploy,

            Outputs.PredeployResponse predeploy,

            bool verify)
        {
            Postdeploy = postdeploy;
            Predeploy = predeploy;
            Verify = verify;
        }
    }
}
