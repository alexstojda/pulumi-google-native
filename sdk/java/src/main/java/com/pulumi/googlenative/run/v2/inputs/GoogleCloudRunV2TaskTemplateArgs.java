// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run.v2.enums.GoogleCloudRunV2TaskTemplateExecutionEnvironment;
import com.pulumi.googlenative.run.v2.inputs.GoogleCloudRunV2ContainerArgs;
import com.pulumi.googlenative.run.v2.inputs.GoogleCloudRunV2VolumeArgs;
import com.pulumi.googlenative.run.v2.inputs.GoogleCloudRunV2VpcAccessArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TaskTemplate describes the data a task should have when created from a template.
 * 
 */
public final class GoogleCloudRunV2TaskTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunV2TaskTemplateArgs Empty = new GoogleCloudRunV2TaskTemplateArgs();

    /**
     * Holds the single container that defines the unit of execution for this task.
     * 
     */
    @Import(name="containers")
    private @Nullable Output<List<GoogleCloudRunV2ContainerArgs>> containers;

    /**
     * @return Holds the single container that defines the unit of execution for this task.
     * 
     */
    public Optional<Output<List<GoogleCloudRunV2ContainerArgs>>> containers() {
        return Optional.ofNullable(this.containers);
    }

    /**
     * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    @Import(name="encryptionKey")
    private @Nullable Output<String> encryptionKey;

    /**
     * @return A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    public Optional<Output<String>> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }

    /**
     * The execution environment being used to host this Task.
     * 
     */
    @Import(name="executionEnvironment")
    private @Nullable Output<GoogleCloudRunV2TaskTemplateExecutionEnvironment> executionEnvironment;

    /**
     * @return The execution environment being used to host this Task.
     * 
     */
    public Optional<Output<GoogleCloudRunV2TaskTemplateExecutionEnvironment>> executionEnvironment() {
        return Optional.ofNullable(this.executionEnvironment);
    }

    /**
     * Number of retries allowed per Task, before marking this Task failed.
     * 
     */
    @Import(name="maxRetries")
    private @Nullable Output<Integer> maxRetries;

    /**
     * @return Number of retries allowed per Task, before marking this Task failed.
     * 
     */
    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    /**
     * Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project&#39;s default service account.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project&#39;s default service account.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout.
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * A list of Volumes to make available to containers.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<GoogleCloudRunV2VolumeArgs>> volumes;

    /**
     * @return A list of Volumes to make available to containers.
     * 
     */
    public Optional<Output<List<GoogleCloudRunV2VolumeArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    /**
     * VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    @Import(name="vpcAccess")
    private @Nullable Output<GoogleCloudRunV2VpcAccessArgs> vpcAccess;

    /**
     * @return VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    public Optional<Output<GoogleCloudRunV2VpcAccessArgs>> vpcAccess() {
        return Optional.ofNullable(this.vpcAccess);
    }

    private GoogleCloudRunV2TaskTemplateArgs() {}

    private GoogleCloudRunV2TaskTemplateArgs(GoogleCloudRunV2TaskTemplateArgs $) {
        this.containers = $.containers;
        this.encryptionKey = $.encryptionKey;
        this.executionEnvironment = $.executionEnvironment;
        this.maxRetries = $.maxRetries;
        this.serviceAccount = $.serviceAccount;
        this.timeout = $.timeout;
        this.volumes = $.volumes;
        this.vpcAccess = $.vpcAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunV2TaskTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunV2TaskTemplateArgs $;

        public Builder() {
            $ = new GoogleCloudRunV2TaskTemplateArgs();
        }

        public Builder(GoogleCloudRunV2TaskTemplateArgs defaults) {
            $ = new GoogleCloudRunV2TaskTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containers Holds the single container that defines the unit of execution for this task.
         * 
         * @return builder
         * 
         */
        public Builder containers(@Nullable Output<List<GoogleCloudRunV2ContainerArgs>> containers) {
            $.containers = containers;
            return this;
        }

        /**
         * @param containers Holds the single container that defines the unit of execution for this task.
         * 
         * @return builder
         * 
         */
        public Builder containers(List<GoogleCloudRunV2ContainerArgs> containers) {
            return containers(Output.of(containers));
        }

        /**
         * @param containers Holds the single container that defines the unit of execution for this task.
         * 
         * @return builder
         * 
         */
        public Builder containers(GoogleCloudRunV2ContainerArgs... containers) {
            return containers(List.of(containers));
        }

        /**
         * @param encryptionKey A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            $.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * @param encryptionKey A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
         * 
         * @return builder
         * 
         */
        public Builder encryptionKey(String encryptionKey) {
            return encryptionKey(Output.of(encryptionKey));
        }

        /**
         * @param executionEnvironment The execution environment being used to host this Task.
         * 
         * @return builder
         * 
         */
        public Builder executionEnvironment(@Nullable Output<GoogleCloudRunV2TaskTemplateExecutionEnvironment> executionEnvironment) {
            $.executionEnvironment = executionEnvironment;
            return this;
        }

        /**
         * @param executionEnvironment The execution environment being used to host this Task.
         * 
         * @return builder
         * 
         */
        public Builder executionEnvironment(GoogleCloudRunV2TaskTemplateExecutionEnvironment executionEnvironment) {
            return executionEnvironment(Output.of(executionEnvironment));
        }

        /**
         * @param maxRetries Number of retries allowed per Task, before marking this Task failed.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param maxRetries Number of retries allowed per Task, before marking this Task failed.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        /**
         * @param serviceAccount Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project&#39;s default service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project&#39;s default service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param timeout Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout.
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param volumes A list of Volumes to make available to containers.
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable Output<List<GoogleCloudRunV2VolumeArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes A list of Volumes to make available to containers.
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<GoogleCloudRunV2VolumeArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        /**
         * @param volumes A list of Volumes to make available to containers.
         * 
         * @return builder
         * 
         */
        public Builder volumes(GoogleCloudRunV2VolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }

        /**
         * @param vpcAccess VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
         * 
         * @return builder
         * 
         */
        public Builder vpcAccess(@Nullable Output<GoogleCloudRunV2VpcAccessArgs> vpcAccess) {
            $.vpcAccess = vpcAccess;
            return this;
        }

        /**
         * @param vpcAccess VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
         * 
         * @return builder
         * 
         */
        public Builder vpcAccess(GoogleCloudRunV2VpcAccessArgs vpcAccess) {
            return vpcAccess(Output.of(vpcAccess));
        }

        public GoogleCloudRunV2TaskTemplateArgs build() {
            return $;
        }
    }

}