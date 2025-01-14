// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Aiplatform.V1Beta1.Outputs
{

    /// <summary>
    /// The config for email alert.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudAiplatformV1beta1ModelMonitoringAlertConfigEmailAlertConfigResponse
    {
        /// <summary>
        /// The email addresses to send the alert.
        /// </summary>
        public readonly ImmutableArray<string> UserEmails;

        [OutputConstructor]
        private GoogleCloudAiplatformV1beta1ModelMonitoringAlertConfigEmailAlertConfigResponse(ImmutableArray<string> userEmails)
        {
            UserEmails = userEmails;
        }
    }
}
