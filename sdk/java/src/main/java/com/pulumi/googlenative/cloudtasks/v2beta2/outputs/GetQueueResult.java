// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.AppEngineHttpTargetResponse;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.HttpTargetResponse;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.PullTargetResponse;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.QueueStatsResponse;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.RateLimitsResponse;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.RetryConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQueueResult {
    /**
     * @return App Engine HTTP target. An App Engine queue is a queue that has an AppEngineHttpTarget.
     * 
     */
    private AppEngineHttpTargetResponse appEngineHttpTarget;
    /**
     * @return An http_target is used to override the target values for HTTP tasks.
     * 
     */
    private HttpTargetResponse httpTarget;
    /**
     * @return Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    private String name;
    /**
     * @return Pull target. A pull queue is a queue that has a PullTarget.
     * 
     */
    private PullTargetResponse pullTarget;
    /**
     * @return The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue has never been purged.
     * 
     */
    private String purgeTime;
    /**
     * @return Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts however they control how tasks are attempted in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc).
     * 
     */
    private RateLimitsResponse rateLimits;
    /**
     * @return Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    private RetryConfigResponse retryConfig;
    /**
     * @return The state of the queue. `state` can only be changed by called PauseQueue, ResumeQueue, or uploading [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
     * 
     */
    private String state;
    /**
     * @return The realtime, informational statistics for a queue. In order to receive the statistics the caller should include this field in the FieldMask.
     * 
     */
    private QueueStatsResponse stats;
    /**
     * @return The maximum amount of time that a task will be retained in this queue. Queues created by Cloud Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues created via queue.yaml/xml is equal to the maximum duration because there is a [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the maximum valid duration, see the documentation for Duration.
     * 
     */
    private String taskTtl;
    /**
     * @return The task tombstone time to live (TTL). After a task is deleted or completed, the task&#39;s tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is used by task de-duplication; another task with the same name can&#39;t be created until the tombstone has expired. For more information about task de-duplication, see the documentation for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
     * 
     */
    private String tombstoneTtl;

    private GetQueueResult() {}
    /**
     * @return App Engine HTTP target. An App Engine queue is a queue that has an AppEngineHttpTarget.
     * 
     */
    public AppEngineHttpTargetResponse appEngineHttpTarget() {
        return this.appEngineHttpTarget;
    }
    /**
     * @return An http_target is used to override the target values for HTTP tasks.
     * 
     */
    public HttpTargetResponse httpTarget() {
        return this.httpTarget;
    }
    /**
     * @return Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Pull target. A pull queue is a queue that has a PullTarget.
     * 
     */
    public PullTargetResponse pullTarget() {
        return this.pullTarget;
    }
    /**
     * @return The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue has never been purged.
     * 
     */
    public String purgeTime() {
        return this.purgeTime;
    }
    /**
     * @return Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts however they control how tasks are attempted in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc).
     * 
     */
    public RateLimitsResponse rateLimits() {
        return this.rateLimits;
    }
    /**
     * @return Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    public RetryConfigResponse retryConfig() {
        return this.retryConfig;
    }
    /**
     * @return The state of the queue. `state` can only be changed by called PauseQueue, ResumeQueue, or uploading [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The realtime, informational statistics for a queue. In order to receive the statistics the caller should include this field in the FieldMask.
     * 
     */
    public QueueStatsResponse stats() {
        return this.stats;
    }
    /**
     * @return The maximum amount of time that a task will be retained in this queue. Queues created by Cloud Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues created via queue.yaml/xml is equal to the maximum duration because there is a [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the maximum valid duration, see the documentation for Duration.
     * 
     */
    public String taskTtl() {
        return this.taskTtl;
    }
    /**
     * @return The task tombstone time to live (TTL). After a task is deleted or completed, the task&#39;s tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is used by task de-duplication; another task with the same name can&#39;t be created until the tombstone has expired. For more information about task de-duplication, see the documentation for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
     * 
     */
    public String tombstoneTtl() {
        return this.tombstoneTtl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AppEngineHttpTargetResponse appEngineHttpTarget;
        private HttpTargetResponse httpTarget;
        private String name;
        private PullTargetResponse pullTarget;
        private String purgeTime;
        private RateLimitsResponse rateLimits;
        private RetryConfigResponse retryConfig;
        private String state;
        private QueueStatsResponse stats;
        private String taskTtl;
        private String tombstoneTtl;
        public Builder() {}
        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpTarget = defaults.appEngineHttpTarget;
    	      this.httpTarget = defaults.httpTarget;
    	      this.name = defaults.name;
    	      this.pullTarget = defaults.pullTarget;
    	      this.purgeTime = defaults.purgeTime;
    	      this.rateLimits = defaults.rateLimits;
    	      this.retryConfig = defaults.retryConfig;
    	      this.state = defaults.state;
    	      this.stats = defaults.stats;
    	      this.taskTtl = defaults.taskTtl;
    	      this.tombstoneTtl = defaults.tombstoneTtl;
        }

        @CustomType.Setter
        public Builder appEngineHttpTarget(AppEngineHttpTargetResponse appEngineHttpTarget) {
            this.appEngineHttpTarget = Objects.requireNonNull(appEngineHttpTarget);
            return this;
        }
        @CustomType.Setter
        public Builder httpTarget(HttpTargetResponse httpTarget) {
            this.httpTarget = Objects.requireNonNull(httpTarget);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder pullTarget(PullTargetResponse pullTarget) {
            this.pullTarget = Objects.requireNonNull(pullTarget);
            return this;
        }
        @CustomType.Setter
        public Builder purgeTime(String purgeTime) {
            this.purgeTime = Objects.requireNonNull(purgeTime);
            return this;
        }
        @CustomType.Setter
        public Builder rateLimits(RateLimitsResponse rateLimits) {
            this.rateLimits = Objects.requireNonNull(rateLimits);
            return this;
        }
        @CustomType.Setter
        public Builder retryConfig(RetryConfigResponse retryConfig) {
            this.retryConfig = Objects.requireNonNull(retryConfig);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder stats(QueueStatsResponse stats) {
            this.stats = Objects.requireNonNull(stats);
            return this;
        }
        @CustomType.Setter
        public Builder taskTtl(String taskTtl) {
            this.taskTtl = Objects.requireNonNull(taskTtl);
            return this;
        }
        @CustomType.Setter
        public Builder tombstoneTtl(String tombstoneTtl) {
            this.tombstoneTtl = Objects.requireNonNull(tombstoneTtl);
            return this;
        }
        public GetQueueResult build() {
            final var o = new GetQueueResult();
            o.appEngineHttpTarget = appEngineHttpTarget;
            o.httpTarget = httpTarget;
            o.name = name;
            o.pullTarget = pullTarget;
            o.purgeTime = purgeTime;
            o.rateLimits = rateLimits;
            o.retryConfig = retryConfig;
            o.state = state;
            o.stats = stats;
            o.taskTtl = taskTtl;
            o.tombstoneTtl = tombstoneTtl;
            return o;
        }
    }
}