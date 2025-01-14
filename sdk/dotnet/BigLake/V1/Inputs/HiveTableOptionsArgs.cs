// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.BigLake.V1.Inputs
{

    /// <summary>
    /// Options of a Hive table.
    /// </summary>
    public sealed class HiveTableOptionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// Stores user supplied Hive table parameters.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// Stores physical storage information of the data.
        /// </summary>
        [Input("storageDescriptor")]
        public Input<Inputs.StorageDescriptorArgs>? StorageDescriptor { get; set; }

        /// <summary>
        /// Hive table type. For example, MANAGED_TABLE, EXTERNAL_TABLE.
        /// </summary>
        [Input("tableType")]
        public Input<string>? TableType { get; set; }

        public HiveTableOptionsArgs()
        {
        }
        public static new HiveTableOptionsArgs Empty => new HiveTableOptionsArgs();
    }
}
