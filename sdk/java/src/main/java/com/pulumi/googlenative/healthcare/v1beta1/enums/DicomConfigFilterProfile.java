// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Tag filtering profile that determines which tags to keep/remove.
     * 
     */
    @EnumType
    public enum DicomConfigFilterProfile {
        /**
         * No tag filtration profile provided. Same as KEEP_ALL_PROFILE.
         * 
         */
        TagFilterProfileUnspecified("TAG_FILTER_PROFILE_UNSPECIFIED"),
        /**
         * Keep only tags required to produce valid DICOM.
         * 
         */
        MinimalKeepListProfile("MINIMAL_KEEP_LIST_PROFILE"),
        /**
         * Remove tags based on DICOM Standard&#39;s Attribute Confidentiality Basic Profile (DICOM Standard Edition 2018e) http://dicom.nema.org/medical/dicom/2018e/output/chtml/part15/chapter_E.html.
         * 
         */
        AttributeConfidentialityBasicProfile("ATTRIBUTE_CONFIDENTIALITY_BASIC_PROFILE"),
        /**
         * Keep all tags.
         * 
         */
        KeepAllProfile("KEEP_ALL_PROFILE"),
        /**
         * Inspects within tag contents and replaces sensitive text. The process can be configured using the TextConfig. Applies to all tags with the following Value Representation names: AE, LO, LT, PN, SH, ST, UC, UT, DA, DT, AS
         * 
         */
        DeidentifyTagContents("DEIDENTIFY_TAG_CONTENTS");

        private final String value;

        DicomConfigFilterProfile(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DicomConfigFilterProfile[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }