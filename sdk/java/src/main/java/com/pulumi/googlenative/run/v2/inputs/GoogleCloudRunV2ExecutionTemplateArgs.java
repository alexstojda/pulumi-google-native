// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run.v2.inputs.GoogleCloudRunV2TaskTemplateArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ExecutionTemplate describes the data an execution should have when created from a template.
 * 
 */
public final class GoogleCloudRunV2ExecutionTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunV2ExecutionTemplateArgs Empty = new GoogleCloudRunV2ExecutionTemplateArgs();

    /**
     * KRM-style annotations for the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return KRM-style annotations for the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * KRM-style labels for the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return KRM-style labels for the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= task_count. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
     * 
     */
    @Import(name="parallelism")
    private @Nullable Output<Integer> parallelism;

    /**
     * @return Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= task_count. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
     * 
     */
    public Optional<Output<Integer>> parallelism() {
        return Optional.ofNullable(this.parallelism);
    }

    /**
     * Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @Import(name="taskCount")
    private @Nullable Output<Integer> taskCount;

    /**
     * @return Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public Optional<Output<Integer>> taskCount() {
        return Optional.ofNullable(this.taskCount);
    }

    /**
     * Describes the task(s) that will be created when executing an execution.
     * 
     */
    @Import(name="template", required=true)
    private Output<GoogleCloudRunV2TaskTemplateArgs> template;

    /**
     * @return Describes the task(s) that will be created when executing an execution.
     * 
     */
    public Output<GoogleCloudRunV2TaskTemplateArgs> template() {
        return this.template;
    }

    private GoogleCloudRunV2ExecutionTemplateArgs() {}

    private GoogleCloudRunV2ExecutionTemplateArgs(GoogleCloudRunV2ExecutionTemplateArgs $) {
        this.annotations = $.annotations;
        this.labels = $.labels;
        this.parallelism = $.parallelism;
        this.taskCount = $.taskCount;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunV2ExecutionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunV2ExecutionTemplateArgs $;

        public Builder() {
            $ = new GoogleCloudRunV2ExecutionTemplateArgs();
        }

        public Builder(GoogleCloudRunV2ExecutionTemplateArgs defaults) {
            $ = new GoogleCloudRunV2ExecutionTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations KRM-style annotations for the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations KRM-style annotations for the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param labels KRM-style labels for the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels KRM-style labels for the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param parallelism Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= task_count. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(@Nullable Output<Integer> parallelism) {
            $.parallelism = parallelism;
            return this;
        }

        /**
         * @param parallelism Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= task_count. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(Integer parallelism) {
            return parallelism(Output.of(parallelism));
        }

        /**
         * @param taskCount Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * 
         * @return builder
         * 
         */
        public Builder taskCount(@Nullable Output<Integer> taskCount) {
            $.taskCount = taskCount;
            return this;
        }

        /**
         * @param taskCount Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * 
         * @return builder
         * 
         */
        public Builder taskCount(Integer taskCount) {
            return taskCount(Output.of(taskCount));
        }

        /**
         * @param template Describes the task(s) that will be created when executing an execution.
         * 
         * @return builder
         * 
         */
        public Builder template(Output<GoogleCloudRunV2TaskTemplateArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Describes the task(s) that will be created when executing an execution.
         * 
         * @return builder
         * 
         */
        public Builder template(GoogleCloudRunV2TaskTemplateArgs template) {
            return template(Output.of(template));
        }

        public GoogleCloudRunV2ExecutionTemplateArgs build() {
            $.template = Objects.requireNonNull($.template, "expected parameter 'template' to be non-null");
            return $;
        }
    }

}