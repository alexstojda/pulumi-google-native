// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class UniformShardingResponse {
    /**
     * @return Total number of shards. When any physical devices are selected, the number must be &gt;= 1 and &lt;= 50. When no physical devices are selected, the number must be &gt;= 1 and &lt;= 500.
     * 
     */
    private Integer numShards;

    private UniformShardingResponse() {}
    /**
     * @return Total number of shards. When any physical devices are selected, the number must be &gt;= 1 and &lt;= 50. When no physical devices are selected, the number must be &gt;= 1 and &lt;= 500.
     * 
     */
    public Integer numShards() {
        return this.numShards;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniformShardingResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer numShards;
        public Builder() {}
        public Builder(UniformShardingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numShards = defaults.numShards;
        }

        @CustomType.Setter
        public Builder numShards(Integer numShards) {
            this.numShards = Objects.requireNonNull(numShards);
            return this;
        }
        public UniformShardingResponse build() {
            final var o = new UniformShardingResponse();
            o.numShards = numShards;
            return o;
        }
    }
}