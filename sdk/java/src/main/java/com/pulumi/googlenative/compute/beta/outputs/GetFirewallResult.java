// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.FirewallAllowedItemResponse;
import com.pulumi.googlenative.compute.beta.outputs.FirewallDeniedItemResponse;
import com.pulumi.googlenative.compute.beta.outputs.FirewallLogConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFirewallResult {
    /**
     * @return The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
     * 
     */
    private List<FirewallAllowedItemResponse> allowed;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private String creationTimestamp;
    /**
     * @return The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
     * 
     */
    private List<FirewallDeniedItemResponse> denied;
    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    private String description;
    /**
     * @return If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Both IPv4 and IPv6 are supported.
     * 
     */
    private List<String> destinationRanges;
    /**
     * @return Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
     * 
     */
    private String direction;
    /**
     * @return Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the firewall rule will be enabled.
     * 
     */
    private Boolean disabled;
    /**
     * @return Deprecated in favor of enable in LogConfig. This field denotes whether to enable logging for a particular firewall rule. If logging is enabled, logs will be exported t Cloud Logging.
     * 
     * @deprecated
     * Deprecated in favor of enable in LogConfig. This field denotes whether to enable logging for a particular firewall rule. If logging is enabled, logs will be exported t Cloud Logging.
     * 
     */
    @Deprecated /* Deprecated in favor of enable in LogConfig. This field denotes whether to enable logging for a particular firewall rule. If logging is enabled, logs will be exported t Cloud Logging. */
    private Boolean enableLogging;
    /**
     * @return Type of the resource. Always compute#firewall for firewall rules.
     * 
     */
    private String kind;
    /**
     * @return This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging.
     * 
     */
    private FirewallLogConfigResponse logConfig;
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    private String name;
    /**
     * @return URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used: global/networks/default If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network - projects/myproject/global/networks/my-network - global/networks/default
     * 
     */
    private String network;
    /**
     * @return Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than `65535`.
     * 
     */
    private Integer priority;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private String selfLink;
    /**
     * @return If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Both IPv4 and IPv6 are supported.
     * 
     */
    private List<String> sourceRanges;
    /**
     * @return If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance&#39;s external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
     * 
     */
    private List<String> sourceServiceAccounts;
    /**
     * @return If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance&#39;s external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
     * 
     */
    private List<String> sourceTags;
    /**
     * @return A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    private List<String> targetServiceAccounts;
    /**
     * @return A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    private List<String> targetTags;

    private GetFirewallResult() {}
    /**
     * @return The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
     * 
     */
    public List<FirewallAllowedItemResponse> allowed() {
        return this.allowed;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
     * 
     */
    public List<FirewallDeniedItemResponse> denied() {
        return this.denied;
    }
    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Both IPv4 and IPv6 are supported.
     * 
     */
    public List<String> destinationRanges() {
        return this.destinationRanges;
    }
    /**
     * @return Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the firewall rule will be enabled.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return Deprecated in favor of enable in LogConfig. This field denotes whether to enable logging for a particular firewall rule. If logging is enabled, logs will be exported t Cloud Logging.
     * 
     * @deprecated
     * Deprecated in favor of enable in LogConfig. This field denotes whether to enable logging for a particular firewall rule. If logging is enabled, logs will be exported t Cloud Logging.
     * 
     */
    @Deprecated /* Deprecated in favor of enable in LogConfig. This field denotes whether to enable logging for a particular firewall rule. If logging is enabled, logs will be exported t Cloud Logging. */
    public Boolean enableLogging() {
        return this.enableLogging;
    }
    /**
     * @return Type of the resource. Always compute#firewall for firewall rules.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging.
     * 
     */
    public FirewallLogConfigResponse logConfig() {
        return this.logConfig;
    }
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used: global/networks/default If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network - projects/myproject/global/networks/my-network - global/networks/default
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than `65535`.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Both IPv4 and IPv6 are supported.
     * 
     */
    public List<String> sourceRanges() {
        return this.sourceRanges;
    }
    /**
     * @return If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance&#39;s external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
     * 
     */
    public List<String> sourceServiceAccounts() {
        return this.sourceServiceAccounts;
    }
    /**
     * @return If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance&#39;s external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
     * 
     */
    public List<String> sourceTags() {
        return this.sourceTags;
    }
    /**
     * @return A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    public List<String> targetServiceAccounts() {
        return this.targetServiceAccounts;
    }
    /**
     * @return A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    public List<String> targetTags() {
        return this.targetTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<FirewallAllowedItemResponse> allowed;
        private String creationTimestamp;
        private List<FirewallDeniedItemResponse> denied;
        private String description;
        private List<String> destinationRanges;
        private String direction;
        private Boolean disabled;
        private Boolean enableLogging;
        private String kind;
        private FirewallLogConfigResponse logConfig;
        private String name;
        private String network;
        private Integer priority;
        private String selfLink;
        private List<String> sourceRanges;
        private List<String> sourceServiceAccounts;
        private List<String> sourceTags;
        private List<String> targetServiceAccounts;
        private List<String> targetTags;
        public Builder() {}
        public Builder(GetFirewallResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowed = defaults.allowed;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.denied = defaults.denied;
    	      this.description = defaults.description;
    	      this.destinationRanges = defaults.destinationRanges;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.enableLogging = defaults.enableLogging;
    	      this.kind = defaults.kind;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.selfLink = defaults.selfLink;
    	      this.sourceRanges = defaults.sourceRanges;
    	      this.sourceServiceAccounts = defaults.sourceServiceAccounts;
    	      this.sourceTags = defaults.sourceTags;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
    	      this.targetTags = defaults.targetTags;
        }

        @CustomType.Setter
        public Builder allowed(List<FirewallAllowedItemResponse> allowed) {
            this.allowed = Objects.requireNonNull(allowed);
            return this;
        }
        public Builder allowed(FirewallAllowedItemResponse... allowed) {
            return allowed(List.of(allowed));
        }
        @CustomType.Setter
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        @CustomType.Setter
        public Builder denied(List<FirewallDeniedItemResponse> denied) {
            this.denied = Objects.requireNonNull(denied);
            return this;
        }
        public Builder denied(FirewallDeniedItemResponse... denied) {
            return denied(List.of(denied));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder destinationRanges(List<String> destinationRanges) {
            this.destinationRanges = Objects.requireNonNull(destinationRanges);
            return this;
        }
        public Builder destinationRanges(String... destinationRanges) {
            return destinationRanges(List.of(destinationRanges));
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        @CustomType.Setter
        public Builder enableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder logConfig(FirewallLogConfigResponse logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
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
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        @CustomType.Setter
        public Builder sourceRanges(List<String> sourceRanges) {
            this.sourceRanges = Objects.requireNonNull(sourceRanges);
            return this;
        }
        public Builder sourceRanges(String... sourceRanges) {
            return sourceRanges(List.of(sourceRanges));
        }
        @CustomType.Setter
        public Builder sourceServiceAccounts(List<String> sourceServiceAccounts) {
            this.sourceServiceAccounts = Objects.requireNonNull(sourceServiceAccounts);
            return this;
        }
        public Builder sourceServiceAccounts(String... sourceServiceAccounts) {
            return sourceServiceAccounts(List.of(sourceServiceAccounts));
        }
        @CustomType.Setter
        public Builder sourceTags(List<String> sourceTags) {
            this.sourceTags = Objects.requireNonNull(sourceTags);
            return this;
        }
        public Builder sourceTags(String... sourceTags) {
            return sourceTags(List.of(sourceTags));
        }
        @CustomType.Setter
        public Builder targetServiceAccounts(List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Objects.requireNonNull(targetServiceAccounts);
            return this;
        }
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }
        @CustomType.Setter
        public Builder targetTags(List<String> targetTags) {
            this.targetTags = Objects.requireNonNull(targetTags);
            return this;
        }
        public Builder targetTags(String... targetTags) {
            return targetTags(List.of(targetTags));
        }
        public GetFirewallResult build() {
            final var o = new GetFirewallResult();
            o.allowed = allowed;
            o.creationTimestamp = creationTimestamp;
            o.denied = denied;
            o.description = description;
            o.destinationRanges = destinationRanges;
            o.direction = direction;
            o.disabled = disabled;
            o.enableLogging = enableLogging;
            o.kind = kind;
            o.logConfig = logConfig;
            o.name = name;
            o.network = network;
            o.priority = priority;
            o.selfLink = selfLink;
            o.sourceRanges = sourceRanges;
            o.sourceServiceAccounts = sourceServiceAccounts;
            o.sourceTags = sourceTags;
            o.targetServiceAccounts = targetServiceAccounts;
            o.targetTags = targetTags;
            return o;
        }
    }
}