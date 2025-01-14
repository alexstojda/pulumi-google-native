// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Datapipelines.V1.Outputs
{

    /// <summary>
    /// Parameters to provide to the template being launched.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse
    {
        /// <summary>
        /// The runtime environment for the job.
        /// </summary>
        public readonly Outputs.GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse Environment;
        /// <summary>
        /// The job name to use for the created job.
        /// </summary>
        public readonly string JobName;
        /// <summary>
        /// The runtime parameters to pass to the job.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Parameters;
        /// <summary>
        /// Map of transform name prefixes of the job to be replaced to the corresponding name prefixes of the new job. Only applicable when updating a pipeline.
        /// </summary>
        public readonly ImmutableDictionary<string, string> TransformNameMapping;
        /// <summary>
        /// If set, replace the existing pipeline with the name specified by jobName with this pipeline, preserving state.
        /// </summary>
        public readonly bool Update;

        [OutputConstructor]
        private GoogleCloudDatapipelinesV1LaunchTemplateParametersResponse(
            Outputs.GoogleCloudDatapipelinesV1RuntimeEnvironmentResponse environment,

            string jobName,

            ImmutableDictionary<string, string> parameters,

            ImmutableDictionary<string, string> transformNameMapping,

            bool update)
        {
            Environment = environment;
            JobName = jobName;
            Parameters = parameters;
            TransformNameMapping = transformNameMapping;
            Update = update;
        }
    }
}
