// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the total network bandwidth tier for the NodePool.
     * 
     */
    @EnumType
    public enum NetworkPerformanceConfigTotalEgressBandwidthTier {
        /**
         * Default value
         * 
         */
        TierUnspecified("TIER_UNSPECIFIED"),
        /**
         * Higher bandwidth, actual values based on VM size.
         * 
         */
        Tier1("TIER_1");

        private final String value;

        NetworkPerformanceConfigTotalEgressBandwidthTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkPerformanceConfigTotalEgressBandwidthTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }