// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Compute.Alpha.Outputs
{

    [OutputType]
    public sealed class BackendServiceIAPOAuth2ClientInfoResponse
    {
        /// <summary>
        /// Application name to be used in OAuth consent screen.
        /// </summary>
        public readonly string ApplicationName;
        /// <summary>
        /// Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
        /// </summary>
        public readonly string ClientName;
        /// <summary>
        /// Developer's information to be used in OAuth consent screen.
        /// </summary>
        public readonly string DeveloperEmailAddress;

        [OutputConstructor]
        private BackendServiceIAPOAuth2ClientInfoResponse(
            string applicationName,

            string clientName,

            string developerEmailAddress)
        {
            ApplicationName = applicationName;
            ClientName = clientName;
            DeveloperEmailAddress = developerEmailAddress;
        }
    }
}