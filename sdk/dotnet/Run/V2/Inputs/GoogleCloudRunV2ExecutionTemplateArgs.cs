// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Run.V2.Inputs
{

    /// <summary>
    /// ExecutionTemplate describes the data an execution should have when created from a template.
    /// </summary>
    public sealed class GoogleCloudRunV2ExecutionTemplateArgs : Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// KRM-style annotations for the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// KRM-style labels for the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= task_count. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
        /// </summary>
        [Input("parallelism")]
        public Input<int>? Parallelism { get; set; }

        /// <summary>
        /// Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        /// </summary>
        [Input("taskCount")]
        public Input<int>? TaskCount { get; set; }

        /// <summary>
        /// Describes the task(s) that will be created when executing an execution.
        /// </summary>
        [Input("template", required: true)]
        public Input<Inputs.GoogleCloudRunV2TaskTemplateArgs> Template { get; set; } = null!;

        public GoogleCloudRunV2ExecutionTemplateArgs()
        {
        }
    }
}