// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Range of numerical values within min and max.
 * 
 */
public final class GoogleMonitoringV3RangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleMonitoringV3RangeArgs Empty = new GoogleMonitoringV3RangeArgs();

    /**
     * Range maximum.
     * 
     */
    @Import(name="max")
    private @Nullable Output<Double> max;

    /**
     * @return Range maximum.
     * 
     */
    public Optional<Output<Double>> max() {
        return Optional.ofNullable(this.max);
    }

    /**
     * Range minimum.
     * 
     */
    @Import(name="min")
    private @Nullable Output<Double> min;

    /**
     * @return Range minimum.
     * 
     */
    public Optional<Output<Double>> min() {
        return Optional.ofNullable(this.min);
    }

    private GoogleMonitoringV3RangeArgs() {}

    private GoogleMonitoringV3RangeArgs(GoogleMonitoringV3RangeArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleMonitoringV3RangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleMonitoringV3RangeArgs $;

        public Builder() {
            $ = new GoogleMonitoringV3RangeArgs();
        }

        public Builder(GoogleMonitoringV3RangeArgs defaults) {
            $ = new GoogleMonitoringV3RangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param max Range maximum.
         * 
         * @return builder
         * 
         */
        public Builder max(@Nullable Output<Double> max) {
            $.max = max;
            return this;
        }

        /**
         * @param max Range maximum.
         * 
         * @return builder
         * 
         */
        public Builder max(Double max) {
            return max(Output.of(max));
        }

        /**
         * @param min Range minimum.
         * 
         * @return builder
         * 
         */
        public Builder min(@Nullable Output<Double> min) {
            $.min = min;
            return this;
        }

        /**
         * @param min Range minimum.
         * 
         * @return builder
         * 
         */
        public Builder min(Double min) {
            return min(Output.of(min));
        }

        public GoogleMonitoringV3RangeArgs build() {
            return $;
        }
    }

}