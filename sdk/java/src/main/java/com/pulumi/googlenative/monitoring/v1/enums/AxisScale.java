// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The axis scale. By default, a linear scale is used.
     * 
     */
    @EnumType
    public enum AxisScale {
        /**
         * Scale is unspecified. The view will default to LINEAR.
         * 
         */
        ScaleUnspecified("SCALE_UNSPECIFIED"),
        /**
         * Linear scale.
         * 
         */
        Linear("LINEAR"),
        /**
         * Logarithmic scale (base 10).
         * 
         */
        Log10("LOG10");

        private final String value;

        AxisScale(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AxisScale[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }