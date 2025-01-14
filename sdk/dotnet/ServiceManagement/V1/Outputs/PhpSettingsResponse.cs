// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.ServiceManagement.V1.Outputs
{

    /// <summary>
    /// Settings for Php client libraries.
    /// </summary>
    [OutputType]
    public sealed class PhpSettingsResponse
    {
        /// <summary>
        /// Some settings.
        /// </summary>
        public readonly Outputs.CommonLanguageSettingsResponse Common;

        [OutputConstructor]
        private PhpSettingsResponse(Outputs.CommonLanguageSettingsResponse common)
        {
            Common = common;
        }
    }
}
