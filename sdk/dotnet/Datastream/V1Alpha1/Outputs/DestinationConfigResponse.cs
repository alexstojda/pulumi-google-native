// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Datastream.V1Alpha1.Outputs
{

    /// <summary>
    /// The configuration of the stream destination.
    /// </summary>
    [OutputType]
    public sealed class DestinationConfigResponse
    {
        /// <summary>
        /// Destination connection profile identifier.
        /// </summary>
        public readonly string DestinationConnectionProfileName;
        /// <summary>
        /// GCS destination configuration.
        /// </summary>
        public readonly Outputs.GcsDestinationConfigResponse GcsDestinationConfig;

        [OutputConstructor]
        private DestinationConfigResponse(
            string destinationConnectionProfileName,

            Outputs.GcsDestinationConfigResponse gcsDestinationConfig)
        {
            DestinationConnectionProfileName = destinationConnectionProfileName;
            GcsDestinationConfig = gcsDestinationConfig;
        }
    }
}