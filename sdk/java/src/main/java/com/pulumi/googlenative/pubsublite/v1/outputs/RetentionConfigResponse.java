// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RetentionConfigResponse {
    /**
     * @return The provisioned storage, in bytes, per partition. If the number of bytes stored in any of the topic&#39;s partitions grows beyond this value, older messages will be dropped to make room for newer ones, regardless of the value of `period`.
     * 
     */
    private String perPartitionBytes;
    /**
     * @return How long a published message is retained. If unset, messages will be retained as long as the bytes retained for each partition is below `per_partition_bytes`.
     * 
     */
    private String period;

    private RetentionConfigResponse() {}
    /**
     * @return The provisioned storage, in bytes, per partition. If the number of bytes stored in any of the topic&#39;s partitions grows beyond this value, older messages will be dropped to make room for newer ones, regardless of the value of `period`.
     * 
     */
    public String perPartitionBytes() {
        return this.perPartitionBytes;
    }
    /**
     * @return How long a published message is retained. If unset, messages will be retained as long as the bytes retained for each partition is below `per_partition_bytes`.
     * 
     */
    public String period() {
        return this.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetentionConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String perPartitionBytes;
        private String period;
        public Builder() {}
        public Builder(RetentionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perPartitionBytes = defaults.perPartitionBytes;
    	      this.period = defaults.period;
        }

        @CustomType.Setter
        public Builder perPartitionBytes(String perPartitionBytes) {
            this.perPartitionBytes = Objects.requireNonNull(perPartitionBytes);
            return this;
        }
        @CustomType.Setter
        public Builder period(String period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        public RetentionConfigResponse build() {
            final var o = new RetentionConfigResponse();
            o.perPartitionBytes = perPartitionBytes;
            o.period = period;
            return o;
        }
    }
}