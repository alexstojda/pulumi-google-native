// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SslSettingsResponse {
    /**
     * @return ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    private String certificateId;
    /**
     * @return ID of the managed AuthorizedCertificate resource currently being provisioned, if applicable. Until the new managed certificate has been successfully provisioned, the previous SSL state will be preserved. Once the provisioning process completes, the certificate_id field will reflect the new managed certificate and this field will be left empty. To remove SSL support while there is still a pending managed certificate, clear the certificate_id field with an UpdateDomainMappingRequest.
     * 
     */
    private String pendingManagedCertificateId;
    /**
     * @return SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
     * 
     */
    private String sslManagementType;

    private SslSettingsResponse() {}
    /**
     * @return ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    public String certificateId() {
        return this.certificateId;
    }
    /**
     * @return ID of the managed AuthorizedCertificate resource currently being provisioned, if applicable. Until the new managed certificate has been successfully provisioned, the previous SSL state will be preserved. Once the provisioning process completes, the certificate_id field will reflect the new managed certificate and this field will be left empty. To remove SSL support while there is still a pending managed certificate, clear the certificate_id field with an UpdateDomainMappingRequest.
     * 
     */
    public String pendingManagedCertificateId() {
        return this.pendingManagedCertificateId;
    }
    /**
     * @return SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
     * 
     */
    public String sslManagementType() {
        return this.sslManagementType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslSettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateId;
        private String pendingManagedCertificateId;
        private String sslManagementType;
        public Builder() {}
        public Builder(SslSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.pendingManagedCertificateId = defaults.pendingManagedCertificateId;
    	      this.sslManagementType = defaults.sslManagementType;
        }

        @CustomType.Setter
        public Builder certificateId(String certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }
        @CustomType.Setter
        public Builder pendingManagedCertificateId(String pendingManagedCertificateId) {
            this.pendingManagedCertificateId = Objects.requireNonNull(pendingManagedCertificateId);
            return this;
        }
        @CustomType.Setter
        public Builder sslManagementType(String sslManagementType) {
            this.sslManagementType = Objects.requireNonNull(sslManagementType);
            return this;
        }
        public SslSettingsResponse build() {
            final var o = new SslSettingsResponse();
            o.certificateId = certificateId;
            o.pendingManagedCertificateId = pendingManagedCertificateId;
            o.sslManagementType = sslManagementType;
            return o;
        }
    }
}