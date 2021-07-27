// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.OSConfig.V1Alpha.Outputs
{

    [OutputType]
    public sealed class OSPolicyResourcePackageResourceResponse
    {
        /// <summary>
        /// A package managed by Apt.
        /// </summary>
        public readonly Outputs.OSPolicyResourcePackageResourceAPTResponse Apt;
        /// <summary>
        /// A deb package file.
        /// </summary>
        public readonly Outputs.OSPolicyResourcePackageResourceDebResponse Deb;
        /// <summary>
        /// The desired state the agent should maintain for this package.
        /// </summary>
        public readonly string DesiredState;
        /// <summary>
        /// A package managed by GooGet.
        /// </summary>
        public readonly Outputs.OSPolicyResourcePackageResourceGooGetResponse Googet;
        /// <summary>
        /// An MSI package.
        /// </summary>
        public readonly Outputs.OSPolicyResourcePackageResourceMSIResponse Msi;
        /// <summary>
        /// An rpm package file.
        /// </summary>
        public readonly Outputs.OSPolicyResourcePackageResourceRPMResponse Rpm;
        /// <summary>
        /// A package managed by YUM.
        /// </summary>
        public readonly Outputs.OSPolicyResourcePackageResourceYUMResponse Yum;
        /// <summary>
        /// A package managed by Zypper.
        /// </summary>
        public readonly Outputs.OSPolicyResourcePackageResourceZypperResponse Zypper;

        [OutputConstructor]
        private OSPolicyResourcePackageResourceResponse(
            Outputs.OSPolicyResourcePackageResourceAPTResponse apt,

            Outputs.OSPolicyResourcePackageResourceDebResponse deb,

            string desiredState,

            Outputs.OSPolicyResourcePackageResourceGooGetResponse googet,

            Outputs.OSPolicyResourcePackageResourceMSIResponse msi,

            Outputs.OSPolicyResourcePackageResourceRPMResponse rpm,

            Outputs.OSPolicyResourcePackageResourceYUMResponse yum,

            Outputs.OSPolicyResourcePackageResourceZypperResponse zypper)
        {
            Apt = apt;
            Deb = deb;
            DesiredState = desiredState;
            Googet = googet;
            Msi = msi;
            Rpm = rpm;
            Yum = yum;
            Zypper = zypper;
        }
    }
}