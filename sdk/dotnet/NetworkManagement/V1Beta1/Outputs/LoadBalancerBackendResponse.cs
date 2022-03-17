// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.NetworkManagement.V1Beta1.Outputs
{

    /// <summary>
    /// For display only. Metadata associated with a specific load balancer backend.
    /// </summary>
    [OutputType]
    public sealed class LoadBalancerBackendResponse
    {
        /// <summary>
        /// Name of a Compute Engine instance or network endpoint.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// A list of firewall rule URIs allowing probes from health check IP ranges.
        /// </summary>
        public readonly ImmutableArray<string> HealthCheckAllowingFirewallRules;
        /// <summary>
        /// A list of firewall rule URIs blocking probes from health check IP ranges.
        /// </summary>
        public readonly ImmutableArray<string> HealthCheckBlockingFirewallRules;
        /// <summary>
        /// State of the health check firewall configuration.
        /// </summary>
        public readonly string HealthCheckFirewallState;
        /// <summary>
        /// URI of a Compute Engine instance or network endpoint.
        /// </summary>
        public readonly string Uri;

        [OutputConstructor]
        private LoadBalancerBackendResponse(
            string displayName,

            ImmutableArray<string> healthCheckAllowingFirewallRules,

            ImmutableArray<string> healthCheckBlockingFirewallRules,

            string healthCheckFirewallState,

            string uri)
        {
            DisplayName = displayName;
            HealthCheckAllowingFirewallRules = healthCheckAllowingFirewallRules;
            HealthCheckBlockingFirewallRules = healthCheckBlockingFirewallRules;
            HealthCheckFirewallState = healthCheckFirewallState;
            Uri = uri;
        }
    }
}