// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.websecurityscanner.v1alpha.outputs.CustomAccountResponse;
import com.pulumi.googlenative.websecurityscanner.v1alpha.outputs.GoogleAccountResponse;
import java.util.Objects;

@CustomType
public final class AuthenticationResponse {
    /**
     * @return Authentication using a custom account.
     * 
     */
    private CustomAccountResponse customAccount;
    /**
     * @return Authentication using a Google account.
     * 
     */
    private GoogleAccountResponse googleAccount;

    private AuthenticationResponse() {}
    /**
     * @return Authentication using a custom account.
     * 
     */
    public CustomAccountResponse customAccount() {
        return this.customAccount;
    }
    /**
     * @return Authentication using a Google account.
     * 
     */
    public GoogleAccountResponse googleAccount() {
        return this.googleAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private CustomAccountResponse customAccount;
        private GoogleAccountResponse googleAccount;
        public Builder() {}
        public Builder(AuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customAccount = defaults.customAccount;
    	      this.googleAccount = defaults.googleAccount;
        }

        @CustomType.Setter
        public Builder customAccount(CustomAccountResponse customAccount) {
            this.customAccount = Objects.requireNonNull(customAccount);
            return this;
        }
        @CustomType.Setter
        public Builder googleAccount(GoogleAccountResponse googleAccount) {
            this.googleAccount = Objects.requireNonNull(googleAccount);
            return this;
        }
        public AuthenticationResponse build() {
            final var o = new AuthenticationResponse();
            o.customAccount = customAccount;
            o.googleAccount = googleAccount;
            return o;
        }
    }
}