// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1AddonsConfigResponse;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1PropertiesResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrganizationResult {
    /**
     * @return Addon configurations of the Apigee organization.
     * 
     */
    private GoogleCloudApigeeV1AddonsConfigResponse addonsConfig;
    /**
     * @return DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     * @deprecated
     * Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    @Deprecated /* Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org). */
    private String analyticsRegion;
    /**
     * @return Apigee Project ID associated with the organization. Use this project to allowlist Apigee in the Service Attachment when using private service connect with Apigee.
     * 
     */
    private String apigeeProjectId;
    /**
     * @return Not used by Apigee.
     * 
     */
    private List<String> attributes;
    /**
     * @return Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
     * 
     */
    private String authorizedNetwork;
    /**
     * @return Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    private String billingType;
    /**
     * @return Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when [RuntimeType](#RuntimeType) is `CLOUD`.
     * 
     */
    private String caCertificate;
    /**
     * @return Time that the Apigee organization was created in milliseconds since epoch.
     * 
     */
    private String createdAt;
    /**
     * @return Not used by Apigee.
     * 
     */
    private String customerName;
    /**
     * @return Description of the Apigee organization.
     * 
     */
    private String description;
    /**
     * @return Display name for the Apigee organization. Unused, but reserved for future use.
     * 
     */
    private String displayName;
    /**
     * @return List of environments in the Apigee organization.
     * 
     */
    private List<String> environments;
    /**
     * @return Time that the Apigee organization is scheduled for deletion.
     * 
     */
    private String expiresAt;
    /**
     * @return Time that the Apigee organization was last modified in milliseconds since epoch.
     * 
     */
    private String lastModifiedAt;
    /**
     * @return Name of the Apigee organization.
     * 
     */
    private String name;
    /**
     * @return Configuration for the Portals settings.
     * 
     */
    private Boolean portalDisabled;
    /**
     * @return Project ID associated with the Apigee organization.
     * 
     */
    private String project;
    /**
     * @return Properties defined in the Apigee organization profile.
     * 
     */
    private GoogleCloudApigeeV1PropertiesResponse properties;
    /**
     * @return Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: &#34;projects/foo/locations/us/keyRings/bar/cryptoKeys/baz&#34;. **Note:** Not supported for Apigee hybrid.
     * 
     */
    private String runtimeDatabaseEncryptionKeyName;
    /**
     * @return Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * 
     */
    private String runtimeType;
    /**
     * @return State of the organization. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    private String state;
    /**
     * @return DEPRECATED: This will eventually be replaced by BillingType. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation purposes only) or paid (full subscription has been purchased). See [Apigee pricing](https://cloud.google.com/apigee/pricing/).
     * 
     * @deprecated
     * Output only. DEPRECATED: This will eventually be replaced by BillingType. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation purposes only) or paid (full subscription has been purchased). See [Apigee pricing](https://cloud.google.com/apigee/pricing/).
     * 
     */
    @Deprecated /* Output only. DEPRECATED: This will eventually be replaced by BillingType. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation purposes only) or paid (full subscription has been purchased). See [Apigee pricing](https://cloud.google.com/apigee/pricing/). */
    private String subscriptionType;
    /**
     * @return Not used by Apigee.
     * 
     */
    private String type;

    private GetOrganizationResult() {}
    /**
     * @return Addon configurations of the Apigee organization.
     * 
     */
    public GoogleCloudApigeeV1AddonsConfigResponse addonsConfig() {
        return this.addonsConfig;
    }
    /**
     * @return DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     * @deprecated
     * Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    @Deprecated /* Required. DEPRECATED: This field will be deprecated once Apigee supports DRZ. Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org). */
    public String analyticsRegion() {
        return this.analyticsRegion;
    }
    /**
     * @return Apigee Project ID associated with the organization. Use this project to allowlist Apigee in the Service Attachment when using private service connect with Apigee.
     * 
     */
    public String apigeeProjectId() {
        return this.apigeeProjectId;
    }
    /**
     * @return Not used by Apigee.
     * 
     */
    public List<String> attributes() {
        return this.attributes;
    }
    /**
     * @return Compute Engine network used for Service Networking to be peered with Apigee runtime instances. See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started). Valid only when [RuntimeType](#RuntimeType) is set to `CLOUD`. The value must be set before the creation of a runtime instance and can be updated only when there are no runtime instances. For example: `default`. Apigee also supports shared VPC (that is, the host network project is not the same as the one that is peering with Apigee). See [Shared VPC overview](https://cloud.google.com/vpc/docs/shared-vpc). To use a shared VPC network, use the following format: `projects/{host-project-id}/{region}/networks/{network-name}`. For example: `projects/my-sharedvpc-host/global/networks/mynetwork` **Note:** Not supported for Apigee hybrid.
     * 
     */
    public String authorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * @return Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    public String billingType() {
        return this.billingType;
    }
    /**
     * @return Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when [RuntimeType](#RuntimeType) is `CLOUD`.
     * 
     */
    public String caCertificate() {
        return this.caCertificate;
    }
    /**
     * @return Time that the Apigee organization was created in milliseconds since epoch.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Not used by Apigee.
     * 
     */
    public String customerName() {
        return this.customerName;
    }
    /**
     * @return Description of the Apigee organization.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Display name for the Apigee organization. Unused, but reserved for future use.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return List of environments in the Apigee organization.
     * 
     */
    public List<String> environments() {
        return this.environments;
    }
    /**
     * @return Time that the Apigee organization is scheduled for deletion.
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return Time that the Apigee organization was last modified in milliseconds since epoch.
     * 
     */
    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * @return Name of the Apigee organization.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configuration for the Portals settings.
     * 
     */
    public Boolean portalDisabled() {
        return this.portalDisabled;
    }
    /**
     * @return Project ID associated with the Apigee organization.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Properties defined in the Apigee organization profile.
     * 
     */
    public GoogleCloudApigeeV1PropertiesResponse properties() {
        return this.properties;
    }
    /**
     * @return Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances. Update is not allowed after the organization is created. Required when [RuntimeType](#RuntimeType) is `CLOUD`. If not specified when [RuntimeType](#RuntimeType) is `TRIAL`, a Google-Managed encryption key will be used. For example: &#34;projects/foo/locations/us/keyRings/bar/cryptoKeys/baz&#34;. **Note:** Not supported for Apigee hybrid.
     * 
     */
    public String runtimeDatabaseEncryptionKeyName() {
        return this.runtimeDatabaseEncryptionKeyName;
    }
    /**
     * @return Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * 
     */
    public String runtimeType() {
        return this.runtimeType;
    }
    /**
     * @return State of the organization. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return DEPRECATED: This will eventually be replaced by BillingType. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation purposes only) or paid (full subscription has been purchased). See [Apigee pricing](https://cloud.google.com/apigee/pricing/).
     * 
     * @deprecated
     * Output only. DEPRECATED: This will eventually be replaced by BillingType. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation purposes only) or paid (full subscription has been purchased). See [Apigee pricing](https://cloud.google.com/apigee/pricing/).
     * 
     */
    @Deprecated /* Output only. DEPRECATED: This will eventually be replaced by BillingType. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation purposes only) or paid (full subscription has been purchased). See [Apigee pricing](https://cloud.google.com/apigee/pricing/). */
    public String subscriptionType() {
        return this.subscriptionType;
    }
    /**
     * @return Not used by Apigee.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudApigeeV1AddonsConfigResponse addonsConfig;
        private String analyticsRegion;
        private String apigeeProjectId;
        private List<String> attributes;
        private String authorizedNetwork;
        private String billingType;
        private String caCertificate;
        private String createdAt;
        private String customerName;
        private String description;
        private String displayName;
        private List<String> environments;
        private String expiresAt;
        private String lastModifiedAt;
        private String name;
        private Boolean portalDisabled;
        private String project;
        private GoogleCloudApigeeV1PropertiesResponse properties;
        private String runtimeDatabaseEncryptionKeyName;
        private String runtimeType;
        private String state;
        private String subscriptionType;
        private String type;
        public Builder() {}
        public Builder(GetOrganizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonsConfig = defaults.addonsConfig;
    	      this.analyticsRegion = defaults.analyticsRegion;
    	      this.apigeeProjectId = defaults.apigeeProjectId;
    	      this.attributes = defaults.attributes;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.billingType = defaults.billingType;
    	      this.caCertificate = defaults.caCertificate;
    	      this.createdAt = defaults.createdAt;
    	      this.customerName = defaults.customerName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.environments = defaults.environments;
    	      this.expiresAt = defaults.expiresAt;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.portalDisabled = defaults.portalDisabled;
    	      this.project = defaults.project;
    	      this.properties = defaults.properties;
    	      this.runtimeDatabaseEncryptionKeyName = defaults.runtimeDatabaseEncryptionKeyName;
    	      this.runtimeType = defaults.runtimeType;
    	      this.state = defaults.state;
    	      this.subscriptionType = defaults.subscriptionType;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder addonsConfig(GoogleCloudApigeeV1AddonsConfigResponse addonsConfig) {
            this.addonsConfig = Objects.requireNonNull(addonsConfig);
            return this;
        }
        @CustomType.Setter
        public Builder analyticsRegion(String analyticsRegion) {
            this.analyticsRegion = Objects.requireNonNull(analyticsRegion);
            return this;
        }
        @CustomType.Setter
        public Builder apigeeProjectId(String apigeeProjectId) {
            this.apigeeProjectId = Objects.requireNonNull(apigeeProjectId);
            return this;
        }
        @CustomType.Setter
        public Builder attributes(List<String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(String... attributes) {
            return attributes(List.of(attributes));
        }
        @CustomType.Setter
        public Builder authorizedNetwork(String authorizedNetwork) {
            this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
            return this;
        }
        @CustomType.Setter
        public Builder billingType(String billingType) {
            this.billingType = Objects.requireNonNull(billingType);
            return this;
        }
        @CustomType.Setter
        public Builder caCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder customerName(String customerName) {
            this.customerName = Objects.requireNonNull(customerName);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder environments(List<String> environments) {
            this.environments = Objects.requireNonNull(environments);
            return this;
        }
        public Builder environments(String... environments) {
            return environments(List.of(environments));
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder portalDisabled(Boolean portalDisabled) {
            this.portalDisabled = Objects.requireNonNull(portalDisabled);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder properties(GoogleCloudApigeeV1PropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        @CustomType.Setter
        public Builder runtimeDatabaseEncryptionKeyName(String runtimeDatabaseEncryptionKeyName) {
            this.runtimeDatabaseEncryptionKeyName = Objects.requireNonNull(runtimeDatabaseEncryptionKeyName);
            return this;
        }
        @CustomType.Setter
        public Builder runtimeType(String runtimeType) {
            this.runtimeType = Objects.requireNonNull(runtimeType);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionType(String subscriptionType) {
            this.subscriptionType = Objects.requireNonNull(subscriptionType);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetOrganizationResult build() {
            final var o = new GetOrganizationResult();
            o.addonsConfig = addonsConfig;
            o.analyticsRegion = analyticsRegion;
            o.apigeeProjectId = apigeeProjectId;
            o.attributes = attributes;
            o.authorizedNetwork = authorizedNetwork;
            o.billingType = billingType;
            o.caCertificate = caCertificate;
            o.createdAt = createdAt;
            o.customerName = customerName;
            o.description = description;
            o.displayName = displayName;
            o.environments = environments;
            o.expiresAt = expiresAt;
            o.lastModifiedAt = lastModifiedAt;
            o.name = name;
            o.portalDisabled = portalDisabled;
            o.project = project;
            o.properties = properties;
            o.runtimeDatabaseEncryptionKeyName = runtimeDatabaseEncryptionKeyName;
            o.runtimeType = runtimeType;
            o.state = state;
            o.subscriptionType = subscriptionType;
            o.type = type;
            return o;
        }
    }
}