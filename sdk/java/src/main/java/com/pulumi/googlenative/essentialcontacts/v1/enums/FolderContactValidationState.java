// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.essentialcontacts.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    @EnumType
    public enum FolderContactValidationState {
        /**
         * The validation state is unknown or unspecified.
         * 
         */
        ValidationStateUnspecified("VALIDATION_STATE_UNSPECIFIED"),
        /**
         * The contact is marked as valid. This is usually done manually by the contact admin. All new contacts begin in the valid state.
         * 
         */
        Valid("VALID"),
        /**
         * The contact is considered invalid. This may become the state if the contact&#39;s email is found to be unreachable.
         * 
         */
        Invalid("INVALID");

        private final String value;

        FolderContactValidationState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FolderContactValidationState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }