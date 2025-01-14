// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.NetworkServices.V1.Outputs
{

    /// <summary>
    /// The Specification for allowing client side cross-origin requests.
    /// </summary>
    [OutputType]
    public sealed class HttpRouteCorsPolicyResponse
    {
        /// <summary>
        /// In response to a preflight request, setting this to true indicates that the actual request can include user credentials. This translates to the Access-Control-Allow-Credentials header. Default value is false.
        /// </summary>
        public readonly bool AllowCredentials;
        /// <summary>
        /// Specifies the content for Access-Control-Allow-Headers header.
        /// </summary>
        public readonly ImmutableArray<string> AllowHeaders;
        /// <summary>
        /// Specifies the content for Access-Control-Allow-Methods header.
        /// </summary>
        public readonly ImmutableArray<string> AllowMethods;
        /// <summary>
        /// Specifies the regular expression patterns that match allowed origins. For regular expression grammar, please see https://github.com/google/re2/wiki/Syntax.
        /// </summary>
        public readonly ImmutableArray<string> AllowOriginRegexes;
        /// <summary>
        /// Specifies the list of origins that will be allowed to do CORS requests. An origin is allowed if it matches either an item in allow_origins or an item in allow_origin_regexes.
        /// </summary>
        public readonly ImmutableArray<string> AllowOrigins;
        /// <summary>
        /// If true, the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
        /// </summary>
        public readonly bool Disabled;
        /// <summary>
        /// Specifies the content for Access-Control-Expose-Headers header.
        /// </summary>
        public readonly ImmutableArray<string> ExposeHeaders;
        /// <summary>
        /// Specifies how long result of a preflight request can be cached in seconds. This translates to the Access-Control-Max-Age header.
        /// </summary>
        public readonly string MaxAge;

        [OutputConstructor]
        private HttpRouteCorsPolicyResponse(
            bool allowCredentials,

            ImmutableArray<string> allowHeaders,

            ImmutableArray<string> allowMethods,

            ImmutableArray<string> allowOriginRegexes,

            ImmutableArray<string> allowOrigins,

            bool disabled,

            ImmutableArray<string> exposeHeaders,

            string maxAge)
        {
            AllowCredentials = allowCredentials;
            AllowHeaders = allowHeaders;
            AllowMethods = allowMethods;
            AllowOriginRegexes = allowOriginRegexes;
            AllowOrigins = allowOrigins;
            Disabled = disabled;
            ExposeHeaders = exposeHeaders;
            MaxAge = maxAge;
        }
    }
}
