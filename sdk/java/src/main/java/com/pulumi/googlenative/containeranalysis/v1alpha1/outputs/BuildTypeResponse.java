// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1alpha1.outputs.BuildSignatureResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BuildTypeResponse {
    /**
     * @return Version of the builder which produced this Note.
     * 
     */
    private String builderVersion;
    /**
     * @return Signature of the build in Occurrences pointing to the Note containing this `BuilderDetails`.
     * 
     */
    private BuildSignatureResponse signature;

    private BuildTypeResponse() {}
    /**
     * @return Version of the builder which produced this Note.
     * 
     */
    public String builderVersion() {
        return this.builderVersion;
    }
    /**
     * @return Signature of the build in Occurrences pointing to the Note containing this `BuilderDetails`.
     * 
     */
    public BuildSignatureResponse signature() {
        return this.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildTypeResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String builderVersion;
        private BuildSignatureResponse signature;
        public Builder() {}
        public Builder(BuildTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
    	      this.signature = defaults.signature;
        }

        @CustomType.Setter
        public Builder builderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }
        @CustomType.Setter
        public Builder signature(BuildSignatureResponse signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }
        public BuildTypeResponse build() {
            final var o = new BuildTypeResponse();
            o.builderVersion = builderVersion;
            o.signature = signature;
            return o;
        }
    }
}