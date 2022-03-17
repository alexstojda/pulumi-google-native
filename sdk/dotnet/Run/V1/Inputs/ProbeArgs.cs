// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Run.V1.Inputs
{

    /// <summary>
    /// Not supported by Cloud Run Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
    /// </summary>
    public sealed class ProbeArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional) One and only one of the following should be specified. Exec specifies the action to take. A field inlined from the Handler message.
        /// </summary>
        [Input("exec")]
        public Input<Inputs.ExecActionArgs>? Exec { get; set; }

        /// <summary>
        /// (Optional) Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
        /// </summary>
        [Input("failureThreshold")]
        public Input<int>? FailureThreshold { get; set; }

        /// <summary>
        /// (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler message.
        /// </summary>
        [Input("httpGet")]
        public Input<Inputs.HTTPGetActionArgs>? HttpGet { get; set; }

        /// <summary>
        /// (Optional) Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
        /// </summary>
        [Input("initialDelaySeconds")]
        public Input<int>? InitialDelaySeconds { get; set; }

        /// <summary>
        /// (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value is 3600. Must be greater or equal than timeout_seconds.
        /// </summary>
        [Input("periodSeconds")]
        public Input<int>? PeriodSeconds { get; set; }

        /// <summary>
        /// (Optional) Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup Probes.
        /// </summary>
        [Input("successThreshold")]
        public Input<int>? SuccessThreshold { get; set; }

        /// <summary>
        /// (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined from the Handler message.
        /// </summary>
        [Input("tcpSocket")]
        public Input<Inputs.TCPSocketActionArgs>? TcpSocket { get; set; }

        /// <summary>
        /// (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 3600. Must be smaller than period_seconds. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
        /// </summary>
        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        public ProbeArgs()
        {
        }
    }
}