// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing.v1.outputs.ManualShardingResponse;
import com.pulumi.googlenative.testing.v1.outputs.UniformShardingResponse;
import java.util.Objects;

@CustomType
public final class ShardingOptionResponse {
    /**
     * @return Shards test cases into the specified groups of packages, classes, and/or methods.
     * 
     */
    private ManualShardingResponse manualSharding;
    /**
     * @return Uniformly shards test cases given a total number of shards.
     * 
     */
    private UniformShardingResponse uniformSharding;

    private ShardingOptionResponse() {}
    /**
     * @return Shards test cases into the specified groups of packages, classes, and/or methods.
     * 
     */
    public ManualShardingResponse manualSharding() {
        return this.manualSharding;
    }
    /**
     * @return Uniformly shards test cases given a total number of shards.
     * 
     */
    public UniformShardingResponse uniformSharding() {
        return this.uniformSharding;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShardingOptionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ManualShardingResponse manualSharding;
        private UniformShardingResponse uniformSharding;
        public Builder() {}
        public Builder(ShardingOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manualSharding = defaults.manualSharding;
    	      this.uniformSharding = defaults.uniformSharding;
        }

        @CustomType.Setter
        public Builder manualSharding(ManualShardingResponse manualSharding) {
            this.manualSharding = Objects.requireNonNull(manualSharding);
            return this;
        }
        @CustomType.Setter
        public Builder uniformSharding(UniformShardingResponse uniformSharding) {
            this.uniformSharding = Objects.requireNonNull(uniformSharding);
            return this;
        }
        public ShardingOptionResponse build() {
            final var o = new ShardingOptionResponse();
            o.manualSharding = manualSharding;
            o.uniformSharding = uniformSharding;
            return o;
        }
    }
}