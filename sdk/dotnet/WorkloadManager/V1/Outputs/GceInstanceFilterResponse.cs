// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.WorkloadManager.V1.Outputs
{

    /// <summary>
    /// Message describing compute engine instance filter
    /// </summary>
    [OutputType]
    public sealed class GceInstanceFilterResponse
    {
        /// <summary>
        /// Service account of compute engine
        /// </summary>
        public readonly ImmutableArray<string> ServiceAccounts;

        [OutputConstructor]
        private GceInstanceFilterResponse(ImmutableArray<string> serviceAccounts)
        {
            ServiceAccounts = serviceAccounts;
        }
    }
}
