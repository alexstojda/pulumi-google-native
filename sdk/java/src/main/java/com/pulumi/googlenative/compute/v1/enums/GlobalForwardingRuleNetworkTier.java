// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This signifies the networking tier used for configuring this load balancer and can only take the following values: PREMIUM, STANDARD. For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For GlobalForwardingRule, the valid value is PREMIUM. If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this value must be equal to the networkTier of the Address.
     * 
     */
    @EnumType
    public enum GlobalForwardingRuleNetworkTier {
        /**
         * Public internet quality with fixed bandwidth.
         * 
         */
        FixedStandard("FIXED_STANDARD"),
        /**
         * High quality, Google-grade network tier, support for all networking products.
         * 
         */
        Premium("PREMIUM"),
        /**
         * Public internet quality, only limited support for other networking products.
         * 
         */
        Standard("STANDARD"),
        /**
         * (Output only) Temporary tier for FIXED_STANDARD when fixed standard tier is expired or not configured.
         * 
         */
        StandardOverridesFixedStandard("STANDARD_OVERRIDES_FIXED_STANDARD");

        private final String value;

        GlobalForwardingRuleNetworkTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GlobalForwardingRuleNetworkTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }