// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run.v1alpha1.inputs.ConfigMapEnvSourceArgs;
import com.pulumi.googlenative.run.v1alpha1.inputs.SecretEnvSourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run EnvFromSource represents the source of a set of ConfigMaps
 * 
 */
public final class EnvFromSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvFromSourceArgs Empty = new EnvFromSourceArgs();

    /**
     * (Optional) The ConfigMap to select from
     * 
     */
    @Import(name="configMapRef")
    private @Nullable Output<ConfigMapEnvSourceArgs> configMapRef;

    /**
     * @return (Optional) The ConfigMap to select from
     * 
     */
    public Optional<Output<ConfigMapEnvSourceArgs>> configMapRef() {
        return Optional.ofNullable(this.configMapRef);
    }

    /**
     * (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * (Optional) The Secret to select from
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<SecretEnvSourceArgs> secretRef;

    /**
     * @return (Optional) The Secret to select from
     * 
     */
    public Optional<Output<SecretEnvSourceArgs>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    private EnvFromSourceArgs() {}

    private EnvFromSourceArgs(EnvFromSourceArgs $) {
        this.configMapRef = $.configMapRef;
        this.prefix = $.prefix;
        this.secretRef = $.secretRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvFromSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvFromSourceArgs $;

        public Builder() {
            $ = new EnvFromSourceArgs();
        }

        public Builder(EnvFromSourceArgs defaults) {
            $ = new EnvFromSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configMapRef (Optional) The ConfigMap to select from
         * 
         * @return builder
         * 
         */
        public Builder configMapRef(@Nullable Output<ConfigMapEnvSourceArgs> configMapRef) {
            $.configMapRef = configMapRef;
            return this;
        }

        /**
         * @param configMapRef (Optional) The ConfigMap to select from
         * 
         * @return builder
         * 
         */
        public Builder configMapRef(ConfigMapEnvSourceArgs configMapRef) {
            return configMapRef(Output.of(configMapRef));
        }

        /**
         * @param prefix (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param secretRef (Optional) The Secret to select from
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable Output<SecretEnvSourceArgs> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param secretRef (Optional) The Secret to select from
         * 
         * @return builder
         * 
         */
        public Builder secretRef(SecretEnvSourceArgs secretRef) {
            return secretRef(Output.of(secretRef));
        }

        public EnvFromSourceArgs build() {
            return $;
        }
    }

}