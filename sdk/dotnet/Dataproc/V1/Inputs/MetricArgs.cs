// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Dataproc.V1.Inputs
{

    /// <summary>
    /// Metric source to enable along with any optional metrics for this source that override the dataproc defaults
    /// </summary>
    public sealed class MetricArgs : Pulumi.ResourceArgs
    {
        [Input("metricOverrides")]
        private InputList<string>? _metricOverrides;

        /// <summary>
        /// Optional. Optional Metrics to override the dataproc default metrics configured for the metric source
        /// </summary>
        public InputList<string> MetricOverrides
        {
            get => _metricOverrides ?? (_metricOverrides = new InputList<string>());
            set => _metricOverrides = value;
        }

        /// <summary>
        /// MetricSource that should be enabled
        /// </summary>
        [Input("metricSource", required: true)]
        public Input<Pulumi.GoogleNative.Dataproc.V1.MetricMetricSource> MetricSource { get; set; } = null!;

        public MetricArgs()
        {
        }
    }
}