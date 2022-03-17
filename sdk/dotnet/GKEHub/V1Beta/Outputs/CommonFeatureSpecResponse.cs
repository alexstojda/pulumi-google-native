// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.GKEHub.V1Beta.Outputs
{

    /// <summary>
    /// CommonFeatureSpec contains Hub-wide configuration information
    /// </summary>
    [OutputType]
    public sealed class CommonFeatureSpecResponse
    {
        /// <summary>
        /// Anthos Observability spec
        /// </summary>
        public readonly Outputs.AnthosObservabilityFeatureSpecResponse Anthosobservability;
        /// <summary>
        /// Appdevexperience specific spec.
        /// </summary>
        public readonly Outputs.AppDevExperienceFeatureSpecResponse Appdevexperience;
        /// <summary>
        /// Multicluster Ingress-specific spec.
        /// </summary>
        public readonly Outputs.MultiClusterIngressFeatureSpecResponse Multiclusteringress;

        [OutputConstructor]
        private CommonFeatureSpecResponse(
            Outputs.AnthosObservabilityFeatureSpecResponse anthosobservability,

            Outputs.AppDevExperienceFeatureSpecResponse appdevexperience,

            Outputs.MultiClusterIngressFeatureSpecResponse multiclusteringress)
        {
            Anthosobservability = anthosobservability;
            Appdevexperience = appdevexperience;
            Multiclusteringress = multiclusteringress;
        }
    }
}