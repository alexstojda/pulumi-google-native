// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A concurrency control configuration. Defines a group config that, when attached to an instance, recognizes that instance as part of a group of instances where only up the concurrency_limit of instances in that group can undergo simultaneous maintenance. For more information: go/concurrency-control-design-doc
 * 
 */
public final class ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs Empty = new ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs();

    @Import(name="concurrencyLimit")
    private @Nullable Output<Integer> concurrencyLimit;

    public Optional<Output<Integer>> concurrencyLimit() {
        return Optional.ofNullable(this.concurrencyLimit);
    }

    private ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs() {}

    private ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs(ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs $) {
        this.concurrencyLimit = $.concurrencyLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs $;

        public Builder() {
            $ = new ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs();
        }

        public Builder(ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs defaults) {
            $ = new ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs(Objects.requireNonNull(defaults));
        }

        public Builder concurrencyLimit(@Nullable Output<Integer> concurrencyLimit) {
            $.concurrencyLimit = concurrencyLimit;
            return this;
        }

        public Builder concurrencyLimit(Integer concurrencyLimit) {
            return concurrencyLimit(Output.of(concurrencyLimit));
        }

        public ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs build() {
            return $;
        }
    }

}