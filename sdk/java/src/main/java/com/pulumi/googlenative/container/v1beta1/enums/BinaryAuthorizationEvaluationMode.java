// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Mode of operation for binauthz policy evaluation. Currently the only options are equivalent to enable/disable. If unspecified, defaults to DISABLED.
     * 
     */
    @EnumType
    public enum BinaryAuthorizationEvaluationMode {
        /**
         * Default value
         * 
         */
        EvaluationModeUnspecified("EVALUATION_MODE_UNSPECIFIED"),
        /**
         * Disable BinaryAuthorization
         * 
         */
        Disabled("DISABLED"),
        /**
         * Enforce Kubernetes admission requests with BinaryAuthorization using the project&#39;s singleton policy. This is equivalent to setting the enabled boolean to true.
         * 
         */
        ProjectSingletonPolicyEnforce("PROJECT_SINGLETON_POLICY_ENFORCE");

        private final String value;

        BinaryAuthorizationEvaluationMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BinaryAuthorizationEvaluationMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }