// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.APIKeys.V2.Inputs
{

    /// <summary>
    /// The iOS apps that are allowed to use the key.
    /// </summary>
    public sealed class V2IosKeyRestrictionsArgs : Pulumi.ResourceArgs
    {
        [Input("allowedBundleIds")]
        private InputList<string>? _allowedBundleIds;

        /// <summary>
        /// A list of bundle IDs that are allowed when making API calls with this key.
        /// </summary>
        public InputList<string> AllowedBundleIds
        {
            get => _allowedBundleIds ?? (_allowedBundleIds = new InputList<string>());
            set => _allowedBundleIds = value;
        }

        public V2IosKeyRestrictionsArgs()
        {
        }
    }
}