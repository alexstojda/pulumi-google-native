// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Error condition this handler applies to.
     * 
     */
    @EnumType
    public enum ErrorHandlerErrorCode {
        /**
         * Not specified. ERROR_CODE_DEFAULT is assumed.
         * 
         */
        ErrorCodeUnspecified("ERROR_CODE_UNSPECIFIED"),
        /**
         * All other error types.
         * 
         */
        ErrorCodeDefault("ERROR_CODE_DEFAULT"),
        /**
         * Application has exceeded a resource quota.
         * 
         */
        ErrorCodeOverQuota("ERROR_CODE_OVER_QUOTA"),
        /**
         * Client blocked by the application&#39;s Denial of Service protection configuration.
         * 
         */
        ErrorCodeDosApiDenial("ERROR_CODE_DOS_API_DENIAL"),
        /**
         * Deadline reached before the application responds.
         * 
         */
        ErrorCodeTimeout("ERROR_CODE_TIMEOUT");

        private final String value;

        ErrorHandlerErrorCode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ErrorHandlerErrorCode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }