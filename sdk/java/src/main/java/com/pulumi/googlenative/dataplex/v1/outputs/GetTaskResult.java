// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1TaskExecutionSpecResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1TaskExecutionStatusResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1TaskSparkTaskConfigResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1TaskTriggerSpecResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTaskResult {
    /**
     * @return The time when the task was created.
     * 
     */
    private String createTime;
    /**
     * @return Optional. Description of the task.
     * 
     */
    private String description;
    /**
     * @return Optional. User friendly display name.
     * 
     */
    private String displayName;
    /**
     * @return Spec related to how a task is executed.
     * 
     */
    private GoogleCloudDataplexV1TaskExecutionSpecResponse executionSpec;
    /**
     * @return Status of the latest task executions.
     * 
     */
    private GoogleCloudDataplexV1TaskExecutionStatusResponse executionStatus;
    /**
     * @return Optional. User-defined labels for the task.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The relative resource name of the task, of the form: projects/{project_number}/locations/{location_id}/lakes/{lake_id}/ tasks/{task_id}.
     * 
     */
    private String name;
    /**
     * @return Config related to running custom Spark tasks.
     * 
     */
    private GoogleCloudDataplexV1TaskSparkTaskConfigResponse spark;
    /**
     * @return Current state of the task.
     * 
     */
    private String state;
    /**
     * @return Spec related to how often and when a task should be triggered.
     * 
     */
    private GoogleCloudDataplexV1TaskTriggerSpecResponse triggerSpec;
    /**
     * @return System generated globally unique ID for the task. This ID will be different if the task is deleted and re-created with the same name.
     * 
     */
    private String uid;
    /**
     * @return The time when the task was last updated.
     * 
     */
    private String updateTime;

    private GetTaskResult() {}
    /**
     * @return The time when the task was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. Description of the task.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. User friendly display name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Spec related to how a task is executed.
     * 
     */
    public GoogleCloudDataplexV1TaskExecutionSpecResponse executionSpec() {
        return this.executionSpec;
    }
    /**
     * @return Status of the latest task executions.
     * 
     */
    public GoogleCloudDataplexV1TaskExecutionStatusResponse executionStatus() {
        return this.executionStatus;
    }
    /**
     * @return Optional. User-defined labels for the task.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The relative resource name of the task, of the form: projects/{project_number}/locations/{location_id}/lakes/{lake_id}/ tasks/{task_id}.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Config related to running custom Spark tasks.
     * 
     */
    public GoogleCloudDataplexV1TaskSparkTaskConfigResponse spark() {
        return this.spark;
    }
    /**
     * @return Current state of the task.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Spec related to how often and when a task should be triggered.
     * 
     */
    public GoogleCloudDataplexV1TaskTriggerSpecResponse triggerSpec() {
        return this.triggerSpec;
    }
    /**
     * @return System generated globally unique ID for the task. This ID will be different if the task is deleted and re-created with the same name.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The time when the task was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private String displayName;
        private GoogleCloudDataplexV1TaskExecutionSpecResponse executionSpec;
        private GoogleCloudDataplexV1TaskExecutionStatusResponse executionStatus;
        private Map<String,String> labels;
        private String name;
        private GoogleCloudDataplexV1TaskSparkTaskConfigResponse spark;
        private String state;
        private GoogleCloudDataplexV1TaskTriggerSpecResponse triggerSpec;
        private String uid;
        private String updateTime;
        public Builder() {}
        public Builder(GetTaskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.executionSpec = defaults.executionSpec;
    	      this.executionStatus = defaults.executionStatus;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.spark = defaults.spark;
    	      this.state = defaults.state;
    	      this.triggerSpec = defaults.triggerSpec;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder executionSpec(GoogleCloudDataplexV1TaskExecutionSpecResponse executionSpec) {
            this.executionSpec = Objects.requireNonNull(executionSpec);
            return this;
        }
        @CustomType.Setter
        public Builder executionStatus(GoogleCloudDataplexV1TaskExecutionStatusResponse executionStatus) {
            this.executionStatus = Objects.requireNonNull(executionStatus);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder spark(GoogleCloudDataplexV1TaskSparkTaskConfigResponse spark) {
            this.spark = Objects.requireNonNull(spark);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder triggerSpec(GoogleCloudDataplexV1TaskTriggerSpecResponse triggerSpec) {
            this.triggerSpec = Objects.requireNonNull(triggerSpec);
            return this;
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetTaskResult build() {
            final var o = new GetTaskResult();
            o.createTime = createTime;
            o.description = description;
            o.displayName = displayName;
            o.executionSpec = executionSpec;
            o.executionStatus = executionStatus;
            o.labels = labels;
            o.name = name;
            o.spark = spark;
            o.state = state;
            o.triggerSpec = triggerSpec;
            o.uid = uid;
            o.updateTime = updateTime;
            return o;
        }
    }
}