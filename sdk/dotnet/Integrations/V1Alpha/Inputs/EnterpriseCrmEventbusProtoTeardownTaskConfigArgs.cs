// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Integrations.V1Alpha.Inputs
{

    public sealed class EnterpriseCrmEventbusProtoTeardownTaskConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The creator's email address.
        /// </summary>
        [Input("creatorEmail")]
        public Input<string>? CreatorEmail { get; set; }

        /// <summary>
        /// Unique identifier of the teardown task within this Config. We use this field as the identifier to find next teardown tasks.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("nextTeardownTask")]
        public Input<Inputs.EnterpriseCrmEventbusProtoNextTeardownTaskArgs>? NextTeardownTask { get; set; }

        /// <summary>
        /// The parameters the user can pass to this task.
        /// </summary>
        [Input("parameters")]
        public Input<Inputs.EnterpriseCrmEventbusProtoEventParametersArgs>? Parameters { get; set; }

        [Input("properties")]
        public Input<Inputs.EnterpriseCrmEventbusProtoEventBusPropertiesArgs>? Properties { get; set; }

        /// <summary>
        /// Implementation class name.
        /// </summary>
        [Input("teardownTaskImplementationClassName", required: true)]
        public Input<string> TeardownTaskImplementationClassName { get; set; } = null!;

        public EnterpriseCrmEventbusProtoTeardownTaskConfigArgs()
        {
        }
        public static new EnterpriseCrmEventbusProtoTeardownTaskConfigArgs Empty => new EnterpriseCrmEventbusProtoTeardownTaskConfigArgs();
    }
}