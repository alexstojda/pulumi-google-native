// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Monitoring.V3.Outputs
{

    [OutputType]
    public sealed class RequestBasedSliResponse
    {
        /// <summary>
        /// distribution_cut is used when good_service is a count of values aggregated in a Distribution that fall into a good range. The total_service is the total count of all values aggregated in the Distribution.
        /// </summary>
        public readonly Outputs.DistributionCutResponse DistributionCut;
        /// <summary>
        /// good_total_ratio is used when the ratio of good_service to total_service is computed from two TimeSeries.
        /// </summary>
        public readonly Outputs.TimeSeriesRatioResponse GoodTotalRatio;

        [OutputConstructor]
        private RequestBasedSliResponse(
            Outputs.DistributionCutResponse distributionCut,

            Outputs.TimeSeriesRatioResponse goodTotalRatio)
        {
            DistributionCut = distributionCut;
            GoodTotalRatio = goodTotalRatio;
        }
    }
}