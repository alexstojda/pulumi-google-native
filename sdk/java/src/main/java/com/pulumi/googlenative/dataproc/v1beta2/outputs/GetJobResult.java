// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.HadoopJobResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.HiveJobResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.JobPlacementResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.JobReferenceResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.JobSchedulingResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.JobStatusResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.PigJobResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.PrestoJobResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.PySparkJobResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.SparkJobResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.SparkRJobResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.SparkSqlJobResponse;
import com.pulumi.googlenative.dataproc.v1beta2.outputs.YarnApplicationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetJobResult {
    /**
     * @return Indicates whether the job is completed. If the value is false, the job is still in progress. If true, the job is completed, and status.state field will indicate if it was successful, failed, or cancelled.
     * 
     */
    private Boolean done;
    /**
     * @return If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
     */
    private String driverControlFilesUri;
    /**
     * @return A URI pointing to the location of the stdout of the job&#39;s driver program.
     * 
     */
    private String driverOutputResourceUri;
    /**
     * @return Optional. Job is a Hadoop job.
     * 
     */
    private HadoopJobResponse hadoopJob;
    /**
     * @return Optional. Job is a Hive job.
     * 
     */
    private HiveJobResponse hiveJob;
    /**
     * @return A UUID that uniquely identifies a job within the project over time. This is in contrast to a user-settable reference.job_id that may be reused over time.
     * 
     */
    private String jobUuid;
    /**
     * @return Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Optional. Job is a Pig job.
     * 
     */
    private PigJobResponse pigJob;
    /**
     * @return Job information, including how, when, and where to run the job.
     * 
     */
    private JobPlacementResponse placement;
    /**
     * @return Optional. Job is a Presto job.
     * 
     */
    private PrestoJobResponse prestoJob;
    /**
     * @return Optional. Job is a PySpark job.
     * 
     */
    private PySparkJobResponse pysparkJob;
    /**
     * @return Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not specified when a job is created, the server generates a job_id.
     * 
     */
    private JobReferenceResponse reference;
    /**
     * @return Optional. Job scheduling configuration.
     * 
     */
    private JobSchedulingResponse scheduling;
    /**
     * @return Optional. Job is a Spark job.
     * 
     */
    private SparkJobResponse sparkJob;
    /**
     * @return Optional. Job is a SparkR job.
     * 
     */
    private SparkRJobResponse sparkRJob;
    /**
     * @return Optional. Job is a SparkSql job.
     * 
     */
    private SparkSqlJobResponse sparkSqlJob;
    /**
     * @return The job status. Additional application-specific status information may be contained in the type_job and yarn_applications fields.
     * 
     */
    private JobStatusResponse status;
    /**
     * @return The previous job status.
     * 
     */
    private List<JobStatusResponse> statusHistory;
    /**
     * @return The email address of the user submitting the job. For jobs submitted on the cluster, the address is username@hostname.
     * 
     */
    private String submittedBy;
    /**
     * @return The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    private List<YarnApplicationResponse> yarnApplications;

    private GetJobResult() {}
    /**
     * @return Indicates whether the job is completed. If the value is false, the job is still in progress. If true, the job is completed, and status.state field will indicate if it was successful, failed, or cancelled.
     * 
     */
    public Boolean done() {
        return this.done;
    }
    /**
     * @return If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
     */
    public String driverControlFilesUri() {
        return this.driverControlFilesUri;
    }
    /**
     * @return A URI pointing to the location of the stdout of the job&#39;s driver program.
     * 
     */
    public String driverOutputResourceUri() {
        return this.driverOutputResourceUri;
    }
    /**
     * @return Optional. Job is a Hadoop job.
     * 
     */
    public HadoopJobResponse hadoopJob() {
        return this.hadoopJob;
    }
    /**
     * @return Optional. Job is a Hive job.
     * 
     */
    public HiveJobResponse hiveJob() {
        return this.hiveJob;
    }
    /**
     * @return A UUID that uniquely identifies a job within the project over time. This is in contrast to a user-settable reference.job_id that may be reused over time.
     * 
     */
    public String jobUuid() {
        return this.jobUuid;
    }
    /**
     * @return Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Optional. Job is a Pig job.
     * 
     */
    public PigJobResponse pigJob() {
        return this.pigJob;
    }
    /**
     * @return Job information, including how, when, and where to run the job.
     * 
     */
    public JobPlacementResponse placement() {
        return this.placement;
    }
    /**
     * @return Optional. Job is a Presto job.
     * 
     */
    public PrestoJobResponse prestoJob() {
        return this.prestoJob;
    }
    /**
     * @return Optional. Job is a PySpark job.
     * 
     */
    public PySparkJobResponse pysparkJob() {
        return this.pysparkJob;
    }
    /**
     * @return Optional. The fully qualified reference to the job, which can be used to obtain the equivalent REST path of the job resource. If this property is not specified when a job is created, the server generates a job_id.
     * 
     */
    public JobReferenceResponse reference() {
        return this.reference;
    }
    /**
     * @return Optional. Job scheduling configuration.
     * 
     */
    public JobSchedulingResponse scheduling() {
        return this.scheduling;
    }
    /**
     * @return Optional. Job is a Spark job.
     * 
     */
    public SparkJobResponse sparkJob() {
        return this.sparkJob;
    }
    /**
     * @return Optional. Job is a SparkR job.
     * 
     */
    public SparkRJobResponse sparkRJob() {
        return this.sparkRJob;
    }
    /**
     * @return Optional. Job is a SparkSql job.
     * 
     */
    public SparkSqlJobResponse sparkSqlJob() {
        return this.sparkSqlJob;
    }
    /**
     * @return The job status. Additional application-specific status information may be contained in the type_job and yarn_applications fields.
     * 
     */
    public JobStatusResponse status() {
        return this.status;
    }
    /**
     * @return The previous job status.
     * 
     */
    public List<JobStatusResponse> statusHistory() {
        return this.statusHistory;
    }
    /**
     * @return The email address of the user submitting the job. For jobs submitted on the cluster, the address is username@hostname.
     * 
     */
    public String submittedBy() {
        return this.submittedBy;
    }
    /**
     * @return The collection of YARN applications spun up by this job.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    public List<YarnApplicationResponse> yarnApplications() {
        return this.yarnApplications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean done;
        private String driverControlFilesUri;
        private String driverOutputResourceUri;
        private HadoopJobResponse hadoopJob;
        private HiveJobResponse hiveJob;
        private String jobUuid;
        private Map<String,String> labels;
        private PigJobResponse pigJob;
        private JobPlacementResponse placement;
        private PrestoJobResponse prestoJob;
        private PySparkJobResponse pysparkJob;
        private JobReferenceResponse reference;
        private JobSchedulingResponse scheduling;
        private SparkJobResponse sparkJob;
        private SparkRJobResponse sparkRJob;
        private SparkSqlJobResponse sparkSqlJob;
        private JobStatusResponse status;
        private List<JobStatusResponse> statusHistory;
        private String submittedBy;
        private List<YarnApplicationResponse> yarnApplications;
        public Builder() {}
        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.done = defaults.done;
    	      this.driverControlFilesUri = defaults.driverControlFilesUri;
    	      this.driverOutputResourceUri = defaults.driverOutputResourceUri;
    	      this.hadoopJob = defaults.hadoopJob;
    	      this.hiveJob = defaults.hiveJob;
    	      this.jobUuid = defaults.jobUuid;
    	      this.labels = defaults.labels;
    	      this.pigJob = defaults.pigJob;
    	      this.placement = defaults.placement;
    	      this.prestoJob = defaults.prestoJob;
    	      this.pysparkJob = defaults.pysparkJob;
    	      this.reference = defaults.reference;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkJob = defaults.sparkJob;
    	      this.sparkRJob = defaults.sparkRJob;
    	      this.sparkSqlJob = defaults.sparkSqlJob;
    	      this.status = defaults.status;
    	      this.statusHistory = defaults.statusHistory;
    	      this.submittedBy = defaults.submittedBy;
    	      this.yarnApplications = defaults.yarnApplications;
        }

        @CustomType.Setter
        public Builder done(Boolean done) {
            this.done = Objects.requireNonNull(done);
            return this;
        }
        @CustomType.Setter
        public Builder driverControlFilesUri(String driverControlFilesUri) {
            this.driverControlFilesUri = Objects.requireNonNull(driverControlFilesUri);
            return this;
        }
        @CustomType.Setter
        public Builder driverOutputResourceUri(String driverOutputResourceUri) {
            this.driverOutputResourceUri = Objects.requireNonNull(driverOutputResourceUri);
            return this;
        }
        @CustomType.Setter
        public Builder hadoopJob(HadoopJobResponse hadoopJob) {
            this.hadoopJob = Objects.requireNonNull(hadoopJob);
            return this;
        }
        @CustomType.Setter
        public Builder hiveJob(HiveJobResponse hiveJob) {
            this.hiveJob = Objects.requireNonNull(hiveJob);
            return this;
        }
        @CustomType.Setter
        public Builder jobUuid(String jobUuid) {
            this.jobUuid = Objects.requireNonNull(jobUuid);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder pigJob(PigJobResponse pigJob) {
            this.pigJob = Objects.requireNonNull(pigJob);
            return this;
        }
        @CustomType.Setter
        public Builder placement(JobPlacementResponse placement) {
            this.placement = Objects.requireNonNull(placement);
            return this;
        }
        @CustomType.Setter
        public Builder prestoJob(PrestoJobResponse prestoJob) {
            this.prestoJob = Objects.requireNonNull(prestoJob);
            return this;
        }
        @CustomType.Setter
        public Builder pysparkJob(PySparkJobResponse pysparkJob) {
            this.pysparkJob = Objects.requireNonNull(pysparkJob);
            return this;
        }
        @CustomType.Setter
        public Builder reference(JobReferenceResponse reference) {
            this.reference = Objects.requireNonNull(reference);
            return this;
        }
        @CustomType.Setter
        public Builder scheduling(JobSchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }
        @CustomType.Setter
        public Builder sparkJob(SparkJobResponse sparkJob) {
            this.sparkJob = Objects.requireNonNull(sparkJob);
            return this;
        }
        @CustomType.Setter
        public Builder sparkRJob(SparkRJobResponse sparkRJob) {
            this.sparkRJob = Objects.requireNonNull(sparkRJob);
            return this;
        }
        @CustomType.Setter
        public Builder sparkSqlJob(SparkSqlJobResponse sparkSqlJob) {
            this.sparkSqlJob = Objects.requireNonNull(sparkSqlJob);
            return this;
        }
        @CustomType.Setter
        public Builder status(JobStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder statusHistory(List<JobStatusResponse> statusHistory) {
            this.statusHistory = Objects.requireNonNull(statusHistory);
            return this;
        }
        public Builder statusHistory(JobStatusResponse... statusHistory) {
            return statusHistory(List.of(statusHistory));
        }
        @CustomType.Setter
        public Builder submittedBy(String submittedBy) {
            this.submittedBy = Objects.requireNonNull(submittedBy);
            return this;
        }
        @CustomType.Setter
        public Builder yarnApplications(List<YarnApplicationResponse> yarnApplications) {
            this.yarnApplications = Objects.requireNonNull(yarnApplications);
            return this;
        }
        public Builder yarnApplications(YarnApplicationResponse... yarnApplications) {
            return yarnApplications(List.of(yarnApplications));
        }
        public GetJobResult build() {
            final var o = new GetJobResult();
            o.done = done;
            o.driverControlFilesUri = driverControlFilesUri;
            o.driverOutputResourceUri = driverOutputResourceUri;
            o.hadoopJob = hadoopJob;
            o.hiveJob = hiveJob;
            o.jobUuid = jobUuid;
            o.labels = labels;
            o.pigJob = pigJob;
            o.placement = placement;
            o.prestoJob = prestoJob;
            o.pysparkJob = pysparkJob;
            o.reference = reference;
            o.scheduling = scheduling;
            o.sparkJob = sparkJob;
            o.sparkRJob = sparkRJob;
            o.sparkSqlJob = sparkSqlJob;
            o.status = status;
            o.statusHistory = statusHistory;
            o.submittedBy = submittedBy;
            o.yarnApplications = yarnApplications;
            return o;
        }
    }
}