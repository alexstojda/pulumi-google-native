// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Integrations.V1Alpha.Inputs
{

    public sealed class EnterpriseCrmFrontendsEventbusProtoWorkflowParameterEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Metadata information about the parameters.
        /// </summary>
        [Input("attributes")]
        public Input<Inputs.EnterpriseCrmEventbusProtoAttributesArgs>? Attributes { get; set; }

        [Input("children")]
        private InputList<Inputs.EnterpriseCrmFrontendsEventbusProtoWorkflowParameterEntryArgs>? _children;

        /// <summary>
        /// Child parameters nested within this parameter. This field only applies to protobuf parameters
        /// </summary>
        public InputList<Inputs.EnterpriseCrmFrontendsEventbusProtoWorkflowParameterEntryArgs> Children
        {
            get => _children ?? (_children = new InputList<Inputs.EnterpriseCrmFrontendsEventbusProtoWorkflowParameterEntryArgs>());
            set => _children = value;
        }

        /// <summary>
        /// The data type of the parameter.
        /// </summary>
        [Input("dataType")]
        public Input<Pulumi.GoogleNative.Integrations.V1Alpha.EnterpriseCrmFrontendsEventbusProtoWorkflowParameterEntryDataType>? DataType { get; set; }

        /// <summary>
        /// Default values for the defined keys. Each value can either be string, int, double or any proto message or a serialized object.
        /// </summary>
        [Input("defaultValue")]
        public Input<Inputs.EnterpriseCrmFrontendsEventbusProtoParameterValueTypeArgs>? DefaultValue { get; set; }

        /// <summary>
        /// Specifies the input/output type for the parameter.
        /// </summary>
        [Input("inOutType")]
        public Input<Pulumi.GoogleNative.Integrations.V1Alpha.EnterpriseCrmFrontendsEventbusProtoWorkflowParameterEntryInOutType>? InOutType { get; set; }

        /// <summary>
        /// Whether this parameter is a transient parameter. go/ip-transient-parameters
        /// </summary>
        [Input("isTransient")]
        public Input<bool>? IsTransient { get; set; }

        /// <summary>
        /// This schema will be used to validate runtime JSON-typed values of this parameter.
        /// </summary>
        [Input("jsonSchema")]
        public Input<string>? JsonSchema { get; set; }

        /// <summary>
        /// Key is used to retrieve the corresponding parameter value. This should be unique for a given fired event. These parameters must be predefined in the workflow definition.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The name (without prefix) to be displayed in the UI for this parameter. E.g. if the key is "foo.bar.myName", then the name would be "myName".
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The identifier of the node (TaskConfig/TriggerConfig) this parameter was produced by, if it is a transient param or a copy of an input param.
        /// </summary>
        [Input("producedBy")]
        public Input<Inputs.EnterpriseCrmEventbusProtoNodeIdentifierArgs>? ProducedBy { get; set; }

        [Input("producer")]
        public Input<string>? Producer { get; set; }

        /// <summary>
        /// The name of the protobuf type if the parameter has a protobuf data type.
        /// </summary>
        [Input("protoDefName")]
        public Input<string>? ProtoDefName { get; set; }

        /// <summary>
        /// If the data type is of type proto or proto array, this field needs to be populated with the fully qualified proto name. This message, for example, would be "enterprise.crm.frontends.eventbus.proto.WorkflowParameterEntry".
        /// </summary>
        [Input("protoDefPath")]
        public Input<string>? ProtoDefPath { get; set; }

        public EnterpriseCrmFrontendsEventbusProtoWorkflowParameterEntryArgs()
        {
        }
        public static new EnterpriseCrmFrontendsEventbusProtoWorkflowParameterEntryArgs Empty => new EnterpriseCrmFrontendsEventbusProtoWorkflowParameterEntryArgs();
    }
}