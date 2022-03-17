// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Healthcare.V1Beta1.Inputs
{

    /// <summary>
    /// Image annotation.
    /// </summary>
    public sealed class ImageAnnotationArgs : Pulumi.ResourceArgs
    {
        [Input("boundingPolys")]
        private InputList<Inputs.BoundingPolyArgs>? _boundingPolys;

        /// <summary>
        /// The list of polygons outlining the sensitive regions in the image.
        /// </summary>
        public InputList<Inputs.BoundingPolyArgs> BoundingPolys
        {
            get => _boundingPolys ?? (_boundingPolys = new InputList<Inputs.BoundingPolyArgs>());
            set => _boundingPolys = value;
        }

        /// <summary>
        /// 0-based index of the image frame. For example, an image frame in a DICOM instance.
        /// </summary>
        [Input("frameIndex")]
        public Input<int>? FrameIndex { get; set; }

        public ImageAnnotationArgs()
        {
        }
    }
}