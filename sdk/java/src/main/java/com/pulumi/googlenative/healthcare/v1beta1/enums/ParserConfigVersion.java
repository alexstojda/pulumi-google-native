// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. Determines the version of both the default parser to be used when `schema` is not given, as well as the schematized parser used when `schema` is specified. This field is immutable after HL7v2 store creation.
     * 
     */
    @EnumType
    public enum ParserConfigVersion {
        /**
         * Unspecified parser version, equivalent to V1.
         * 
         */
        ParserVersionUnspecified("PARSER_VERSION_UNSPECIFIED"),
        /**
         * The `parsed_data` includes every given non-empty message field except the Field Separator (MSH-1) field. As a result, the parsed MSH segment starts with the MSH-2 field and the field numbers are off-by-one with respect to the HL7 standard.
         * 
         */
        V1("V1"),
        /**
         * The `parsed_data` includes every given non-empty message field.
         * 
         */
        V2("V2"),
        /**
         * This version is the same as V2, with the following change. The `parsed_data` contains unescaped escaped field separators, component separators, sub-component separators, repetition separators, escape characters, and truncation characters. If `schema` is specified, the schematized parser uses improved parsing heuristics compared to previous versions.
         * 
         */
        V3("V3");

        private final String value;

        ParserConfigVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ParserConfigVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }