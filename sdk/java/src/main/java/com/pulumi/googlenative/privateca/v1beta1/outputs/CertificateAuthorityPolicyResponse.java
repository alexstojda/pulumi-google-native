// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca.v1beta1.outputs.AllowedConfigListResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.AllowedSubjectAltNamesResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.IssuanceModesResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.ReusableConfigWrapperResponse;
import com.pulumi.googlenative.privateca.v1beta1.outputs.SubjectResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CertificateAuthorityPolicyResponse {
    /**
     * @return Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
     * 
     */
    private List<String> allowedCommonNames;
    /**
     * @return Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
     * 
     */
    private AllowedConfigListResponse allowedConfigList;
    /**
     * @return Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
     */
    private IssuanceModesResponse allowedIssuanceModes;
    /**
     * @return Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
     * 
     */
    private List<SubjectResponse> allowedLocationsAndOrganizations;
    /**
     * @return Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
     * 
     */
    private AllowedSubjectAltNamesResponse allowedSans;
    /**
     * @return Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate&#39;s requested maximum_lifetime, the effective lifetime will be explicitly truncated.
     * 
     */
    private String maximumLifetime;
    /**
     * @return Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
     * 
     */
    private ReusableConfigWrapperResponse overwriteConfigValues;

    private CertificateAuthorityPolicyResponse() {}
    /**
     * @return Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
     * 
     */
    public List<String> allowedCommonNames() {
        return this.allowedCommonNames;
    }
    /**
     * @return Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
     * 
     */
    public AllowedConfigListResponse allowedConfigList() {
        return this.allowedConfigList;
    }
    /**
     * @return Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
     */
    public IssuanceModesResponse allowedIssuanceModes() {
        return this.allowedIssuanceModes;
    }
    /**
     * @return Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
     * 
     */
    public List<SubjectResponse> allowedLocationsAndOrganizations() {
        return this.allowedLocationsAndOrganizations;
    }
    /**
     * @return Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
     * 
     */
    public AllowedSubjectAltNamesResponse allowedSans() {
        return this.allowedSans;
    }
    /**
     * @return Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate&#39;s requested maximum_lifetime, the effective lifetime will be explicitly truncated.
     * 
     */
    public String maximumLifetime() {
        return this.maximumLifetime;
    }
    /**
     * @return Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
     * 
     */
    public ReusableConfigWrapperResponse overwriteConfigValues() {
        return this.overwriteConfigValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityPolicyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedCommonNames;
        private AllowedConfigListResponse allowedConfigList;
        private IssuanceModesResponse allowedIssuanceModes;
        private List<SubjectResponse> allowedLocationsAndOrganizations;
        private AllowedSubjectAltNamesResponse allowedSans;
        private String maximumLifetime;
        private ReusableConfigWrapperResponse overwriteConfigValues;
        public Builder() {}
        public Builder(CertificateAuthorityPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCommonNames = defaults.allowedCommonNames;
    	      this.allowedConfigList = defaults.allowedConfigList;
    	      this.allowedIssuanceModes = defaults.allowedIssuanceModes;
    	      this.allowedLocationsAndOrganizations = defaults.allowedLocationsAndOrganizations;
    	      this.allowedSans = defaults.allowedSans;
    	      this.maximumLifetime = defaults.maximumLifetime;
    	      this.overwriteConfigValues = defaults.overwriteConfigValues;
        }

        @CustomType.Setter
        public Builder allowedCommonNames(List<String> allowedCommonNames) {
            this.allowedCommonNames = Objects.requireNonNull(allowedCommonNames);
            return this;
        }
        public Builder allowedCommonNames(String... allowedCommonNames) {
            return allowedCommonNames(List.of(allowedCommonNames));
        }
        @CustomType.Setter
        public Builder allowedConfigList(AllowedConfigListResponse allowedConfigList) {
            this.allowedConfigList = Objects.requireNonNull(allowedConfigList);
            return this;
        }
        @CustomType.Setter
        public Builder allowedIssuanceModes(IssuanceModesResponse allowedIssuanceModes) {
            this.allowedIssuanceModes = Objects.requireNonNull(allowedIssuanceModes);
            return this;
        }
        @CustomType.Setter
        public Builder allowedLocationsAndOrganizations(List<SubjectResponse> allowedLocationsAndOrganizations) {
            this.allowedLocationsAndOrganizations = Objects.requireNonNull(allowedLocationsAndOrganizations);
            return this;
        }
        public Builder allowedLocationsAndOrganizations(SubjectResponse... allowedLocationsAndOrganizations) {
            return allowedLocationsAndOrganizations(List.of(allowedLocationsAndOrganizations));
        }
        @CustomType.Setter
        public Builder allowedSans(AllowedSubjectAltNamesResponse allowedSans) {
            this.allowedSans = Objects.requireNonNull(allowedSans);
            return this;
        }
        @CustomType.Setter
        public Builder maximumLifetime(String maximumLifetime) {
            this.maximumLifetime = Objects.requireNonNull(maximumLifetime);
            return this;
        }
        @CustomType.Setter
        public Builder overwriteConfigValues(ReusableConfigWrapperResponse overwriteConfigValues) {
            this.overwriteConfigValues = Objects.requireNonNull(overwriteConfigValues);
            return this;
        }
        public CertificateAuthorityPolicyResponse build() {
            final var o = new CertificateAuthorityPolicyResponse();
            o.allowedCommonNames = allowedCommonNames;
            o.allowedConfigList = allowedConfigList;
            o.allowedIssuanceModes = allowedIssuanceModes;
            o.allowedLocationsAndOrganizations = allowedLocationsAndOrganizations;
            o.allowedSans = allowedSans;
            o.maximumLifetime = maximumLifetime;
            o.overwriteConfigValues = overwriteConfigValues;
            return o;
        }
    }
}