// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.VMMigration.V1.Outputs
{

    /// <summary>
    /// UpgradeStatus contains information about upgradeAppliance operation.
    /// </summary>
    [OutputType]
    public sealed class UpgradeStatusResponse
    {
        /// <summary>
        /// Provides details on the state of the upgrade operation in case of an error.
        /// </summary>
        public readonly Outputs.StatusResponse Error;
        /// <summary>
        /// The version from which we upgraded.
        /// </summary>
        public readonly string PreviousVersion;
        /// <summary>
        /// The time the operation was started.
        /// </summary>
        public readonly string StartTime;
        /// <summary>
        /// The state of the upgradeAppliance operation.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The version to upgrade to.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private UpgradeStatusResponse(
            Outputs.StatusResponse error,

            string previousVersion,

            string startTime,

            string state,

            string version)
        {
            Error = error;
            PreviousVersion = previousVersion;
            StartTime = startTime;
            State = state;
            Version = version;
        }
    }
}