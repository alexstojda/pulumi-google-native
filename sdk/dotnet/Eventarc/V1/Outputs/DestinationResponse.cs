// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Eventarc.V1.Outputs
{

    [OutputType]
    public sealed class DestinationResponse
    {
        /// <summary>
        /// Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
        /// </summary>
        public readonly Outputs.CloudRunResponse CloudRun;

        [OutputConstructor]
        private DestinationResponse(Outputs.CloudRunResponse cloudRun)
        {
            CloudRun = cloudRun;
        }
    }
}