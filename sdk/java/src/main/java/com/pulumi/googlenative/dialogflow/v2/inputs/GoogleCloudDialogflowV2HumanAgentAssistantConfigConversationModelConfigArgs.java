// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom conversation models used in agent assist feature. Supported feature: ARTICLE_SUGGESTION, SMART_COMPOSE, SMART_REPLY, CONVERSATION_SUMMARIZATION.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs();

    /**
     * Conversation model resource name. Format: `projects//conversationModels/`.
     * 
     */
    @Import(name="model")
    private @Nullable Output<String> model;

    /**
     * @return Conversation model resource name. Format: `projects//conversationModels/`.
     * 
     */
    public Optional<Output<String>> model() {
        return Optional.ofNullable(this.model);
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs() {}

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs $) {
        this.model = $.model;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param model Conversation model resource name. Format: `projects//conversationModels/`.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<String> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model Conversation model resource name. Format: `projects//conversationModels/`.
         * 
         * @return builder
         * 
         */
        public Builder model(String model) {
            return model(Output.of(model));
        }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigArgs build() {
            return $;
        }
    }

}