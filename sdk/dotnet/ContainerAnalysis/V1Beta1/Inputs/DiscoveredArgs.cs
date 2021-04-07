// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.ContainerAnalysis.V1Beta1.Inputs
{

    /// <summary>
    /// Provides information about the analysis status of a discovered resource.
    /// </summary>
    public sealed class DiscoveredArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status of discovery for the resource.
        /// </summary>
        [Input("analysisStatus")]
        public Input<string>? AnalysisStatus { get; set; }

        /// <summary>
        /// When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API.
        /// </summary>
        [Input("analysisStatusError")]
        public Input<Inputs.StatusArgs>? AnalysisStatusError { get; set; }

        /// <summary>
        /// Whether the resource is continuously analyzed.
        /// </summary>
        [Input("continuousAnalysis")]
        public Input<string>? ContinuousAnalysis { get; set; }

        /// <summary>
        /// The last time continuous analysis was done for this resource. Deprecated, do not use.
        /// </summary>
        [Input("lastAnalysisTime")]
        public Input<string>? LastAnalysisTime { get; set; }

        public DiscoveredArgs()
        {
        }
    }
}