// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageTextResponse {
    /**
     * @return Optional. The collection of the agent&#39;s responses.
     * 
     */
    private List<String> text;

    private GoogleCloudDialogflowV2beta1IntentMessageTextResponse() {}
    /**
     * @return Optional. The collection of the agent&#39;s responses.
     * 
     */
    public List<String> text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTextResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> text;
        public Builder() {}
        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder text(List<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder text(String... text) {
            return text(List.of(text));
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTextResponse build() {
            final var o = new GoogleCloudDialogflowV2beta1IntentMessageTextResponse();
            o.text = text;
            return o;
        }
    }
}