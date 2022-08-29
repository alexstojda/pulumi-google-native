// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.AnalyticsHub.V1Beta1.Inputs
{

    /// <summary>
    /// Contains details of the listing publisher.
    /// </summary>
    public sealed class PublisherArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Name of the listing publisher.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Optional. Email or URL of the listing publisher. Max Length: 1000 bytes.
        /// </summary>
        [Input("primaryContact")]
        public Input<string>? PrimaryContact { get; set; }

        public PublisherArgs()
        {
        }
        public static new PublisherArgs Empty => new PublisherArgs();
    }
}