// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The network firewall policy enforcement order. Can be either AFTER_CLASSIC_FIREWALL or BEFORE_CLASSIC_FIREWALL. Defaults to AFTER_CLASSIC_FIREWALL if the field is not specified.
     * 
     */
    @EnumType
    public enum NetworkNetworkFirewallPolicyEnforcementOrder {
        AfterClassicFirewall("AFTER_CLASSIC_FIREWALL"),
        BeforeClassicFirewall("BEFORE_CLASSIC_FIREWALL");

        private final String value;

        NetworkNetworkFirewallPolicyEnforcementOrder(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkNetworkFirewallPolicyEnforcementOrder[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }