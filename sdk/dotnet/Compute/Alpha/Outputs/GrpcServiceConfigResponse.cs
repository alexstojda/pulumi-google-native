// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Compute.Alpha.Outputs
{

    /// <summary>
    /// [Deprecated] gRPC config to access the SDS server. gRPC config to access the SDS server.
    /// </summary>
    [OutputType]
    public sealed class GrpcServiceConfigResponse
    {
        /// <summary>
        /// The call credentials to access the SDS server.
        /// </summary>
        public readonly Outputs.CallCredentialsResponse CallCredentials;
        /// <summary>
        /// The channel credentials to access the SDS server.
        /// </summary>
        public readonly Outputs.ChannelCredentialsResponse ChannelCredentials;
        /// <summary>
        /// The target URI of the SDS server.
        /// </summary>
        public readonly string TargetUri;

        [OutputConstructor]
        private GrpcServiceConfigResponse(
            Outputs.CallCredentialsResponse callCredentials,

            Outputs.ChannelCredentialsResponse channelCredentials,

            string targetUri)
        {
            CallCredentials = callCredentials;
            ChannelCredentials = channelCredentials;
            TargetUri = targetUri;
        }
    }
}