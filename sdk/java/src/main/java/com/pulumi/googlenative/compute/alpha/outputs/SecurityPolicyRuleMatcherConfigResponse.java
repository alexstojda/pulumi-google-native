// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.SecurityPolicyRuleMatcherConfigDestinationPortResponse;
import com.pulumi.googlenative.compute.alpha.outputs.SecurityPolicyRuleMatcherConfigLayer4ConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRuleMatcherConfigResponse {
    /**
     * @return CIDR IP address range. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private List<String> destIpRanges;
    /**
     * @return Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private List<SecurityPolicyRuleMatcherConfigDestinationPortResponse> destPorts;
    /**
     * @return Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    private List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs;
    /**
     * @return CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
     */
    private List<String> srcIpRanges;

    private SecurityPolicyRuleMatcherConfigResponse() {}
    /**
     * @return CIDR IP address range. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    public List<String> destIpRanges() {
        return this.destIpRanges;
    }
    /**
     * @return Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    public List<SecurityPolicyRuleMatcherConfigDestinationPortResponse> destPorts() {
        return this.destPorts;
    }
    /**
     * @return Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    public List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs() {
        return this.layer4Configs;
    }
    /**
     * @return CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
     */
    public List<String> srcIpRanges() {
        return this.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> destIpRanges;
        private List<SecurityPolicyRuleMatcherConfigDestinationPortResponse> destPorts;
        private List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs;
        private List<String> srcIpRanges;
        public Builder() {}
        public Builder(SecurityPolicyRuleMatcherConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.destPorts = defaults.destPorts;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        @CustomType.Setter
        public Builder destIpRanges(List<String> destIpRanges) {
            this.destIpRanges = Objects.requireNonNull(destIpRanges);
            return this;
        }
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }
        @CustomType.Setter
        public Builder destPorts(List<SecurityPolicyRuleMatcherConfigDestinationPortResponse> destPorts) {
            this.destPorts = Objects.requireNonNull(destPorts);
            return this;
        }
        public Builder destPorts(SecurityPolicyRuleMatcherConfigDestinationPortResponse... destPorts) {
            return destPorts(List.of(destPorts));
        }
        @CustomType.Setter
        public Builder layer4Configs(List<SecurityPolicyRuleMatcherConfigLayer4ConfigResponse> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }
        public Builder layer4Configs(SecurityPolicyRuleMatcherConfigLayer4ConfigResponse... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }
        @CustomType.Setter
        public Builder srcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }
        public SecurityPolicyRuleMatcherConfigResponse build() {
            final var o = new SecurityPolicyRuleMatcherConfigResponse();
            o.destIpRanges = destIpRanges;
            o.destPorts = destPorts;
            o.layer4Configs = layer4Configs;
            o.srcIpRanges = srcIpRanges;
            return o;
        }
    }
}