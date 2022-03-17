// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.GKEHub.V1Beta.Inputs
{

    /// <summary>
    /// **Multi-cluster Ingress**: The configuration for the MultiClusterIngress feature.
    /// </summary>
    public sealed class MultiClusterIngressFeatureSpecArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Deprecated: This field will be ignored and should not be set. Customer's billing structure.
        /// </summary>
        [Input("billing")]
        public Input<Pulumi.GoogleNative.GKEHub.V1Beta.MultiClusterIngressFeatureSpecBilling>? Billing { get; set; }

        /// <summary>
        /// Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
        /// </summary>
        [Input("configMembership")]
        public Input<string>? ConfigMembership { get; set; }

        public MultiClusterIngressFeatureSpecArgs()
        {
        }
    }
}