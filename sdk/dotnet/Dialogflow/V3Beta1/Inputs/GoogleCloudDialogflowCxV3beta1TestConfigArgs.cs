// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Dialogflow.V3Beta1.Inputs
{

    /// <summary>
    /// Represents configurations for a test case.
    /// </summary>
    public sealed class GoogleCloudDialogflowCxV3beta1TestConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Flow name to start the test case with. Format: `projects//locations//agents//flows/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
        /// </summary>
        [Input("flow")]
        public Input<string>? Flow { get; set; }

        /// <summary>
        /// The page to start the test case with. Format: `projects//locations//agents//flows//pages/`. Only one of `flow` and `page` should be set to indicate the starting point of the test case. If both are set, `page` takes precedence over `flow`. If neither is set, the test case will start with start page on the default start flow.
        /// </summary>
        [Input("page")]
        public Input<string>? Page { get; set; }

        [Input("trackingParameters")]
        private InputList<string>? _trackingParameters;

        /// <summary>
        /// Session parameters to be compared when calculating differences.
        /// </summary>
        public InputList<string> TrackingParameters
        {
            get => _trackingParameters ?? (_trackingParameters = new InputList<string>());
            set => _trackingParameters = value;
        }

        public GoogleCloudDialogflowCxV3beta1TestConfigArgs()
        {
        }
    }
}