// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.DLP.V2.Outputs
{

    /// <summary>
    /// Message defining a field of a BigQuery table.
    /// </summary>
    [OutputType]
    public sealed class GooglePrivacyDlpV2BigQueryFieldResponse
    {
        /// <summary>
        /// Designated field in the BigQuery table.
        /// </summary>
        public readonly Outputs.GooglePrivacyDlpV2FieldIdResponse Field;
        /// <summary>
        /// Source table of the field.
        /// </summary>
        public readonly Outputs.GooglePrivacyDlpV2BigQueryTableResponse Table;

        [OutputConstructor]
        private GooglePrivacyDlpV2BigQueryFieldResponse(
            Outputs.GooglePrivacyDlpV2FieldIdResponse field,

            Outputs.GooglePrivacyDlpV2BigQueryTableResponse table)
        {
            Field = field;
            Table = table;
        }
    }
}