// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for how to query telemetry on a Service.
 * 
 */
public final class TelemetryArgs extends com.pulumi.resources.ResourceArgs {

    public static final TelemetryArgs Empty = new TelemetryArgs();

    /**
     * The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    private TelemetryArgs() {}

    private TelemetryArgs(TelemetryArgs $) {
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TelemetryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TelemetryArgs $;

        public Builder() {
            $ = new TelemetryArgs();
        }

        public Builder(TelemetryArgs defaults) {
            $ = new TelemetryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceName The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public TelemetryArgs build() {
            return $;
        }
    }

}