// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.DeploymentManager.V2Beta.Inputs
{

    public sealed class DiagnosticArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// JsonPath expression on the resource that if non empty, indicates that this field needs to be extracted as a diagnostic.
        /// </summary>
        [Input("field")]
        public Input<string>? Field { get; set; }

        /// <summary>
        /// Level to record this diagnostic.
        /// </summary>
        [Input("level")]
        public Input<Pulumi.GoogleNative.DeploymentManager.V2Beta.DiagnosticLevel>? Level { get; set; }

        public DiagnosticArgs()
        {
        }
    }
}