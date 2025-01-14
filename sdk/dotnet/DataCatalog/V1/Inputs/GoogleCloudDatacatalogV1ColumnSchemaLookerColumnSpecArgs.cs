// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.DataCatalog.V1.Inputs
{

    /// <summary>
    /// Column info specific to Looker System.
    /// </summary>
    public sealed class GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Looker specific column type of this column.
        /// </summary>
        [Input("type")]
        public Input<Pulumi.GoogleNative.DataCatalog.V1.GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecType>? Type { get; set; }

        public GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs()
        {
        }
        public static new GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs Empty => new GoogleCloudDatacatalogV1ColumnSchemaLookerColumnSpecArgs();
    }
}
