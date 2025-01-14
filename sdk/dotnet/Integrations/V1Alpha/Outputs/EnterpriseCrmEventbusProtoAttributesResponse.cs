// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Integrations.V1Alpha.Outputs
{

    /// <summary>
    /// Attributes are additional options that can be associated with each event property. For more information, see
    /// </summary>
    [OutputType]
    public sealed class EnterpriseCrmEventbusProtoAttributesResponse
    {
        /// <summary>
        /// Things like URL, Email, Currency, Timestamp (rather than string, int64...)
        /// </summary>
        public readonly string DataType;
        /// <summary>
        /// Used to define defaults.
        /// </summary>
        public readonly Outputs.EnterpriseCrmEventbusProtoValueTypeResponse DefaultValue;
        /// <summary>
        /// Required for event execution. The validation will be done by the event bus when the event is triggered.
        /// </summary>
        public readonly bool IsRequired;
        /// <summary>
        /// Used to indicate if a ParameterEntry should be converted to ParamIndexes for ST-Spanner full-text search. DEPRECATED: use searchable.
        /// </summary>
        public readonly bool IsSearchable;
        /// <summary>
        /// See
        /// </summary>
        public readonly Outputs.EnterpriseCrmEventbusProtoLogSettingsResponse LogSettings;
        /// <summary>
        /// Used to indicate if the ParameterEntry is a read only field or not.
        /// </summary>
        public readonly bool ReadOnly;
        public readonly string Searchable;
        /// <summary>
        /// List of tasks that can view this property, if empty then all.
        /// </summary>
        public readonly ImmutableArray<string> TaskVisibility;

        [OutputConstructor]
        private EnterpriseCrmEventbusProtoAttributesResponse(
            string dataType,

            Outputs.EnterpriseCrmEventbusProtoValueTypeResponse defaultValue,

            bool isRequired,

            bool isSearchable,

            Outputs.EnterpriseCrmEventbusProtoLogSettingsResponse logSettings,

            bool readOnly,

            string searchable,

            ImmutableArray<string> taskVisibility)
        {
            DataType = dataType;
            DefaultValue = defaultValue;
            IsRequired = isRequired;
            IsSearchable = isSearchable;
            LogSettings = logSettings;
            ReadOnly = readOnly;
            Searchable = searchable;
            TaskVisibility = taskVisibility;
        }
    }
}
