// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.AccessContextManager.V1.Inputs
{

    /// <summary>
    /// Defines the conditions under which an IngressPolicy matches a request. Conditions are based on information about the ApiOperation intended to be performed on the destination of the request.
    /// </summary>
    public sealed class IngressToArgs : Pulumi.ResourceArgs
    {
        [Input("operations")]
        private InputList<Inputs.ApiOperationArgs>? _operations;

        /// <summary>
        /// A list of ApiOperations the sources specified in corresponding IngressFrom are allowed to perform in this ServicePerimeter.
        /// </summary>
        public InputList<Inputs.ApiOperationArgs> Operations
        {
            get => _operations ?? (_operations = new InputList<Inputs.ApiOperationArgs>());
            set => _operations = value;
        }

        [Input("resources")]
        private InputList<string>? _resources;

        /// <summary>
        /// A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. A request matches if it contains a resource in this list. If `*` is specified for resources, then this IngressTo rule will authorize access to all resources inside the perimeter, provided that the request also matches the `operations` field.
        /// </summary>
        public InputList<string> Resources
        {
            get => _resources ?? (_resources = new InputList<string>());
            set => _resources = value;
        }

        public IngressToArgs()
        {
        }
    }
}