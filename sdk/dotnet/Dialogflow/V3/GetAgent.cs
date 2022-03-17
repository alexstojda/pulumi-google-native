// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Dialogflow.V3
{
    public static class GetAgent
    {
        /// <summary>
        /// Retrieves the specified agent.
        /// </summary>
        public static Task<GetAgentResult> InvokeAsync(GetAgentArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAgentResult>("google-native:dialogflow/v3:getAgent", args ?? new GetAgentArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the specified agent.
        /// </summary>
        public static Output<GetAgentResult> Invoke(GetAgentInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAgentResult>("google-native:dialogflow/v3:getAgent", args ?? new GetAgentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAgentArgs : Pulumi.InvokeArgs
    {
        [Input("agentId", required: true)]
        public string AgentId { get; set; } = null!;

        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        [Input("project")]
        public string? Project { get; set; }

        public GetAgentArgs()
        {
        }
    }

    public sealed class GetAgentInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("agentId", required: true)]
        public Input<string> AgentId { get; set; } = null!;

        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetAgentInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAgentResult
    {
        /// <summary>
        /// Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
        /// </summary>
        public readonly Outputs.GoogleCloudDialogflowCxV3AdvancedSettingsResponse AdvancedSettings;
        /// <summary>
        /// The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
        /// </summary>
        public readonly string AvatarUri;
        /// <summary>
        /// Immutable. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
        /// </summary>
        public readonly string DefaultLanguageCode;
        /// <summary>
        /// The description of the agent. The maximum length is 500 characters. If exceeded, the request is rejected.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The human-readable name of the agent, unique within the location.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// Indicates if automatic spell correction is enabled in detect intent requests.
        /// </summary>
        public readonly bool EnableSpellCorrection;
        /// <summary>
        /// Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings instead.
        /// </summary>
        public readonly bool EnableStackdriverLogging;
        /// <summary>
        /// The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Name of the SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
        /// </summary>
        public readonly string SecuritySettings;
        /// <summary>
        /// Speech recognition related settings.
        /// </summary>
        public readonly Outputs.GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse SpeechToTextSettings;
        /// <summary>
        /// Immutable. Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: `projects//locations//agents//flows/`.
        /// </summary>
        public readonly string StartFlow;
        /// <summary>
        /// The list of all languages supported by the agent (except for the `default_language_code`).
        /// </summary>
        public readonly ImmutableArray<string> SupportedLanguageCodes;
        /// <summary>
        /// The time zone of the agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris.
        /// </summary>
        public readonly string TimeZone;

        [OutputConstructor]
        private GetAgentResult(
            Outputs.GoogleCloudDialogflowCxV3AdvancedSettingsResponse advancedSettings,

            string avatarUri,

            string defaultLanguageCode,

            string description,

            string displayName,

            bool enableSpellCorrection,

            bool enableStackdriverLogging,

            string name,

            string securitySettings,

            Outputs.GoogleCloudDialogflowCxV3SpeechToTextSettingsResponse speechToTextSettings,

            string startFlow,

            ImmutableArray<string> supportedLanguageCodes,

            string timeZone)
        {
            AdvancedSettings = advancedSettings;
            AvatarUri = avatarUri;
            DefaultLanguageCode = defaultLanguageCode;
            Description = description;
            DisplayName = displayName;
            EnableSpellCorrection = enableSpellCorrection;
            EnableStackdriverLogging = enableStackdriverLogging;
            Name = name;
            SecuritySettings = securitySettings;
            SpeechToTextSettings = speechToTextSettings;
            StartFlow = startFlow;
            SupportedLanguageCodes = supportedLanguageCodes;
            TimeZone = timeZone;
        }
    }
}