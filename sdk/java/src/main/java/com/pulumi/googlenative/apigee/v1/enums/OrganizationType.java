// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Not used by Apigee.
     * 
     */
    @EnumType
    public enum OrganizationType {
        /**
         * Subscription type not specified.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Subscription to Apigee is free, limited, and used for evaluation purposes only.
         * 
         */
        TypeTrial("TYPE_TRIAL"),
        /**
         * Full subscription to Apigee has been purchased. See [Apigee pricing](https://cloud.google.com/apigee/pricing/).
         * 
         */
        TypePaid("TYPE_PAID"),
        /**
         * For internal users only.
         * 
         */
        TypeInternal("TYPE_INTERNAL");

        private final String value;

        OrganizationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OrganizationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }