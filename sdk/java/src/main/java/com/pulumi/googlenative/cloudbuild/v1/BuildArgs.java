// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild.v1.inputs.ArtifactsArgs;
import com.pulumi.googlenative.cloudbuild.v1.inputs.BuildOptionsArgs;
import com.pulumi.googlenative.cloudbuild.v1.inputs.BuildStepArgs;
import com.pulumi.googlenative.cloudbuild.v1.inputs.SecretArgs;
import com.pulumi.googlenative.cloudbuild.v1.inputs.SecretsArgs;
import com.pulumi.googlenative.cloudbuild.v1.inputs.SourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BuildArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildArgs Empty = new BuildArgs();

    /**
     * Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * 
     */
    @Import(name="artifacts")
    private @Nullable Output<ArtifactsArgs> artifacts;

    /**
     * @return Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * 
     */
    public Optional<Output<ArtifactsArgs>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    /**
     * Secrets and secret environment variables.
     * 
     */
    @Import(name="availableSecrets")
    private @Nullable Output<SecretsArgs> availableSecrets;

    /**
     * @return Secrets and secret environment variables.
     * 
     */
    public Optional<Output<SecretsArgs>> availableSecrets() {
        return Optional.ofNullable(this.availableSecrets);
    }

    /**
     * A list of images to be pushed upon the successful completion of all build steps. The images are pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the `Build` resource&#39;s results field. If any of the images fail to be pushed, the build status is marked `FAILURE`.
     * 
     */
    @Import(name="images")
    private @Nullable Output<List<String>> images;

    /**
     * @return A list of images to be pushed upon the successful completion of all build steps. The images are pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the `Build` resource&#39;s results field. If any of the images fail to be pushed, the build status is marked `FAILURE`.
     * 
     */
    public Optional<Output<List<String>>> images() {
        return Optional.ofNullable(this.images);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Google Cloud Storage bucket where logs should be written (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
     * 
     */
    @Import(name="logsBucket")
    private @Nullable Output<String> logsBucket;

    /**
     * @return Google Cloud Storage bucket where logs should be written (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
     * 
     */
    public Optional<Output<String>> logsBucket() {
        return Optional.ofNullable(this.logsBucket);
    }

    /**
     * Special options for this build.
     * 
     */
    @Import(name="options")
    private @Nullable Output<BuildOptionsArgs> options;

    /**
     * @return Special options for this build.
     * 
     */
    public Optional<Output<BuildOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Required. ID of the project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Required. ID of the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * TTL in queue for this build. If provided and the build is enqueued longer than this value, the build will expire and the build status will be `EXPIRED`. The TTL starts ticking from create_time.
     * 
     */
    @Import(name="queueTtl")
    private @Nullable Output<String> queueTtl;

    /**
     * @return TTL in queue for this build. If provided and the build is enqueued longer than this value, the build will expire and the build status will be `EXPIRED`. The TTL starts ticking from create_time.
     * 
     */
    public Optional<Output<String>> queueTtl() {
        return Optional.ofNullable(this.queueTtl);
    }

    /**
     * Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<List<SecretArgs>> secrets;

    /**
     * @return Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
     * 
     */
    public Optional<Output<List<SecretArgs>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * IAM service account whose credentials will be used at build runtime. Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of the service account.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return IAM service account whose credentials will be used at build runtime. Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of the service account.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * The location of the source files to build.
     * 
     */
    @Import(name="source")
    private @Nullable Output<SourceArgs> source;

    /**
     * @return The location of the source files to build.
     * 
     */
    public Optional<Output<SourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The operations to be performed on the workspace.
     * 
     */
    @Import(name="steps", required=true)
    private Output<List<BuildStepArgs>> steps;

    /**
     * @return The operations to be performed on the workspace.
     * 
     */
    public Output<List<BuildStepArgs>> steps() {
        return this.steps;
    }

    /**
     * Substitutions data for `Build` resource.
     * 
     */
    @Import(name="substitutions")
    private @Nullable Output<Map<String,String>> substitutions;

    /**
     * @return Substitutions data for `Build` resource.
     * 
     */
    public Optional<Output<Map<String,String>>> substitutions() {
        return Optional.ofNullable(this.substitutions);
    }

    /**
     * Tags for annotation of a `Build`. These are not docker tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags for annotation of a `Build`. These are not docker tags.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Amount of time that this build should be allowed to run, to second granularity. If this amount of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout` starts ticking from `startTime`. Default time is ten minutes.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return Amount of time that this build should be allowed to run, to second granularity. If this amount of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout` starts ticking from `startTime`. Default time is ten minutes.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private BuildArgs() {}

    private BuildArgs(BuildArgs $) {
        this.artifacts = $.artifacts;
        this.availableSecrets = $.availableSecrets;
        this.images = $.images;
        this.location = $.location;
        this.logsBucket = $.logsBucket;
        this.options = $.options;
        this.project = $.project;
        this.projectId = $.projectId;
        this.queueTtl = $.queueTtl;
        this.secrets = $.secrets;
        this.serviceAccount = $.serviceAccount;
        this.source = $.source;
        this.steps = $.steps;
        this.substitutions = $.substitutions;
        this.tags = $.tags;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildArgs $;

        public Builder() {
            $ = new BuildArgs();
        }

        public Builder(BuildArgs defaults) {
            $ = new BuildArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifacts Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(@Nullable Output<ArtifactsArgs> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        /**
         * @param artifacts Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(ArtifactsArgs artifacts) {
            return artifacts(Output.of(artifacts));
        }

        /**
         * @param availableSecrets Secrets and secret environment variables.
         * 
         * @return builder
         * 
         */
        public Builder availableSecrets(@Nullable Output<SecretsArgs> availableSecrets) {
            $.availableSecrets = availableSecrets;
            return this;
        }

        /**
         * @param availableSecrets Secrets and secret environment variables.
         * 
         * @return builder
         * 
         */
        public Builder availableSecrets(SecretsArgs availableSecrets) {
            return availableSecrets(Output.of(availableSecrets));
        }

        /**
         * @param images A list of images to be pushed upon the successful completion of all build steps. The images are pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the `Build` resource&#39;s results field. If any of the images fail to be pushed, the build status is marked `FAILURE`.
         * 
         * @return builder
         * 
         */
        public Builder images(@Nullable Output<List<String>> images) {
            $.images = images;
            return this;
        }

        /**
         * @param images A list of images to be pushed upon the successful completion of all build steps. The images are pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the `Build` resource&#39;s results field. If any of the images fail to be pushed, the build status is marked `FAILURE`.
         * 
         * @return builder
         * 
         */
        public Builder images(List<String> images) {
            return images(Output.of(images));
        }

        /**
         * @param images A list of images to be pushed upon the successful completion of all build steps. The images are pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the `Build` resource&#39;s results field. If any of the images fail to be pushed, the build status is marked `FAILURE`.
         * 
         * @return builder
         * 
         */
        public Builder images(String... images) {
            return images(List.of(images));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param logsBucket Google Cloud Storage bucket where logs should be written (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
         * 
         * @return builder
         * 
         */
        public Builder logsBucket(@Nullable Output<String> logsBucket) {
            $.logsBucket = logsBucket;
            return this;
        }

        /**
         * @param logsBucket Google Cloud Storage bucket where logs should be written (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
         * 
         * @return builder
         * 
         */
        public Builder logsBucket(String logsBucket) {
            return logsBucket(Output.of(logsBucket));
        }

        /**
         * @param options Special options for this build.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<BuildOptionsArgs> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Special options for this build.
         * 
         * @return builder
         * 
         */
        public Builder options(BuildOptionsArgs options) {
            return options(Output.of(options));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param projectId Required. ID of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Required. ID of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param queueTtl TTL in queue for this build. If provided and the build is enqueued longer than this value, the build will expire and the build status will be `EXPIRED`. The TTL starts ticking from create_time.
         * 
         * @return builder
         * 
         */
        public Builder queueTtl(@Nullable Output<String> queueTtl) {
            $.queueTtl = queueTtl;
            return this;
        }

        /**
         * @param queueTtl TTL in queue for this build. If provided and the build is enqueued longer than this value, the build will expire and the build status will be `EXPIRED`. The TTL starts ticking from create_time.
         * 
         * @return builder
         * 
         */
        public Builder queueTtl(String queueTtl) {
            return queueTtl(Output.of(queueTtl));
        }

        /**
         * @param secrets Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<List<SecretArgs>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
         * 
         * @return builder
         * 
         */
        public Builder secrets(List<SecretArgs> secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param secrets Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
         * 
         * @return builder
         * 
         */
        public Builder secrets(SecretArgs... secrets) {
            return secrets(List.of(secrets));
        }

        /**
         * @param serviceAccount IAM service account whose credentials will be used at build runtime. Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of the service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount IAM service account whose credentials will be used at build runtime. Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of the service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param source The location of the source files to build.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<SourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The location of the source files to build.
         * 
         * @return builder
         * 
         */
        public Builder source(SourceArgs source) {
            return source(Output.of(source));
        }

        /**
         * @param steps The operations to be performed on the workspace.
         * 
         * @return builder
         * 
         */
        public Builder steps(Output<List<BuildStepArgs>> steps) {
            $.steps = steps;
            return this;
        }

        /**
         * @param steps The operations to be performed on the workspace.
         * 
         * @return builder
         * 
         */
        public Builder steps(List<BuildStepArgs> steps) {
            return steps(Output.of(steps));
        }

        /**
         * @param steps The operations to be performed on the workspace.
         * 
         * @return builder
         * 
         */
        public Builder steps(BuildStepArgs... steps) {
            return steps(List.of(steps));
        }

        /**
         * @param substitutions Substitutions data for `Build` resource.
         * 
         * @return builder
         * 
         */
        public Builder substitutions(@Nullable Output<Map<String,String>> substitutions) {
            $.substitutions = substitutions;
            return this;
        }

        /**
         * @param substitutions Substitutions data for `Build` resource.
         * 
         * @return builder
         * 
         */
        public Builder substitutions(Map<String,String> substitutions) {
            return substitutions(Output.of(substitutions));
        }

        /**
         * @param tags Tags for annotation of a `Build`. These are not docker tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags for annotation of a `Build`. These are not docker tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags for annotation of a `Build`. These are not docker tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param timeout Amount of time that this build should be allowed to run, to second granularity. If this amount of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout` starts ticking from `startTime`. Default time is ten minutes.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Amount of time that this build should be allowed to run, to second granularity. If this amount of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout` starts ticking from `startTime`. Default time is ten minutes.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public BuildArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.steps = Objects.requireNonNull($.steps, "expected parameter 'steps' to be non-null");
            return $;
        }
    }

}