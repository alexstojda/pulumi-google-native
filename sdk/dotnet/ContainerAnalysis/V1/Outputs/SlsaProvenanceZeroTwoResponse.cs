// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.ContainerAnalysis.V1.Outputs
{

    /// <summary>
    /// See full explanation of fields at slsa.dev/provenance/v0.2.
    /// </summary>
    [OutputType]
    public sealed class SlsaProvenanceZeroTwoResponse
    {
        public readonly ImmutableDictionary<string, string> BuildConfig;
        public readonly string BuildType;
        public readonly Outputs.GrafeasV1SlsaProvenanceZeroTwoSlsaBuilderResponse Builder;
        public readonly Outputs.GrafeasV1SlsaProvenanceZeroTwoSlsaInvocationResponse Invocation;
        public readonly ImmutableArray<Outputs.GrafeasV1SlsaProvenanceZeroTwoSlsaMaterialResponse> Materials;
        public readonly Outputs.GrafeasV1SlsaProvenanceZeroTwoSlsaMetadataResponse Metadata;

        [OutputConstructor]
        private SlsaProvenanceZeroTwoResponse(
            ImmutableDictionary<string, string> buildConfig,

            string buildType,

            Outputs.GrafeasV1SlsaProvenanceZeroTwoSlsaBuilderResponse builder,

            Outputs.GrafeasV1SlsaProvenanceZeroTwoSlsaInvocationResponse invocation,

            ImmutableArray<Outputs.GrafeasV1SlsaProvenanceZeroTwoSlsaMaterialResponse> materials,

            Outputs.GrafeasV1SlsaProvenanceZeroTwoSlsaMetadataResponse metadata)
        {
            BuildConfig = buildConfig;
            BuildType = buildType;
            Builder = builder;
            Invocation = invocation;
            Materials = materials;
            Metadata = metadata;
        }
    }
}