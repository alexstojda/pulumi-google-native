// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datalabeling.v1beta1.outputs.GoogleCloudDatalabelingV1beta1AttemptResponse;
import com.pulumi.googlenative.datalabeling.v1beta1.outputs.GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEvaluationJobResult {
    /**
     * @return Name of the AnnotationSpecSet describing all the labels that your machine learning model outputs. You must create this resource before you create an evaluation job and provide its name in the following format: &#34;projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}&#34;
     * 
     */
    private String annotationSpecSet;
    /**
     * @return Every time the evaluation job runs and an error occurs, the failed attempt is appended to this array.
     * 
     */
    private List<GoogleCloudDatalabelingV1beta1AttemptResponse> attempts;
    /**
     * @return Timestamp of when this evaluation job was created.
     * 
     */
    private String createTime;
    /**
     * @return Description of the job. The description can be up to 25,000 characters long.
     * 
     */
    private String description;
    /**
     * @return Configuration details for the evaluation job.
     * 
     */
    private GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse evaluationJobConfig;
    /**
     * @return Whether you want Data Labeling Service to provide ground truth labels for prediction input. If you want the service to assign human labelers to annotate your data, set this to `true`. If you want to provide your own ground truth labels in the evaluation job&#39;s BigQuery table, set this to `false`.
     * 
     */
    private Boolean labelMissingGroundTruth;
    /**
     * @return The [AI Platform Prediction model version](/ml-engine/docs/prediction-overview) to be evaluated. Prediction input and output is sampled from this model version. When creating an evaluation job, specify the model version in the following format: &#34;projects/{project_id}/models/{model_name}/versions/{version_name}&#34; There can only be one evaluation job per model version.
     * 
     */
    private String modelVersion;
    /**
     * @return After you create a job, Data Labeling Service assigns a name to the job with the following format: &#34;projects/{project_id}/evaluationJobs/ {evaluation_job_id}&#34;
     * 
     */
    private String name;
    /**
     * @return Describes the interval at which the job runs. This interval must be at least 1 day, and it is rounded to the nearest day. For example, if you specify a 50-hour interval, the job runs every 2 days. You can provide the schedule in [crontab format](/scheduler/docs/configuring/cron-job-schedules) or in an [English-like format](/appengine/docs/standard/python/config/cronref#schedule_format). Regardless of what you specify, the job will run at 10:00 AM UTC. Only the interval from this schedule is used, not the specific time of day.
     * 
     */
    private String schedule;
    /**
     * @return Describes the current state of the job.
     * 
     */
    private String state;

    private GetEvaluationJobResult() {}
    /**
     * @return Name of the AnnotationSpecSet describing all the labels that your machine learning model outputs. You must create this resource before you create an evaluation job and provide its name in the following format: &#34;projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}&#34;
     * 
     */
    public String annotationSpecSet() {
        return this.annotationSpecSet;
    }
    /**
     * @return Every time the evaluation job runs and an error occurs, the failed attempt is appended to this array.
     * 
     */
    public List<GoogleCloudDatalabelingV1beta1AttemptResponse> attempts() {
        return this.attempts;
    }
    /**
     * @return Timestamp of when this evaluation job was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Description of the job. The description can be up to 25,000 characters long.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Configuration details for the evaluation job.
     * 
     */
    public GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse evaluationJobConfig() {
        return this.evaluationJobConfig;
    }
    /**
     * @return Whether you want Data Labeling Service to provide ground truth labels for prediction input. If you want the service to assign human labelers to annotate your data, set this to `true`. If you want to provide your own ground truth labels in the evaluation job&#39;s BigQuery table, set this to `false`.
     * 
     */
    public Boolean labelMissingGroundTruth() {
        return this.labelMissingGroundTruth;
    }
    /**
     * @return The [AI Platform Prediction model version](/ml-engine/docs/prediction-overview) to be evaluated. Prediction input and output is sampled from this model version. When creating an evaluation job, specify the model version in the following format: &#34;projects/{project_id}/models/{model_name}/versions/{version_name}&#34; There can only be one evaluation job per model version.
     * 
     */
    public String modelVersion() {
        return this.modelVersion;
    }
    /**
     * @return After you create a job, Data Labeling Service assigns a name to the job with the following format: &#34;projects/{project_id}/evaluationJobs/ {evaluation_job_id}&#34;
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Describes the interval at which the job runs. This interval must be at least 1 day, and it is rounded to the nearest day. For example, if you specify a 50-hour interval, the job runs every 2 days. You can provide the schedule in [crontab format](/scheduler/docs/configuring/cron-job-schedules) or in an [English-like format](/appengine/docs/standard/python/config/cronref#schedule_format). Regardless of what you specify, the job will run at 10:00 AM UTC. Only the interval from this schedule is used, not the specific time of day.
     * 
     */
    public String schedule() {
        return this.schedule;
    }
    /**
     * @return Describes the current state of the job.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEvaluationJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String annotationSpecSet;
        private List<GoogleCloudDatalabelingV1beta1AttemptResponse> attempts;
        private String createTime;
        private String description;
        private GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse evaluationJobConfig;
        private Boolean labelMissingGroundTruth;
        private String modelVersion;
        private String name;
        private String schedule;
        private String state;
        public Builder() {}
        public Builder(GetEvaluationJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationSpecSet = defaults.annotationSpecSet;
    	      this.attempts = defaults.attempts;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.evaluationJobConfig = defaults.evaluationJobConfig;
    	      this.labelMissingGroundTruth = defaults.labelMissingGroundTruth;
    	      this.modelVersion = defaults.modelVersion;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder annotationSpecSet(String annotationSpecSet) {
            this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet);
            return this;
        }
        @CustomType.Setter
        public Builder attempts(List<GoogleCloudDatalabelingV1beta1AttemptResponse> attempts) {
            this.attempts = Objects.requireNonNull(attempts);
            return this;
        }
        public Builder attempts(GoogleCloudDatalabelingV1beta1AttemptResponse... attempts) {
            return attempts(List.of(attempts));
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
        public Builder evaluationJobConfig(GoogleCloudDatalabelingV1beta1EvaluationJobConfigResponse evaluationJobConfig) {
            this.evaluationJobConfig = Objects.requireNonNull(evaluationJobConfig);
            return this;
        }
        @CustomType.Setter
        public Builder labelMissingGroundTruth(Boolean labelMissingGroundTruth) {
            this.labelMissingGroundTruth = Objects.requireNonNull(labelMissingGroundTruth);
            return this;
        }
        @CustomType.Setter
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = Objects.requireNonNull(modelVersion);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetEvaluationJobResult build() {
            final var o = new GetEvaluationJobResult();
            o.annotationSpecSet = annotationSpecSet;
            o.attempts = attempts;
            o.createTime = createTime;
            o.description = description;
            o.evaluationJobConfig = evaluationJobConfig;
            o.labelMissingGroundTruth = labelMissingGroundTruth;
            o.modelVersion = modelVersion;
            o.name = name;
            o.schedule = schedule;
            o.state = state;
            return o;
        }
    }
}