// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild.v1.outputs.InlineSecretResponse;
import com.pulumi.googlenative.cloudbuild.v1.outputs.SecretManagerSecretResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SecretsResponse {
    /**
     * @return Secrets encrypted with KMS key and the associated secret environment variable.
     * 
     */
    private List<InlineSecretResponse> inline;
    /**
     * @return Secrets in Secret Manager and associated secret environment variable.
     * 
     */
    private List<SecretManagerSecretResponse> secretManager;

    private SecretsResponse() {}
    /**
     * @return Secrets encrypted with KMS key and the associated secret environment variable.
     * 
     */
    public List<InlineSecretResponse> inline() {
        return this.inline;
    }
    /**
     * @return Secrets in Secret Manager and associated secret environment variable.
     * 
     */
    public List<SecretManagerSecretResponse> secretManager() {
        return this.secretManager;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<InlineSecretResponse> inline;
        private List<SecretManagerSecretResponse> secretManager;
        public Builder() {}
        public Builder(SecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inline = defaults.inline;
    	      this.secretManager = defaults.secretManager;
        }

        @CustomType.Setter
        public Builder inline(List<InlineSecretResponse> inline) {
            this.inline = Objects.requireNonNull(inline);
            return this;
        }
        public Builder inline(InlineSecretResponse... inline) {
            return inline(List.of(inline));
        }
        @CustomType.Setter
        public Builder secretManager(List<SecretManagerSecretResponse> secretManager) {
            this.secretManager = Objects.requireNonNull(secretManager);
            return this;
        }
        public Builder secretManager(SecretManagerSecretResponse... secretManager) {
            return secretManager(List.of(secretManager));
        }
        public SecretsResponse build() {
            final var o = new SecretsResponse();
            o.inline = inline;
            o.secretManager = secretManager;
            return o;
        }
    }
}