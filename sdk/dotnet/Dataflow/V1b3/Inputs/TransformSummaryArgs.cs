// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Dataflow.V1b3.Inputs
{

    /// <summary>
    /// Description of the type, names/ids, and input/outputs for a transform.
    /// </summary>
    public sealed class TransformSummaryArgs : Pulumi.ResourceArgs
    {
        [Input("displayData")]
        private InputList<Inputs.DisplayDataArgs>? _displayData;

        /// <summary>
        /// Transform-specific display data.
        /// </summary>
        public InputList<Inputs.DisplayDataArgs> DisplayData
        {
            get => _displayData ?? (_displayData = new InputList<Inputs.DisplayDataArgs>());
            set => _displayData = value;
        }

        /// <summary>
        /// SDK generated id of this transform instance.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("inputCollectionName")]
        private InputList<string>? _inputCollectionName;

        /// <summary>
        /// User names for all collection inputs to this transform.
        /// </summary>
        public InputList<string> InputCollectionName
        {
            get => _inputCollectionName ?? (_inputCollectionName = new InputList<string>());
            set => _inputCollectionName = value;
        }

        /// <summary>
        /// Type of transform.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// User provided name for this transform instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("outputCollectionName")]
        private InputList<string>? _outputCollectionName;

        /// <summary>
        /// User names for all collection outputs to this transform.
        /// </summary>
        public InputList<string> OutputCollectionName
        {
            get => _outputCollectionName ?? (_outputCollectionName = new InputList<string>());
            set => _outputCollectionName = value;
        }

        public TransformSummaryArgs()
        {
        }
    }
}