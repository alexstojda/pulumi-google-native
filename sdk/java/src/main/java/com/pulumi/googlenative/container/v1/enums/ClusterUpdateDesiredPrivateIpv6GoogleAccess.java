// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The desired state of IPv6 connectivity to Google Services.
     * 
     */
    @EnumType
    public enum ClusterUpdateDesiredPrivateIpv6GoogleAccess {
        /**
         * Default value. Same as DISABLED
         * 
         */
        PrivateIpv6GoogleAccessUnspecified("PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED"),
        /**
         * No private access to or from Google Services
         * 
         */
        PrivateIpv6GoogleAccessDisabled("PRIVATE_IPV6_GOOGLE_ACCESS_DISABLED"),
        /**
         * Enables private IPv6 access to Google Services from GKE
         * 
         */
        PrivateIpv6GoogleAccessToGoogle("PRIVATE_IPV6_GOOGLE_ACCESS_TO_GOOGLE"),
        /**
         * Enables priate IPv6 access to and from Google Services
         * 
         */
        PrivateIpv6GoogleAccessBidirectional("PRIVATE_IPV6_GOOGLE_ACCESS_BIDIRECTIONAL");

        private final String value;

        ClusterUpdateDesiredPrivateIpv6GoogleAccess(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ClusterUpdateDesiredPrivateIpv6GoogleAccess[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }