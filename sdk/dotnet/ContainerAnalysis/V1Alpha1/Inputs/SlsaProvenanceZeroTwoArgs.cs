// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.ContainerAnalysis.V1Alpha1.Inputs
{

    /// <summary>
    /// SlsaProvenanceZeroTwo is the slsa provenance as defined by the slsa spec. See full explanation of fields at slsa.dev/provenance/v0.2.
    /// </summary>
    public sealed class SlsaProvenanceZeroTwoArgs : Pulumi.ResourceArgs
    {
        [Input("buildConfig")]
        private InputMap<string>? _buildConfig;

        /// <summary>
        /// Lists the steps in the build.
        /// </summary>
        public InputMap<string> BuildConfig
        {
            get => _buildConfig ?? (_buildConfig = new InputMap<string>());
            set => _buildConfig = value;
        }

        /// <summary>
        /// URI indicating what type of build was performed.
        /// </summary>
        [Input("buildType")]
        public Input<string>? BuildType { get; set; }

        /// <summary>
        /// Identifies the entity that executed the recipe, which is trusted to have correctly performed the operation and populated this provenance.
        /// </summary>
        [Input("builder")]
        public Input<Inputs.GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaBuilderArgs>? Builder { get; set; }

        /// <summary>
        /// Identifies the event that kicked off the build.
        /// </summary>
        [Input("invocation")]
        public Input<Inputs.GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaInvocationArgs>? Invocation { get; set; }

        [Input("materials")]
        private InputList<Inputs.GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs>? _materials;

        /// <summary>
        /// The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on.
        /// </summary>
        public InputList<Inputs.GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs> Materials
        {
            get => _materials ?? (_materials = new InputList<Inputs.GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs>());
            set => _materials = value;
        }

        /// <summary>
        /// Other properties of the build.
        /// </summary>
        [Input("metadata")]
        public Input<Inputs.GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMetadataArgs>? Metadata { get; set; }

        public SlsaProvenanceZeroTwoArgs()
        {
        }
    }
}