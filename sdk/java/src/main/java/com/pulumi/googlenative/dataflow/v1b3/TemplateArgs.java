// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataflow.v1b3.inputs.RuntimeEnvironmentArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateArgs Empty = new TemplateArgs();

    /**
     * The runtime environment for the job.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<RuntimeEnvironmentArgs> environment;

    /**
     * @return The runtime environment for the job.
     * 
     */
    public Optional<Output<RuntimeEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * A Cloud Storage path to the template from which to create the job. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    @Import(name="gcsPath", required=true)
    private Output<String> gcsPath;

    /**
     * @return A Cloud Storage path to the template from which to create the job. Must be a valid Cloud Storage URL, beginning with `gs://`.
     * 
     */
    public Output<String> gcsPath() {
        return this.gcsPath;
    }

    /**
     * The job name to use for the created job.
     * 
     */
    @Import(name="jobName", required=true)
    private Output<String> jobName;

    /**
     * @return The job name to use for the created job.
     * 
     */
    public Output<String> jobName() {
        return this.jobName;
    }

    /**
     * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The runtime parameters to pass to the job.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return The runtime parameters to pass to the job.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private TemplateArgs() {}

    private TemplateArgs(TemplateArgs $) {
        this.environment = $.environment;
        this.gcsPath = $.gcsPath;
        this.jobName = $.jobName;
        this.location = $.location;
        this.parameters = $.parameters;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateArgs $;

        public Builder() {
            $ = new TemplateArgs();
        }

        public Builder(TemplateArgs defaults) {
            $ = new TemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environment The runtime environment for the job.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<RuntimeEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The runtime environment for the job.
         * 
         * @return builder
         * 
         */
        public Builder environment(RuntimeEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param gcsPath A Cloud Storage path to the template from which to create the job. Must be a valid Cloud Storage URL, beginning with `gs://`.
         * 
         * @return builder
         * 
         */
        public Builder gcsPath(Output<String> gcsPath) {
            $.gcsPath = gcsPath;
            return this;
        }

        /**
         * @param gcsPath A Cloud Storage path to the template from which to create the job. Must be a valid Cloud Storage URL, beginning with `gs://`.
         * 
         * @return builder
         * 
         */
        public Builder gcsPath(String gcsPath) {
            return gcsPath(Output.of(gcsPath));
        }

        /**
         * @param jobName The job name to use for the created job.
         * 
         * @return builder
         * 
         */
        public Builder jobName(Output<String> jobName) {
            $.jobName = jobName;
            return this;
        }

        /**
         * @param jobName The job name to use for the created job.
         * 
         * @return builder
         * 
         */
        public Builder jobName(String jobName) {
            return jobName(Output.of(jobName));
        }

        /**
         * @param location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param parameters The runtime parameters to pass to the job.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The runtime parameters to pass to the job.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public TemplateArgs build() {
            $.gcsPath = Objects.requireNonNull($.gcsPath, "expected parameter 'gcsPath' to be non-null");
            $.jobName = Objects.requireNonNull($.jobName, "expected parameter 'jobName' to be non-null");
            return $;
        }
    }

}