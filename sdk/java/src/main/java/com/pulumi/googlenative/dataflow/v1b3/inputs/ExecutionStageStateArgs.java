// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataflow.v1b3.enums.ExecutionStageStateExecutionStageState;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A message describing the state of a particular execution stage.
 * 
 */
public final class ExecutionStageStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutionStageStateArgs Empty = new ExecutionStageStateArgs();

    /**
     * The time at which the stage transitioned to this state.
     * 
     */
    @Import(name="currentStateTime")
    private @Nullable Output<String> currentStateTime;

    /**
     * @return The time at which the stage transitioned to this state.
     * 
     */
    public Optional<Output<String>> currentStateTime() {
        return Optional.ofNullable(this.currentStateTime);
    }

    /**
     * The name of the execution stage.
     * 
     */
    @Import(name="executionStageName")
    private @Nullable Output<String> executionStageName;

    /**
     * @return The name of the execution stage.
     * 
     */
    public Optional<Output<String>> executionStageName() {
        return Optional.ofNullable(this.executionStageName);
    }

    /**
     * Executions stage states allow the same set of values as JobState.
     * 
     */
    @Import(name="executionStageState")
    private @Nullable Output<ExecutionStageStateExecutionStageState> executionStageState;

    /**
     * @return Executions stage states allow the same set of values as JobState.
     * 
     */
    public Optional<Output<ExecutionStageStateExecutionStageState>> executionStageState() {
        return Optional.ofNullable(this.executionStageState);
    }

    private ExecutionStageStateArgs() {}

    private ExecutionStageStateArgs(ExecutionStageStateArgs $) {
        this.currentStateTime = $.currentStateTime;
        this.executionStageName = $.executionStageName;
        this.executionStageState = $.executionStageState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutionStageStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionStageStateArgs $;

        public Builder() {
            $ = new ExecutionStageStateArgs();
        }

        public Builder(ExecutionStageStateArgs defaults) {
            $ = new ExecutionStageStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param currentStateTime The time at which the stage transitioned to this state.
         * 
         * @return builder
         * 
         */
        public Builder currentStateTime(@Nullable Output<String> currentStateTime) {
            $.currentStateTime = currentStateTime;
            return this;
        }

        /**
         * @param currentStateTime The time at which the stage transitioned to this state.
         * 
         * @return builder
         * 
         */
        public Builder currentStateTime(String currentStateTime) {
            return currentStateTime(Output.of(currentStateTime));
        }

        /**
         * @param executionStageName The name of the execution stage.
         * 
         * @return builder
         * 
         */
        public Builder executionStageName(@Nullable Output<String> executionStageName) {
            $.executionStageName = executionStageName;
            return this;
        }

        /**
         * @param executionStageName The name of the execution stage.
         * 
         * @return builder
         * 
         */
        public Builder executionStageName(String executionStageName) {
            return executionStageName(Output.of(executionStageName));
        }

        /**
         * @param executionStageState Executions stage states allow the same set of values as JobState.
         * 
         * @return builder
         * 
         */
        public Builder executionStageState(@Nullable Output<ExecutionStageStateExecutionStageState> executionStageState) {
            $.executionStageState = executionStageState;
            return this;
        }

        /**
         * @param executionStageState Executions stage states allow the same set of values as JobState.
         * 
         * @return builder
         * 
         */
        public Builder executionStageState(ExecutionStageStateExecutionStageState executionStageState) {
            return executionStageState(Output.of(executionStageState));
        }

        public ExecutionStageStateArgs build() {
            return $;
        }
    }

}