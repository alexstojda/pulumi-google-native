// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse {
    /**
     * @return Url where the media is stored.
     * 
     */
    private String contentUrl;
    /**
     * @return Optional. Description of media card.
     * 
     */
    private String description;
    /**
     * @return Optional. Icon to display above media content.
     * 
     */
    private GoogleCloudDialogflowV2beta1IntentMessageImageResponse icon;
    /**
     * @return Optional. Image to display above media content.
     * 
     */
    private GoogleCloudDialogflowV2beta1IntentMessageImageResponse largeImage;
    /**
     * @return Name of media card.
     * 
     */
    private String name;

    private GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse() {}
    /**
     * @return Url where the media is stored.
     * 
     */
    public String contentUrl() {
        return this.contentUrl;
    }
    /**
     * @return Optional. Description of media card.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. Icon to display above media content.
     * 
     */
    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse icon() {
        return this.icon;
    }
    /**
     * @return Optional. Image to display above media content.
     * 
     */
    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse largeImage() {
        return this.largeImage;
    }
    /**
     * @return Name of media card.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contentUrl;
        private String description;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse icon;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse largeImage;
        private String name;
        public Builder() {}
        public Builder(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentUrl = defaults.contentUrl;
    	      this.description = defaults.description;
    	      this.icon = defaults.icon;
    	      this.largeImage = defaults.largeImage;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder contentUrl(String contentUrl) {
            this.contentUrl = Objects.requireNonNull(contentUrl);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder icon(GoogleCloudDialogflowV2beta1IntentMessageImageResponse icon) {
            this.icon = Objects.requireNonNull(icon);
            return this;
        }
        @CustomType.Setter
        public Builder largeImage(GoogleCloudDialogflowV2beta1IntentMessageImageResponse largeImage) {
            this.largeImage = Objects.requireNonNull(largeImage);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse build() {
            final var o = new GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponseMediaObjectResponse();
            o.contentUrl = contentUrl;
            o.description = description;
            o.icon = icon;
            o.largeImage = largeImage;
            o.name = name;
            return o;
        }
    }
}