// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Config to process conversation.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs();

    /**
     * Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
     * 
     */
    @Import(name="recentSentencesCount")
    private @Nullable Output<Integer> recentSentencesCount;

    /**
     * @return Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
     * 
     */
    public Optional<Output<Integer>> recentSentencesCount() {
        return Optional.ofNullable(this.recentSentencesCount);
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs() {}

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs $) {
        this.recentSentencesCount = $.recentSentencesCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recentSentencesCount Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
         * 
         * @return builder
         * 
         */
        public Builder recentSentencesCount(@Nullable Output<Integer> recentSentencesCount) {
            $.recentSentencesCount = recentSentencesCount;
            return this;
        }

        /**
         * @param recentSentencesCount Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
         * 
         * @return builder
         * 
         */
        public Builder recentSentencesCount(Integer recentSentencesCount) {
            return recentSentencesCount(Output.of(recentSentencesCount));
        }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigArgs build() {
            return $;
        }
    }

}