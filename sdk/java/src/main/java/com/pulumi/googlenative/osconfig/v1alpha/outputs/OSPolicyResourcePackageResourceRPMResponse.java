// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig.v1alpha.outputs.OSPolicyResourceFileResponse;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class OSPolicyResourcePackageResourceRPMResponse {
    /**
     * @return Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    private Boolean pullDeps;
    /**
     * @return An rpm package.
     * 
     */
    private OSPolicyResourceFileResponse source;

    private OSPolicyResourcePackageResourceRPMResponse() {}
    /**
     * @return Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    public Boolean pullDeps() {
        return this.pullDeps;
    }
    /**
     * @return An rpm package.
     * 
     */
    public OSPolicyResourceFileResponse source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceRPMResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean pullDeps;
        private OSPolicyResourceFileResponse source;
        public Builder() {}
        public Builder(OSPolicyResourcePackageResourceRPMResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder pullDeps(Boolean pullDeps) {
            this.pullDeps = Objects.requireNonNull(pullDeps);
            return this;
        }
        @CustomType.Setter
        public Builder source(OSPolicyResourceFileResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public OSPolicyResourcePackageResourceRPMResponse build() {
            final var o = new OSPolicyResourcePackageResourceRPMResponse();
            o.pullDeps = pullDeps;
            o.source = source;
            return o;
        }
    }
}