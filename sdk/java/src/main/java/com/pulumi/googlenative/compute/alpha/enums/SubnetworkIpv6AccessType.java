// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The access type of IPv6 address this subnet holds. It&#39;s immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack.
     * 
     */
    @EnumType
    public enum SubnetworkIpv6AccessType {
        /**
         * VMs on this subnet will be assigned IPv6 addresses that are accessible via the Internet, as well as the VPC network.
         * 
         */
        External("EXTERNAL"),
        /**
         * VMs on this subnet will be assigned IPv6 addresses that are only accessible over the VPC network.
         * 
         */
        Internal("INTERNAL");

        private final String value;

        SubnetworkIpv6AccessType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SubnetworkIpv6AccessType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }