// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ErrorHandlerResponse {
    /**
     * @return Error condition this handler applies to.
     * 
     */
    private String errorCode;
    /**
     * @return MIME type of file. Defaults to text/html.
     * 
     */
    private String mimeType;
    /**
     * @return Static file content to be served for this error.
     * 
     */
    private String staticFile;

    private ErrorHandlerResponse() {}
    /**
     * @return Error condition this handler applies to.
     * 
     */
    public String errorCode() {
        return this.errorCode;
    }
    /**
     * @return MIME type of file. Defaults to text/html.
     * 
     */
    public String mimeType() {
        return this.mimeType;
    }
    /**
     * @return Static file content to be served for this error.
     * 
     */
    public String staticFile() {
        return this.staticFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorHandlerResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String errorCode;
        private String mimeType;
        private String staticFile;
        public Builder() {}
        public Builder(ErrorHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.mimeType = defaults.mimeType;
    	      this.staticFile = defaults.staticFile;
        }

        @CustomType.Setter
        public Builder errorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }
        @CustomType.Setter
        public Builder mimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }
        @CustomType.Setter
        public Builder staticFile(String staticFile) {
            this.staticFile = Objects.requireNonNull(staticFile);
            return this;
        }
        public ErrorHandlerResponse build() {
            final var o = new ErrorHandlerResponse();
            o.errorCode = errorCode;
            o.mimeType = mimeType;
            o.staticFile = staticFile;
            return o;
        }
    }
}