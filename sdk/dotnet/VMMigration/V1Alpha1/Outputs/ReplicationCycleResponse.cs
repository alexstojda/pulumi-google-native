// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.VMMigration.V1Alpha1.Outputs
{

    /// <summary>
    /// ReplicationCycle contains information about the current replication cycle status.
    /// </summary>
    [OutputType]
    public sealed class ReplicationCycleResponse
    {
        /// <summary>
        /// The current progress in percentage of this cycle.
        /// </summary>
        public readonly int Progress;
        /// <summary>
        /// The current progress in percentage of this cycle.
        /// </summary>
        public readonly int ProgressPercent;
        /// <summary>
        /// The time the replication cycle has started.
        /// </summary>
        public readonly string StartTime;
        /// <summary>
        /// The cycle's steps list reflecting its progress.
        /// </summary>
        public readonly ImmutableArray<Outputs.CycleStepResponse> Steps;
        /// <summary>
        /// The accumulated duration the replication cycle was paused.
        /// </summary>
        public readonly string TotalPauseDuration;

        [OutputConstructor]
        private ReplicationCycleResponse(
            int progress,

            int progressPercent,

            string startTime,

            ImmutableArray<Outputs.CycleStepResponse> steps,

            string totalPauseDuration)
        {
            Progress = progress;
            ProgressPercent = progressPercent;
            StartTime = startTime;
            Steps = steps;
            TotalPauseDuration = totalPauseDuration;
        }
    }
}