// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse {
    /**
     * @return The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
     */
    private String parameterId;
    /**
     * @return The text for this part.
     * 
     */
    private String text;

    private GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse() {}
    /**
     * @return The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
     */
    public String parameterId() {
        return this.parameterId;
    }
    /**
     * @return The text for this part.
     * 
     */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String parameterId;
        private String text;
        public Builder() {}
        public Builder(GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterId = defaults.parameterId;
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder parameterId(String parameterId) {
            this.parameterId = Objects.requireNonNull(parameterId);
            return this;
        }
        @CustomType.Setter
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse build() {
            final var o = new GoogleCloudDialogflowCxV3beta1IntentTrainingPhrasePartResponse();
            o.parameterId = parameterId;
            o.text = text;
            return o;
        }
    }
}