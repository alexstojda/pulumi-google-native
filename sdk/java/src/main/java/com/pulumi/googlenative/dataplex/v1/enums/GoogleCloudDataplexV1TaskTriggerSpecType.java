// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Immutable. Trigger type of the user-specified Task.
     * 
     */
    @EnumType
    public enum GoogleCloudDataplexV1TaskTriggerSpecType {
        /**
         * Unspecified trigger type.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * The task runs one-time shortly after Task Creation.
         * 
         */
        OnDemand("ON_DEMAND"),
        /**
         * The task is scheduled to run periodically.
         * 
         */
        Recurring("RECURRING");

        private final String value;

        GoogleCloudDataplexV1TaskTriggerSpecType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDataplexV1TaskTriggerSpecType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }