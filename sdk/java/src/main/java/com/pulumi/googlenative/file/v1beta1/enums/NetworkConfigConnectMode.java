// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The network connect mode of the Filestore instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    @EnumType
    public enum NetworkConfigConnectMode {
        /**
         * ConnectMode not set.
         * 
         */
        ConnectModeUnspecified("CONNECT_MODE_UNSPECIFIED"),
        /**
         * Connect via direct peering to the Filestore service.
         * 
         */
        DirectPeering("DIRECT_PEERING"),
        /**
         * Connect to your Filestore instance using Private Service Access. Private services access provides an IP address range for multiple Google Cloud services, including Filestore.
         * 
         */
        PrivateServiceAccess("PRIVATE_SERVICE_ACCESS");

        private final String value;

        NetworkConfigConnectMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkConfigConnectMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }