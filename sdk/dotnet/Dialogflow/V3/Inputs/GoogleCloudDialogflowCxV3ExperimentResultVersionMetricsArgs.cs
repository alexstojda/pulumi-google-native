// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Dialogflow.V3.Inputs
{

    /// <summary>
    /// Version variant and associated metrics.
    /// </summary>
    public sealed class GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs : Pulumi.ResourceArgs
    {
        [Input("metrics")]
        private InputList<Inputs.GoogleCloudDialogflowCxV3ExperimentResultMetricArgs>? _metrics;

        /// <summary>
        /// The metrics and corresponding confidence intervals in the inference result.
        /// </summary>
        public InputList<Inputs.GoogleCloudDialogflowCxV3ExperimentResultMetricArgs> Metrics
        {
            get => _metrics ?? (_metrics = new InputList<Inputs.GoogleCloudDialogflowCxV3ExperimentResultMetricArgs>());
            set => _metrics = value;
        }

        /// <summary>
        /// Number of sessions that were allocated to this version.
        /// </summary>
        [Input("sessionCount")]
        public Input<int>? SessionCount { get; set; }

        /// <summary>
        /// The name of the flow Version. Format: `projects//locations//agents//flows//versions/`.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs()
        {
        }
    }
}