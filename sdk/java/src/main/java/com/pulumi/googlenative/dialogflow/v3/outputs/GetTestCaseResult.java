// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3ConversationTurnResponse;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3TestCaseResultResponse;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3TestConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTestCaseResult {
    /**
     * @return When the test was created.
     * 
     */
    private String creationTime;
    /**
     * @return The human-readable name of the test case, unique within the agent. Limit of 200 characters.
     * 
     */
    private String displayName;
    /**
     * @return The latest test result.
     * 
     */
    private GoogleCloudDialogflowCxV3TestCaseResultResponse lastTestResult;
    /**
     * @return The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
     * 
     */
    private String name;
    /**
     * @return Additional freeform notes about the test case. Limit of 400 characters.
     * 
     */
    private String notes;
    /**
     * @return Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
     * 
     */
    private List<String> tags;
    /**
     * @return The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     * 
     */
    private List<GoogleCloudDialogflowCxV3ConversationTurnResponse> testCaseConversationTurns;
    /**
     * @return Config for the test case.
     * 
     */
    private GoogleCloudDialogflowCxV3TestConfigResponse testConfig;

    private GetTestCaseResult() {}
    /**
     * @return When the test was created.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The human-readable name of the test case, unique within the agent. Limit of 200 characters.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The latest test result.
     * 
     */
    public GoogleCloudDialogflowCxV3TestCaseResultResponse lastTestResult() {
        return this.lastTestResult;
    }
    /**
     * @return The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Additional freeform notes about the test case. Limit of 400 characters.
     * 
     */
    public String notes() {
        return this.notes;
    }
    /**
     * @return Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with &#34;#&#34; and has a limit of 30 characters.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     * 
     */
    public List<GoogleCloudDialogflowCxV3ConversationTurnResponse> testCaseConversationTurns() {
        return this.testCaseConversationTurns;
    }
    /**
     * @return Config for the test case.
     * 
     */
    public GoogleCloudDialogflowCxV3TestConfigResponse testConfig() {
        return this.testConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestCaseResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String creationTime;
        private String displayName;
        private GoogleCloudDialogflowCxV3TestCaseResultResponse lastTestResult;
        private String name;
        private String notes;
        private List<String> tags;
        private List<GoogleCloudDialogflowCxV3ConversationTurnResponse> testCaseConversationTurns;
        private GoogleCloudDialogflowCxV3TestConfigResponse testConfig;
        public Builder() {}
        public Builder(GetTestCaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.displayName = defaults.displayName;
    	      this.lastTestResult = defaults.lastTestResult;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.tags = defaults.tags;
    	      this.testCaseConversationTurns = defaults.testCaseConversationTurns;
    	      this.testConfig = defaults.testConfig;
        }

        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder lastTestResult(GoogleCloudDialogflowCxV3TestCaseResultResponse lastTestResult) {
            this.lastTestResult = Objects.requireNonNull(lastTestResult);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder notes(String notes) {
            this.notes = Objects.requireNonNull(notes);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder testCaseConversationTurns(List<GoogleCloudDialogflowCxV3ConversationTurnResponse> testCaseConversationTurns) {
            this.testCaseConversationTurns = Objects.requireNonNull(testCaseConversationTurns);
            return this;
        }
        public Builder testCaseConversationTurns(GoogleCloudDialogflowCxV3ConversationTurnResponse... testCaseConversationTurns) {
            return testCaseConversationTurns(List.of(testCaseConversationTurns));
        }
        @CustomType.Setter
        public Builder testConfig(GoogleCloudDialogflowCxV3TestConfigResponse testConfig) {
            this.testConfig = Objects.requireNonNull(testConfig);
            return this;
        }
        public GetTestCaseResult build() {
            final var o = new GetTestCaseResult();
            o.creationTime = creationTime;
            o.displayName = displayName;
            o.lastTestResult = lastTestResult;
            o.name = name;
            o.notes = notes;
            o.tags = tags;
            o.testCaseConversationTurns = testCaseConversationTurns;
            o.testConfig = testConfig;
            return o;
        }
    }
}