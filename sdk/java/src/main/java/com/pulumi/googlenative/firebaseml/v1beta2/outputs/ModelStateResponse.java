// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaseml.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.firebaseml.v1beta2.outputs.StatusResponse;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ModelStateResponse {
    /**
     * @return Indicates if this model has been published.
     * 
     */
    private Boolean published;
    /**
     * @return Indicates the latest validation error on the model if any. A model may have validation errors if there were problems during the model creation/update. e.g. in the case of a TfLiteModel, if a tflite model file was missing or in the wrong format. This field will be empty for valid models.
     * 
     */
    private StatusResponse validationError;

    private ModelStateResponse() {}
    /**
     * @return Indicates if this model has been published.
     * 
     */
    public Boolean published() {
        return this.published;
    }
    /**
     * @return Indicates the latest validation error on the model if any. A model may have validation errors if there were problems during the model creation/update. e.g. in the case of a TfLiteModel, if a tflite model file was missing or in the wrong format. This field will be empty for valid models.
     * 
     */
    public StatusResponse validationError() {
        return this.validationError;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelStateResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean published;
        private StatusResponse validationError;
        public Builder() {}
        public Builder(ModelStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.published = defaults.published;
    	      this.validationError = defaults.validationError;
        }

        @CustomType.Setter
        public Builder published(Boolean published) {
            this.published = Objects.requireNonNull(published);
            return this;
        }
        @CustomType.Setter
        public Builder validationError(StatusResponse validationError) {
            this.validationError = Objects.requireNonNull(validationError);
            return this;
        }
        public ModelStateResponse build() {
            final var o = new ModelStateResponse();
            o.published = published;
            o.validationError = validationError;
            return o;
        }
    }
}