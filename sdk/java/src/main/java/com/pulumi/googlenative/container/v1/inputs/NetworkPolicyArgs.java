// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1.enums.NetworkPolicyProvider;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration options for the NetworkPolicy feature. https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
 * 
 */
public final class NetworkPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyArgs Empty = new NetworkPolicyArgs();

    /**
     * Whether network policy is enabled on the cluster.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether network policy is enabled on the cluster.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The selected network policy provider.
     * 
     */
    @Import(name="provider")
    private @Nullable Output<NetworkPolicyProvider> provider;

    /**
     * @return The selected network policy provider.
     * 
     */
    public Optional<Output<NetworkPolicyProvider>> provider() {
        return Optional.ofNullable(this.provider);
    }

    private NetworkPolicyArgs() {}

    private NetworkPolicyArgs(NetworkPolicyArgs $) {
        this.enabled = $.enabled;
        this.provider = $.provider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyArgs $;

        public Builder() {
            $ = new NetworkPolicyArgs();
        }

        public Builder(NetworkPolicyArgs defaults) {
            $ = new NetworkPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether network policy is enabled on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether network policy is enabled on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param provider The selected network policy provider.
         * 
         * @return builder
         * 
         */
        public Builder provider(@Nullable Output<NetworkPolicyProvider> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider The selected network policy provider.
         * 
         * @return builder
         * 
         */
        public Builder provider(NetworkPolicyProvider provider) {
            return provider(Output.of(provider));
        }

        public NetworkPolicyArgs build() {
            return $;
        }
    }

}