// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ConversationTurnArgs;
import com.pulumi.googlenative.dialogflow.v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TestCaseResultArgs;
import com.pulumi.googlenative.dialogflow.v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TestConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TestCaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final TestCaseArgs Empty = new TestCaseArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * The human-readable name of the test case, unique within the agent. Limit of 200 characters.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the test case, unique within the agent. Limit of 200 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The latest test result.
     * 
     */
    @Import(name="lastTestResult")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1TestCaseResultArgs> lastTestResult;

    /**
     * @return The latest test result.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1TestCaseResultArgs>> lastTestResult() {
        return Optional.ofNullable(this.lastTestResult);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Additional freeform notes about the test case. Limit of 400 characters.
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return Additional freeform notes about the test case. Limit of 400 characters.
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     * 
     */
    @Import(name="testCaseConversationTurns")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> testCaseConversationTurns;

    /**
     * @return The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>>> testCaseConversationTurns() {
        return Optional.ofNullable(this.testCaseConversationTurns);
    }

    /**
     * Config for the test case.
     * 
     */
    @Import(name="testConfig")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1TestConfigArgs> testConfig;

    /**
     * @return Config for the test case.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1TestConfigArgs>> testConfig() {
        return Optional.ofNullable(this.testConfig);
    }

    private TestCaseArgs() {}

    private TestCaseArgs(TestCaseArgs $) {
        this.agentId = $.agentId;
        this.displayName = $.displayName;
        this.lastTestResult = $.lastTestResult;
        this.location = $.location;
        this.name = $.name;
        this.notes = $.notes;
        this.project = $.project;
        this.tags = $.tags;
        this.testCaseConversationTurns = $.testCaseConversationTurns;
        this.testConfig = $.testConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestCaseArgs $;

        public Builder() {
            $ = new TestCaseArgs();
        }

        public Builder(TestCaseArgs defaults) {
            $ = new TestCaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param displayName The human-readable name of the test case, unique within the agent. Limit of 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the test case, unique within the agent. Limit of 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param lastTestResult The latest test result.
         * 
         * @return builder
         * 
         */
        public Builder lastTestResult(@Nullable Output<GoogleCloudDialogflowCxV3beta1TestCaseResultArgs> lastTestResult) {
            $.lastTestResult = lastTestResult;
            return this;
        }

        /**
         * @param lastTestResult The latest test result.
         * 
         * @return builder
         * 
         */
        public Builder lastTestResult(GoogleCloudDialogflowCxV3beta1TestCaseResultArgs lastTestResult) {
            return lastTestResult(Output.of(lastTestResult));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notes Additional freeform notes about the test case. Limit of 400 characters.
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes Additional freeform notes about the test case. Limit of 400 characters.
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param tags Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param testCaseConversationTurns The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
         * 
         * @return builder
         * 
         */
        public Builder testCaseConversationTurns(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs>> testCaseConversationTurns) {
            $.testCaseConversationTurns = testCaseConversationTurns;
            return this;
        }

        /**
         * @param testCaseConversationTurns The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
         * 
         * @return builder
         * 
         */
        public Builder testCaseConversationTurns(List<GoogleCloudDialogflowCxV3beta1ConversationTurnArgs> testCaseConversationTurns) {
            return testCaseConversationTurns(Output.of(testCaseConversationTurns));
        }

        /**
         * @param testCaseConversationTurns The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
         * 
         * @return builder
         * 
         */
        public Builder testCaseConversationTurns(GoogleCloudDialogflowCxV3beta1ConversationTurnArgs... testCaseConversationTurns) {
            return testCaseConversationTurns(List.of(testCaseConversationTurns));
        }

        /**
         * @param testConfig Config for the test case.
         * 
         * @return builder
         * 
         */
        public Builder testConfig(@Nullable Output<GoogleCloudDialogflowCxV3beta1TestConfigArgs> testConfig) {
            $.testConfig = testConfig;
            return this;
        }

        /**
         * @param testConfig Config for the test case.
         * 
         * @return builder
         * 
         */
        public Builder testConfig(GoogleCloudDialogflowCxV3beta1TestConfigArgs testConfig) {
            return testConfig(Output.of(testConfig));
        }

        public TestCaseArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}