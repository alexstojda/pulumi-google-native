// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v2alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudFunctionsV2alphaStateMessageResponse {
    /**
     * @return The message.
     * 
     */
    private String message;
    /**
     * @return Severity of the state message.
     * 
     */
    private String severity;
    /**
     * @return One-word CamelCase type of the state message.
     * 
     */
    private String type;

    private GoogleCloudFunctionsV2alphaStateMessageResponse() {}
    /**
     * @return The message.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Severity of the state message.
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return One-word CamelCase type of the state message.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudFunctionsV2alphaStateMessageResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String message;
        private String severity;
        private String type;
        public Builder() {}
        public Builder(GoogleCloudFunctionsV2alphaStateMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.severity = defaults.severity;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        @CustomType.Setter
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudFunctionsV2alphaStateMessageResponse build() {
            final var o = new GoogleCloudFunctionsV2alphaStateMessageResponse();
            o.message = message;
            o.severity = severity;
            o.type = type;
            return o;
        }
    }
}