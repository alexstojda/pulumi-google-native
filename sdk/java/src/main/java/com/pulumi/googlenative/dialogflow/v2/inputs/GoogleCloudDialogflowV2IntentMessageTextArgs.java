// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The text response message.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageTextArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageTextArgs Empty = new GoogleCloudDialogflowV2IntentMessageTextArgs();

    /**
     * Optional. The collection of the agent&#39;s responses.
     * 
     */
    @Import(name="text")
    private @Nullable Output<List<String>> text;

    /**
     * @return Optional. The collection of the agent&#39;s responses.
     * 
     */
    public Optional<Output<List<String>>> text() {
        return Optional.ofNullable(this.text);
    }

    private GoogleCloudDialogflowV2IntentMessageTextArgs() {}

    private GoogleCloudDialogflowV2IntentMessageTextArgs(GoogleCloudDialogflowV2IntentMessageTextArgs $) {
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageTextArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageTextArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTextArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageTextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param text Optional. The collection of the agent&#39;s responses.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<List<String>> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text Optional. The collection of the agent&#39;s responses.
         * 
         * @return builder
         * 
         */
        public Builder text(List<String> text) {
            return text(Output.of(text));
        }

        /**
         * @param text Optional. The collection of the agent&#39;s responses.
         * 
         * @return builder
         * 
         */
        public Builder text(String... text) {
            return text(List.of(text));
        }

        public GoogleCloudDialogflowV2IntentMessageTextArgs build() {
            return $;
        }
    }

}