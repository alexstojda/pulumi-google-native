// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse {
    /**
     * @return The word or phrase to be excluded.
     * 
     */
    private String value;

    private GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse() {}
    /**
     * @return The word or phrase to be excluded.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String value;
        public Builder() {}
        public Builder(GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse build() {
            final var o = new GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseResponse();
            o.value = value;
            return o;
        }
    }
}