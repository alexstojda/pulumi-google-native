// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Contactcenterinsights.V1.Outputs
{

    /// <summary>
    /// The conversation source, which is a combination of transcript and audio.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse
    {
        /// <summary>
        /// The source when the conversation comes from Dialogflow.
        /// </summary>
        public readonly Outputs.GoogleCloudContactcenterinsightsV1DialogflowSourceResponse DialogflowSource;
        /// <summary>
        /// A Cloud Storage location specification for the audio and transcript.
        /// </summary>
        public readonly Outputs.GoogleCloudContactcenterinsightsV1GcsSourceResponse GcsSource;

        [OutputConstructor]
        private GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse(
            Outputs.GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource,

            Outputs.GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource)
        {
            DialogflowSource = dialogflowSource;
            GcsSource = gcsSource;
        }
    }
}