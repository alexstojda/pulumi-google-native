// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Orgpolicy.V2.Outputs
{

    [OutputType]
    public sealed class GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse
    {
        /// <summary>
        /// List of values allowed at this resource.
        /// </summary>
        public readonly ImmutableArray<string> AllowedValues;
        /// <summary>
        /// List of values denied at this resource.
        /// </summary>
        public readonly ImmutableArray<string> DeniedValues;

        [OutputConstructor]
        private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse(
            ImmutableArray<string> allowedValues,

            ImmutableArray<string> deniedValues)
        {
            AllowedValues = allowedValues;
            DeniedValues = deniedValues;
        }
    }
}