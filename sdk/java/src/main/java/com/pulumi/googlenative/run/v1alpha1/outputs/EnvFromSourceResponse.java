// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run.v1alpha1.outputs.ConfigMapEnvSourceResponse;
import com.pulumi.googlenative.run.v1alpha1.outputs.SecretEnvSourceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvFromSourceResponse {
    /**
     * @return (Optional) The ConfigMap to select from
     * 
     */
    private ConfigMapEnvSourceResponse configMapRef;
    /**
     * @return (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    private String prefix;
    /**
     * @return (Optional) The Secret to select from
     * 
     */
    private SecretEnvSourceResponse secretRef;

    private EnvFromSourceResponse() {}
    /**
     * @return (Optional) The ConfigMap to select from
     * 
     */
    public ConfigMapEnvSourceResponse configMapRef() {
        return this.configMapRef;
    }
    /**
     * @return (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return (Optional) The Secret to select from
     * 
     */
    public SecretEnvSourceResponse secretRef() {
        return this.secretRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvFromSourceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ConfigMapEnvSourceResponse configMapRef;
        private String prefix;
        private SecretEnvSourceResponse secretRef;
        public Builder() {}
        public Builder(EnvFromSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapRef = defaults.configMapRef;
    	      this.prefix = defaults.prefix;
    	      this.secretRef = defaults.secretRef;
        }

        @CustomType.Setter
        public Builder configMapRef(ConfigMapEnvSourceResponse configMapRef) {
            this.configMapRef = Objects.requireNonNull(configMapRef);
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder secretRef(SecretEnvSourceResponse secretRef) {
            this.secretRef = Objects.requireNonNull(secretRef);
            return this;
        }
        public EnvFromSourceResponse build() {
            final var o = new EnvFromSourceResponse();
            o.configMapRef = configMapRef;
            o.prefix = prefix;
            o.secretRef = secretRef;
            return o;
        }
    }
}