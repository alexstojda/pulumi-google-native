// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.BigQuery.V2.Inputs
{

    public sealed class ModelDefinitionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.
        /// </summary>
        [Input("modelOptions")]
        public Input<Inputs.ModelDefinitionModelOptionsArgs>? ModelOptions { get; set; }

        [Input("trainingRuns")]
        private InputList<Inputs.BqmlTrainingRunArgs>? _trainingRuns;

        /// <summary>
        /// [Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is used or if a user decides to continue a previously cancelled query.
        /// </summary>
        public InputList<Inputs.BqmlTrainingRunArgs> TrainingRuns
        {
            get => _trainingRuns ?? (_trainingRuns = new InputList<Inputs.BqmlTrainingRunArgs>());
            set => _trainingRuns = value;
        }

        public ModelDefinitionArgs()
        {
        }
    }
}