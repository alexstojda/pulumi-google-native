// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs();

    /**
     * Collection of cryptographic digests for the contents of this artifact.
     * 
     */
    @Import(name="digest")
    private @Nullable Output<Map<String,String>> digest;

    /**
     * @return Collection of cryptographic digests for the contents of this artifact.
     * 
     */
    public Optional<Output<Map<String,String>>> digest() {
        return Optional.ofNullable(this.digest);
    }

    /**
     * The method by which this artifact was referenced during the build.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The method by which this artifact was referenced during the build.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs() {}

    private GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs(GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs $) {
        this.digest = $.digest;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs $;

        public Builder() {
            $ = new GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs();
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs defaults) {
            $ = new GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param digest Collection of cryptographic digests for the contents of this artifact.
         * 
         * @return builder
         * 
         */
        public Builder digest(@Nullable Output<Map<String,String>> digest) {
            $.digest = digest;
            return this;
        }

        /**
         * @param digest Collection of cryptographic digests for the contents of this artifact.
         * 
         * @return builder
         * 
         */
        public Builder digest(Map<String,String> digest) {
            return digest(Output.of(digest));
        }

        /**
         * @param uri The method by which this artifact was referenced during the build.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The method by which this artifact was referenced during the build.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public GoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaMaterialArgs build() {
            return $;
        }
    }

}