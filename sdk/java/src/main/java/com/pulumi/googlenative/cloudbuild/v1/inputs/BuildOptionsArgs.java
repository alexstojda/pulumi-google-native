// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild.v1.enums.BuildOptionsLogStreamingOption;
import com.pulumi.googlenative.cloudbuild.v1.enums.BuildOptionsLogging;
import com.pulumi.googlenative.cloudbuild.v1.enums.BuildOptionsMachineType;
import com.pulumi.googlenative.cloudbuild.v1.enums.BuildOptionsRequestedVerifyOption;
import com.pulumi.googlenative.cloudbuild.v1.enums.BuildOptionsSourceProvenanceHashItem;
import com.pulumi.googlenative.cloudbuild.v1.enums.BuildOptionsSubstitutionOption;
import com.pulumi.googlenative.cloudbuild.v1.inputs.PoolOptionArgs;
import com.pulumi.googlenative.cloudbuild.v1.inputs.VolumeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Optional arguments to enable specific features of builds.
 * 
 */
public final class BuildOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildOptionsArgs Empty = new BuildOptionsArgs();

    /**
     * Requested disk size for the VM that runs the build. Note that this is *NOT* &#34;disk free&#34;; some of the space will be used by the operating system and build utilities. Also note that this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that request more than the maximum are rejected with an error.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<String> diskSizeGb;

    /**
     * @return Requested disk size for the VM that runs the build. Note that this is *NOT* &#34;disk free&#34;; some of the space will be used by the operating system and build utilities. Also note that this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that request more than the maximum are rejected with an error.
     * 
     */
    public Optional<Output<String>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    @Import(name="dynamicSubstitutions")
    private @Nullable Output<Boolean> dynamicSubstitutions;

    /**
     * @return Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    public Optional<Output<Boolean>> dynamicSubstitutions() {
        return Optional.ofNullable(this.dynamicSubstitutions);
    }

    /**
     * A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will use the build step value. The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
     * 
     */
    @Import(name="env")
    private @Nullable Output<List<String>> env;

    /**
     * @return A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will use the build step value. The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
     * 
     */
    public Optional<Output<List<String>>> env() {
        return Optional.ofNullable(this.env);
    }

    /**
     * Option to define build log streaming behavior to Google Cloud Storage.
     * 
     */
    @Import(name="logStreamingOption")
    private @Nullable Output<BuildOptionsLogStreamingOption> logStreamingOption;

    /**
     * @return Option to define build log streaming behavior to Google Cloud Storage.
     * 
     */
    public Optional<Output<BuildOptionsLogStreamingOption>> logStreamingOption() {
        return Optional.ofNullable(this.logStreamingOption);
    }

    /**
     * Option to specify the logging mode, which determines if and where build logs are stored.
     * 
     */
    @Import(name="logging")
    private @Nullable Output<BuildOptionsLogging> logging;

    /**
     * @return Option to specify the logging mode, which determines if and where build logs are stored.
     * 
     */
    public Optional<Output<BuildOptionsLogging>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * Compute Engine machine type on which to run the build.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<BuildOptionsMachineType> machineType;

    /**
     * @return Compute Engine machine type on which to run the build.
     * 
     */
    public Optional<Output<BuildOptionsMachineType>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * Optional. Specification for execution on a `WorkerPool`. See [running builds in a private pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more information.
     * 
     */
    @Import(name="pool")
    private @Nullable Output<PoolOptionArgs> pool;

    /**
     * @return Optional. Specification for execution on a `WorkerPool`. See [running builds in a private pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more information.
     * 
     */
    public Optional<Output<PoolOptionArgs>> pool() {
        return Optional.ofNullable(this.pool);
    }

    /**
     * Requested verifiability options.
     * 
     */
    @Import(name="requestedVerifyOption")
    private @Nullable Output<BuildOptionsRequestedVerifyOption> requestedVerifyOption;

    /**
     * @return Requested verifiability options.
     * 
     */
    public Optional<Output<BuildOptionsRequestedVerifyOption>> requestedVerifyOption() {
        return Optional.ofNullable(this.requestedVerifyOption);
    }

    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build&#39;s `Secret`. These variables will be available to all build steps in this build.
     * 
     */
    @Import(name="secretEnv")
    private @Nullable Output<List<String>> secretEnv;

    /**
     * @return A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build&#39;s `Secret`. These variables will be available to all build steps in this build.
     * 
     */
    public Optional<Output<List<String>>> secretEnv() {
        return Optional.ofNullable(this.secretEnv);
    }

    /**
     * Requested hash for SourceProvenance.
     * 
     */
    @Import(name="sourceProvenanceHash")
    private @Nullable Output<List<BuildOptionsSourceProvenanceHashItem>> sourceProvenanceHash;

    /**
     * @return Requested hash for SourceProvenance.
     * 
     */
    public Optional<Output<List<BuildOptionsSourceProvenanceHashItem>>> sourceProvenanceHash() {
        return Optional.ofNullable(this.sourceProvenanceHash);
    }

    /**
     * Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    @Import(name="substitutionOption")
    private @Nullable Output<BuildOptionsSubstitutionOption> substitutionOption;

    /**
     * @return Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    public Optional<Output<BuildOptionsSubstitutionOption>> substitutionOption() {
        return Optional.ofNullable(this.substitutionOption);
    }

    /**
     * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it is indicative of a build request with an incorrect configuration.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<VolumeArgs>> volumes;

    /**
     * @return Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it is indicative of a build request with an incorrect configuration.
     * 
     */
    public Optional<Output<List<VolumeArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    /**
     * This field deprecated; please use `pool.name` instead.
     * 
     */
    @Import(name="workerPool")
    private @Nullable Output<String> workerPool;

    /**
     * @return This field deprecated; please use `pool.name` instead.
     * 
     */
    public Optional<Output<String>> workerPool() {
        return Optional.ofNullable(this.workerPool);
    }

    private BuildOptionsArgs() {}

    private BuildOptionsArgs(BuildOptionsArgs $) {
        this.diskSizeGb = $.diskSizeGb;
        this.dynamicSubstitutions = $.dynamicSubstitutions;
        this.env = $.env;
        this.logStreamingOption = $.logStreamingOption;
        this.logging = $.logging;
        this.machineType = $.machineType;
        this.pool = $.pool;
        this.requestedVerifyOption = $.requestedVerifyOption;
        this.secretEnv = $.secretEnv;
        this.sourceProvenanceHash = $.sourceProvenanceHash;
        this.substitutionOption = $.substitutionOption;
        this.volumes = $.volumes;
        this.workerPool = $.workerPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildOptionsArgs $;

        public Builder() {
            $ = new BuildOptionsArgs();
        }

        public Builder(BuildOptionsArgs defaults) {
            $ = new BuildOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskSizeGb Requested disk size for the VM that runs the build. Note that this is *NOT* &#34;disk free&#34;; some of the space will be used by the operating system and build utilities. Also note that this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that request more than the maximum are rejected with an error.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Requested disk size for the VM that runs the build. Note that this is *NOT* &#34;disk free&#34;; some of the space will be used by the operating system and build utilities. Also note that this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that request more than the maximum are rejected with an error.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(String diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param dynamicSubstitutions Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build configuration file.
         * 
         * @return builder
         * 
         */
        public Builder dynamicSubstitutions(@Nullable Output<Boolean> dynamicSubstitutions) {
            $.dynamicSubstitutions = dynamicSubstitutions;
            return this;
        }

        /**
         * @param dynamicSubstitutions Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build configuration file.
         * 
         * @return builder
         * 
         */
        public Builder dynamicSubstitutions(Boolean dynamicSubstitutions) {
            return dynamicSubstitutions(Output.of(dynamicSubstitutions));
        }

        /**
         * @param env A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will use the build step value. The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder env(@Nullable Output<List<String>> env) {
            $.env = env;
            return this;
        }

        /**
         * @param env A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will use the build step value. The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder env(List<String> env) {
            return env(Output.of(env));
        }

        /**
         * @param env A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will use the build step value. The elements are of the form &#34;KEY=VALUE&#34; for the environment variable &#34;KEY&#34; being given the value &#34;VALUE&#34;.
         * 
         * @return builder
         * 
         */
        public Builder env(String... env) {
            return env(List.of(env));
        }

        /**
         * @param logStreamingOption Option to define build log streaming behavior to Google Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder logStreamingOption(@Nullable Output<BuildOptionsLogStreamingOption> logStreamingOption) {
            $.logStreamingOption = logStreamingOption;
            return this;
        }

        /**
         * @param logStreamingOption Option to define build log streaming behavior to Google Cloud Storage.
         * 
         * @return builder
         * 
         */
        public Builder logStreamingOption(BuildOptionsLogStreamingOption logStreamingOption) {
            return logStreamingOption(Output.of(logStreamingOption));
        }

        /**
         * @param logging Option to specify the logging mode, which determines if and where build logs are stored.
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<BuildOptionsLogging> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging Option to specify the logging mode, which determines if and where build logs are stored.
         * 
         * @return builder
         * 
         */
        public Builder logging(BuildOptionsLogging logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param machineType Compute Engine machine type on which to run the build.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<BuildOptionsMachineType> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType Compute Engine machine type on which to run the build.
         * 
         * @return builder
         * 
         */
        public Builder machineType(BuildOptionsMachineType machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param pool Optional. Specification for execution on a `WorkerPool`. See [running builds in a private pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more information.
         * 
         * @return builder
         * 
         */
        public Builder pool(@Nullable Output<PoolOptionArgs> pool) {
            $.pool = pool;
            return this;
        }

        /**
         * @param pool Optional. Specification for execution on a `WorkerPool`. See [running builds in a private pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more information.
         * 
         * @return builder
         * 
         */
        public Builder pool(PoolOptionArgs pool) {
            return pool(Output.of(pool));
        }

        /**
         * @param requestedVerifyOption Requested verifiability options.
         * 
         * @return builder
         * 
         */
        public Builder requestedVerifyOption(@Nullable Output<BuildOptionsRequestedVerifyOption> requestedVerifyOption) {
            $.requestedVerifyOption = requestedVerifyOption;
            return this;
        }

        /**
         * @param requestedVerifyOption Requested verifiability options.
         * 
         * @return builder
         * 
         */
        public Builder requestedVerifyOption(BuildOptionsRequestedVerifyOption requestedVerifyOption) {
            return requestedVerifyOption(Output.of(requestedVerifyOption));
        }

        /**
         * @param secretEnv A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build&#39;s `Secret`. These variables will be available to all build steps in this build.
         * 
         * @return builder
         * 
         */
        public Builder secretEnv(@Nullable Output<List<String>> secretEnv) {
            $.secretEnv = secretEnv;
            return this;
        }

        /**
         * @param secretEnv A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build&#39;s `Secret`. These variables will be available to all build steps in this build.
         * 
         * @return builder
         * 
         */
        public Builder secretEnv(List<String> secretEnv) {
            return secretEnv(Output.of(secretEnv));
        }

        /**
         * @param secretEnv A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build&#39;s `Secret`. These variables will be available to all build steps in this build.
         * 
         * @return builder
         * 
         */
        public Builder secretEnv(String... secretEnv) {
            return secretEnv(List.of(secretEnv));
        }

        /**
         * @param sourceProvenanceHash Requested hash for SourceProvenance.
         * 
         * @return builder
         * 
         */
        public Builder sourceProvenanceHash(@Nullable Output<List<BuildOptionsSourceProvenanceHashItem>> sourceProvenanceHash) {
            $.sourceProvenanceHash = sourceProvenanceHash;
            return this;
        }

        /**
         * @param sourceProvenanceHash Requested hash for SourceProvenance.
         * 
         * @return builder
         * 
         */
        public Builder sourceProvenanceHash(List<BuildOptionsSourceProvenanceHashItem> sourceProvenanceHash) {
            return sourceProvenanceHash(Output.of(sourceProvenanceHash));
        }

        /**
         * @param sourceProvenanceHash Requested hash for SourceProvenance.
         * 
         * @return builder
         * 
         */
        public Builder sourceProvenanceHash(BuildOptionsSourceProvenanceHashItem... sourceProvenanceHash) {
            return sourceProvenanceHash(List.of(sourceProvenanceHash));
        }

        /**
         * @param substitutionOption Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build configuration file.
         * 
         * @return builder
         * 
         */
        public Builder substitutionOption(@Nullable Output<BuildOptionsSubstitutionOption> substitutionOption) {
            $.substitutionOption = substitutionOption;
            return this;
        }

        /**
         * @param substitutionOption Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build configuration file.
         * 
         * @return builder
         * 
         */
        public Builder substitutionOption(BuildOptionsSubstitutionOption substitutionOption) {
            return substitutionOption(Output.of(substitutionOption));
        }

        /**
         * @param volumes Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it is indicative of a build request with an incorrect configuration.
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable Output<List<VolumeArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it is indicative of a build request with an incorrect configuration.
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<VolumeArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        /**
         * @param volumes Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it is indicative of a build request with an incorrect configuration.
         * 
         * @return builder
         * 
         */
        public Builder volumes(VolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }

        /**
         * @param workerPool This field deprecated; please use `pool.name` instead.
         * 
         * @return builder
         * 
         */
        public Builder workerPool(@Nullable Output<String> workerPool) {
            $.workerPool = workerPool;
            return this;
        }

        /**
         * @param workerPool This field deprecated; please use `pool.name` instead.
         * 
         * @return builder
         * 
         */
        public Builder workerPool(String workerPool) {
            return workerPool(Output.of(workerPool));
        }

        public BuildOptionsArgs build() {
            return $;
        }
    }

}