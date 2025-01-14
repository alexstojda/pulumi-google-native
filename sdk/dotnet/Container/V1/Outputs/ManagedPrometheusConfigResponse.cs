// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Container.V1.Outputs
{

    /// <summary>
    /// ManagedPrometheusConfig defines the configuration for Google Cloud Managed Service for Prometheus.
    /// </summary>
    [OutputType]
    public sealed class ManagedPrometheusConfigResponse
    {
        /// <summary>
        /// Enable Managed Collection.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private ManagedPrometheusConfigResponse(bool enabled)
        {
            Enabled = enabled;
        }
    }
}
