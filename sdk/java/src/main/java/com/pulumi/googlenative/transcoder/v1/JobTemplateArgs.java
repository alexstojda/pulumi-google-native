// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder.v1.inputs.JobConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateArgs Empty = new JobTemplateArgs();

    /**
     * The configuration for this template.
     * 
     */
    @Import(name="config")
    private @Nullable Output<JobConfigArgs> config;

    /**
     * @return The configuration for this template.
     * 
     */
    public Optional<Output<JobConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * Required. The ID to use for the job template, which will become the final component of the job template&#39;s resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`.
     * 
     */
    @Import(name="jobTemplateId", required=true)
    private Output<String> jobTemplateId;

    /**
     * @return Required. The ID to use for the job template, which will become the final component of the job template&#39;s resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`.
     * 
     */
    public Output<String> jobTemplateId() {
        return this.jobTemplateId;
    }

    /**
     * The labels associated with this job template. You can use these to organize and group your job templates.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this job template. You can use these to organize and group your job templates.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private JobTemplateArgs() {}

    private JobTemplateArgs(JobTemplateArgs $) {
        this.config = $.config;
        this.jobTemplateId = $.jobTemplateId;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateArgs $;

        public Builder() {
            $ = new JobTemplateArgs();
        }

        public Builder(JobTemplateArgs defaults) {
            $ = new JobTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The configuration for this template.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<JobConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The configuration for this template.
         * 
         * @return builder
         * 
         */
        public Builder config(JobConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param jobTemplateId Required. The ID to use for the job template, which will become the final component of the job template&#39;s resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`.
         * 
         * @return builder
         * 
         */
        public Builder jobTemplateId(Output<String> jobTemplateId) {
            $.jobTemplateId = jobTemplateId;
            return this;
        }

        /**
         * @param jobTemplateId Required. The ID to use for the job template, which will become the final component of the job template&#39;s resource name. This value should be 4-63 characters, and valid characters must match the regular expression `a-zA-Z*`.
         * 
         * @return builder
         * 
         */
        public Builder jobTemplateId(String jobTemplateId) {
            return jobTemplateId(Output.of(jobTemplateId));
        }

        /**
         * @param labels The labels associated with this job template. You can use these to organize and group your job templates.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels associated with this job template. You can use these to organize and group your job templates.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public JobTemplateArgs build() {
            $.jobTemplateId = Objects.requireNonNull($.jobTemplateId, "expected parameter 'jobTemplateId' to be non-null");
            return $;
        }
    }

}