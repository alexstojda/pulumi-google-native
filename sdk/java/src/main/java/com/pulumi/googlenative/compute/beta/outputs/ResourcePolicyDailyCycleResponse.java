// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePolicyDailyCycleResponse {
    /**
     * @return Defines a schedule with units measured in days. The value determines how many days pass between the start of each cycle.
     * 
     */
    private Integer daysInCycle;
    /**
     * @return [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
     */
    private String duration;
    /**
     * @return Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    private String startTime;

    private ResourcePolicyDailyCycleResponse() {}
    /**
     * @return Defines a schedule with units measured in days. The value determines how many days pass between the start of each cycle.
     * 
     */
    public Integer daysInCycle() {
        return this.daysInCycle;
    }
    /**
     * @return [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyDailyCycleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer daysInCycle;
        private String duration;
        private String startTime;
        public Builder() {}
        public Builder(ResourcePolicyDailyCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysInCycle = defaults.daysInCycle;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder daysInCycle(Integer daysInCycle) {
            this.daysInCycle = Objects.requireNonNull(daysInCycle);
            return this;
        }
        @CustomType.Setter
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public ResourcePolicyDailyCycleResponse build() {
            final var o = new ResourcePolicyDailyCycleResponse();
            o.daysInCycle = daysInCycle;
            o.duration = duration;
            o.startTime = startTime;
            return o;
        }
    }
}