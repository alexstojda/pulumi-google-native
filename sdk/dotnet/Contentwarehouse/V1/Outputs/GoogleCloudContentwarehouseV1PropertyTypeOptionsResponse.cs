// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Contentwarehouse.V1.Outputs
{

    /// <summary>
    /// Configurations for a nested structured data property.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudContentwarehouseV1PropertyTypeOptionsResponse
    {
        /// <summary>
        /// List of property definitions.
        /// </summary>
        public readonly ImmutableArray<Outputs.GoogleCloudContentwarehouseV1PropertyDefinitionResponse> PropertyDefinitions;

        [OutputConstructor]
        private GoogleCloudContentwarehouseV1PropertyTypeOptionsResponse(ImmutableArray<Outputs.GoogleCloudContentwarehouseV1PropertyDefinitionResponse> propertyDefinitions)
        {
            PropertyDefinitions = propertyDefinitions;
        }
    }
}
