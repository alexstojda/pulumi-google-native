// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Metastore.V1.Outputs
{

    /// <summary>
    /// Telemetry Configuration for the Dataproc Metastore service.
    /// </summary>
    [OutputType]
    public sealed class TelemetryConfigResponse
    {
        /// <summary>
        /// The output format of the Dataproc Metastore service's logs.
        /// </summary>
        public readonly string LogFormat;

        [OutputConstructor]
        private TelemetryConfigResponse(string logFormat)
        {
            LogFormat = logFormat;
        }
    }
}
