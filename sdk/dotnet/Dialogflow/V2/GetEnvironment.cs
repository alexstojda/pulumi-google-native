// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Dialogflow.V2
{
    public static class GetEnvironment
    {
        /// <summary>
        /// Retrieves the specified agent environment.
        /// </summary>
        public static Task<GetEnvironmentResult> InvokeAsync(GetEnvironmentArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetEnvironmentResult>("google-native:dialogflow/v2:getEnvironment", args ?? new GetEnvironmentArgs(), options.WithVersion());
    }


    public sealed class GetEnvironmentArgs : Pulumi.InvokeArgs
    {
        [Input("environmentId", required: true)]
        public string EnvironmentId { get; set; } = null!;

        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        [Input("project", required: true)]
        public string Project { get; set; } = null!;

        public GetEnvironmentArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetEnvironmentResult
    {
        /// <summary>
        /// Optional. The agent version loaded into this environment. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
        /// </summary>
        public readonly string AgentVersion;
        /// <summary>
        /// Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Optional. The fulfillment settings to use for this environment.
        /// </summary>
        public readonly Outputs.GoogleCloudDialogflowV2FulfillmentResponse Fulfillment;
        /// <summary>
        /// The unique identifier of this agent environment. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/`
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The state of this environment. This field is read-only, i.e., it cannot be set by create and update methods.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Optional. Text to speech settings for this environment.
        /// </summary>
        public readonly Outputs.GoogleCloudDialogflowV2TextToSpeechSettingsResponse TextToSpeechSettings;
        /// <summary>
        /// The last update time of this environment. This field is read-only, i.e., it cannot be set by create and update methods.
        /// </summary>
        public readonly string UpdateTime;

        [OutputConstructor]
        private GetEnvironmentResult(
            string agentVersion,

            string description,

            Outputs.GoogleCloudDialogflowV2FulfillmentResponse fulfillment,

            string name,

            string state,

            Outputs.GoogleCloudDialogflowV2TextToSpeechSettingsResponse textToSpeechSettings,

            string updateTime)
        {
            AgentVersion = agentVersion;
            Description = description;
            Fulfillment = fulfillment;
            Name = name;
            State = state;
            TextToSpeechSettings = textToSpeechSettings;
            UpdateTime = updateTime;
        }
    }
}