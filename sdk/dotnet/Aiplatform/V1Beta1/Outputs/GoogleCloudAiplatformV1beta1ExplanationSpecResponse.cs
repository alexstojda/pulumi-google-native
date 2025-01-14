// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Aiplatform.V1Beta1.Outputs
{

    /// <summary>
    /// Specification of Model explanation.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudAiplatformV1beta1ExplanationSpecResponse
    {
        /// <summary>
        /// Optional. Metadata describing the Model's input and output for explanation.
        /// </summary>
        public readonly Outputs.GoogleCloudAiplatformV1beta1ExplanationMetadataResponse Metadata;
        /// <summary>
        /// Parameters that configure explaining of the Model's predictions.
        /// </summary>
        public readonly Outputs.GoogleCloudAiplatformV1beta1ExplanationParametersResponse Parameters;

        [OutputConstructor]
        private GoogleCloudAiplatformV1beta1ExplanationSpecResponse(
            Outputs.GoogleCloudAiplatformV1beta1ExplanationMetadataResponse metadata,

            Outputs.GoogleCloudAiplatformV1beta1ExplanationParametersResponse parameters)
        {
            Metadata = metadata;
            Parameters = parameters;
        }
    }
}
