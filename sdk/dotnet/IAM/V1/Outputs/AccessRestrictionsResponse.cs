// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.IAM.V1.Outputs
{

    /// <summary>
    /// Access related restrictions on the workforce pool.
    /// </summary>
    [OutputType]
    public sealed class AccessRestrictionsResponse
    {
        /// <summary>
        /// Optional. Immutable. Services allowed for web sign-in with the workforce pool. If not set by default there are no restrictions.
        /// </summary>
        public readonly ImmutableArray<Outputs.ServiceConfigResponse> AllowedServices;
        /// <summary>
        /// Optional. Disable programmatic sign-in by disabling token issue via the Security Token API endpoint. See [Security Token Service API] (https://cloud.google.com/iam/docs/reference/sts/rest).
        /// </summary>
        public readonly bool DisableProgrammaticSignin;

        [OutputConstructor]
        private AccessRestrictionsResponse(
            ImmutableArray<Outputs.ServiceConfigResponse> allowedServices,

            bool disableProgrammaticSignin)
        {
            AllowedServices = allowedServices;
            DisableProgrammaticSignin = disableProgrammaticSignin;
        }
    }
}
