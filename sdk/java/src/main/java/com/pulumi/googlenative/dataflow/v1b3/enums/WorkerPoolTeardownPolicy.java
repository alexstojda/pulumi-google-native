// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow.v1b3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user&#39;s project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @EnumType
    public enum WorkerPoolTeardownPolicy {
        /**
         * The teardown policy isn&#39;t specified, or is unknown.
         * 
         */
        TeardownPolicyUnknown("TEARDOWN_POLICY_UNKNOWN"),
        /**
         * Always teardown the resource.
         * 
         */
        TeardownAlways("TEARDOWN_ALWAYS"),
        /**
         * Teardown the resource on success. This is useful for debugging failures.
         * 
         */
        TeardownOnSuccess("TEARDOWN_ON_SUCCESS"),
        /**
         * Never teardown the resource. This is useful for debugging and development.
         * 
         */
        TeardownNever("TEARDOWN_NEVER");

        private final String value;

        WorkerPoolTeardownPolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WorkerPoolTeardownPolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }