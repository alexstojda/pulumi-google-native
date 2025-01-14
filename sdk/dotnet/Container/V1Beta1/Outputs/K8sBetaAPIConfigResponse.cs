// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Container.V1Beta1.Outputs
{

    /// <summary>
    /// Kubernetes open source beta apis enabled on the cluster.
    /// </summary>
    [OutputType]
    public sealed class K8sBetaAPIConfigResponse
    {
        /// <summary>
        /// api name, e.g. storage.k8s.io/v1beta1/csistoragecapacities.
        /// </summary>
        public readonly ImmutableArray<string> EnabledApis;

        [OutputConstructor]
        private K8sBetaAPIConfigResponse(ImmutableArray<string> enabledApis)
        {
            EnabledApis = enabledApis;
        }
    }
}
