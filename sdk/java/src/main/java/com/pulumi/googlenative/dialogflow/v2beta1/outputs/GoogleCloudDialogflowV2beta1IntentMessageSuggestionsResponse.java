// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse {
    /**
     * @return The list of suggested replies.
     * 
     */
    private List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse> suggestions;

    private GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse() {}
    /**
     * @return The list of suggested replies.
     * 
     */
    public List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse> suggestions() {
        return this.suggestions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse> suggestions;
        public Builder() {}
        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.suggestions = defaults.suggestions;
        }

        @CustomType.Setter
        public Builder suggestions(List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse> suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }
        public Builder suggestions(GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse... suggestions) {
            return suggestions(List.of(suggestions));
        }
        public GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse build() {
            final var o = new GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse();
            o.suggestions = suggestions;
            return o;
        }
    }
}