// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run.v1.outputs.TaskTemplateSpecResponse;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ExecutionSpecResponse {
    /**
     * @return Optional. Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= task_count. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism. +optional
     * 
     */
    private Integer parallelism;
    /**
     * @return Optional. Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    private Integer taskCount;
    /**
     * @return Optional. Describes the task(s) that will be created when executing an execution.
     * 
     */
    private TaskTemplateSpecResponse template;

    private ExecutionSpecResponse() {}
    /**
     * @return Optional. Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= task_count. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism. +optional
     * 
     */
    public Integer parallelism() {
        return this.parallelism;
    }
    /**
     * @return Optional. Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    public Integer taskCount() {
        return this.taskCount;
    }
    /**
     * @return Optional. Describes the task(s) that will be created when executing an execution.
     * 
     */
    public TaskTemplateSpecResponse template() {
        return this.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionSpecResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer parallelism;
        private Integer taskCount;
        private TaskTemplateSpecResponse template;
        public Builder() {}
        public Builder(ExecutionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parallelism = defaults.parallelism;
    	      this.taskCount = defaults.taskCount;
    	      this.template = defaults.template;
        }

        @CustomType.Setter
        public Builder parallelism(Integer parallelism) {
            this.parallelism = Objects.requireNonNull(parallelism);
            return this;
        }
        @CustomType.Setter
        public Builder taskCount(Integer taskCount) {
            this.taskCount = Objects.requireNonNull(taskCount);
            return this;
        }
        @CustomType.Setter
        public Builder template(TaskTemplateSpecResponse template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public ExecutionSpecResponse build() {
            final var o = new ExecutionSpecResponse();
            o.parallelism = parallelism;
            o.taskCount = taskCount;
            o.template = template;
            return o;
        }
    }
}