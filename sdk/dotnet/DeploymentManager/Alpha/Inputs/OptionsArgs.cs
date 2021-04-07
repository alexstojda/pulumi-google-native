// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.DeploymentManager.Alpha.Inputs
{

    /// <summary>
    /// Options allows customized resource handling by Deployment Manager.
    /// </summary>
    public sealed class OptionsArgs : Pulumi.ResourceArgs
    {
        [Input("asyncOptions")]
        private InputList<Inputs.AsyncOptionsArgs>? _asyncOptions;

        /// <summary>
        /// Options regarding how to thread async requests.
        /// </summary>
        public InputList<Inputs.AsyncOptionsArgs> AsyncOptions
        {
            get => _asyncOptions ?? (_asyncOptions = new InputList<Inputs.AsyncOptionsArgs>());
            set => _asyncOptions = value;
        }

        [Input("inputMappings")]
        private InputList<Inputs.InputMappingArgs>? _inputMappings;

        /// <summary>
        /// The mappings that apply for requests.
        /// </summary>
        public InputList<Inputs.InputMappingArgs> InputMappings
        {
            get => _inputMappings ?? (_inputMappings = new InputList<Inputs.InputMappingArgs>());
            set => _inputMappings = value;
        }

        /// <summary>
        /// The json path to the field in the resource JSON body into which the resource name should be mapped. Leaving this empty indicates that there should be no mapping performed.
        /// </summary>
        [Input("nameProperty")]
        public Input<string>? NameProperty { get; set; }

        /// <summary>
        /// Options for how to validate and process properties on a resource.
        /// </summary>
        [Input("validationOptions")]
        public Input<Inputs.ValidationOptionsArgs>? ValidationOptions { get; set; }

        public OptionsArgs()
        {
        }
    }
}