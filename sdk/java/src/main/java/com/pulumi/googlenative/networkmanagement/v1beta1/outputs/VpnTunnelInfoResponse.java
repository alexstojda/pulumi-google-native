// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpnTunnelInfoResponse {
    /**
     * @return Name of a VPN tunnel.
     * 
     */
    private String displayName;
    /**
     * @return URI of a Compute Engine network where the VPN tunnel is configured.
     * 
     */
    private String networkUri;
    /**
     * @return Name of a Google Cloud region where this VPN tunnel is configured.
     * 
     */
    private String region;
    /**
     * @return URI of a VPN gateway at remote end of the tunnel.
     * 
     */
    private String remoteGateway;
    /**
     * @return Remote VPN gateway&#39;s IP address.
     * 
     */
    private String remoteGatewayIp;
    /**
     * @return Type of the routing policy.
     * 
     */
    private String routingType;
    /**
     * @return URI of the VPN gateway at local end of the tunnel.
     * 
     */
    private String sourceGateway;
    /**
     * @return Local VPN gateway&#39;s IP address.
     * 
     */
    private String sourceGatewayIp;
    /**
     * @return URI of a VPN tunnel.
     * 
     */
    private String uri;

    private VpnTunnelInfoResponse() {}
    /**
     * @return Name of a VPN tunnel.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return URI of a Compute Engine network where the VPN tunnel is configured.
     * 
     */
    public String networkUri() {
        return this.networkUri;
    }
    /**
     * @return Name of a Google Cloud region where this VPN tunnel is configured.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return URI of a VPN gateway at remote end of the tunnel.
     * 
     */
    public String remoteGateway() {
        return this.remoteGateway;
    }
    /**
     * @return Remote VPN gateway&#39;s IP address.
     * 
     */
    public String remoteGatewayIp() {
        return this.remoteGatewayIp;
    }
    /**
     * @return Type of the routing policy.
     * 
     */
    public String routingType() {
        return this.routingType;
    }
    /**
     * @return URI of the VPN gateway at local end of the tunnel.
     * 
     */
    public String sourceGateway() {
        return this.sourceGateway;
    }
    /**
     * @return Local VPN gateway&#39;s IP address.
     * 
     */
    public String sourceGatewayIp() {
        return this.sourceGatewayIp;
    }
    /**
     * @return URI of a VPN tunnel.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnTunnelInfoResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private String networkUri;
        private String region;
        private String remoteGateway;
        private String remoteGatewayIp;
        private String routingType;
        private String sourceGateway;
        private String sourceGatewayIp;
        private String uri;
        public Builder() {}
        public Builder(VpnTunnelInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.networkUri = defaults.networkUri;
    	      this.region = defaults.region;
    	      this.remoteGateway = defaults.remoteGateway;
    	      this.remoteGatewayIp = defaults.remoteGatewayIp;
    	      this.routingType = defaults.routingType;
    	      this.sourceGateway = defaults.sourceGateway;
    	      this.sourceGatewayIp = defaults.sourceGatewayIp;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder remoteGateway(String remoteGateway) {
            this.remoteGateway = Objects.requireNonNull(remoteGateway);
            return this;
        }
        @CustomType.Setter
        public Builder remoteGatewayIp(String remoteGatewayIp) {
            this.remoteGatewayIp = Objects.requireNonNull(remoteGatewayIp);
            return this;
        }
        @CustomType.Setter
        public Builder routingType(String routingType) {
            this.routingType = Objects.requireNonNull(routingType);
            return this;
        }
        @CustomType.Setter
        public Builder sourceGateway(String sourceGateway) {
            this.sourceGateway = Objects.requireNonNull(sourceGateway);
            return this;
        }
        @CustomType.Setter
        public Builder sourceGatewayIp(String sourceGatewayIp) {
            this.sourceGatewayIp = Objects.requireNonNull(sourceGatewayIp);
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public VpnTunnelInfoResponse build() {
            final var o = new VpnTunnelInfoResponse();
            o.displayName = displayName;
            o.networkUri = networkUri;
            o.region = region;
            o.remoteGateway = remoteGateway;
            o.remoteGatewayIp = remoteGatewayIp;
            o.routingType = routingType;
            o.sourceGateway = sourceGateway;
            o.sourceGatewayIp = sourceGatewayIp;
            o.uri = uri;
            return o;
        }
    }
}