// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The network scope of the backends that can be added to the backend service. This field can be either GLOBAL_VPC_NETWORK or REGIONAL_VPC_NETWORK. A backend service with the VPC scope set to GLOBAL_VPC_NETWORK is only allowed to have backends in global VPC networks. When the VPC scope is set to REGIONAL_VPC_NETWORK the backend service is only allowed to have backends in regional networks in the same scope as the backend service. Note: if not specified then GLOBAL_VPC_NETWORK will be used.
     * 
     */
    @EnumType
    public enum RegionBackendServiceVpcNetworkScope {
        /**
         * The backend service can only have backends in global VPCs
         * 
         */
        GlobalVpcNetwork("GLOBAL_VPC_NETWORK"),
        /**
         * The backend service can only have backends in regional VPCs
         * 
         */
        RegionalVpcNetwork("REGIONAL_VPC_NETWORK");

        private final String value;

        RegionBackendServiceVpcNetworkScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegionBackendServiceVpcNetworkScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }