// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse {
    /**
     * @return The text shown the in the suggestion chip.
     * 
     */
    private String title;

    private GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse() {}
    /**
     * @return The text shown the in the suggestion chip.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String title;
        public Builder() {}
        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse build() {
            final var o = new GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse();
            o.title = title;
            return o;
        }
    }
}