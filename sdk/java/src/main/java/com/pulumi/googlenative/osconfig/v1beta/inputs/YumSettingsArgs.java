// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Yum patching is performed by executing `yum update`. Additional options can be set to control how this is executed. Note that not all settings are supported on all platforms.
 * 
 */
public final class YumSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final YumSettingsArgs Empty = new YumSettingsArgs();

    /**
     * List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
     * 
     */
    @Import(name="excludes")
    private @Nullable Output<List<String>> excludes;

    /**
     * @return List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
     * 
     */
    public Optional<Output<List<String>>> excludes() {
        return Optional.ofNullable(this.excludes);
    }

    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
     * 
     */
    @Import(name="exclusivePackages")
    private @Nullable Output<List<String>> exclusivePackages;

    /**
     * @return An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
     * 
     */
    public Optional<Output<List<String>>> exclusivePackages() {
        return Optional.ofNullable(this.exclusivePackages);
    }

    /**
     * Will cause patch to run `yum update-minimal` instead.
     * 
     */
    @Import(name="minimal")
    private @Nullable Output<Boolean> minimal;

    /**
     * @return Will cause patch to run `yum update-minimal` instead.
     * 
     */
    public Optional<Output<Boolean>> minimal() {
        return Optional.ofNullable(this.minimal);
    }

    /**
     * Adds the `--security` flag to `yum update`. Not supported on all platforms.
     * 
     */
    @Import(name="security")
    private @Nullable Output<Boolean> security;

    /**
     * @return Adds the `--security` flag to `yum update`. Not supported on all platforms.
     * 
     */
    public Optional<Output<Boolean>> security() {
        return Optional.ofNullable(this.security);
    }

    private YumSettingsArgs() {}

    private YumSettingsArgs(YumSettingsArgs $) {
        this.excludes = $.excludes;
        this.exclusivePackages = $.exclusivePackages;
        this.minimal = $.minimal;
        this.security = $.security;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(YumSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private YumSettingsArgs $;

        public Builder() {
            $ = new YumSettingsArgs();
        }

        public Builder(YumSettingsArgs defaults) {
            $ = new YumSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludes List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
         * 
         * @return builder
         * 
         */
        public Builder excludes(@Nullable Output<List<String>> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
         * 
         * @return builder
         * 
         */
        public Builder excludes(List<String> excludes) {
            return excludes(Output.of(excludes));
        }

        /**
         * @param excludes List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
         * 
         * @return builder
         * 
         */
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        /**
         * @param exclusivePackages An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePackages(@Nullable Output<List<String>> exclusivePackages) {
            $.exclusivePackages = exclusivePackages;
            return this;
        }

        /**
         * @param exclusivePackages An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePackages(List<String> exclusivePackages) {
            return exclusivePackages(Output.of(exclusivePackages));
        }

        /**
         * @param exclusivePackages An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePackages(String... exclusivePackages) {
            return exclusivePackages(List.of(exclusivePackages));
        }

        /**
         * @param minimal Will cause patch to run `yum update-minimal` instead.
         * 
         * @return builder
         * 
         */
        public Builder minimal(@Nullable Output<Boolean> minimal) {
            $.minimal = minimal;
            return this;
        }

        /**
         * @param minimal Will cause patch to run `yum update-minimal` instead.
         * 
         * @return builder
         * 
         */
        public Builder minimal(Boolean minimal) {
            return minimal(Output.of(minimal));
        }

        /**
         * @param security Adds the `--security` flag to `yum update`. Not supported on all platforms.
         * 
         * @return builder
         * 
         */
        public Builder security(@Nullable Output<Boolean> security) {
            $.security = security;
            return this;
        }

        /**
         * @param security Adds the `--security` flag to `yum update`. Not supported on all platforms.
         * 
         * @return builder
         * 
         */
        public Builder security(Boolean security) {
            return security(Output.of(security));
        }

        public YumSettingsArgs build() {
            return $;
        }
    }

}