// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an SAML 2.0 identity provider.
 * 
 */
public final class SamlArgs extends com.pulumi.resources.ResourceArgs {

    public static final SamlArgs Empty = new SamlArgs();

    /**
     * SAML Identity provider configuration metadata xml doc. The xml document should comply with [SAML 2.0 specification](https://www.oasis-open.org/committees/download.php/56785/sstc-saml-metadata-errata-2.0-wd-05.pdf). The max size of the acceptable xml document will be bounded to 128k characters. The metadata xml document should satisfy the following constraints: 1) Must contain an Identity Provider Entity ID. 2) Must contain at least one non-expired signing key certificate. 3) For each signing key: a) Valid from should be no more than 7 days from now. b) Valid to should be no more than 10 years in the future. 4) Upto 3 IdP signing keys are allowed in the metadata xml. When updating the provider&#39;s metadata xml, at lease one non-expired signing key must overlap with the existing metadata. This requirement is skipped if there are no non-expired signing keys present in the existing metadata
     * 
     */
    @Import(name="idpMetadataXml", required=true)
    private Output<String> idpMetadataXml;

    /**
     * @return SAML Identity provider configuration metadata xml doc. The xml document should comply with [SAML 2.0 specification](https://www.oasis-open.org/committees/download.php/56785/sstc-saml-metadata-errata-2.0-wd-05.pdf). The max size of the acceptable xml document will be bounded to 128k characters. The metadata xml document should satisfy the following constraints: 1) Must contain an Identity Provider Entity ID. 2) Must contain at least one non-expired signing key certificate. 3) For each signing key: a) Valid from should be no more than 7 days from now. b) Valid to should be no more than 10 years in the future. 4) Upto 3 IdP signing keys are allowed in the metadata xml. When updating the provider&#39;s metadata xml, at lease one non-expired signing key must overlap with the existing metadata. This requirement is skipped if there are no non-expired signing keys present in the existing metadata
     * 
     */
    public Output<String> idpMetadataXml() {
        return this.idpMetadataXml;
    }

    private SamlArgs() {}

    private SamlArgs(SamlArgs $) {
        this.idpMetadataXml = $.idpMetadataXml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SamlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SamlArgs $;

        public Builder() {
            $ = new SamlArgs();
        }

        public Builder(SamlArgs defaults) {
            $ = new SamlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param idpMetadataXml SAML Identity provider configuration metadata xml doc. The xml document should comply with [SAML 2.0 specification](https://www.oasis-open.org/committees/download.php/56785/sstc-saml-metadata-errata-2.0-wd-05.pdf). The max size of the acceptable xml document will be bounded to 128k characters. The metadata xml document should satisfy the following constraints: 1) Must contain an Identity Provider Entity ID. 2) Must contain at least one non-expired signing key certificate. 3) For each signing key: a) Valid from should be no more than 7 days from now. b) Valid to should be no more than 10 years in the future. 4) Upto 3 IdP signing keys are allowed in the metadata xml. When updating the provider&#39;s metadata xml, at lease one non-expired signing key must overlap with the existing metadata. This requirement is skipped if there are no non-expired signing keys present in the existing metadata
         * 
         * @return builder
         * 
         */
        public Builder idpMetadataXml(Output<String> idpMetadataXml) {
            $.idpMetadataXml = idpMetadataXml;
            return this;
        }

        /**
         * @param idpMetadataXml SAML Identity provider configuration metadata xml doc. The xml document should comply with [SAML 2.0 specification](https://www.oasis-open.org/committees/download.php/56785/sstc-saml-metadata-errata-2.0-wd-05.pdf). The max size of the acceptable xml document will be bounded to 128k characters. The metadata xml document should satisfy the following constraints: 1) Must contain an Identity Provider Entity ID. 2) Must contain at least one non-expired signing key certificate. 3) For each signing key: a) Valid from should be no more than 7 days from now. b) Valid to should be no more than 10 years in the future. 4) Upto 3 IdP signing keys are allowed in the metadata xml. When updating the provider&#39;s metadata xml, at lease one non-expired signing key must overlap with the existing metadata. This requirement is skipped if there are no non-expired signing keys present in the existing metadata
         * 
         * @return builder
         * 
         */
        public Builder idpMetadataXml(String idpMetadataXml) {
            return idpMetadataXml(Output.of(idpMetadataXml));
        }

        public SamlArgs build() {
            $.idpMetadataXml = Objects.requireNonNull($.idpMetadataXml, "expected parameter 'idpMetadataXml' to be non-null");
            return $;
        }
    }

}