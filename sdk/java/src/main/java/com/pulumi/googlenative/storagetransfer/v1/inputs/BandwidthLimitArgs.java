// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a bandwidth limit for an agent pool.
 * 
 */
public final class BandwidthLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final BandwidthLimitArgs Empty = new BandwidthLimitArgs();

    /**
     * Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
     * 
     */
    @Import(name="limitMbps")
    private @Nullable Output<String> limitMbps;

    /**
     * @return Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
     * 
     */
    public Optional<Output<String>> limitMbps() {
        return Optional.ofNullable(this.limitMbps);
    }

    private BandwidthLimitArgs() {}

    private BandwidthLimitArgs(BandwidthLimitArgs $) {
        this.limitMbps = $.limitMbps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BandwidthLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BandwidthLimitArgs $;

        public Builder() {
            $ = new BandwidthLimitArgs();
        }

        public Builder(BandwidthLimitArgs defaults) {
            $ = new BandwidthLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param limitMbps Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
         * 
         * @return builder
         * 
         */
        public Builder limitMbps(@Nullable Output<String> limitMbps) {
            $.limitMbps = limitMbps;
            return this;
        }

        /**
         * @param limitMbps Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
         * 
         * @return builder
         * 
         */
        public Builder limitMbps(String limitMbps) {
            return limitMbps(Output.of(limitMbps));
        }

        public BandwidthLimitArgs build() {
            return $;
        }
    }

}