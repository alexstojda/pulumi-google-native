// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Healthcare.V1Beta1.Outputs
{

    /// <summary>
    /// Configures de-id options specific to different types of content. Each submessage customizes the handling of an https://tools.ietf.org/html/rfc6838 media type or subtype. Configs are applied in a nested manner at runtime.
    /// </summary>
    [OutputType]
    public sealed class DeidentifyConfigResponse
    {
        /// <summary>
        /// Configures how annotations, meaning that the location and infoType of sensitive information findings, are created during de-identification. If unspecified, no annotations are created.
        /// </summary>
        public readonly Outputs.AnnotationConfigResponse Annotation;
        /// <summary>
        /// Configures de-id of application/DICOM content.
        /// </summary>
        public readonly Outputs.DicomConfigResponse Dicom;
        /// <summary>
        /// Configures de-id of application/FHIR content.
        /// </summary>
        public readonly Outputs.FhirConfigResponse Fhir;
        /// <summary>
        /// Configures de-identification of image pixels wherever they are found in the source_dataset.
        /// </summary>
        public readonly Outputs.ImageConfigResponse Image;
        /// <summary>
        /// Details about the work the de-identify operation performed.
        /// </summary>
        public readonly Outputs.DeidentifyOperationMetadataResponse OperationMetadata;
        /// <summary>
        /// Configures de-identification of text wherever it is found in the source_dataset.
        /// </summary>
        public readonly Outputs.TextConfigResponse Text;

        [OutputConstructor]
        private DeidentifyConfigResponse(
            Outputs.AnnotationConfigResponse annotation,

            Outputs.DicomConfigResponse dicom,

            Outputs.FhirConfigResponse fhir,

            Outputs.ImageConfigResponse image,

            Outputs.DeidentifyOperationMetadataResponse operationMetadata,

            Outputs.TextConfigResponse text)
        {
            Annotation = annotation;
            Dicom = dicom;
            Fhir = fhir;
            Image = image;
            OperationMetadata = operationMetadata;
            Text = text;
        }
    }
}