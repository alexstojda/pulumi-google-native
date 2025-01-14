// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Datamigration.V1.Outputs
{

    /// <summary>
    /// An entry for an Access Control list.
    /// </summary>
    [OutputType]
    public sealed class SqlAclEntryResponse
    {
        /// <summary>
        /// The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
        /// </summary>
        public readonly string ExpireTime;
        /// <summary>
        /// A label to identify this entry.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// Input only. The time-to-leave of this access control entry.
        /// </summary>
        public readonly string Ttl;
        /// <summary>
        /// The allowlisted value for the access control list.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private SqlAclEntryResponse(
            string expireTime,

            string label,

            string ttl,

            string value)
        {
            ExpireTime = expireTime;
            Label = label;
            Ttl = ttl;
            Value = value;
        }
    }
}
