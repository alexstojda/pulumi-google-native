// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig.v1.inputs.OSPolicyResourceFileArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An RPM package file. RPM packages only support INSTALLED state.
 * 
 */
public final class OSPolicyResourcePackageResourceRPMArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourcePackageResourceRPMArgs Empty = new OSPolicyResourcePackageResourceRPMArgs();

    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    @Import(name="pullDeps")
    private @Nullable Output<Boolean> pullDeps;

    /**
     * @return Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    public Optional<Output<Boolean>> pullDeps() {
        return Optional.ofNullable(this.pullDeps);
    }

    /**
     * An rpm package.
     * 
     */
    @Import(name="source", required=true)
    private Output<OSPolicyResourceFileArgs> source;

    /**
     * @return An rpm package.
     * 
     */
    public Output<OSPolicyResourceFileArgs> source() {
        return this.source;
    }

    private OSPolicyResourcePackageResourceRPMArgs() {}

    private OSPolicyResourcePackageResourceRPMArgs(OSPolicyResourcePackageResourceRPMArgs $) {
        this.pullDeps = $.pullDeps;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceRPMArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceRPMArgs $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceRPMArgs();
        }

        public Builder(OSPolicyResourcePackageResourceRPMArgs defaults) {
            $ = new OSPolicyResourcePackageResourceRPMArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pullDeps Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
         * 
         * @return builder
         * 
         */
        public Builder pullDeps(@Nullable Output<Boolean> pullDeps) {
            $.pullDeps = pullDeps;
            return this;
        }

        /**
         * @param pullDeps Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
         * 
         * @return builder
         * 
         */
        public Builder pullDeps(Boolean pullDeps) {
            return pullDeps(Output.of(pullDeps));
        }

        /**
         * @param source An rpm package.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<OSPolicyResourceFileArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source An rpm package.
         * 
         * @return builder
         * 
         */
        public Builder source(OSPolicyResourceFileArgs source) {
            return source(Output.of(source));
        }

        public OSPolicyResourcePackageResourceRPMArgs build() {
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}