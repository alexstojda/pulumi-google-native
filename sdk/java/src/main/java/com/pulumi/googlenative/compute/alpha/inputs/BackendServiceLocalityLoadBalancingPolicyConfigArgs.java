// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.inputs.BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyArgs;
import com.pulumi.googlenative.compute.alpha.inputs.BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container for either a built-in LB policy supported by gRPC or Envoy or a custom one implemented by the end user.
 * 
 */
public final class BackendServiceLocalityLoadBalancingPolicyConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceLocalityLoadBalancingPolicyConfigArgs Empty = new BackendServiceLocalityLoadBalancingPolicyConfigArgs();

    @Import(name="customPolicy")
    private @Nullable Output<BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyArgs> customPolicy;

    public Optional<Output<BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyArgs>> customPolicy() {
        return Optional.ofNullable(this.customPolicy);
    }

    @Import(name="policy")
    private @Nullable Output<BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs> policy;

    public Optional<Output<BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private BackendServiceLocalityLoadBalancingPolicyConfigArgs() {}

    private BackendServiceLocalityLoadBalancingPolicyConfigArgs(BackendServiceLocalityLoadBalancingPolicyConfigArgs $) {
        this.customPolicy = $.customPolicy;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceLocalityLoadBalancingPolicyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceLocalityLoadBalancingPolicyConfigArgs $;

        public Builder() {
            $ = new BackendServiceLocalityLoadBalancingPolicyConfigArgs();
        }

        public Builder(BackendServiceLocalityLoadBalancingPolicyConfigArgs defaults) {
            $ = new BackendServiceLocalityLoadBalancingPolicyConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder customPolicy(@Nullable Output<BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyArgs> customPolicy) {
            $.customPolicy = customPolicy;
            return this;
        }

        public Builder customPolicy(BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyArgs customPolicy) {
            return customPolicy(Output.of(customPolicy));
        }

        public Builder policy(@Nullable Output<BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(BackendServiceLocalityLoadBalancingPolicyConfigPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        public BackendServiceLocalityLoadBalancingPolicyConfigArgs build() {
            return $;
        }
    }

}