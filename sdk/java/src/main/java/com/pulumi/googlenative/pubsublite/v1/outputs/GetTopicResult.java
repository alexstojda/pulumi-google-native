// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsublite.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.pubsublite.v1.outputs.PartitionConfigResponse;
import com.pulumi.googlenative.pubsublite.v1.outputs.ReservationConfigResponse;
import com.pulumi.googlenative.pubsublite.v1.outputs.RetentionConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTopicResult {
    /**
     * @return The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    private String name;
    /**
     * @return The settings for this topic&#39;s partitions.
     * 
     */
    private PartitionConfigResponse partitionConfig;
    /**
     * @return The settings for this topic&#39;s Reservation usage.
     * 
     */
    private ReservationConfigResponse reservationConfig;
    /**
     * @return The settings for this topic&#39;s message retention.
     * 
     */
    private RetentionConfigResponse retentionConfig;

    private GetTopicResult() {}
    /**
     * @return The name of the topic. Structured like: projects/{project_number}/locations/{location}/topics/{topic_id}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The settings for this topic&#39;s partitions.
     * 
     */
    public PartitionConfigResponse partitionConfig() {
        return this.partitionConfig;
    }
    /**
     * @return The settings for this topic&#39;s Reservation usage.
     * 
     */
    public ReservationConfigResponse reservationConfig() {
        return this.reservationConfig;
    }
    /**
     * @return The settings for this topic&#39;s message retention.
     * 
     */
    public RetentionConfigResponse retentionConfig() {
        return this.retentionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private PartitionConfigResponse partitionConfig;
        private ReservationConfigResponse reservationConfig;
        private RetentionConfigResponse retentionConfig;
        public Builder() {}
        public Builder(GetTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.partitionConfig = defaults.partitionConfig;
    	      this.reservationConfig = defaults.reservationConfig;
    	      this.retentionConfig = defaults.retentionConfig;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder partitionConfig(PartitionConfigResponse partitionConfig) {
            this.partitionConfig = Objects.requireNonNull(partitionConfig);
            return this;
        }
        @CustomType.Setter
        public Builder reservationConfig(ReservationConfigResponse reservationConfig) {
            this.reservationConfig = Objects.requireNonNull(reservationConfig);
            return this;
        }
        @CustomType.Setter
        public Builder retentionConfig(RetentionConfigResponse retentionConfig) {
            this.retentionConfig = Objects.requireNonNull(retentionConfig);
            return this;
        }
        public GetTopicResult build() {
            final var o = new GetTopicResult();
            o.name = name;
            o.partitionConfig = partitionConfig;
            o.reservationConfig = reservationConfig;
            o.retentionConfig = retentionConfig;
            return o;
        }
    }
}