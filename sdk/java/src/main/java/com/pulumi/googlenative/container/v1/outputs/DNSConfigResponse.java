// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DNSConfigResponse {
    /**
     * @return cluster_dns indicates which in-cluster DNS provider should be used.
     * 
     */
    private String clusterDns;
    /**
     * @return cluster_dns_domain is the suffix used for all cluster service records.
     * 
     */
    private String clusterDnsDomain;
    /**
     * @return cluster_dns_scope indicates the scope of access to cluster DNS records.
     * 
     */
    private String clusterDnsScope;

    private DNSConfigResponse() {}
    /**
     * @return cluster_dns indicates which in-cluster DNS provider should be used.
     * 
     */
    public String clusterDns() {
        return this.clusterDns;
    }
    /**
     * @return cluster_dns_domain is the suffix used for all cluster service records.
     * 
     */
    public String clusterDnsDomain() {
        return this.clusterDnsDomain;
    }
    /**
     * @return cluster_dns_scope indicates the scope of access to cluster DNS records.
     * 
     */
    public String clusterDnsScope() {
        return this.clusterDnsScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DNSConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterDns;
        private String clusterDnsDomain;
        private String clusterDnsScope;
        public Builder() {}
        public Builder(DNSConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterDns = defaults.clusterDns;
    	      this.clusterDnsDomain = defaults.clusterDnsDomain;
    	      this.clusterDnsScope = defaults.clusterDnsScope;
        }

        @CustomType.Setter
        public Builder clusterDns(String clusterDns) {
            this.clusterDns = Objects.requireNonNull(clusterDns);
            return this;
        }
        @CustomType.Setter
        public Builder clusterDnsDomain(String clusterDnsDomain) {
            this.clusterDnsDomain = Objects.requireNonNull(clusterDnsDomain);
            return this;
        }
        @CustomType.Setter
        public Builder clusterDnsScope(String clusterDnsScope) {
            this.clusterDnsScope = Objects.requireNonNull(clusterDnsScope);
            return this;
        }
        public DNSConfigResponse build() {
            final var o = new DNSConfigResponse();
            o.clusterDns = clusterDns;
            o.clusterDnsDomain = clusterDnsDomain;
            o.clusterDnsScope = clusterDnsScope;
            return o;
        }
    }
}