// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RouterNatSubnetworkToNatSourceIpRangesToNatItem {
        /**
         * The primary and all the secondary ranges are allowed to Nat.
         * 
         */
        AllIpRanges("ALL_IP_RANGES"),
        /**
         * A list of secondary ranges are allowed to Nat.
         * 
         */
        ListOfSecondaryIpRanges("LIST_OF_SECONDARY_IP_RANGES"),
        /**
         * The primary range is allowed to Nat.
         * 
         */
        PrimaryIpRange("PRIMARY_IP_RANGE");

        private final String value;

        RouterNatSubnetworkToNatSourceIpRangesToNatItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RouterNatSubnetworkToNatSourceIpRangesToNatItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }