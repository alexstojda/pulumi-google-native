// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OperationErrorErrorsItemResponse {
    /**
     * @return The error type identifier for this error.
     * 
     */
    private String code;
    /**
     * @return Indicates the field in the request that caused the error. This property is optional.
     * 
     */
    private String location;
    /**
     * @return An optional, human-readable error message.
     * 
     */
    private String message;

    private OperationErrorErrorsItemResponse() {}
    /**
     * @return The error type identifier for this error.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Indicates the field in the request that caused the error. This property is optional.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return An optional, human-readable error message.
     * 
     */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorErrorsItemResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String code;
        private String location;
        private String message;
        public Builder() {}
        public Builder(OperationErrorErrorsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.location = defaults.location;
    	      this.message = defaults.message;
        }

        @CustomType.Setter
        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public OperationErrorErrorsItemResponse build() {
            final var o = new OperationErrorErrorsItemResponse();
            o.code = code;
            o.location = location;
            o.message = message;
            return o;
        }
    }
}