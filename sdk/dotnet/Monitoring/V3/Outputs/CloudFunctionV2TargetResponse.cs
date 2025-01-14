// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Monitoring.V3.Outputs
{

    /// <summary>
    /// A Synthetic Monitor deployed to a Cloud Functions V2 instance.
    /// </summary>
    [OutputType]
    public sealed class CloudFunctionV2TargetResponse
    {
        /// <summary>
        /// The cloud_run_revision Monitored Resource associated with the GCFv2. The Synthetic Monitor execution results (metrics, logs, and spans) are reported against this Monitored Resource. This field is output only.
        /// </summary>
        public readonly Outputs.MonitoredResourceResponse CloudRunRevision;
        /// <summary>
        /// Fully qualified GCFv2 resource name i.e. projects/{project}/locations/{location}/functions/{function} Required.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private CloudFunctionV2TargetResponse(
            Outputs.MonitoredResourceResponse cloudRunRevision,

            string name)
        {
            CloudRunRevision = cloudRunRevision;
            Name = name;
        }
    }
}
