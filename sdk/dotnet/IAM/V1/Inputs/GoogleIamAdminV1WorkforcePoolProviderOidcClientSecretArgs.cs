// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.IAM.V1.Inputs
{

    /// <summary>
    /// Representation of a client secret configured for the OIDC provider.
    /// </summary>
    public sealed class GoogleIamAdminV1WorkforcePoolProviderOidcClientSecretArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The value of the client secret.
        /// </summary>
        [Input("value")]
        public Input<Inputs.GoogleIamAdminV1WorkforcePoolProviderOidcClientSecretValueArgs>? Value { get; set; }

        public GoogleIamAdminV1WorkforcePoolProviderOidcClientSecretArgs()
        {
        }
        public static new GoogleIamAdminV1WorkforcePoolProviderOidcClientSecretArgs Empty => new GoogleIamAdminV1WorkforcePoolProviderOidcClientSecretArgs();
    }
}
