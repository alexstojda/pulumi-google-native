// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Gkeonprem.V1.Inputs
{

    /// <summary>
    /// NodePoolAutoscaling config for the NodePool to allow for the kubernetes to scale NodePool.
    /// </summary>
    public sealed class VmwareNodePoolAutoscalingConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of replicas in the NodePool.
        /// </summary>
        [Input("maxReplicas")]
        public Input<int>? MaxReplicas { get; set; }

        /// <summary>
        /// Minimum number of replicas in the NodePool.
        /// </summary>
        [Input("minReplicas")]
        public Input<int>? MinReplicas { get; set; }

        public VmwareNodePoolAutoscalingConfigArgs()
        {
        }
        public static new VmwareNodePoolAutoscalingConfigArgs Empty => new VmwareNodePoolAutoscalingConfigArgs();
    }
}
