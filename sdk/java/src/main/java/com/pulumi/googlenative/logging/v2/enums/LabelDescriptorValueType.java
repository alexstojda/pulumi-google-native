// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of data that can be assigned to the label.
     * 
     */
    @EnumType
    public enum LabelDescriptorValueType {
        /**
         * A variable-length string. This is the default.
         * 
         */
        String("STRING"),
        /**
         * Boolean; true or false.
         * 
         */
        Bool("BOOL"),
        /**
         * A 64-bit signed integer.
         * 
         */
        Int64("INT64");

        private final String value;

        LabelDescriptorValueType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LabelDescriptorValueType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }