// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.contentwarehouse.V1.Outputs
{

    /// <summary>
    /// Represents the action responsible for access control list management operations.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudContentwarehouseV1AccessControlActionResponse
    {
        /// <summary>
        /// Identifies the type of operation.
        /// </summary>
        public readonly string OperationType;
        /// <summary>
        /// Represents the new policy from which bindings are added, removed or replaced based on the type of the operation. the policy is limited to a few 10s of KB.
        /// </summary>
        public readonly Outputs.GoogleIamV1PolicyResponse Policy;

        [OutputConstructor]
        private GoogleCloudContentwarehouseV1AccessControlActionResponse(
            string operationType,

            Outputs.GoogleIamV1PolicyResponse policy)
        {
            OperationType = operationType;
            Policy = policy;
        }
    }
}