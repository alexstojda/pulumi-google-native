// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * GitHubEnterpriseSecrets represents the names of all necessary secrets in Secret Manager for a GitHub Enterprise server. Format is: projects//secrets/.
 * 
 */
public final class GitHubEnterpriseSecretsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitHubEnterpriseSecretsArgs Empty = new GitHubEnterpriseSecretsArgs();

    /**
     * The resource name for the OAuth client ID secret in Secret Manager.
     * 
     */
    @Import(name="oauthClientIdName")
    private @Nullable Output<String> oauthClientIdName;

    /**
     * @return The resource name for the OAuth client ID secret in Secret Manager.
     * 
     */
    public Optional<Output<String>> oauthClientIdName() {
        return Optional.ofNullable(this.oauthClientIdName);
    }

    /**
     * The resource name for the OAuth client ID secret version in Secret Manager.
     * 
     */
    @Import(name="oauthClientIdVersionName")
    private @Nullable Output<String> oauthClientIdVersionName;

    /**
     * @return The resource name for the OAuth client ID secret version in Secret Manager.
     * 
     */
    public Optional<Output<String>> oauthClientIdVersionName() {
        return Optional.ofNullable(this.oauthClientIdVersionName);
    }

    /**
     * The resource name for the OAuth secret in Secret Manager.
     * 
     */
    @Import(name="oauthSecretName")
    private @Nullable Output<String> oauthSecretName;

    /**
     * @return The resource name for the OAuth secret in Secret Manager.
     * 
     */
    public Optional<Output<String>> oauthSecretName() {
        return Optional.ofNullable(this.oauthSecretName);
    }

    /**
     * The resource name for the OAuth secret secret version in Secret Manager.
     * 
     */
    @Import(name="oauthSecretVersionName")
    private @Nullable Output<String> oauthSecretVersionName;

    /**
     * @return The resource name for the OAuth secret secret version in Secret Manager.
     * 
     */
    public Optional<Output<String>> oauthSecretVersionName() {
        return Optional.ofNullable(this.oauthSecretVersionName);
    }

    /**
     * The resource name for the private key secret.
     * 
     */
    @Import(name="privateKeyName")
    private @Nullable Output<String> privateKeyName;

    /**
     * @return The resource name for the private key secret.
     * 
     */
    public Optional<Output<String>> privateKeyName() {
        return Optional.ofNullable(this.privateKeyName);
    }

    /**
     * The resource name for the private key secret version.
     * 
     */
    @Import(name="privateKeyVersionName")
    private @Nullable Output<String> privateKeyVersionName;

    /**
     * @return The resource name for the private key secret version.
     * 
     */
    public Optional<Output<String>> privateKeyVersionName() {
        return Optional.ofNullable(this.privateKeyVersionName);
    }

    /**
     * The resource name for the webhook secret in Secret Manager.
     * 
     */
    @Import(name="webhookSecretName")
    private @Nullable Output<String> webhookSecretName;

    /**
     * @return The resource name for the webhook secret in Secret Manager.
     * 
     */
    public Optional<Output<String>> webhookSecretName() {
        return Optional.ofNullable(this.webhookSecretName);
    }

    /**
     * The resource name for the webhook secret secret version in Secret Manager.
     * 
     */
    @Import(name="webhookSecretVersionName")
    private @Nullable Output<String> webhookSecretVersionName;

    /**
     * @return The resource name for the webhook secret secret version in Secret Manager.
     * 
     */
    public Optional<Output<String>> webhookSecretVersionName() {
        return Optional.ofNullable(this.webhookSecretVersionName);
    }

    private GitHubEnterpriseSecretsArgs() {}

    private GitHubEnterpriseSecretsArgs(GitHubEnterpriseSecretsArgs $) {
        this.oauthClientIdName = $.oauthClientIdName;
        this.oauthClientIdVersionName = $.oauthClientIdVersionName;
        this.oauthSecretName = $.oauthSecretName;
        this.oauthSecretVersionName = $.oauthSecretVersionName;
        this.privateKeyName = $.privateKeyName;
        this.privateKeyVersionName = $.privateKeyVersionName;
        this.webhookSecretName = $.webhookSecretName;
        this.webhookSecretVersionName = $.webhookSecretVersionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitHubEnterpriseSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitHubEnterpriseSecretsArgs $;

        public Builder() {
            $ = new GitHubEnterpriseSecretsArgs();
        }

        public Builder(GitHubEnterpriseSecretsArgs defaults) {
            $ = new GitHubEnterpriseSecretsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param oauthClientIdName The resource name for the OAuth client ID secret in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientIdName(@Nullable Output<String> oauthClientIdName) {
            $.oauthClientIdName = oauthClientIdName;
            return this;
        }

        /**
         * @param oauthClientIdName The resource name for the OAuth client ID secret in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientIdName(String oauthClientIdName) {
            return oauthClientIdName(Output.of(oauthClientIdName));
        }

        /**
         * @param oauthClientIdVersionName The resource name for the OAuth client ID secret version in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientIdVersionName(@Nullable Output<String> oauthClientIdVersionName) {
            $.oauthClientIdVersionName = oauthClientIdVersionName;
            return this;
        }

        /**
         * @param oauthClientIdVersionName The resource name for the OAuth client ID secret version in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientIdVersionName(String oauthClientIdVersionName) {
            return oauthClientIdVersionName(Output.of(oauthClientIdVersionName));
        }

        /**
         * @param oauthSecretName The resource name for the OAuth secret in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder oauthSecretName(@Nullable Output<String> oauthSecretName) {
            $.oauthSecretName = oauthSecretName;
            return this;
        }

        /**
         * @param oauthSecretName The resource name for the OAuth secret in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder oauthSecretName(String oauthSecretName) {
            return oauthSecretName(Output.of(oauthSecretName));
        }

        /**
         * @param oauthSecretVersionName The resource name for the OAuth secret secret version in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder oauthSecretVersionName(@Nullable Output<String> oauthSecretVersionName) {
            $.oauthSecretVersionName = oauthSecretVersionName;
            return this;
        }

        /**
         * @param oauthSecretVersionName The resource name for the OAuth secret secret version in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder oauthSecretVersionName(String oauthSecretVersionName) {
            return oauthSecretVersionName(Output.of(oauthSecretVersionName));
        }

        /**
         * @param privateKeyName The resource name for the private key secret.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyName(@Nullable Output<String> privateKeyName) {
            $.privateKeyName = privateKeyName;
            return this;
        }

        /**
         * @param privateKeyName The resource name for the private key secret.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyName(String privateKeyName) {
            return privateKeyName(Output.of(privateKeyName));
        }

        /**
         * @param privateKeyVersionName The resource name for the private key secret version.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyVersionName(@Nullable Output<String> privateKeyVersionName) {
            $.privateKeyVersionName = privateKeyVersionName;
            return this;
        }

        /**
         * @param privateKeyVersionName The resource name for the private key secret version.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyVersionName(String privateKeyVersionName) {
            return privateKeyVersionName(Output.of(privateKeyVersionName));
        }

        /**
         * @param webhookSecretName The resource name for the webhook secret in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder webhookSecretName(@Nullable Output<String> webhookSecretName) {
            $.webhookSecretName = webhookSecretName;
            return this;
        }

        /**
         * @param webhookSecretName The resource name for the webhook secret in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder webhookSecretName(String webhookSecretName) {
            return webhookSecretName(Output.of(webhookSecretName));
        }

        /**
         * @param webhookSecretVersionName The resource name for the webhook secret secret version in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder webhookSecretVersionName(@Nullable Output<String> webhookSecretVersionName) {
            $.webhookSecretVersionName = webhookSecretVersionName;
            return this;
        }

        /**
         * @param webhookSecretVersionName The resource name for the webhook secret secret version in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder webhookSecretVersionName(String webhookSecretVersionName) {
            return webhookSecretVersionName(Output.of(webhookSecretVersionName));
        }

        public GitHubEnterpriseSecretsArgs build() {
            return $;
        }
    }

}