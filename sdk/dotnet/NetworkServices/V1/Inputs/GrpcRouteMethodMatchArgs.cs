// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.NetworkServices.V1.Inputs
{

    /// <summary>
    /// Specifies a match against a method.
    /// </summary>
    public sealed class GrpcRouteMethodMatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Specifies that matches are case sensitive. The default value is true. case_sensitive must not be used with a type of REGULAR_EXPRESSION.
        /// </summary>
        [Input("caseSensitive")]
        public Input<bool>? CaseSensitive { get; set; }

        /// <summary>
        /// Name of the method to match against. If unspecified, will match all methods.
        /// </summary>
        [Input("grpcMethod", required: true)]
        public Input<string> GrpcMethod { get; set; } = null!;

        /// <summary>
        /// Name of the service to match against. If unspecified, will match all services.
        /// </summary>
        [Input("grpcService", required: true)]
        public Input<string> GrpcService { get; set; } = null!;

        /// <summary>
        /// Optional. Specifies how to match against the name. If not specified, a default value of "EXACT" is used.
        /// </summary>
        [Input("type")]
        public Input<Pulumi.GoogleNative.NetworkServices.V1.GrpcRouteMethodMatchType>? Type { get; set; }

        public GrpcRouteMethodMatchArgs()
        {
        }
        public static new GrpcRouteMethodMatchArgs Empty => new GrpcRouteMethodMatchArgs();
    }
}