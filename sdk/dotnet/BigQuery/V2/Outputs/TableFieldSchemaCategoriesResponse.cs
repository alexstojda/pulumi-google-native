// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.BigQuery.V2.Outputs
{

    /// <summary>
    /// [Optional] The categories attached to this field, used for field-level access control.
    /// </summary>
    [OutputType]
    public sealed class TableFieldSchemaCategoriesResponse
    {
        /// <summary>
        /// A list of category resource names. For example, "projects/1/taxonomies/2/categories/3". At most 5 categories are allowed.
        /// </summary>
        public readonly ImmutableArray<string> Names;

        [OutputConstructor]
        private TableFieldSchemaCategoriesResponse(ImmutableArray<string> names)
        {
            Names = names;
        }
    }
}