// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Integrations.V1Alpha.Inputs
{

    /// <summary>
    /// Next available id: 4
    /// </summary>
    public sealed class EnterpriseCrmFrontendsEventbusProtoRollbackStrategyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. The customized parameters the user can pass to this task.
        /// </summary>
        [Input("parameters")]
        public Input<Inputs.EnterpriseCrmFrontendsEventbusProtoEventParametersArgs>? Parameters { get; set; }

        /// <summary>
        /// This is the name of the task that needs to be executed upon rollback of this task.
        /// </summary>
        [Input("rollbackTaskImplementationClassName", required: true)]
        public Input<string> RollbackTaskImplementationClassName { get; set; } = null!;

        [Input("taskNumbersToRollback", required: true)]
        private InputList<string>? _taskNumbersToRollback;

        /// <summary>
        /// These are the tasks numbers of the tasks whose `rollback_strategy.rollback_task_implementation_class_name` needs to be executed upon failure of this task.
        /// </summary>
        public InputList<string> TaskNumbersToRollback
        {
            get => _taskNumbersToRollback ?? (_taskNumbersToRollback = new InputList<string>());
            set => _taskNumbersToRollback = value;
        }

        public EnterpriseCrmFrontendsEventbusProtoRollbackStrategyArgs()
        {
        }
        public static new EnterpriseCrmFrontendsEventbusProtoRollbackStrategyArgs Empty => new EnterpriseCrmFrontendsEventbusProtoRollbackStrategyArgs();
    }
}
