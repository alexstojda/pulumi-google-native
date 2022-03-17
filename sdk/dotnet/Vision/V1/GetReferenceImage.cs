// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Vision.V1
{
    public static class GetReferenceImage
    {
        /// <summary>
        /// Gets information associated with a ReferenceImage. Possible errors: * Returns NOT_FOUND if the specified image does not exist.
        /// </summary>
        public static Task<GetReferenceImageResult> InvokeAsync(GetReferenceImageArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetReferenceImageResult>("google-native:vision/v1:getReferenceImage", args ?? new GetReferenceImageArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information associated with a ReferenceImage. Possible errors: * Returns NOT_FOUND if the specified image does not exist.
        /// </summary>
        public static Output<GetReferenceImageResult> Invoke(GetReferenceImageInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetReferenceImageResult>("google-native:vision/v1:getReferenceImage", args ?? new GetReferenceImageInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetReferenceImageArgs : Pulumi.InvokeArgs
    {
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        [Input("productId", required: true)]
        public string ProductId { get; set; } = null!;

        [Input("project")]
        public string? Project { get; set; }

        [Input("referenceImageId", required: true)]
        public string ReferenceImageId { get; set; } = null!;

        public GetReferenceImageArgs()
        {
        }
    }

    public sealed class GetReferenceImageInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("productId", required: true)]
        public Input<string> ProductId { get; set; } = null!;

        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("referenceImageId", required: true)]
        public Input<string> ReferenceImageId { get; set; } = null!;

        public GetReferenceImageInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetReferenceImageResult
    {
        /// <summary>
        /// Optional. Bounding polygons around the areas of interest in the reference image. If this field is empty, the system will try to detect regions of interest. At most 10 bounding polygons will be used. The provided shape is converted into a non-rotated rectangle. Once converted, the small edge of the rectangle must be greater than or equal to 300 pixels. The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
        /// </summary>
        public readonly ImmutableArray<Outputs.BoundingPolyResponse> BoundingPolys;
        /// <summary>
        /// The resource name of the reference image. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`. This field is ignored when creating a reference image.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Google Cloud Storage URI of the reference image. The URI must start with `gs://`.
        /// </summary>
        public readonly string Uri;

        [OutputConstructor]
        private GetReferenceImageResult(
            ImmutableArray<Outputs.BoundingPolyResponse> boundingPolys,

            string name,

            string uri)
        {
            BoundingPolys = boundingPolys;
            Name = name;
            Uri = uri;
        }
    }
}