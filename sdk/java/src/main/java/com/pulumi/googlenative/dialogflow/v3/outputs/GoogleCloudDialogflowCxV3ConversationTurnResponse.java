// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ConversationTurnResponse {
    /**
     * @return The user input.
     * 
     */
    private GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse userInput;
    /**
     * @return The virtual agent output.
     * 
     */
    private GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;

    private GoogleCloudDialogflowCxV3ConversationTurnResponse() {}
    /**
     * @return The user input.
     * 
     */
    public GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse userInput() {
        return this.userInput;
    }
    /**
     * @return The virtual agent output.
     * 
     */
    public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse virtualAgentOutput() {
        return this.virtualAgentOutput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse userInput;
        private GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;
        public Builder() {}
        public Builder(GoogleCloudDialogflowCxV3ConversationTurnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userInput = defaults.userInput;
    	      this.virtualAgentOutput = defaults.virtualAgentOutput;
        }

        @CustomType.Setter
        public Builder userInput(GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse userInput) {
            this.userInput = Objects.requireNonNull(userInput);
            return this;
        }
        @CustomType.Setter
        public Builder virtualAgentOutput(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse virtualAgentOutput) {
            this.virtualAgentOutput = Objects.requireNonNull(virtualAgentOutput);
            return this;
        }
        public GoogleCloudDialogflowCxV3ConversationTurnResponse build() {
            final var o = new GoogleCloudDialogflowCxV3ConversationTurnResponse();
            o.userInput = userInput;
            o.virtualAgentOutput = virtualAgentOutput;
            return o;
        }
    }
}