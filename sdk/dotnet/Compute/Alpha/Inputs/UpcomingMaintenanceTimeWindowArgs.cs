// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Compute.Alpha.Inputs
{

    /// <summary>
    /// Represents a window of time using two timestamps: `earliest` and `latest`. This timestamp values are in RFC3339 text format.
    /// </summary>
    public sealed class UpcomingMaintenanceTimeWindowArgs : Pulumi.ResourceArgs
    {
        [Input("earliest")]
        public Input<string>? Earliest { get; set; }

        [Input("latest")]
        public Input<string>? Latest { get; set; }

        public UpcomingMaintenanceTimeWindowArgs()
        {
        }
    }
}