// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.CloudSearch.V1.Outputs
{

    /// <summary>
    /// Configurations for a source while processing a Search or Suggest request.
    /// </summary>
    [OutputType]
    public sealed class SourceConfigResponse
    {
        /// <summary>
        /// The crowding configuration for the source.
        /// </summary>
        public readonly Outputs.SourceCrowdingConfigResponse CrowdingConfig;
        /// <summary>
        /// The scoring configuration for the source.
        /// </summary>
        public readonly Outputs.SourceScoringConfigResponse ScoringConfig;
        /// <summary>
        /// The source for which this configuration is to be used.
        /// </summary>
        public readonly Outputs.SourceResponse Source;

        [OutputConstructor]
        private SourceConfigResponse(
            Outputs.SourceCrowdingConfigResponse crowdingConfig,

            Outputs.SourceScoringConfigResponse scoringConfig,

            Outputs.SourceResponse source)
        {
            CrowdingConfig = crowdingConfig;
            ScoringConfig = scoringConfig;
            Source = source;
        }
    }
}