// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Response media object for media content card.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs();

    /**
     * Url where the media is stored.
     * 
     */
    @Import(name="contentUrl", required=true)
    private Output<String> contentUrl;

    /**
     * @return Url where the media is stored.
     * 
     */
    public Output<String> contentUrl() {
        return this.contentUrl;
    }

    /**
     * Optional. Description of media card.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of media card.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Icon to display above media content.
     * 
     */
    @Import(name="icon")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> icon;

    /**
     * @return Optional. Icon to display above media content.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs>> icon() {
        return Optional.ofNullable(this.icon);
    }

    /**
     * Optional. Image to display above media content.
     * 
     */
    @Import(name="largeImage")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> largeImage;

    /**
     * @return Optional. Image to display above media content.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs>> largeImage() {
        return Optional.ofNullable(this.largeImage);
    }

    /**
     * Name of media card.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of media card.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs $) {
        this.contentUrl = $.contentUrl;
        this.description = $.description;
        this.icon = $.icon;
        this.largeImage = $.largeImage;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentUrl Url where the media is stored.
         * 
         * @return builder
         * 
         */
        public Builder contentUrl(Output<String> contentUrl) {
            $.contentUrl = contentUrl;
            return this;
        }

        /**
         * @param contentUrl Url where the media is stored.
         * 
         * @return builder
         * 
         */
        public Builder contentUrl(String contentUrl) {
            return contentUrl(Output.of(contentUrl));
        }

        /**
         * @param description Optional. Description of media card.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of media card.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param icon Optional. Icon to display above media content.
         * 
         * @return builder
         * 
         */
        public Builder icon(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> icon) {
            $.icon = icon;
            return this;
        }

        /**
         * @param icon Optional. Icon to display above media content.
         * 
         * @return builder
         * 
         */
        public Builder icon(GoogleCloudDialogflowV2beta1IntentMessageImageArgs icon) {
            return icon(Output.of(icon));
        }

        /**
         * @param largeImage Optional. Image to display above media content.
         * 
         * @return builder
         * 
         */
        public Builder largeImage(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> largeImage) {
            $.largeImage = largeImage;
            return this;
        }

        /**
         * @param largeImage Optional. Image to display above media content.
         * 
         * @return builder
         * 
         */
        public Builder largeImage(GoogleCloudDialogflowV2beta1IntentMessageImageArgs largeImage) {
            return largeImage(Output.of(largeImage));
        }

        /**
         * @param name Name of media card.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of media card.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectArgs build() {
            $.contentUrl = Objects.requireNonNull($.contentUrl, "expected parameter 'contentUrl' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}