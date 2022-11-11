// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Integrations.V1Alpha.Inputs
{

    /// <summary>
    /// LINT.IfChange This message is used for storing key value pair properties for each Event / Task in the EventBus. Please see go/cloud-crm-eng/platform/event_bus.md for more details.
    /// </summary>
    public sealed class EnterpriseCrmEventbusProtoEventBusPropertiesArgs : global::Pulumi.ResourceArgs
    {
        [Input("properties")]
        private InputList<Inputs.EnterpriseCrmEventbusProtoPropertyEntryArgs>? _properties;

        /// <summary>
        /// An unordered list of property entries.
        /// </summary>
        public InputList<Inputs.EnterpriseCrmEventbusProtoPropertyEntryArgs> Properties
        {
            get => _properties ?? (_properties = new InputList<Inputs.EnterpriseCrmEventbusProtoPropertyEntryArgs>());
            set => _properties = value;
        }

        public EnterpriseCrmEventbusProtoEventBusPropertiesArgs()
        {
        }
        public static new EnterpriseCrmEventbusProtoEventBusPropertiesArgs Empty => new EnterpriseCrmEventbusProtoEventBusPropertiesArgs();
    }
}