// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Compute.Alpha.Outputs
{

    [OutputType]
    public sealed class AutoscalingPolicyScaleInControlResponse
    {
        /// <summary>
        /// Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
        /// </summary>
        public readonly Outputs.FixedOrPercentResponse MaxScaledInReplicas;
        /// <summary>
        /// How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
        /// </summary>
        public readonly int TimeWindowSec;

        [OutputConstructor]
        private AutoscalingPolicyScaleInControlResponse(
            Outputs.FixedOrPercentResponse maxScaledInReplicas,

            int timeWindowSec)
        {
            MaxScaledInReplicas = maxScaledInReplicas;
            TimeWindowSec = timeWindowSec;
        }
    }
}