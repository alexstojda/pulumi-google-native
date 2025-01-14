// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.NetworkConnectivity.V1.Inputs
{

    /// <summary>
    /// A collection of router appliance instances. If you configure multiple router appliance instances to receive data from the same set of sites outside of Google Cloud, we recommend that you associate those instances with the same spoke.
    /// </summary>
    public sealed class LinkedRouterApplianceInstancesArgs : global::Pulumi.ResourceArgs
    {
        [Input("instances")]
        private InputList<Inputs.RouterApplianceInstanceArgs>? _instances;

        /// <summary>
        /// The list of router appliance instances.
        /// </summary>
        public InputList<Inputs.RouterApplianceInstanceArgs> Instances
        {
            get => _instances ?? (_instances = new InputList<Inputs.RouterApplianceInstanceArgs>());
            set => _instances = value;
        }

        /// <summary>
        /// A value that controls whether site-to-site data transfer is enabled for these resources. Data transfer is available only in [supported locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
        /// </summary>
        [Input("siteToSiteDataTransfer")]
        public Input<bool>? SiteToSiteDataTransfer { get; set; }

        public LinkedRouterApplianceInstancesArgs()
        {
        }
        public static new LinkedRouterApplianceInstancesArgs Empty => new LinkedRouterApplianceInstancesArgs();
    }
}
