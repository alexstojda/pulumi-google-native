// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1.enums.UpgradeSettingsStrategy;
import com.pulumi.googlenative.container.v1.inputs.BlueGreenSettingsArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * These upgrade settings control the level of parallelism and the level of disruption caused by an upgrade. maxUnavailable controls the number of nodes that can be simultaneously unavailable. maxSurge controls the number of additional nodes that can be added to the node pool temporarily for the time of the upgrade to increase the number of available nodes. (maxUnavailable + maxSurge) determines the level of parallelism (how many nodes are being upgraded at the same time). Note: upgrades inevitably introduce some disruption since workloads need to be moved from old nodes to new, upgraded ones. Even if maxUnavailable=0, this holds true. (Disruption stays within the limits of PodDisruptionBudget, if it is configured.) Consider a hypothetical node pool with 5 nodes having maxSurge=2, maxUnavailable=1. This means the upgrade process upgrades 3 nodes simultaneously. It creates 2 additional (upgraded) nodes, then it brings down 3 old (not yet upgraded) nodes at the same time. This ensures that there are always at least 4 nodes available. These upgrade settings configure the upgrade strategy for the node pool. Use strategy to switch between the strategies applied to the node pool. If the strategy is ROLLING, use max_surge and max_unavailable to control the level of parallelism and the level of disruption caused by upgrade. 1. maxSurge controls the number of additional nodes that can be added to the node pool temporarily for the time of the upgrade to increase the number of available nodes. 2. maxUnavailable controls the number of nodes that can be simultaneously unavailable. 3. (maxUnavailable + maxSurge) determines the level of parallelism (how many nodes are being upgraded at the same time). If the strategy is BLUE_GREEN, use blue_green_settings to configure the blue-green upgrade related settings. 1. standard_rollout_policy is the default policy. The policy is used to control the way blue pool gets drained. The draining is executed in the batch mode. The batch size could be specified as either percentage of the node pool size or the number of nodes. batch_soak_duration is the soak time after each batch gets drained. 2. node_pool_soak_duration is the soak time after all blue nodes are drained. After this period, the blue pool nodes will be deleted.
 * 
 */
public final class UpgradeSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UpgradeSettingsArgs Empty = new UpgradeSettingsArgs();

    /**
     * Settings for blue-green upgrade strategy.
     * 
     */
    @Import(name="blueGreenSettings")
    private @Nullable Output<BlueGreenSettingsArgs> blueGreenSettings;

    /**
     * @return Settings for blue-green upgrade strategy.
     * 
     */
    public Optional<Output<BlueGreenSettingsArgs>> blueGreenSettings() {
        return Optional.ofNullable(this.blueGreenSettings);
    }

    /**
     * The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
     * 
     */
    @Import(name="maxSurge")
    private @Nullable Output<Integer> maxSurge;

    /**
     * @return The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
     * 
     */
    public Optional<Output<Integer>> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }

    /**
     * The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
     * 
     */
    @Import(name="maxUnavailable")
    private @Nullable Output<Integer> maxUnavailable;

    /**
     * @return The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
     * 
     */
    public Optional<Output<Integer>> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    /**
     * Update strategy of the node pool.
     * 
     */
    @Import(name="strategy")
    private @Nullable Output<UpgradeSettingsStrategy> strategy;

    /**
     * @return Update strategy of the node pool.
     * 
     */
    public Optional<Output<UpgradeSettingsStrategy>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    private UpgradeSettingsArgs() {}

    private UpgradeSettingsArgs(UpgradeSettingsArgs $) {
        this.blueGreenSettings = $.blueGreenSettings;
        this.maxSurge = $.maxSurge;
        this.maxUnavailable = $.maxUnavailable;
        this.strategy = $.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpgradeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeSettingsArgs $;

        public Builder() {
            $ = new UpgradeSettingsArgs();
        }

        public Builder(UpgradeSettingsArgs defaults) {
            $ = new UpgradeSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blueGreenSettings Settings for blue-green upgrade strategy.
         * 
         * @return builder
         * 
         */
        public Builder blueGreenSettings(@Nullable Output<BlueGreenSettingsArgs> blueGreenSettings) {
            $.blueGreenSettings = blueGreenSettings;
            return this;
        }

        /**
         * @param blueGreenSettings Settings for blue-green upgrade strategy.
         * 
         * @return builder
         * 
         */
        public Builder blueGreenSettings(BlueGreenSettingsArgs blueGreenSettings) {
            return blueGreenSettings(Output.of(blueGreenSettings));
        }

        /**
         * @param maxSurge The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(@Nullable Output<Integer> maxSurge) {
            $.maxSurge = maxSurge;
            return this;
        }

        /**
         * @param maxSurge The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process.
         * 
         * @return builder
         * 
         */
        public Builder maxSurge(Integer maxSurge) {
            return maxSurge(Output.of(maxSurge));
        }

        /**
         * @param maxUnavailable The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(@Nullable Output<Integer> maxUnavailable) {
            $.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * @param maxUnavailable The maximum number of nodes that can be simultaneously unavailable during the upgrade process. A node is considered available if its status is Ready.
         * 
         * @return builder
         * 
         */
        public Builder maxUnavailable(Integer maxUnavailable) {
            return maxUnavailable(Output.of(maxUnavailable));
        }

        /**
         * @param strategy Update strategy of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder strategy(@Nullable Output<UpgradeSettingsStrategy> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy Update strategy of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder strategy(UpgradeSettingsStrategy strategy) {
            return strategy(Output.of(strategy));
        }

        public UpgradeSettingsArgs build() {
            return $;
        }
    }

}