// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse {
    /**
     * @return Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
     * 
     */
    private String phoneNumber;

    private GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse() {}
    /**
     * @return Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
     * 
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String phoneNumber;
        public Builder() {}
        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        @CustomType.Setter
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse build() {
            final var o = new GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse();
            o.phoneNumber = phoneNumber;
            return o;
        }
    }
}