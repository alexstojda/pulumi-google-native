// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Determines if existing data in the destination dataset is overwritten, appended to, or not written if the tables contain data. If a write_disposition is specified, the `force` parameter is ignored.
     * 
     */
    @EnumType
    public enum GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition {
        /**
         * Default behavior is the same as WRITE_EMPTY.
         * 
         */
        WriteDispositionUnspecified("WRITE_DISPOSITION_UNSPECIFIED"),
        /**
         * Only export data if the destination tables are empty.
         * 
         */
        WriteEmpty("WRITE_EMPTY"),
        /**
         * Erase all existing data in the tables before writing the instances.
         * 
         */
        WriteTruncate("WRITE_TRUNCATE"),
        /**
         * Append data to the existing tables.
         * 
         */
        WriteAppend("WRITE_APPEND");

        private final String value;

        GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }