// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.websecurityscanner.v1.inputs.CustomAccountArgs;
import com.pulumi.googlenative.websecurityscanner.v1.inputs.GoogleAccountArgs;
import com.pulumi.googlenative.websecurityscanner.v1.inputs.IapCredentialArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scan authentication configuration.
 * 
 */
public final class AuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationArgs Empty = new AuthenticationArgs();

    /**
     * Authentication using a custom account.
     * 
     */
    @Import(name="customAccount")
    private @Nullable Output<CustomAccountArgs> customAccount;

    /**
     * @return Authentication using a custom account.
     * 
     */
    public Optional<Output<CustomAccountArgs>> customAccount() {
        return Optional.ofNullable(this.customAccount);
    }

    /**
     * Authentication using a Google account.
     * 
     */
    @Import(name="googleAccount")
    private @Nullable Output<GoogleAccountArgs> googleAccount;

    /**
     * @return Authentication using a Google account.
     * 
     */
    public Optional<Output<GoogleAccountArgs>> googleAccount() {
        return Optional.ofNullable(this.googleAccount);
    }

    /**
     * Authentication using Identity-Aware-Proxy (IAP).
     * 
     */
    @Import(name="iapCredential")
    private @Nullable Output<IapCredentialArgs> iapCredential;

    /**
     * @return Authentication using Identity-Aware-Proxy (IAP).
     * 
     */
    public Optional<Output<IapCredentialArgs>> iapCredential() {
        return Optional.ofNullable(this.iapCredential);
    }

    private AuthenticationArgs() {}

    private AuthenticationArgs(AuthenticationArgs $) {
        this.customAccount = $.customAccount;
        this.googleAccount = $.googleAccount;
        this.iapCredential = $.iapCredential;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationArgs $;

        public Builder() {
            $ = new AuthenticationArgs();
        }

        public Builder(AuthenticationArgs defaults) {
            $ = new AuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customAccount Authentication using a custom account.
         * 
         * @return builder
         * 
         */
        public Builder customAccount(@Nullable Output<CustomAccountArgs> customAccount) {
            $.customAccount = customAccount;
            return this;
        }

        /**
         * @param customAccount Authentication using a custom account.
         * 
         * @return builder
         * 
         */
        public Builder customAccount(CustomAccountArgs customAccount) {
            return customAccount(Output.of(customAccount));
        }

        /**
         * @param googleAccount Authentication using a Google account.
         * 
         * @return builder
         * 
         */
        public Builder googleAccount(@Nullable Output<GoogleAccountArgs> googleAccount) {
            $.googleAccount = googleAccount;
            return this;
        }

        /**
         * @param googleAccount Authentication using a Google account.
         * 
         * @return builder
         * 
         */
        public Builder googleAccount(GoogleAccountArgs googleAccount) {
            return googleAccount(Output.of(googleAccount));
        }

        /**
         * @param iapCredential Authentication using Identity-Aware-Proxy (IAP).
         * 
         * @return builder
         * 
         */
        public Builder iapCredential(@Nullable Output<IapCredentialArgs> iapCredential) {
            $.iapCredential = iapCredential;
            return this;
        }

        /**
         * @param iapCredential Authentication using Identity-Aware-Proxy (IAP).
         * 
         * @return builder
         * 
         */
        public Builder iapCredential(IapCredentialArgs iapCredential) {
            return iapCredential(Output.of(iapCredential));
        }

        public AuthenticationArgs build() {
            return $;
        }
    }

}