// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Monitoring.V1.Outputs
{

    /// <summary>
    /// TimeSeriesQuery collects the set of supported methods for querying time series data from the Stackdriver metrics API.
    /// </summary>
    [OutputType]
    public sealed class TimeSeriesQueryResponse
    {
        /// <summary>
        /// Filter parameters to fetch time series.
        /// </summary>
        public readonly Outputs.TimeSeriesFilterResponse TimeSeriesFilter;
        /// <summary>
        /// Parameters to fetch a ratio between two time series filters.
        /// </summary>
        public readonly Outputs.TimeSeriesFilterRatioResponse TimeSeriesFilterRatio;
        /// <summary>
        /// A query used to fetch time series.
        /// </summary>
        public readonly string TimeSeriesQueryLanguage;
        /// <summary>
        /// The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
        /// </summary>
        public readonly string UnitOverride;

        [OutputConstructor]
        private TimeSeriesQueryResponse(
            Outputs.TimeSeriesFilterResponse timeSeriesFilter,

            Outputs.TimeSeriesFilterRatioResponse timeSeriesFilterRatio,

            string timeSeriesQueryLanguage,

            string unitOverride)
        {
            TimeSeriesFilter = timeSeriesFilter;
            TimeSeriesFilterRatio = timeSeriesFilterRatio;
            TimeSeriesQueryLanguage = timeSeriesQueryLanguage;
            UnitOverride = unitOverride;
        }
    }
}