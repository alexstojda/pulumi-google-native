// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Immutable. The type of field.
     * 
     */
    @EnumType
    public enum GoogleCloudDataplexV1SchemaPartitionFieldType {
        /**
         * SchemaType unspecified.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * Boolean field.
         * 
         */
        Boolean("BOOLEAN"),
        /**
         * Single byte numeric field.
         * 
         */
        Byte("BYTE"),
        /**
         * 16-bit numeric field.
         * 
         */
        Int16("INT16"),
        /**
         * 32-bit numeric field.
         * 
         */
        Int32("INT32"),
        /**
         * 64-bit numeric field.
         * 
         */
        Int64("INT64"),
        /**
         * Floating point numeric field.
         * 
         */
        Float("FLOAT"),
        /**
         * Double precision numeric field.
         * 
         */
        Double("DOUBLE"),
        /**
         * Real value numeric field.
         * 
         */
        Decimal("DECIMAL"),
        /**
         * Sequence of characters field.
         * 
         */
        String("STRING"),
        /**
         * Sequence of bytes field.
         * 
         */
        Binary("BINARY"),
        /**
         * Date and time field.
         * 
         */
        Timestamp("TIMESTAMP"),
        /**
         * Date field.
         * 
         */
        Date("DATE"),
        /**
         * Time field.
         * 
         */
        Time("TIME"),
        /**
         * Structured field. Nested fields that define the structure of the map. If all nested fields are nullable, this field represents a union.
         * 
         */
        Record("RECORD"),
        /**
         * Null field that does not have values.
         * 
         */
        Null("NULL");

        private final String value;

        GoogleCloudDataplexV1SchemaPartitionFieldType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDataplexV1SchemaPartitionFieldType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }