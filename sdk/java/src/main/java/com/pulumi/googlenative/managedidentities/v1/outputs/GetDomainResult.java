// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.managedidentities.v1.outputs.TrustResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDomainResult {
    /**
     * @return Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
     * 
     */
    private String admin;
    /**
     * @return Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    private Boolean auditLogsEnabled;
    /**
     * @return Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    private List<String> authorizedNetworks;
    /**
     * @return The time the instance was created.
     * 
     */
    private String createTime;
    /**
     * @return The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an internal network.
     * 
     */
    private String fqdn;
    /**
     * @return Optional. Resource labels that can contain user-provided metadata.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    private List<String> locations;
    /**
     * @return The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
     * 
     */
    private String name;
    /**
     * @return The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    private String reservedIpRange;
    /**
     * @return The current state of this domain.
     * 
     */
    private String state;
    /**
     * @return Additional information about the current status of this domain, if available.
     * 
     */
    private String statusMessage;
    /**
     * @return The current trusts associated with the domain.
     * 
     */
    private List<TrustResponse> trusts;
    /**
     * @return The last update time.
     * 
     */
    private String updateTime;

    private GetDomainResult() {}
    /**
     * @return Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
     * 
     */
    public String admin() {
        return this.admin;
    }
    /**
     * @return Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    public Boolean auditLogsEnabled() {
        return this.auditLogsEnabled;
    }
    /**
     * @return Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    public List<String> authorizedNetworks() {
        return this.authorizedNetworks;
    }
    /**
     * @return The time the instance was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an internal network.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return Optional. Resource labels that can contain user-provided metadata.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    public List<String> locations() {
        return this.locations;
    }
    /**
     * @return The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    public String reservedIpRange() {
        return this.reservedIpRange;
    }
    /**
     * @return The current state of this domain.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Additional information about the current status of this domain, if available.
     * 
     */
    public String statusMessage() {
        return this.statusMessage;
    }
    /**
     * @return The current trusts associated with the domain.
     * 
     */
    public List<TrustResponse> trusts() {
        return this.trusts;
    }
    /**
     * @return The last update time.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String admin;
        private Boolean auditLogsEnabled;
        private List<String> authorizedNetworks;
        private String createTime;
        private String fqdn;
        private Map<String,String> labels;
        private List<String> locations;
        private String name;
        private String reservedIpRange;
        private String state;
        private String statusMessage;
        private List<TrustResponse> trusts;
        private String updateTime;
        public Builder() {}
        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.auditLogsEnabled = defaults.auditLogsEnabled;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.createTime = defaults.createTime;
    	      this.fqdn = defaults.fqdn;
    	      this.labels = defaults.labels;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
    	      this.trusts = defaults.trusts;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder admin(String admin) {
            this.admin = Objects.requireNonNull(admin);
            return this;
        }
        @CustomType.Setter
        public Builder auditLogsEnabled(Boolean auditLogsEnabled) {
            this.auditLogsEnabled = Objects.requireNonNull(auditLogsEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder authorizedNetworks(List<String> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }
        public Builder authorizedNetworks(String... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder locations(List<String> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder reservedIpRange(String reservedIpRange) {
            this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        @CustomType.Setter
        public Builder trusts(List<TrustResponse> trusts) {
            this.trusts = Objects.requireNonNull(trusts);
            return this;
        }
        public Builder trusts(TrustResponse... trusts) {
            return trusts(List.of(trusts));
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetDomainResult build() {
            final var o = new GetDomainResult();
            o.admin = admin;
            o.auditLogsEnabled = auditLogsEnabled;
            o.authorizedNetworks = authorizedNetworks;
            o.createTime = createTime;
            o.fqdn = fqdn;
            o.labels = labels;
            o.locations = locations;
            o.name = name;
            o.reservedIpRange = reservedIpRange;
            o.state = state;
            o.statusMessage = statusMessage;
            o.trusts = trusts;
            o.updateTime = updateTime;
            return o;
        }
    }
}