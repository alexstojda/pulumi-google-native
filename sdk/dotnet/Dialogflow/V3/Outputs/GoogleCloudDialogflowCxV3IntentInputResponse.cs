// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Dialogflow.V3.Outputs
{

    [OutputType]
    public sealed class GoogleCloudDialogflowCxV3IntentInputResponse
    {
        /// <summary>
        /// Required. The unique identifier of the intent. Format: `projects//locations//agents//intents/`.
        /// </summary>
        public readonly string Intent;

        [OutputConstructor]
        private GoogleCloudDialogflowCxV3IntentInputResponse(string intent)
        {
            Intent = intent;
        }
    }
}