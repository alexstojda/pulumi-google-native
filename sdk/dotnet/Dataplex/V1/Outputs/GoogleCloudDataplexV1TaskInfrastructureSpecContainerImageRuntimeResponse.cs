// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Dataplex.V1.Outputs
{

    /// <summary>
    /// Container Image Runtime Configuration used with Batch execution.
    /// </summary>
    [OutputType]
    public sealed class GoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntimeResponse
    {
        /// <summary>
        /// Optional. A list of Java JARS to add to the classpath. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
        /// </summary>
        public readonly ImmutableArray<string> JavaJars;
        /// <summary>
        /// Optional. Override to common configuration of open source components installed on the Dataproc cluster. The properties to set on daemon config files. Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. For more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
        /// </summary>
        public readonly ImmutableDictionary<string, string> Properties;
        /// <summary>
        /// Optional. A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
        /// </summary>
        public readonly ImmutableArray<string> PythonPackages;

        [OutputConstructor]
        private GoogleCloudDataplexV1TaskInfrastructureSpecContainerImageRuntimeResponse(
            ImmutableArray<string> javaJars,

            ImmutableDictionary<string, string> properties,

            ImmutableArray<string> pythonPackages)
        {
            JavaJars = javaJars;
            Properties = properties;
            PythonPackages = pythonPackages;
        }
    }
}