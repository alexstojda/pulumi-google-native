// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defined in CVSS v3, CVSS v2
     * 
     */
    @EnumType
    public enum CVSSAvailabilityImpact {
        /**
         * Defined in CVSS v3, CVSS v2
         * 
         */
        ImpactUnspecified("IMPACT_UNSPECIFIED"),
        /**
         * Defined in CVSS v3
         * 
         */
        ImpactHigh("IMPACT_HIGH"),
        /**
         * Defined in CVSS v3
         * 
         */
        ImpactLow("IMPACT_LOW"),
        /**
         * Defined in CVSS v3, CVSS v2
         * 
         */
        ImpactNone("IMPACT_NONE"),
        /**
         * Defined in CVSS v2
         * 
         */
        ImpactPartial("IMPACT_PARTIAL"),
        /**
         * Defined in CVSS v2
         * 
         */
        ImpactComplete("IMPACT_COMPLETE");

        private final String value;

        CVSSAvailabilityImpact(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CVSSAvailabilityImpact[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }