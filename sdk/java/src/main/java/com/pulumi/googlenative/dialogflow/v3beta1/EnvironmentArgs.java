// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigArgs;
import com.pulumi.googlenative.dialogflow.v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigArgs;
import com.pulumi.googlenative.dialogflow.v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the environment. Format: `projects//locations//agents//environments/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment. Format: `projects//locations//agents//environments/`.
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

    /**
     * The test cases config for continuous tests of this environment.
     * 
     */
    @Import(name="testCasesConfig")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigArgs> testCasesConfig;

    /**
     * @return The test cases config for continuous tests of this environment.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigArgs>> testCasesConfig() {
        return Optional.ofNullable(this.testCasesConfig);
    }

    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
     * 
     */
    @Import(name="versionConfigs", required=true)
    private Output<List<GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigArgs>> versionConfigs;

    /**
     * @return A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigArgs>> versionConfigs() {
        return this.versionConfigs;
    }

    /**
     * The webhook configuration for this environment.
     * 
     */
    @Import(name="webhookConfig")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs> webhookConfig;

    /**
     * @return The webhook configuration for this environment.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs>> webhookConfig() {
        return Optional.ofNullable(this.webhookConfig);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.agentId = $.agentId;
        this.description = $.description;
        this.displayName = $.displayName;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.testCasesConfig = $.testCasesConfig;
        this.versionConfigs = $.versionConfigs;
        this.webhookConfig = $.webhookConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param description The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The human-readable name of the environment (unique in an agent). Limit of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the environment (unique in an agent). Limit of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the environment. Format: `projects//locations//agents//environments/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment. Format: `projects//locations//agents//environments/`.
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

        /**
         * @param testCasesConfig The test cases config for continuous tests of this environment.
         * 
         * @return builder
         * 
         */
        public Builder testCasesConfig(@Nullable Output<GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigArgs> testCasesConfig) {
            $.testCasesConfig = testCasesConfig;
            return this;
        }

        /**
         * @param testCasesConfig The test cases config for continuous tests of this environment.
         * 
         * @return builder
         * 
         */
        public Builder testCasesConfig(GoogleCloudDialogflowCxV3beta1EnvironmentTestCasesConfigArgs testCasesConfig) {
            return testCasesConfig(Output.of(testCasesConfig));
        }

        /**
         * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder versionConfigs(Output<List<GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigArgs>> versionConfigs) {
            $.versionConfigs = versionConfigs;
            return this;
        }

        /**
         * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder versionConfigs(List<GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigArgs> versionConfigs) {
            return versionConfigs(Output.of(versionConfigs));
        }

        /**
         * @param versionConfigs A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
         * 
         * @return builder
         * 
         */
        public Builder versionConfigs(GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigArgs... versionConfigs) {
            return versionConfigs(List.of(versionConfigs));
        }

        /**
         * @param webhookConfig The webhook configuration for this environment.
         * 
         * @return builder
         * 
         */
        public Builder webhookConfig(@Nullable Output<GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs> webhookConfig) {
            $.webhookConfig = webhookConfig;
            return this;
        }

        /**
         * @param webhookConfig The webhook configuration for this environment.
         * 
         * @return builder
         * 
         */
        public Builder webhookConfig(GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs webhookConfig) {
            return webhookConfig(Output.of(webhookConfig));
        }

        public EnvironmentArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.versionConfigs = Objects.requireNonNull($.versionConfigs, "expected parameter 'versionConfigs' to be non-null");
            return $;
        }
    }

}