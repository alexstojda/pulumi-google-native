// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * cgroup_mode specifies the cgroup mode to be used on the node.
     * 
     */
    @EnumType
    public enum LinuxNodeConfigCgroupMode {
        /**
         * CGROUP_MODE_UNSPECIFIED is when unspecified cgroup configuration is used. The default for the GKE node OS image will be used.
         * 
         */
        CgroupModeUnspecified("CGROUP_MODE_UNSPECIFIED"),
        /**
         * CGROUP_MODE_V1 specifies to use cgroupv1 for the cgroup configuration on the node image.
         * 
         */
        CgroupModeV1("CGROUP_MODE_V1"),
        /**
         * CGROUP_MODE_V2 specifies to use cgroupv2 for the cgroup configuration on the node image.
         * 
         */
        CgroupModeV2("CGROUP_MODE_V2");

        private final String value;

        LinuxNodeConfigCgroupMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LinuxNodeConfigCgroupMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }