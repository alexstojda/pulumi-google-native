// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The resource type of the group members.
     * 
     */
    @EnumType
    public enum ResourceGroupResourceType {
        /**
         * Default value (not valid).
         * 
         */
        ResourceTypeUnspecified("RESOURCE_TYPE_UNSPECIFIED"),
        /**
         * A group of instances from Google Cloud Platform (GCP) or Amazon Web Services (AWS).
         * 
         */
        Instance("INSTANCE"),
        /**
         * A group of Amazon ELB load balancers.
         * 
         */
        AwsElbLoadBalancer("AWS_ELB_LOAD_BALANCER");

        private final String value;

        ResourceGroupResourceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResourceGroupResourceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }