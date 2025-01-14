// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.DataLabeling.V1Beta1.Inputs
{

    /// <summary>
    /// Config for setting up sentiments.
    /// </summary>
    public sealed class GoogleCloudDatalabelingV1beta1SentimentConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If set to true, contributors will have the option to select sentiment of the label they selected, to mark it as negative or positive label. Default is false.
        /// </summary>
        [Input("enableLabelSentimentSelection")]
        public Input<bool>? EnableLabelSentimentSelection { get; set; }

        public GoogleCloudDatalabelingV1beta1SentimentConfigArgs()
        {
        }
        public static new GoogleCloudDatalabelingV1beta1SentimentConfigArgs Empty => new GoogleCloudDatalabelingV1beta1SentimentConfigArgs();
    }
}
