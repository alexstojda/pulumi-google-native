// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Options that affect all certificates issued by a CertificateAuthority.
 * 
 */
public final class IssuingOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final IssuingOptionsArgs Empty = new IssuingOptionsArgs();

    /**
     * When true, includes a URL to the issuing CA certificate in the &#34;authority information access&#34; X.509 extension.
     * 
     */
    @Import(name="includeCaCertUrl", required=true)
    private Output<Boolean> includeCaCertUrl;

    /**
     * @return When true, includes a URL to the issuing CA certificate in the &#34;authority information access&#34; X.509 extension.
     * 
     */
    public Output<Boolean> includeCaCertUrl() {
        return this.includeCaCertUrl;
    }

    /**
     * When true, includes a URL to the CRL corresponding to certificates issued from a CertificateAuthority. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
     * 
     */
    @Import(name="includeCrlAccessUrl", required=true)
    private Output<Boolean> includeCrlAccessUrl;

    /**
     * @return When true, includes a URL to the CRL corresponding to certificates issued from a CertificateAuthority. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
     * 
     */
    public Output<Boolean> includeCrlAccessUrl() {
        return this.includeCrlAccessUrl;
    }

    private IssuingOptionsArgs() {}

    private IssuingOptionsArgs(IssuingOptionsArgs $) {
        this.includeCaCertUrl = $.includeCaCertUrl;
        this.includeCrlAccessUrl = $.includeCrlAccessUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IssuingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IssuingOptionsArgs $;

        public Builder() {
            $ = new IssuingOptionsArgs();
        }

        public Builder(IssuingOptionsArgs defaults) {
            $ = new IssuingOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeCaCertUrl When true, includes a URL to the issuing CA certificate in the &#34;authority information access&#34; X.509 extension.
         * 
         * @return builder
         * 
         */
        public Builder includeCaCertUrl(Output<Boolean> includeCaCertUrl) {
            $.includeCaCertUrl = includeCaCertUrl;
            return this;
        }

        /**
         * @param includeCaCertUrl When true, includes a URL to the issuing CA certificate in the &#34;authority information access&#34; X.509 extension.
         * 
         * @return builder
         * 
         */
        public Builder includeCaCertUrl(Boolean includeCaCertUrl) {
            return includeCaCertUrl(Output.of(includeCaCertUrl));
        }

        /**
         * @param includeCrlAccessUrl When true, includes a URL to the CRL corresponding to certificates issued from a CertificateAuthority. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
         * 
         * @return builder
         * 
         */
        public Builder includeCrlAccessUrl(Output<Boolean> includeCrlAccessUrl) {
            $.includeCrlAccessUrl = includeCrlAccessUrl;
            return this;
        }

        /**
         * @param includeCrlAccessUrl When true, includes a URL to the CRL corresponding to certificates issued from a CertificateAuthority. CRLs will expire 7 days from their creation. However, we will rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
         * 
         * @return builder
         * 
         */
        public Builder includeCrlAccessUrl(Boolean includeCrlAccessUrl) {
            return includeCrlAccessUrl(Output.of(includeCrlAccessUrl));
        }

        public IssuingOptionsArgs build() {
            $.includeCaCertUrl = Objects.requireNonNull($.includeCaCertUrl, "expected parameter 'includeCaCertUrl' to be non-null");
            $.includeCrlAccessUrl = Objects.requireNonNull($.includeCrlAccessUrl, "expected parameter 'includeCrlAccessUrl' to be non-null");
            return $;
        }
    }

}