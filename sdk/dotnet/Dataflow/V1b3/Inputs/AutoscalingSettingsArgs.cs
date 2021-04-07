// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Dataflow.V1b3.Inputs
{

    /// <summary>
    /// Settings for WorkerPool autoscaling.
    /// </summary>
    public sealed class AutoscalingSettingsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The algorithm to use for autoscaling.
        /// </summary>
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        /// <summary>
        /// The maximum number of workers to cap scaling at.
        /// </summary>
        [Input("maxNumWorkers")]
        public Input<int>? MaxNumWorkers { get; set; }

        public AutoscalingSettingsArgs()
        {
        }
    }
}