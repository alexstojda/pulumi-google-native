// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults.v1beta3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults.v1beta3.enums.ExecutionState;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.MatrixDimensionDefinitionArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.OutcomeArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.SpecificationArgs;
import com.pulumi.googlenative.toolresults.v1beta3.inputs.TimestampArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExecutionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutionArgs Empty = new ExecutionArgs();

    /**
     * The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    @Import(name="completionTime")
    private @Nullable Output<TimestampArgs> completionTime;

    /**
     * @return The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    public Optional<Output<TimestampArgs>> completionTime() {
        return Optional.ofNullable(this.completionTime);
    }

    /**
     * The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<TimestampArgs> creationTime;

    /**
     * @return The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
     * 
     */
    public Optional<Output<TimestampArgs>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    @Import(name="dimensionDefinitions")
    private @Nullable Output<List<MatrixDimensionDefinitionArgs>> dimensionDefinitions;

    /**
     * @return The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    public Optional<Output<List<MatrixDimensionDefinitionArgs>>> dimensionDefinitions() {
        return Optional.ofNullable(this.dimensionDefinitions);
    }

    /**
     * A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
     * 
     */
    @Import(name="executionId")
    private @Nullable Output<String> executionId;

    /**
     * @return A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
     * 
     */
    public Optional<Output<String>> executionId() {
        return Optional.ofNullable(this.executionId);
    }

    @Import(name="historyId", required=true)
    private Output<String> historyId;

    public Output<String> historyId() {
        return this.historyId;
    }

    /**
     * Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Import(name="outcome")
    private @Nullable Output<OutcomeArgs> outcome;

    /**
     * @return Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    public Optional<Output<OutcomeArgs>> outcome() {
        return Optional.ofNullable(this.outcome);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended.
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended.
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
     * 
     */
    @Import(name="specification")
    private @Nullable Output<SpecificationArgs> specification;

    /**
     * @return Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
     * 
     */
    public Optional<Output<SpecificationArgs>> specification() {
        return Optional.ofNullable(this.specification);
    }

    /**
     * The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
     * 
     */
    @Import(name="state")
    private @Nullable Output<ExecutionState> state;

    /**
     * @return The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
     * 
     */
    public Optional<Output<ExecutionState>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
     * 
     */
    @Import(name="testExecutionMatrixId")
    private @Nullable Output<String> testExecutionMatrixId;

    /**
     * @return TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
     * 
     */
    public Optional<Output<String>> testExecutionMatrixId() {
        return Optional.ofNullable(this.testExecutionMatrixId);
    }

    private ExecutionArgs() {}

    private ExecutionArgs(ExecutionArgs $) {
        this.completionTime = $.completionTime;
        this.creationTime = $.creationTime;
        this.dimensionDefinitions = $.dimensionDefinitions;
        this.executionId = $.executionId;
        this.historyId = $.historyId;
        this.outcome = $.outcome;
        this.project = $.project;
        this.requestId = $.requestId;
        this.specification = $.specification;
        this.state = $.state;
        this.testExecutionMatrixId = $.testExecutionMatrixId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionArgs $;

        public Builder() {
            $ = new ExecutionArgs();
        }

        public Builder(ExecutionArgs defaults) {
            $ = new ExecutionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param completionTime The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
         * 
         * @return builder
         * 
         */
        public Builder completionTime(@Nullable Output<TimestampArgs> completionTime) {
            $.completionTime = completionTime;
            return this;
        }

        /**
         * @param completionTime The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
         * 
         * @return builder
         * 
         */
        public Builder completionTime(TimestampArgs completionTime) {
            return completionTime(Output.of(completionTime));
        }

        /**
         * @param creationTime The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<TimestampArgs> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
         * 
         * @return builder
         * 
         */
        public Builder creationTime(TimestampArgs creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param dimensionDefinitions The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
         * 
         * @return builder
         * 
         */
        public Builder dimensionDefinitions(@Nullable Output<List<MatrixDimensionDefinitionArgs>> dimensionDefinitions) {
            $.dimensionDefinitions = dimensionDefinitions;
            return this;
        }

        /**
         * @param dimensionDefinitions The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
         * 
         * @return builder
         * 
         */
        public Builder dimensionDefinitions(List<MatrixDimensionDefinitionArgs> dimensionDefinitions) {
            return dimensionDefinitions(Output.of(dimensionDefinitions));
        }

        /**
         * @param dimensionDefinitions The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
         * 
         * @return builder
         * 
         */
        public Builder dimensionDefinitions(MatrixDimensionDefinitionArgs... dimensionDefinitions) {
            return dimensionDefinitions(List.of(dimensionDefinitions));
        }

        /**
         * @param executionId A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
         * 
         * @return builder
         * 
         */
        public Builder executionId(@Nullable Output<String> executionId) {
            $.executionId = executionId;
            return this;
        }

        /**
         * @param executionId A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
         * 
         * @return builder
         * 
         */
        public Builder executionId(String executionId) {
            return executionId(Output.of(executionId));
        }

        public Builder historyId(Output<String> historyId) {
            $.historyId = historyId;
            return this;
        }

        public Builder historyId(String historyId) {
            return historyId(Output.of(historyId));
        }

        /**
         * @param outcome Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder outcome(@Nullable Output<OutcomeArgs> outcome) {
            $.outcome = outcome;
            return this;
        }

        /**
         * @param outcome Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder outcome(OutcomeArgs outcome) {
            return outcome(Output.of(outcome));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended.
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId A unique request ID for server to detect duplicated requests. For example, a UUID. Optional, but strongly recommended.
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param specification Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
         * 
         * @return builder
         * 
         */
        public Builder specification(@Nullable Output<SpecificationArgs> specification) {
            $.specification = specification;
            return this;
        }

        /**
         * @param specification Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
         * 
         * @return builder
         * 
         */
        public Builder specification(SpecificationArgs specification) {
            return specification(Output.of(specification));
        }

        /**
         * @param state The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<ExecutionState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder state(ExecutionState state) {
            return state(Output.of(state));
        }

        /**
         * @param testExecutionMatrixId TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
         * 
         * @return builder
         * 
         */
        public Builder testExecutionMatrixId(@Nullable Output<String> testExecutionMatrixId) {
            $.testExecutionMatrixId = testExecutionMatrixId;
            return this;
        }

        /**
         * @param testExecutionMatrixId TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
         * 
         * @return builder
         * 
         */
        public Builder testExecutionMatrixId(String testExecutionMatrixId) {
            return testExecutionMatrixId(Output.of(testExecutionMatrixId));
        }

        public ExecutionArgs build() {
            $.historyId = Objects.requireNonNull($.historyId, "expected parameter 'historyId' to be non-null");
            return $;
        }
    }

}