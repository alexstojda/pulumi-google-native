// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * When to overwrite objects that already exist in the sink. If not set, overwrite behavior is determined by overwrite_objects_already_existing_in_sink.
     * 
     */
    @EnumType
    public enum TransferOptionsOverwriteWhen {
        /**
         * Overwrite behavior is unspecified.
         * 
         */
        OverwriteWhenUnspecified("OVERWRITE_WHEN_UNSPECIFIED"),
        /**
         * Overwrites destination objects with the source objects, only if the objects have the same name but different HTTP ETags or checksum values.
         * 
         */
        Different("DIFFERENT"),
        /**
         * Never overwrites a destination object if a source object has the same name. In this case, the source object is not transferred.
         * 
         */
        Never("NEVER"),
        /**
         * Always overwrite the destination object with the source object, even if the HTTP Etags or checksum values are the same.
         * 
         */
        Always("ALWAYS");

        private final String value;

        TransferOptionsOverwriteWhen(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TransferOptionsOverwriteWhen[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }