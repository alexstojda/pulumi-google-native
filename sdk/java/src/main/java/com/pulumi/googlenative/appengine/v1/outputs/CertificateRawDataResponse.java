// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateRawDataResponse {
    /**
     * @return Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
     * 
     */
    private String privateKey;
    /**
     * @return PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END CERTIFICATE-----
     * 
     */
    private String publicCertificate;

    private CertificateRawDataResponse() {}
    /**
     * @return Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }
    /**
     * @return PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END CERTIFICATE-----
     * 
     */
    public String publicCertificate() {
        return this.publicCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateRawDataResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String privateKey;
        private String publicCertificate;
        public Builder() {}
        public Builder(CertificateRawDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateKey = defaults.privateKey;
    	      this.publicCertificate = defaults.publicCertificate;
        }

        @CustomType.Setter
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        @CustomType.Setter
        public Builder publicCertificate(String publicCertificate) {
            this.publicCertificate = Objects.requireNonNull(publicCertificate);
            return this;
        }
        public CertificateRawDataResponse build() {
            final var o = new CertificateRawDataResponse();
            o.privateKey = privateKey;
            o.publicCertificate = publicCertificate;
            return o;
        }
    }
}