// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.CloudTasks.V2Beta2.Outputs
{

    /// <summary>
    /// Defines a header message. A header can have a key and a value.
    /// </summary>
    [OutputType]
    public sealed class HeaderResponse
    {
        public readonly string Key;
        public readonly string Value;

        [OutputConstructor]
        private HeaderResponse(
            string key,

            string value)
        {
            Key = key;
            Value = value;
        }
    }
}