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
    /// A Service-Level Indicator (SLI) describes the "performance" of a service. For some services, the SLI is well-defined. In such cases, the SLI can be described easily by referencing the well-known SLI and providing the needed parameters. Alternatively, a "custom" SLI can be defined with a query to the underlying metric store. An SLI is defined to be good_service / total_service over any queried time interval. The value of performance always falls into the range 0 &lt;= performance &lt;= 1. A custom SLI describes how to compute this ratio, whether this is by dividing values from a pair of time series, cutting a Distribution into good and bad counts, or counting time windows in which the service complies with a criterion. For separation of concerns, a single Service-Level Indicator measures performance for only one aspect of service quality, such as fraction of successful queries or fast-enough queries.
    /// </summary>
    [OutputType]
    public sealed class ServiceLevelIndicatorResponse
    {
        /// <summary>
        /// Basic SLI on a well-known service type.
        /// </summary>
        public readonly Outputs.BasicSliResponse BasicSli;
        /// <summary>
        /// Request-based SLIs
        /// </summary>
        public readonly Outputs.RequestBasedSliResponse RequestBased;
        /// <summary>
        /// Windows-based SLIs
        /// </summary>
        public readonly Outputs.WindowsBasedSliResponse WindowsBased;

        [OutputConstructor]
        private ServiceLevelIndicatorResponse(
            Outputs.BasicSliResponse basicSli,

            Outputs.RequestBasedSliResponse requestBased,

            Outputs.WindowsBasedSliResponse windowsBased)
        {
            BasicSli = basicSli;
            RequestBased = requestBased;
            WindowsBased = windowsBased;
        }
    }
}