// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration.v1alpha1.outputs.CycleStepResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReplicationCycleResponse {
    /**
     * @return The time the replication cycle has ended.
     * 
     */
    private String endTime;
    /**
     * @return The identifier of the ReplicationCycle.
     * 
     */
    private String name;
    /**
     * @return The current progress in percentage of this cycle.
     * 
     */
    private Integer progress;
    /**
     * @return The current progress in percentage of this cycle.
     * 
     */
    private Integer progressPercent;
    /**
     * @return The time the replication cycle has started.
     * 
     */
    private String startTime;
    /**
     * @return The cycle&#39;s steps list representing its progress.
     * 
     */
    private List<CycleStepResponse> steps;
    /**
     * @return The accumulated duration the replication cycle was paused.
     * 
     */
    private String totalPauseDuration;

    private ReplicationCycleResponse() {}
    /**
     * @return The time the replication cycle has ended.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The identifier of the ReplicationCycle.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current progress in percentage of this cycle.
     * 
     */
    public Integer progress() {
        return this.progress;
    }
    /**
     * @return The current progress in percentage of this cycle.
     * 
     */
    public Integer progressPercent() {
        return this.progressPercent;
    }
    /**
     * @return The time the replication cycle has started.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The cycle&#39;s steps list representing its progress.
     * 
     */
    public List<CycleStepResponse> steps() {
        return this.steps;
    }
    /**
     * @return The accumulated duration the replication cycle was paused.
     * 
     */
    public String totalPauseDuration() {
        return this.totalPauseDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationCycleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endTime;
        private String name;
        private Integer progress;
        private Integer progressPercent;
        private String startTime;
        private List<CycleStepResponse> steps;
        private String totalPauseDuration;
        public Builder() {}
        public Builder(ReplicationCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.progress = defaults.progress;
    	      this.progressPercent = defaults.progressPercent;
    	      this.startTime = defaults.startTime;
    	      this.steps = defaults.steps;
    	      this.totalPauseDuration = defaults.totalPauseDuration;
        }

        @CustomType.Setter
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }
        @CustomType.Setter
        public Builder progressPercent(Integer progressPercent) {
            this.progressPercent = Objects.requireNonNull(progressPercent);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder steps(List<CycleStepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(CycleStepResponse... steps) {
            return steps(List.of(steps));
        }
        @CustomType.Setter
        public Builder totalPauseDuration(String totalPauseDuration) {
            this.totalPauseDuration = Objects.requireNonNull(totalPauseDuration);
            return this;
        }
        public ReplicationCycleResponse build() {
            final var o = new ReplicationCycleResponse();
            o.endTime = endTime;
            o.name = name;
            o.progress = progress;
            o.progressPercent = progressPercent;
            o.startTime = startTime;
            o.steps = steps;
            o.totalPauseDuration = totalPauseDuration;
            return o;
        }
    }
}