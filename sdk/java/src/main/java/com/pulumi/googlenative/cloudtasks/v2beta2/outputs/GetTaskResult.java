// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.AppEngineHttpRequestResponse;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.HttpRequestResponse;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.PullMessageResponse;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.TaskStatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTaskResult {
    /**
     * @return App Engine HTTP request that is sent to the task&#39;s target. Can be set only if app_engine_http_target is set on the queue. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    private AppEngineHttpRequestResponse appEngineHttpRequest;
    /**
     * @return The time that the task was created. `create_time` will be truncated to the nearest second.
     * 
     */
    private String createTime;
    /**
     * @return HTTP request that is sent to the task&#39;s target. An HTTP task is a task that has HttpRequest set.
     * 
     */
    private HttpRequestResponse httpRequest;
    /**
     * @return Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    private String name;
    /**
     * @return LeaseTasks to process the task. Can be set only if pull_target is set on the queue. A pull task is a task that has PullMessage set.
     * 
     */
    private PullMessageResponse pullMessage;
    /**
     * @return The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. For pull queues, this is the time when the task is available to be leased; if a task is currently leased, this is the time when the current lease expires, that is, the time that the task was leased plus the lease_duration. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    private String scheduleTime;
    /**
     * @return The task status.
     * 
     */
    private TaskStatusResponse status;
    /**
     * @return The view specifies which subset of the Task has been returned.
     * 
     */
    private String view;

    private GetTaskResult() {}
    /**
     * @return App Engine HTTP request that is sent to the task&#39;s target. Can be set only if app_engine_http_target is set on the queue. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    public AppEngineHttpRequestResponse appEngineHttpRequest() {
        return this.appEngineHttpRequest;
    }
    /**
     * @return The time that the task was created. `create_time` will be truncated to the nearest second.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return HTTP request that is sent to the task&#39;s target. An HTTP task is a task that has HttpRequest set.
     * 
     */
    public HttpRequestResponse httpRequest() {
        return this.httpRequest;
    }
    /**
     * @return Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return LeaseTasks to process the task. Can be set only if pull_target is set on the queue. A pull task is a task that has PullMessage set.
     * 
     */
    public PullMessageResponse pullMessage() {
        return this.pullMessage;
    }
    /**
     * @return The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. For pull queues, this is the time when the task is available to be leased; if a task is currently leased, this is the time when the current lease expires, that is, the time that the task was leased plus the lease_duration. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    public String scheduleTime() {
        return this.scheduleTime;
    }
    /**
     * @return The task status.
     * 
     */
    public TaskStatusResponse status() {
        return this.status;
    }
    /**
     * @return The view specifies which subset of the Task has been returned.
     * 
     */
    public String view() {
        return this.view;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AppEngineHttpRequestResponse appEngineHttpRequest;
        private String createTime;
        private HttpRequestResponse httpRequest;
        private String name;
        private PullMessageResponse pullMessage;
        private String scheduleTime;
        private TaskStatusResponse status;
        private String view;
        public Builder() {}
        public Builder(GetTaskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpRequest = defaults.appEngineHttpRequest;
    	      this.createTime = defaults.createTime;
    	      this.httpRequest = defaults.httpRequest;
    	      this.name = defaults.name;
    	      this.pullMessage = defaults.pullMessage;
    	      this.scheduleTime = defaults.scheduleTime;
    	      this.status = defaults.status;
    	      this.view = defaults.view;
        }

        @CustomType.Setter
        public Builder appEngineHttpRequest(AppEngineHttpRequestResponse appEngineHttpRequest) {
            this.appEngineHttpRequest = Objects.requireNonNull(appEngineHttpRequest);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder httpRequest(HttpRequestResponse httpRequest) {
            this.httpRequest = Objects.requireNonNull(httpRequest);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder pullMessage(PullMessageResponse pullMessage) {
            this.pullMessage = Objects.requireNonNull(pullMessage);
            return this;
        }
        @CustomType.Setter
        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = Objects.requireNonNull(scheduleTime);
            return this;
        }
        @CustomType.Setter
        public Builder status(TaskStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder view(String view) {
            this.view = Objects.requireNonNull(view);
            return this;
        }
        public GetTaskResult build() {
            final var o = new GetTaskResult();
            o.appEngineHttpRequest = appEngineHttpRequest;
            o.createTime = createTime;
            o.httpRequest = httpRequest;
            o.name = name;
            o.pullMessage = pullMessage;
            o.scheduleTime = scheduleTime;
            o.status = status;
            o.view = view;
            return o;
        }
    }
}