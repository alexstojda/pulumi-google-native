// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * 
     */
    @EnumType
    public enum OrganizationRuntimeType {
        /**
         * Runtime type not specified.
         * 
         */
        RuntimeTypeUnspecified("RUNTIME_TYPE_UNSPECIFIED"),
        /**
         * Google-managed Apigee runtime.
         * 
         */
        Cloud("CLOUD"),
        /**
         * User-managed Apigee hybrid runtime.
         * 
         */
        Hybrid("HYBRID");

        private final String value;

        OrganizationRuntimeType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OrganizationRuntimeType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }