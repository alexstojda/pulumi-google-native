// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs;
import com.pulumi.googlenative.dialogflow.v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Browsing carousel tile
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs();

    /**
     * Optional. Description of the carousel item. Maximum of four lines of text.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the carousel item. Maximum of four lines of text.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of text.
     * 
     */
    @Import(name="footer")
    private @Nullable Output<String> footer;

    /**
     * @return Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of text.
     * 
     */
    public Optional<Output<String>> footer() {
        return Optional.ofNullable(this.footer);
    }

    /**
     * Optional. Hero image for the carousel item.
     * 
     */
    @Import(name="image")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;

    /**
     * @return Optional. Hero image for the carousel item.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Action to present to the user.
     * 
     */
    @Import(name="openUriAction", required=true)
    private Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs> openUriAction;

    /**
     * @return Action to present to the user.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs> openUriAction() {
        return this.openUriAction;
    }

    /**
     * Title of the carousel item. Maximum of two lines of text.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return Title of the carousel item. Maximum of two lines of text.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs $) {
        this.description = $.description;
        this.footer = $.footer;
        this.image = $.image;
        this.openUriAction = $.openUriAction;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. Description of the carousel item. Maximum of four lines of text.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the carousel item. Maximum of four lines of text.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param footer Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of text.
         * 
         * @return builder
         * 
         */
        public Builder footer(@Nullable Output<String> footer) {
            $.footer = footer;
            return this;
        }

        /**
         * @param footer Optional. Text that appears at the bottom of the Browse Carousel Card. Maximum of one line of text.
         * 
         * @return builder
         * 
         */
        public Builder footer(String footer) {
            return footer(Output.of(footer));
        }

        /**
         * @param image Optional. Hero image for the carousel item.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Optional. Hero image for the carousel item.
         * 
         * @return builder
         * 
         */
        public Builder image(GoogleCloudDialogflowV2beta1IntentMessageImageArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param openUriAction Action to present to the user.
         * 
         * @return builder
         * 
         */
        public Builder openUriAction(Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs> openUriAction) {
            $.openUriAction = openUriAction;
            return this;
        }

        /**
         * @param openUriAction Action to present to the user.
         * 
         * @return builder
         * 
         */
        public Builder openUriAction(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemOpenUrlActionArgs openUriAction) {
            return openUriAction(Output.of(openUriAction));
        }

        /**
         * @param title Title of the carousel item. Maximum of two lines of text.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Title of the carousel item. Maximum of two lines of text.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs build() {
            $.openUriAction = Objects.requireNonNull($.openUriAction, "expected parameter 'openUriAction' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}