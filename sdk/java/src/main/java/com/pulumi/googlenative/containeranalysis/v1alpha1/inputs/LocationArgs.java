// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.VersionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An occurrence of a particular package installation found within a system&#39;s filesystem. e.g. glibc was found in /var/lib/dpkg/status
 * 
 */
public final class LocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationArgs Empty = new LocationArgs();

    /**
     * Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     * @deprecated
     * Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    @Deprecated /* Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. */
    @Import(name="cpeUri")
    private @Nullable Output<String> cpeUri;

    /**
     * @return Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     * @deprecated
     * Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    @Deprecated /* Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. */
    public Optional<Output<String>> cpeUri() {
        return Optional.ofNullable(this.cpeUri);
    }

    /**
     * The path from which we gathered that this package/version is installed.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path from which we gathered that this package/version is installed.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Deprecated. The version installed at this location.
     * 
     * @deprecated
     * Deprecated. The version installed at this location.
     * 
     */
    @Deprecated /* Deprecated. The version installed at this location. */
    @Import(name="version")
    private @Nullable Output<VersionArgs> version;

    /**
     * @return Deprecated. The version installed at this location.
     * 
     * @deprecated
     * Deprecated. The version installed at this location.
     * 
     */
    @Deprecated /* Deprecated. The version installed at this location. */
    public Optional<Output<VersionArgs>> version() {
        return Optional.ofNullable(this.version);
    }

    private LocationArgs() {}

    private LocationArgs(LocationArgs $) {
        this.cpeUri = $.cpeUri;
        this.path = $.path;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationArgs $;

        public Builder() {
            $ = new LocationArgs();
        }

        public Builder(LocationArgs defaults) {
            $ = new LocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpeUri Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
         * 
         */
        @Deprecated /* Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. */
        public Builder cpeUri(@Nullable Output<String> cpeUri) {
            $.cpeUri = cpeUri;
            return this;
        }

        /**
         * @param cpeUri Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
         * 
         */
        @Deprecated /* Deprecated. The cpe_uri in [cpe format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package. */
        public Builder cpeUri(String cpeUri) {
            return cpeUri(Output.of(cpeUri));
        }

        /**
         * @param path The path from which we gathered that this package/version is installed.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path from which we gathered that this package/version is installed.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param version Deprecated. The version installed at this location.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The version installed at this location.
         * 
         */
        @Deprecated /* Deprecated. The version installed at this location. */
        public Builder version(@Nullable Output<VersionArgs> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Deprecated. The version installed at this location.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated. The version installed at this location.
         * 
         */
        @Deprecated /* Deprecated. The version installed at this location. */
        public Builder version(VersionArgs version) {
            return version(Output.of(version));
        }

        public LocationArgs build() {
            return $;
        }
    }

}