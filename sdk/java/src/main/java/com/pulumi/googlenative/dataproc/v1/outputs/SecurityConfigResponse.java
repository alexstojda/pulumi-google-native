// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc.v1.outputs.IdentityConfigResponse;
import com.pulumi.googlenative.dataproc.v1.outputs.KerberosConfigResponse;
import java.util.Objects;

@CustomType
public final class SecurityConfigResponse {
    /**
     * @return Optional. Identity related configuration, including service account based secure multi-tenancy user mappings.
     * 
     */
    private IdentityConfigResponse identityConfig;
    /**
     * @return Optional. Kerberos related configuration.
     * 
     */
    private KerberosConfigResponse kerberosConfig;

    private SecurityConfigResponse() {}
    /**
     * @return Optional. Identity related configuration, including service account based secure multi-tenancy user mappings.
     * 
     */
    public IdentityConfigResponse identityConfig() {
        return this.identityConfig;
    }
    /**
     * @return Optional. Kerberos related configuration.
     * 
     */
    public KerberosConfigResponse kerberosConfig() {
        return this.kerberosConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private IdentityConfigResponse identityConfig;
        private KerberosConfigResponse kerberosConfig;
        public Builder() {}
        public Builder(SecurityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityConfig = defaults.identityConfig;
    	      this.kerberosConfig = defaults.kerberosConfig;
        }

        @CustomType.Setter
        public Builder identityConfig(IdentityConfigResponse identityConfig) {
            this.identityConfig = Objects.requireNonNull(identityConfig);
            return this;
        }
        @CustomType.Setter
        public Builder kerberosConfig(KerberosConfigResponse kerberosConfig) {
            this.kerberosConfig = Objects.requireNonNull(kerberosConfig);
            return this;
        }
        public SecurityConfigResponse build() {
            final var o = new SecurityConfigResponse();
            o.identityConfig = identityConfig;
            o.kerberosConfig = kerberosConfig;
            return o;
        }
    }
}