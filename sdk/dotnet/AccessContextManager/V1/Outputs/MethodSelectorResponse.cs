// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.AccessContextManager.V1.Outputs
{

    /// <summary>
    /// An allowed method or permission of a service specified in ApiOperation.
    /// </summary>
    [OutputType]
    public sealed class MethodSelectorResponse
    {
        /// <summary>
        /// Value for `method` should be a valid method name for the corresponding `service_name` in ApiOperation. If `*` used as value for `method`, then ALL methods and permissions are allowed.
        /// </summary>
        public readonly string Method;
        /// <summary>
        /// Value for `permission` should be a valid Cloud IAM permission for the corresponding `service_name` in ApiOperation.
        /// </summary>
        public readonly string Permission;

        [OutputConstructor]
        private MethodSelectorResponse(
            string method,

            string permission)
        {
            Method = method;
            Permission = permission;
        }
    }
}
