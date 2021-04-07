// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Testing.V1.Outputs
{

    [OutputType]
    public sealed class IosXcTestResponse
    {
        /// <summary>
        /// The bundle id for the application under test.
        /// </summary>
        public readonly string AppBundleId;
        /// <summary>
        /// The option to test special app entitlements. Setting this would re-sign the app having special entitlements with an explicit application-identifier. Currently supports testing aps-environment entitlement.
        /// </summary>
        public readonly bool TestSpecialEntitlements;
        /// <summary>
        /// Required. The .zip containing the .xctestrun file and the contents of the DerivedData/Build/Products directory. The .xctestrun file in this zip is ignored if the xctestrun field is specified.
        /// </summary>
        public readonly Outputs.FileReferenceResponse TestsZip;
        /// <summary>
        /// The Xcode version that should be used for the test. Use the TestEnvironmentDiscoveryService to get supported options. Defaults to the latest Xcode version Firebase Test Lab supports.
        /// </summary>
        public readonly string XcodeVersion;
        /// <summary>
        /// An .xctestrun file that will override the .xctestrun file in the tests zip. Because the .xctestrun file contains environment variables along with test methods to run and/or ignore, this can be useful for sharding tests. Default is taken from the tests zip.
        /// </summary>
        public readonly Outputs.FileReferenceResponse Xctestrun;

        [OutputConstructor]
        private IosXcTestResponse(
            string appBundleId,

            bool testSpecialEntitlements,

            Outputs.FileReferenceResponse testsZip,

            string xcodeVersion,

            Outputs.FileReferenceResponse xctestrun)
        {
            AppBundleId = appBundleId;
            TestSpecialEntitlements = testSpecialEntitlements;
            TestsZip = testsZip;
            XcodeVersion = xcodeVersion;
            Xctestrun = xctestrun;
        }
    }
}