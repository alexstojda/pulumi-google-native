// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1beta2.inputs.KerberosConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Security related configuration, including encryption, Kerberos, etc.
 * 
 */
public final class SecurityConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityConfigArgs Empty = new SecurityConfigArgs();

    /**
     * Optional. Kerberos related configuration.
     * 
     */
    @Import(name="kerberosConfig")
    private @Nullable Output<KerberosConfigArgs> kerberosConfig;

    /**
     * @return Optional. Kerberos related configuration.
     * 
     */
    public Optional<Output<KerberosConfigArgs>> kerberosConfig() {
        return Optional.ofNullable(this.kerberosConfig);
    }

    private SecurityConfigArgs() {}

    private SecurityConfigArgs(SecurityConfigArgs $) {
        this.kerberosConfig = $.kerberosConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityConfigArgs $;

        public Builder() {
            $ = new SecurityConfigArgs();
        }

        public Builder(SecurityConfigArgs defaults) {
            $ = new SecurityConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kerberosConfig Optional. Kerberos related configuration.
         * 
         * @return builder
         * 
         */
        public Builder kerberosConfig(@Nullable Output<KerberosConfigArgs> kerberosConfig) {
            $.kerberosConfig = kerberosConfig;
            return this;
        }

        /**
         * @param kerberosConfig Optional. Kerberos related configuration.
         * 
         * @return builder
         * 
         */
        public Builder kerberosConfig(KerberosConfigArgs kerberosConfig) {
            return kerberosConfig(Output.of(kerberosConfig));
        }

        public SecurityConfigArgs build() {
            return $;
        }
    }

}