// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.DLP.V2.Outputs
{

    /// <summary>
    /// What event needs to occur for a new job to be started.
    /// </summary>
    [OutputType]
    public sealed class GooglePrivacyDlpV2TriggerResponse
    {
        /// <summary>
        /// For use with hybrid jobs. Jobs must be manually created and finished.
        /// </summary>
        public readonly Outputs.GooglePrivacyDlpV2ManualResponse Manual;
        /// <summary>
        /// Create a job on a repeating basis based on the elapse of time.
        /// </summary>
        public readonly Outputs.GooglePrivacyDlpV2ScheduleResponse Schedule;

        [OutputConstructor]
        private GooglePrivacyDlpV2TriggerResponse(
            Outputs.GooglePrivacyDlpV2ManualResponse manual,

            Outputs.GooglePrivacyDlpV2ScheduleResponse schedule)
        {
            Manual = manual;
            Schedule = schedule;
        }
    }
}
