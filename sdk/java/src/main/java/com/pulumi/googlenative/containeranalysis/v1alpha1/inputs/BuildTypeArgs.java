// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1alpha1.inputs.BuildSignatureArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Note holding the version of the provider&#39;s builder and the signature of the provenance message in linked BuildDetails.
 * 
 */
public final class BuildTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildTypeArgs Empty = new BuildTypeArgs();

    /**
     * Version of the builder which produced this Note.
     * 
     */
    @Import(name="builderVersion")
    private @Nullable Output<String> builderVersion;

    /**
     * @return Version of the builder which produced this Note.
     * 
     */
    public Optional<Output<String>> builderVersion() {
        return Optional.ofNullable(this.builderVersion);
    }

    /**
     * Signature of the build in Occurrences pointing to the Note containing this `BuilderDetails`.
     * 
     */
    @Import(name="signature")
    private @Nullable Output<BuildSignatureArgs> signature;

    /**
     * @return Signature of the build in Occurrences pointing to the Note containing this `BuilderDetails`.
     * 
     */
    public Optional<Output<BuildSignatureArgs>> signature() {
        return Optional.ofNullable(this.signature);
    }

    private BuildTypeArgs() {}

    private BuildTypeArgs(BuildTypeArgs $) {
        this.builderVersion = $.builderVersion;
        this.signature = $.signature;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildTypeArgs $;

        public Builder() {
            $ = new BuildTypeArgs();
        }

        public Builder(BuildTypeArgs defaults) {
            $ = new BuildTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param builderVersion Version of the builder which produced this Note.
         * 
         * @return builder
         * 
         */
        public Builder builderVersion(@Nullable Output<String> builderVersion) {
            $.builderVersion = builderVersion;
            return this;
        }

        /**
         * @param builderVersion Version of the builder which produced this Note.
         * 
         * @return builder
         * 
         */
        public Builder builderVersion(String builderVersion) {
            return builderVersion(Output.of(builderVersion));
        }

        /**
         * @param signature Signature of the build in Occurrences pointing to the Note containing this `BuilderDetails`.
         * 
         * @return builder
         * 
         */
        public Builder signature(@Nullable Output<BuildSignatureArgs> signature) {
            $.signature = signature;
            return this;
        }

        /**
         * @param signature Signature of the build in Occurrences pointing to the Note containing this `BuilderDetails`.
         * 
         * @return builder
         * 
         */
        public Builder signature(BuildSignatureArgs signature) {
            return signature(Output.of(signature));
        }

        public BuildTypeArgs build() {
            return $;
        }
    }

}