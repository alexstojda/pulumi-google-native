// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca.v1beta1.outputs.CertificateFingerprintResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.KeyIdResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.PublicKeyResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.ReusableConfigValuesResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.SubjectDescriptionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CertificateDescriptionResponse {
    /**
     * @return Describes lists of issuer CA certificate URLs that appear in the &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    private List<String> aiaIssuingCertificateUrls;
    /**
     * @return Identifies the subject_key_id of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1
     * 
     */
    private KeyIdResponse authorityKeyId;
    /**
     * @return The hash of the x.509 certificate.
     * 
     */
    private CertificateFingerprintResponse certFingerprint;
    /**
     * @return Describes some of the technical fields in a certificate.
     * 
     */
    private ReusableConfigValuesResponse configValues;
    /**
     * @return Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13
     * 
     */
    private List<String> crlDistributionPoints;
    /**
     * @return The public key that corresponds to an issued certificate.
     * 
     */
    private PublicKeyResponse publicKey;
    /**
     * @return Describes some of the values in a certificate that are related to the subject and lifetime.
     * 
     */
    private SubjectDescriptionResponse subjectDescription;
    /**
     * @return Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2.
     * 
     */
    private KeyIdResponse subjectKeyId;

    private CertificateDescriptionResponse() {}
    /**
     * @return Describes lists of issuer CA certificate URLs that appear in the &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public List<String> aiaIssuingCertificateUrls() {
        return this.aiaIssuingCertificateUrls;
    }
    /**
     * @return Identifies the subject_key_id of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1
     * 
     */
    public KeyIdResponse authorityKeyId() {
        return this.authorityKeyId;
    }
    /**
     * @return The hash of the x.509 certificate.
     * 
     */
    public CertificateFingerprintResponse certFingerprint() {
        return this.certFingerprint;
    }
    /**
     * @return Describes some of the technical fields in a certificate.
     * 
     */
    public ReusableConfigValuesResponse configValues() {
        return this.configValues;
    }
    /**
     * @return Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13
     * 
     */
    public List<String> crlDistributionPoints() {
        return this.crlDistributionPoints;
    }
    /**
     * @return The public key that corresponds to an issued certificate.
     * 
     */
    public PublicKeyResponse publicKey() {
        return this.publicKey;
    }
    /**
     * @return Describes some of the values in a certificate that are related to the subject and lifetime.
     * 
     */
    public SubjectDescriptionResponse subjectDescription() {
        return this.subjectDescription;
    }
    /**
     * @return Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2.
     * 
     */
    public KeyIdResponse subjectKeyId() {
        return this.subjectKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateDescriptionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> aiaIssuingCertificateUrls;
        private KeyIdResponse authorityKeyId;
        private CertificateFingerprintResponse certFingerprint;
        private ReusableConfigValuesResponse configValues;
        private List<String> crlDistributionPoints;
        private PublicKeyResponse publicKey;
        private SubjectDescriptionResponse subjectDescription;
        private KeyIdResponse subjectKeyId;
        public Builder() {}
        public Builder(CertificateDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aiaIssuingCertificateUrls = defaults.aiaIssuingCertificateUrls;
    	      this.authorityKeyId = defaults.authorityKeyId;
    	      this.certFingerprint = defaults.certFingerprint;
    	      this.configValues = defaults.configValues;
    	      this.crlDistributionPoints = defaults.crlDistributionPoints;
    	      this.publicKey = defaults.publicKey;
    	      this.subjectDescription = defaults.subjectDescription;
    	      this.subjectKeyId = defaults.subjectKeyId;
        }

        @CustomType.Setter
        public Builder aiaIssuingCertificateUrls(List<String> aiaIssuingCertificateUrls) {
            this.aiaIssuingCertificateUrls = Objects.requireNonNull(aiaIssuingCertificateUrls);
            return this;
        }
        public Builder aiaIssuingCertificateUrls(String... aiaIssuingCertificateUrls) {
            return aiaIssuingCertificateUrls(List.of(aiaIssuingCertificateUrls));
        }
        @CustomType.Setter
        public Builder authorityKeyId(KeyIdResponse authorityKeyId) {
            this.authorityKeyId = Objects.requireNonNull(authorityKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder certFingerprint(CertificateFingerprintResponse certFingerprint) {
            this.certFingerprint = Objects.requireNonNull(certFingerprint);
            return this;
        }
        @CustomType.Setter
        public Builder configValues(ReusableConfigValuesResponse configValues) {
            this.configValues = Objects.requireNonNull(configValues);
            return this;
        }
        @CustomType.Setter
        public Builder crlDistributionPoints(List<String> crlDistributionPoints) {
            this.crlDistributionPoints = Objects.requireNonNull(crlDistributionPoints);
            return this;
        }
        public Builder crlDistributionPoints(String... crlDistributionPoints) {
            return crlDistributionPoints(List.of(crlDistributionPoints));
        }
        @CustomType.Setter
        public Builder publicKey(PublicKeyResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        @CustomType.Setter
        public Builder subjectDescription(SubjectDescriptionResponse subjectDescription) {
            this.subjectDescription = Objects.requireNonNull(subjectDescription);
            return this;
        }
        @CustomType.Setter
        public Builder subjectKeyId(KeyIdResponse subjectKeyId) {
            this.subjectKeyId = Objects.requireNonNull(subjectKeyId);
            return this;
        }
        public CertificateDescriptionResponse build() {
            final var o = new CertificateDescriptionResponse();
            o.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
            o.authorityKeyId = authorityKeyId;
            o.certFingerprint = certFingerprint;
            o.configValues = configValues;
            o.crlDistributionPoints = crlDistributionPoints;
            o.publicKey = publicKey;
            o.subjectDescription = subjectDescription;
            o.subjectKeyId = subjectKeyId;
            return o;
        }
    }
}