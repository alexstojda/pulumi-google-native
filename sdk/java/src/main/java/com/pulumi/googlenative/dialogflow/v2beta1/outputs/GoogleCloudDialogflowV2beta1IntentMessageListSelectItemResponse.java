// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse {
    /**
     * @return Optional. The main text describing the item.
     * 
     */
    private String description;
    /**
     * @return Optional. The image to display.
     * 
     */
    private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
    /**
     * @return Additional information about this option.
     * 
     */
    private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info;
    /**
     * @return The title of the list item.
     * 
     */
    private String title;

    private GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse() {}
    /**
     * @return Optional. The main text describing the item.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. The image to display.
     * 
     */
    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse image() {
        return this.image;
    }
    /**
     * @return Additional information about this option.
     * 
     */
    public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info() {
        return this.info;
    }
    /**
     * @return The title of the list item.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info;
        private String title;
        public Builder() {}
        public Builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.info = defaults.info;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder image(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder info(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse build() {
            final var o = new GoogleCloudDialogflowV2beta1IntentMessageListSelectItemResponse();
            o.description = description;
            o.image = image;
            o.info = info;
            o.title = title;
            return o;
        }
    }
}