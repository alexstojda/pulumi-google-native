// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    @EnumType
    public enum InterconnectInterconnectType {
        /**
         * A dedicated physical interconnection with the customer.
         * 
         */
        Dedicated("DEDICATED"),
        /**
         * [Deprecated] A private, physical interconnection with the customer.
         * 
         */
        ItPrivate("IT_PRIVATE"),
        /**
         * A partner-managed interconnection shared between customers via partner.
         * 
         */
        Partner("PARTNER");

        private final String value;

        InterconnectInterconnectType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InterconnectInterconnectType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }