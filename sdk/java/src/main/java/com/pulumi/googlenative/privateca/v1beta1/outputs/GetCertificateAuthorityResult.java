// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca.v1beta1.outputs.AccessUrlsResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.CertificateAuthorityPolicyResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.CertificateConfigResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.CertificateDescriptionResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.IssuingOptionsResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.KeyVersionSpecResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.SubordinateConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCertificateAuthorityResult {
    /**
     * @return URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
     */
    private AccessUrlsResponse accessUrls;
    /**
     * @return A structured description of this CertificateAuthority&#39;s CA certificate and its issuers. Ordered as self-to-root.
     * 
     */
    private List<CertificateDescriptionResponse> caCertificateDescriptions;
    /**
     * @return Optional. The CertificateAuthorityPolicy to enforce when issuing Certificates from this CertificateAuthority.
     * 
     */
    private CertificateAuthorityPolicyResponse certificatePolicy;
    /**
     * @return Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    private CertificateConfigResponse config;
    /**
     * @return The time at which this CertificateAuthority was created.
     * 
     */
    private String createTime;
    /**
     * @return The time at which this CertificateAuthority will be deleted, if scheduled for deletion.
     * 
     */
    private String deleteTime;
    /**
     * @return Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    private String gcsBucket;
    /**
     * @return Optional. The IssuingOptions to follow when issuing Certificates from this CertificateAuthority.
     * 
     */
    private IssuingOptionsResponse issuingOptions;
    /**
     * @return Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    private KeyVersionSpecResponse keySpec;
    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The desired lifetime of the CA certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate.
     * 
     */
    private String lifetime;
    /**
     * @return The resource name for this CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}certificateAuthorities/*`.
     * 
     */
    private String name;
    /**
     * @return This CertificateAuthority&#39;s certificate chain, including the current CertificateAuthority&#39;s certificate. Ordered such that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority&#39;s certificate.
     * 
     */
    private List<String> pemCaCertificates;
    /**
     * @return The State for this CertificateAuthority.
     * 
     */
    private String state;
    /**
     * @return Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    private SubordinateConfigResponse subordinateConfig;
    /**
     * @return Immutable. The Tier of this CertificateAuthority.
     * 
     */
    private String tier;
    /**
     * @return Immutable. The Type of this CertificateAuthority.
     * 
     */
    private String type;
    /**
     * @return The time at which this CertificateAuthority was updated.
     * 
     */
    private String updateTime;

    private GetCertificateAuthorityResult() {}
    /**
     * @return URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
     */
    public AccessUrlsResponse accessUrls() {
        return this.accessUrls;
    }
    /**
     * @return A structured description of this CertificateAuthority&#39;s CA certificate and its issuers. Ordered as self-to-root.
     * 
     */
    public List<CertificateDescriptionResponse> caCertificateDescriptions() {
        return this.caCertificateDescriptions;
    }
    /**
     * @return Optional. The CertificateAuthorityPolicy to enforce when issuing Certificates from this CertificateAuthority.
     * 
     */
    public CertificateAuthorityPolicyResponse certificatePolicy() {
        return this.certificatePolicy;
    }
    /**
     * @return Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    public CertificateConfigResponse config() {
        return this.config;
    }
    /**
     * @return The time at which this CertificateAuthority was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The time at which this CertificateAuthority will be deleted, if scheduled for deletion.
     * 
     */
    public String deleteTime() {
        return this.deleteTime;
    }
    /**
     * @return Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    public String gcsBucket() {
        return this.gcsBucket;
    }
    /**
     * @return Optional. The IssuingOptions to follow when issuing Certificates from this CertificateAuthority.
     * 
     */
    public IssuingOptionsResponse issuingOptions() {
        return this.issuingOptions;
    }
    /**
     * @return Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    public KeyVersionSpecResponse keySpec() {
        return this.keySpec;
    }
    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The desired lifetime of the CA certificate. Used to create the &#34;not_before_time&#34; and &#34;not_after_time&#34; fields inside an X.509 certificate.
     * 
     */
    public String lifetime() {
        return this.lifetime;
    }
    /**
     * @return The resource name for this CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}certificateAuthorities/*`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return This CertificateAuthority&#39;s certificate chain, including the current CertificateAuthority&#39;s certificate. Ordered such that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority&#39;s certificate.
     * 
     */
    public List<String> pemCaCertificates() {
        return this.pemCaCertificates;
    }
    /**
     * @return The State for this CertificateAuthority.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    public SubordinateConfigResponse subordinateConfig() {
        return this.subordinateConfig;
    }
    /**
     * @return Immutable. The Tier of this CertificateAuthority.
     * 
     */
    public String tier() {
        return this.tier;
    }
    /**
     * @return Immutable. The Type of this CertificateAuthority.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The time at which this CertificateAuthority was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AccessUrlsResponse accessUrls;
        private List<CertificateDescriptionResponse> caCertificateDescriptions;
        private CertificateAuthorityPolicyResponse certificatePolicy;
        private CertificateConfigResponse config;
        private String createTime;
        private String deleteTime;
        private String gcsBucket;
        private IssuingOptionsResponse issuingOptions;
        private KeyVersionSpecResponse keySpec;
        private Map<String,String> labels;
        private String lifetime;
        private String name;
        private List<String> pemCaCertificates;
        private String state;
        private SubordinateConfigResponse subordinateConfig;
        private String tier;
        private String type;
        private String updateTime;
        public Builder() {}
        public Builder(GetCertificateAuthorityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessUrls = defaults.accessUrls;
    	      this.caCertificateDescriptions = defaults.caCertificateDescriptions;
    	      this.certificatePolicy = defaults.certificatePolicy;
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.gcsBucket = defaults.gcsBucket;
    	      this.issuingOptions = defaults.issuingOptions;
    	      this.keySpec = defaults.keySpec;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.name = defaults.name;
    	      this.pemCaCertificates = defaults.pemCaCertificates;
    	      this.state = defaults.state;
    	      this.subordinateConfig = defaults.subordinateConfig;
    	      this.tier = defaults.tier;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder accessUrls(AccessUrlsResponse accessUrls) {
            this.accessUrls = Objects.requireNonNull(accessUrls);
            return this;
        }
        @CustomType.Setter
        public Builder caCertificateDescriptions(List<CertificateDescriptionResponse> caCertificateDescriptions) {
            this.caCertificateDescriptions = Objects.requireNonNull(caCertificateDescriptions);
            return this;
        }
        public Builder caCertificateDescriptions(CertificateDescriptionResponse... caCertificateDescriptions) {
            return caCertificateDescriptions(List.of(caCertificateDescriptions));
        }
        @CustomType.Setter
        public Builder certificatePolicy(CertificateAuthorityPolicyResponse certificatePolicy) {
            this.certificatePolicy = Objects.requireNonNull(certificatePolicy);
            return this;
        }
        @CustomType.Setter
        public Builder config(CertificateConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }
        @CustomType.Setter
        public Builder gcsBucket(String gcsBucket) {
            this.gcsBucket = Objects.requireNonNull(gcsBucket);
            return this;
        }
        @CustomType.Setter
        public Builder issuingOptions(IssuingOptionsResponse issuingOptions) {
            this.issuingOptions = Objects.requireNonNull(issuingOptions);
            return this;
        }
        @CustomType.Setter
        public Builder keySpec(KeyVersionSpecResponse keySpec) {
            this.keySpec = Objects.requireNonNull(keySpec);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder lifetime(String lifetime) {
            this.lifetime = Objects.requireNonNull(lifetime);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder pemCaCertificates(List<String> pemCaCertificates) {
            this.pemCaCertificates = Objects.requireNonNull(pemCaCertificates);
            return this;
        }
        public Builder pemCaCertificates(String... pemCaCertificates) {
            return pemCaCertificates(List.of(pemCaCertificates));
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder subordinateConfig(SubordinateConfigResponse subordinateConfig) {
            this.subordinateConfig = Objects.requireNonNull(subordinateConfig);
            return this;
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetCertificateAuthorityResult build() {
            final var o = new GetCertificateAuthorityResult();
            o.accessUrls = accessUrls;
            o.caCertificateDescriptions = caCertificateDescriptions;
            o.certificatePolicy = certificatePolicy;
            o.config = config;
            o.createTime = createTime;
            o.deleteTime = deleteTime;
            o.gcsBucket = gcsBucket;
            o.issuingOptions = issuingOptions;
            o.keySpec = keySpec;
            o.labels = labels;
            o.lifetime = lifetime;
            o.name = name;
            o.pemCaCertificates = pemCaCertificates;
            o.state = state;
            o.subordinateConfig = subordinateConfig;
            o.tier = tier;
            o.type = type;
            o.updateTime = updateTime;
            return o;
        }
    }
}