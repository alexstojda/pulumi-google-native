// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.RouteAsPathResponse;
import com.pulumi.googlenative.compute.alpha.outputs.RouteWarningsItemResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteResult {
    /**
     * @return Whether this route can conflict with existing subnetworks. Setting this to true allows this route to conflict with subnetworks that have already been configured on the corresponding network.
     * 
     */
    private Boolean allowConflictingSubnetworks;
    /**
     * @return AS path.
     * 
     */
    private List<RouteAsPathResponse> asPaths;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    private String description;
    /**
     * @return The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    private String destRange;
    /**
     * @return ILB route behavior when ILB is deemed unhealthy based on user specified threshold on the Backend Service of the internal load balancing.
     * 
     */
    private String ilbRouteBehaviorOnUnhealthy;
    /**
     * @return Type of this resource. Always compute#routes for Route resources.
     * 
     */
    private String kind;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    private String name;
    /**
     * @return Fully-qualified URL of the network that this route applies to.
     * 
     */
    private String network;
    /**
     * @return The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    private String nextHopGateway;
    /**
     * @return The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    private String nextHopIlb;
    /**
     * @return The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    private String nextHopInstance;
    /**
     * @return The URL to an InterconnectAttachment which is the next hop for the route. This field will only be populated for the dynamic routes generated by Cloud Router with a linked interconnectAttachment.
     * 
     */
    private String nextHopInterconnectAttachment;
    /**
     * @return The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    private String nextHopIp;
    /**
     * @return The URL of the local network if it should handle matching packets.
     * 
     */
    private String nextHopNetwork;
    /**
     * @return The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
     */
    private String nextHopPeering;
    /**
     * @return The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    private String nextHopVpnTunnel;
    /**
     * @return The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    private Integer priority;
    /**
     * @return [Output only] The status of the route.
     * 
     */
    private String routeStatus;
    /**
     * @return The type of this route, which can be one of the following values: - &#39;TRANSIT&#39; for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - &#39;SUBNET&#39; for a route from a subnet of the VPC - &#39;BGP&#39; for a route learned from a BGP peer of this router - &#39;STATIC&#39; for a static route
     * 
     */
    private String routeType;
    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    private String selfLink;
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    private String selfLinkWithId;
    /**
     * @return A list of instance tags to which this route applies.
     * 
     */
    private List<String> tags;
    /**
     * @return If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
     */
    private List<RouteWarningsItemResponse> warnings;

    private GetRouteResult() {}
    /**
     * @return Whether this route can conflict with existing subnetworks. Setting this to true allows this route to conflict with subnetworks that have already been configured on the corresponding network.
     * 
     */
    public Boolean allowConflictingSubnetworks() {
        return this.allowConflictingSubnetworks;
    }
    /**
     * @return AS path.
     * 
     */
    public List<RouteAsPathResponse> asPaths() {
        return this.asPaths;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    public String destRange() {
        return this.destRange;
    }
    /**
     * @return ILB route behavior when ILB is deemed unhealthy based on user specified threshold on the Backend Service of the internal load balancing.
     * 
     */
    public String ilbRouteBehaviorOnUnhealthy() {
        return this.ilbRouteBehaviorOnUnhealthy;
    }
    /**
     * @return Type of this resource. Always compute#routes for Route resources.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Fully-qualified URL of the network that this route applies to.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    public String nextHopGateway() {
        return this.nextHopGateway;
    }
    /**
     * @return The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    public String nextHopIlb() {
        return this.nextHopIlb;
    }
    /**
     * @return The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    public String nextHopInstance() {
        return this.nextHopInstance;
    }
    /**
     * @return The URL to an InterconnectAttachment which is the next hop for the route. This field will only be populated for the dynamic routes generated by Cloud Router with a linked interconnectAttachment.
     * 
     */
    public String nextHopInterconnectAttachment() {
        return this.nextHopInterconnectAttachment;
    }
    /**
     * @return The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    public String nextHopIp() {
        return this.nextHopIp;
    }
    /**
     * @return The URL of the local network if it should handle matching packets.
     * 
     */
    public String nextHopNetwork() {
        return this.nextHopNetwork;
    }
    /**
     * @return The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
     */
    public String nextHopPeering() {
        return this.nextHopPeering;
    }
    /**
     * @return The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    public String nextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }
    /**
     * @return The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return [Output only] The status of the route.
     * 
     */
    public String routeStatus() {
        return this.routeStatus;
    }
    /**
     * @return The type of this route, which can be one of the following values: - &#39;TRANSIT&#39; for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - &#39;SUBNET&#39; for a route from a subnet of the VPC - &#39;BGP&#39; for a route learned from a BGP peer of this router - &#39;STATIC&#39; for a static route
     * 
     */
    public String routeType() {
        return this.routeType;
    }
    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * @return A list of instance tags to which this route applies.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
     */
    public List<RouteWarningsItemResponse> warnings() {
        return this.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowConflictingSubnetworks;
        private List<RouteAsPathResponse> asPaths;
        private String creationTimestamp;
        private String description;
        private String destRange;
        private String ilbRouteBehaviorOnUnhealthy;
        private String kind;
        private String name;
        private String network;
        private String nextHopGateway;
        private String nextHopIlb;
        private String nextHopInstance;
        private String nextHopInterconnectAttachment;
        private String nextHopIp;
        private String nextHopNetwork;
        private String nextHopPeering;
        private String nextHopVpnTunnel;
        private Integer priority;
        private String routeStatus;
        private String routeType;
        private String selfLink;
        private String selfLinkWithId;
        private List<String> tags;
        private List<RouteWarningsItemResponse> warnings;
        public Builder() {}
        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowConflictingSubnetworks = defaults.allowConflictingSubnetworks;
    	      this.asPaths = defaults.asPaths;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.destRange = defaults.destRange;
    	      this.ilbRouteBehaviorOnUnhealthy = defaults.ilbRouteBehaviorOnUnhealthy;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nextHopGateway = defaults.nextHopGateway;
    	      this.nextHopIlb = defaults.nextHopIlb;
    	      this.nextHopInstance = defaults.nextHopInstance;
    	      this.nextHopInterconnectAttachment = defaults.nextHopInterconnectAttachment;
    	      this.nextHopIp = defaults.nextHopIp;
    	      this.nextHopNetwork = defaults.nextHopNetwork;
    	      this.nextHopPeering = defaults.nextHopPeering;
    	      this.nextHopVpnTunnel = defaults.nextHopVpnTunnel;
    	      this.priority = defaults.priority;
    	      this.routeStatus = defaults.routeStatus;
    	      this.routeType = defaults.routeType;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.tags = defaults.tags;
    	      this.warnings = defaults.warnings;
        }

        @CustomType.Setter
        public Builder allowConflictingSubnetworks(Boolean allowConflictingSubnetworks) {
            this.allowConflictingSubnetworks = Objects.requireNonNull(allowConflictingSubnetworks);
            return this;
        }
        @CustomType.Setter
        public Builder asPaths(List<RouteAsPathResponse> asPaths) {
            this.asPaths = Objects.requireNonNull(asPaths);
            return this;
        }
        public Builder asPaths(RouteAsPathResponse... asPaths) {
            return asPaths(List.of(asPaths));
        }
        @CustomType.Setter
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder destRange(String destRange) {
            this.destRange = Objects.requireNonNull(destRange);
            return this;
        }
        @CustomType.Setter
        public Builder ilbRouteBehaviorOnUnhealthy(String ilbRouteBehaviorOnUnhealthy) {
            this.ilbRouteBehaviorOnUnhealthy = Objects.requireNonNull(ilbRouteBehaviorOnUnhealthy);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        @CustomType.Setter
        public Builder nextHopGateway(String nextHopGateway) {
            this.nextHopGateway = Objects.requireNonNull(nextHopGateway);
            return this;
        }
        @CustomType.Setter
        public Builder nextHopIlb(String nextHopIlb) {
            this.nextHopIlb = Objects.requireNonNull(nextHopIlb);
            return this;
        }
        @CustomType.Setter
        public Builder nextHopInstance(String nextHopInstance) {
            this.nextHopInstance = Objects.requireNonNull(nextHopInstance);
            return this;
        }
        @CustomType.Setter
        public Builder nextHopInterconnectAttachment(String nextHopInterconnectAttachment) {
            this.nextHopInterconnectAttachment = Objects.requireNonNull(nextHopInterconnectAttachment);
            return this;
        }
        @CustomType.Setter
        public Builder nextHopIp(String nextHopIp) {
            this.nextHopIp = Objects.requireNonNull(nextHopIp);
            return this;
        }
        @CustomType.Setter
        public Builder nextHopNetwork(String nextHopNetwork) {
            this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork);
            return this;
        }
        @CustomType.Setter
        public Builder nextHopPeering(String nextHopPeering) {
            this.nextHopPeering = Objects.requireNonNull(nextHopPeering);
            return this;
        }
        @CustomType.Setter
        public Builder nextHopVpnTunnel(String nextHopVpnTunnel) {
            this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder routeStatus(String routeStatus) {
            this.routeStatus = Objects.requireNonNull(routeStatus);
            return this;
        }
        @CustomType.Setter
        public Builder routeType(String routeType) {
            this.routeType = Objects.requireNonNull(routeType);
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        @CustomType.Setter
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder warnings(List<RouteWarningsItemResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }
        public Builder warnings(RouteWarningsItemResponse... warnings) {
            return warnings(List.of(warnings));
        }
        public GetRouteResult build() {
            final var o = new GetRouteResult();
            o.allowConflictingSubnetworks = allowConflictingSubnetworks;
            o.asPaths = asPaths;
            o.creationTimestamp = creationTimestamp;
            o.description = description;
            o.destRange = destRange;
            o.ilbRouteBehaviorOnUnhealthy = ilbRouteBehaviorOnUnhealthy;
            o.kind = kind;
            o.name = name;
            o.network = network;
            o.nextHopGateway = nextHopGateway;
            o.nextHopIlb = nextHopIlb;
            o.nextHopInstance = nextHopInstance;
            o.nextHopInterconnectAttachment = nextHopInterconnectAttachment;
            o.nextHopIp = nextHopIp;
            o.nextHopNetwork = nextHopNetwork;
            o.nextHopPeering = nextHopPeering;
            o.nextHopVpnTunnel = nextHopVpnTunnel;
            o.priority = priority;
            o.routeStatus = routeStatus;
            o.routeType = routeType;
            o.selfLink = selfLink;
            o.selfLinkWithId = selfLinkWithId;
            o.tags = tags;
            o.warnings = warnings;
            return o;
        }
    }
}