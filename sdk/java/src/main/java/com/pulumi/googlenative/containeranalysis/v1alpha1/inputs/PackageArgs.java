// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.enums.PackageArchitecture;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DigestArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.DistributionArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.LicenseArgs;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.VersionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This represents a particular package that is distributed over various channels. e.g. glibc (aka libc6) is distributed by many, at various versions.
 * 
 */
public final class PackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackageArgs Empty = new PackageArgs();

    /**
     * The CPU architecture for which packages in this distribution channel were built. Architecture will be blank for language packages.
     * 
     */
    @Import(name="architecture")
    private @Nullable Output<PackageArchitecture> architecture;

    /**
     * @return The CPU architecture for which packages in this distribution channel were built. Architecture will be blank for language packages.
     * 
     */
    public Optional<Output<PackageArchitecture>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. The cpe_uri will be blank for language packages.
     * 
     */
    @Import(name="cpeUri")
    private @Nullable Output<String> cpeUri;

    /**
     * @return The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. The cpe_uri will be blank for language packages.
     * 
     */
    public Optional<Output<String>> cpeUri() {
        return Optional.ofNullable(this.cpeUri);
    }

    /**
     * The description of this package.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this package.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Hash value, typically a file digest, that allows unique identification a specific package.
     * 
     */
    @Import(name="digest")
    private @Nullable Output<List<DigestArgs>> digest;

    /**
     * @return Hash value, typically a file digest, that allows unique identification a specific package.
     * 
     */
    public Optional<Output<List<DigestArgs>>> digest() {
        return Optional.ofNullable(this.digest);
    }

    /**
     * The various channels by which a package is distributed.
     * 
     */
    @Import(name="distribution")
    private @Nullable Output<List<DistributionArgs>> distribution;

    /**
     * @return The various channels by which a package is distributed.
     * 
     */
    public Optional<Output<List<DistributionArgs>>> distribution() {
        return Optional.ofNullable(this.distribution);
    }

    /**
     * Licenses that have been declared by the authors of the package.
     * 
     */
    @Import(name="license")
    private @Nullable Output<LicenseArgs> license;

    /**
     * @return Licenses that have been declared by the authors of the package.
     * 
     */
    public Optional<Output<LicenseArgs>> license() {
        return Optional.ofNullable(this.license);
    }

    /**
     * A freeform text denoting the maintainer of this package.
     * 
     */
    @Import(name="maintainer")
    private @Nullable Output<String> maintainer;

    /**
     * @return A freeform text denoting the maintainer of this package.
     * 
     */
    public Optional<Output<String>> maintainer() {
        return Optional.ofNullable(this.maintainer);
    }

    /**
     * The name of the package.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the package.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
     * 
     */
    @Import(name="packageType")
    private @Nullable Output<String> packageType;

    /**
     * @return The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
     * 
     */
    public Optional<Output<String>> packageType() {
        return Optional.ofNullable(this.packageType);
    }

    /**
     * The homepage for this package.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The homepage for this package.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * The version of the package.
     * 
     */
    @Import(name="version")
    private @Nullable Output<VersionArgs> version;

    /**
     * @return The version of the package.
     * 
     */
    public Optional<Output<VersionArgs>> version() {
        return Optional.ofNullable(this.version);
    }

    private PackageArgs() {}

    private PackageArgs(PackageArgs $) {
        this.architecture = $.architecture;
        this.cpeUri = $.cpeUri;
        this.description = $.description;
        this.digest = $.digest;
        this.distribution = $.distribution;
        this.license = $.license;
        this.maintainer = $.maintainer;
        this.name = $.name;
        this.packageType = $.packageType;
        this.url = $.url;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackageArgs $;

        public Builder() {
            $ = new PackageArgs();
        }

        public Builder(PackageArgs defaults) {
            $ = new PackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param architecture The CPU architecture for which packages in this distribution channel were built. Architecture will be blank for language packages.
         * 
         * @return builder
         * 
         */
        public Builder architecture(@Nullable Output<PackageArchitecture> architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param architecture The CPU architecture for which packages in this distribution channel were built. Architecture will be blank for language packages.
         * 
         * @return builder
         * 
         */
        public Builder architecture(PackageArchitecture architecture) {
            return architecture(Output.of(architecture));
        }

        /**
         * @param cpeUri The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. The cpe_uri will be blank for language packages.
         * 
         * @return builder
         * 
         */
        public Builder cpeUri(@Nullable Output<String> cpeUri) {
            $.cpeUri = cpeUri;
            return this;
        }

        /**
         * @param cpeUri The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. The cpe_uri will be blank for language packages.
         * 
         * @return builder
         * 
         */
        public Builder cpeUri(String cpeUri) {
            return cpeUri(Output.of(cpeUri));
        }

        /**
         * @param description The description of this package.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this package.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param digest Hash value, typically a file digest, that allows unique identification a specific package.
         * 
         * @return builder
         * 
         */
        public Builder digest(@Nullable Output<List<DigestArgs>> digest) {
            $.digest = digest;
            return this;
        }

        /**
         * @param digest Hash value, typically a file digest, that allows unique identification a specific package.
         * 
         * @return builder
         * 
         */
        public Builder digest(List<DigestArgs> digest) {
            return digest(Output.of(digest));
        }

        /**
         * @param digest Hash value, typically a file digest, that allows unique identification a specific package.
         * 
         * @return builder
         * 
         */
        public Builder digest(DigestArgs... digest) {
            return digest(List.of(digest));
        }

        /**
         * @param distribution The various channels by which a package is distributed.
         * 
         * @return builder
         * 
         */
        public Builder distribution(@Nullable Output<List<DistributionArgs>> distribution) {
            $.distribution = distribution;
            return this;
        }

        /**
         * @param distribution The various channels by which a package is distributed.
         * 
         * @return builder
         * 
         */
        public Builder distribution(List<DistributionArgs> distribution) {
            return distribution(Output.of(distribution));
        }

        /**
         * @param distribution The various channels by which a package is distributed.
         * 
         * @return builder
         * 
         */
        public Builder distribution(DistributionArgs... distribution) {
            return distribution(List.of(distribution));
        }

        /**
         * @param license Licenses that have been declared by the authors of the package.
         * 
         * @return builder
         * 
         */
        public Builder license(@Nullable Output<LicenseArgs> license) {
            $.license = license;
            return this;
        }

        /**
         * @param license Licenses that have been declared by the authors of the package.
         * 
         * @return builder
         * 
         */
        public Builder license(LicenseArgs license) {
            return license(Output.of(license));
        }

        /**
         * @param maintainer A freeform text denoting the maintainer of this package.
         * 
         * @return builder
         * 
         */
        public Builder maintainer(@Nullable Output<String> maintainer) {
            $.maintainer = maintainer;
            return this;
        }

        /**
         * @param maintainer A freeform text denoting the maintainer of this package.
         * 
         * @return builder
         * 
         */
        public Builder maintainer(String maintainer) {
            return maintainer(Output.of(maintainer));
        }

        /**
         * @param name The name of the package.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the package.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param packageType The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
         * 
         * @return builder
         * 
         */
        public Builder packageType(@Nullable Output<String> packageType) {
            $.packageType = packageType;
            return this;
        }

        /**
         * @param packageType The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
         * 
         * @return builder
         * 
         */
        public Builder packageType(String packageType) {
            return packageType(Output.of(packageType));
        }

        /**
         * @param url The homepage for this package.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The homepage for this package.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param version The version of the package.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<VersionArgs> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the package.
         * 
         * @return builder
         * 
         */
        public Builder version(VersionArgs version) {
            return version(Output.of(version));
        }

        public PackageArgs build() {
            return $;
        }
    }

}