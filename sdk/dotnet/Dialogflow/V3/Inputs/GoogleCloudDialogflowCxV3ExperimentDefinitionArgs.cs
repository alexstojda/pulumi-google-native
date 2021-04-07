// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Dialogflow.V3.Inputs
{

    /// <summary>
    /// Definition of the experiment.
    /// </summary>
    public sealed class GoogleCloudDialogflowCxV3ExperimentDefinitionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. "query_input.language_code=en" See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        /// <summary>
        /// The flow versions as the variants of this experiment.
        /// </summary>
        [Input("versionVariants")]
        public Input<Inputs.GoogleCloudDialogflowCxV3VersionVariantsArgs>? VersionVariants { get; set; }

        public GoogleCloudDialogflowCxV3ExperimentDefinitionArgs()
        {
        }
    }
}