// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Monitoring.V3.Inputs
{

    /// <summary>
    /// Range of numerical values within min and max.
    /// </summary>
    public sealed class GoogleMonitoringV3RangeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Range maximum.
        /// </summary>
        [Input("max")]
        public Input<double>? Max { get; set; }

        /// <summary>
        /// Range minimum.
        /// </summary>
        [Input("min")]
        public Input<double>? Min { get; set; }

        public GoogleMonitoringV3RangeArgs()
        {
        }
        public static new GoogleMonitoringV3RangeArgs Empty => new GoogleMonitoringV3RangeArgs();
    }
}
