// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1beta1.inputs.FingerprintArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Basis describes the base image portion (Note) of the DockerImage relationship. Linked occurrences are derived from this or an equivalent image via: FROM Or an equivalent reference, e.g. a tag of the resource_url.
 * 
 */
public final class BasisArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasisArgs Empty = new BasisArgs();

    /**
     * Immutable. The fingerprint of the base image.
     * 
     */
    @Import(name="fingerprint", required=true)
    private Output<FingerprintArgs> fingerprint;

    /**
     * @return Immutable. The fingerprint of the base image.
     * 
     */
    public Output<FingerprintArgs> fingerprint() {
        return this.fingerprint;
    }

    /**
     * Immutable. The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    @Import(name="resourceUrl", required=true)
    private Output<String> resourceUrl;

    /**
     * @return Immutable. The resource_url for the resource representing the basis of associated occurrence images.
     * 
     */
    public Output<String> resourceUrl() {
        return this.resourceUrl;
    }

    private BasisArgs() {}

    private BasisArgs(BasisArgs $) {
        this.fingerprint = $.fingerprint;
        this.resourceUrl = $.resourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasisArgs $;

        public Builder() {
            $ = new BasisArgs();
        }

        public Builder(BasisArgs defaults) {
            $ = new BasisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fingerprint Immutable. The fingerprint of the base image.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(Output<FingerprintArgs> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint Immutable. The fingerprint of the base image.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(FingerprintArgs fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param resourceUrl Immutable. The resource_url for the resource representing the basis of associated occurrence images.
         * 
         * @return builder
         * 
         */
        public Builder resourceUrl(Output<String> resourceUrl) {
            $.resourceUrl = resourceUrl;
            return this;
        }

        /**
         * @param resourceUrl Immutable. The resource_url for the resource representing the basis of associated occurrence images.
         * 
         * @return builder
         * 
         */
        public Builder resourceUrl(String resourceUrl) {
            return resourceUrl(Output.of(resourceUrl));
        }

        public BasisArgs build() {
            $.fingerprint = Objects.requireNonNull($.fingerprint, "expected parameter 'fingerprint' to be non-null");
            $.resourceUrl = Objects.requireNonNull($.resourceUrl, "expected parameter 'resourceUrl' to be non-null");
            return $;
        }
    }

}