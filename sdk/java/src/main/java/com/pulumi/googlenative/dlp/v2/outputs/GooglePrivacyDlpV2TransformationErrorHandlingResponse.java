// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2LeaveUntransformedResponse;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2ThrowErrorResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2TransformationErrorHandlingResponse {
    /**
     * @return Ignore errors
     * 
     */
    private GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed;
    /**
     * @return Throw an error
     * 
     */
    private GooglePrivacyDlpV2ThrowErrorResponse throwError;

    private GooglePrivacyDlpV2TransformationErrorHandlingResponse() {}
    /**
     * @return Ignore errors
     * 
     */
    public GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed() {
        return this.leaveUntransformed;
    }
    /**
     * @return Throw an error
     * 
     */
    public GooglePrivacyDlpV2ThrowErrorResponse throwError() {
        return this.throwError;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TransformationErrorHandlingResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed;
        private GooglePrivacyDlpV2ThrowErrorResponse throwError;
        public Builder() {}
        public Builder(GooglePrivacyDlpV2TransformationErrorHandlingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.leaveUntransformed = defaults.leaveUntransformed;
    	      this.throwError = defaults.throwError;
        }

        @CustomType.Setter
        public Builder leaveUntransformed(GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed) {
            this.leaveUntransformed = Objects.requireNonNull(leaveUntransformed);
            return this;
        }
        @CustomType.Setter
        public Builder throwError(GooglePrivacyDlpV2ThrowErrorResponse throwError) {
            this.throwError = Objects.requireNonNull(throwError);
            return this;
        }
        public GooglePrivacyDlpV2TransformationErrorHandlingResponse build() {
            final var o = new GooglePrivacyDlpV2TransformationErrorHandlingResponse();
            o.leaveUntransformed = leaveUntransformed;
            o.throwError = throwError;
            return o;
        }
    }
}