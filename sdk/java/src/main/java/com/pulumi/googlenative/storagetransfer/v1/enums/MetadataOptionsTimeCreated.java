// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how each object&#39;s `timeCreated` metadata is preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as TIME_CREATED_SKIP.
     * 
     */
    @EnumType
    public enum MetadataOptionsTimeCreated {
        /**
         * TimeCreated behavior is unspecified.
         * 
         */
        TimeCreatedUnspecified("TIME_CREATED_UNSPECIFIED"),
        /**
         * Do not preserve the `timeCreated` metadata from the source object.
         * 
         */
        TimeCreatedSkip("TIME_CREATED_SKIP"),
        /**
         * Preserves the source object&#39;s `timeCreated` metadata in the `customTime` field in the destination object. Note that any value stored in the source object&#39;s `customTime` field will not be propagated to the destination object.
         * 
         */
        TimeCreatedPreserveAsCustomTime("TIME_CREATED_PRESERVE_AS_CUSTOM_TIME");

        private final String value;

        MetadataOptionsTimeCreated(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetadataOptionsTimeCreated[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }