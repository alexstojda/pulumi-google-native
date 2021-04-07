// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Dialogflow.V2.Inputs
{

    /// <summary>
    /// Dialogflow source setting. Supported feature: DIALOGFLOW_ASSIST.
    /// </summary>
    public sealed class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. The name of a Dialogflow virtual agent used for end user side intent detection and suggestion. Format: `projects//locations//agent`. When multiple agents are allowed in the same Dialogflow project.
        /// </summary>
        [Input("agent")]
        public Input<string>? Agent { get; set; }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDialogflowQuerySourceArgs()
        {
        }
    }
}