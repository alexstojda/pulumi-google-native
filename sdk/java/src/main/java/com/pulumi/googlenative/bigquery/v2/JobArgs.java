// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2;

import com.pulumi.asset.AssetOrArchive;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery.v2.inputs.JobConfigurationArgs;
import com.pulumi.googlenative.bigquery.v2.inputs.JobReferenceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * [Required] Describes the job configuration.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<JobConfigurationArgs> configuration;

    /**
     * @return [Required] Describes the job configuration.
     * 
     */
    public Optional<Output<JobConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * [Optional] Reference describing the unique-per-user name of the job.
     * 
     */
    @Import(name="jobReference")
    private @Nullable Output<JobReferenceArgs> jobReference;

    /**
     * @return [Optional] Reference describing the unique-per-user name of the job.
     * 
     */
    public Optional<Output<JobReferenceArgs>> jobReference() {
        return Optional.ofNullable(this.jobReference);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="source")
    private @Nullable Output<AssetOrArchive> source;

    public Optional<Output<AssetOrArchive>> source() {
        return Optional.ofNullable(this.source);
    }

    private JobArgs() {}

    private JobArgs(JobArgs $) {
        this.configuration = $.configuration;
        this.jobReference = $.jobReference;
        this.project = $.project;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobArgs $;

        public Builder() {
            $ = new JobArgs();
        }

        public Builder(JobArgs defaults) {
            $ = new JobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration [Required] Describes the job configuration.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<JobConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration [Required] Describes the job configuration.
         * 
         * @return builder
         * 
         */
        public Builder configuration(JobConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param jobReference [Optional] Reference describing the unique-per-user name of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobReference(@Nullable Output<JobReferenceArgs> jobReference) {
            $.jobReference = jobReference;
            return this;
        }

        /**
         * @param jobReference [Optional] Reference describing the unique-per-user name of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobReference(JobReferenceArgs jobReference) {
            return jobReference(Output.of(jobReference));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder source(@Nullable Output<AssetOrArchive> source) {
            $.source = source;
            return this;
        }

        public Builder source(AssetOrArchive source) {
            return source(Output.of(source));
        }

        public JobArgs build() {
            return $;
        }
    }

}