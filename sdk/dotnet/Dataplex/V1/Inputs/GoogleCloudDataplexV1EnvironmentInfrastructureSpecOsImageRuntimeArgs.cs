// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Dataplex.V1.Inputs
{

    /// <summary>
    /// Software Runtime Configuration to run Analyze.
    /// </summary>
    public sealed class GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Dataplex Image version.
        /// </summary>
        [Input("imageVersion", required: true)]
        public Input<string> ImageVersion { get; set; } = null!;

        [Input("javaLibraries")]
        private InputList<string>? _javaLibraries;

        /// <summary>
        /// Optional. List of Java jars to be included in the runtime environment. Valid input includes Cloud Storage URIs to Jar binaries. For example, gs://bucket-name/my/path/to/file.jar
        /// </summary>
        public InputList<string> JavaLibraries
        {
            get => _javaLibraries ?? (_javaLibraries = new InputList<string>());
            set => _javaLibraries = value;
        }

        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// Optional. Spark properties to provide configuration for use in sessions created for this environment. The properties to set on daemon config files. Property keys are specified in prefix:property format. The prefix must be "spark".
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        [Input("pythonPackages")]
        private InputList<string>? _pythonPackages;

        /// <summary>
        /// Optional. A list of python packages to be installed. Valid formats include Cloud Storage URI to a PIP installable library. For example, gs://bucket-name/my/path/to/lib.tar.gz
        /// </summary>
        public InputList<string> PythonPackages
        {
            get => _pythonPackages ?? (_pythonPackages = new InputList<string>());
            set => _pythonPackages = value;
        }

        public GoogleCloudDataplexV1EnvironmentInfrastructureSpecOsImageRuntimeArgs()
        {
        }
    }
}