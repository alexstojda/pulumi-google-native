// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs Empty = new GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs();

    /**
     * The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
     * 
     */
    @Import(name="ssml")
    private @Nullable Output<String> ssml;

    /**
     * @return The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
     * 
     */
    public Optional<Output<String>> ssml() {
        return Optional.ofNullable(this.ssml);
    }

    /**
     * The raw text to be synthesized.
     * 
     */
    @Import(name="text")
    private @Nullable Output<String> text;

    /**
     * @return The raw text to be synthesized.
     * 
     */
    public Optional<Output<String>> text() {
        return Optional.ofNullable(this.text);
    }

    private GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs() {}

    private GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs(GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs $) {
        this.ssml = $.ssml;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ssml The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
         * 
         * @return builder
         * 
         */
        public Builder ssml(@Nullable Output<String> ssml) {
            $.ssml = ssml;
            return this;
        }

        /**
         * @param ssml The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
         * 
         * @return builder
         * 
         */
        public Builder ssml(String ssml) {
            return ssml(Output.of(ssml));
        }

        /**
         * @param text The raw text to be synthesized.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<String> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text The raw text to be synthesized.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            return text(Output.of(text));
        }

        public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextArgs build() {
            return $;
        }
    }

}