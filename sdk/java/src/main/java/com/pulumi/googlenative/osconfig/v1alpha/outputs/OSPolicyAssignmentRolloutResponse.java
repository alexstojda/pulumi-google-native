// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig.v1alpha.outputs.FixedOrPercentResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OSPolicyAssignmentRolloutResponse {
    /**
     * @return The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
     * 
     */
    private FixedOrPercentResponse disruptionBudget;
    /**
     * @return This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    private String minWaitDuration;

    private OSPolicyAssignmentRolloutResponse() {}
    /**
     * @return The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
     * 
     */
    public FixedOrPercentResponse disruptionBudget() {
        return this.disruptionBudget;
    }
    /**
     * @return This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    public String minWaitDuration() {
        return this.minWaitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentRolloutResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private FixedOrPercentResponse disruptionBudget;
        private String minWaitDuration;
        public Builder() {}
        public Builder(OSPolicyAssignmentRolloutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.minWaitDuration = defaults.minWaitDuration;
        }

        @CustomType.Setter
        public Builder disruptionBudget(FixedOrPercentResponse disruptionBudget) {
            this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
            return this;
        }
        @CustomType.Setter
        public Builder minWaitDuration(String minWaitDuration) {
            this.minWaitDuration = Objects.requireNonNull(minWaitDuration);
            return this;
        }
        public OSPolicyAssignmentRolloutResponse build() {
            final var o = new OSPolicyAssignmentRolloutResponse();
            o.disruptionBudget = disruptionBudget;
            o.minWaitDuration = minWaitDuration;
            return o;
        }
    }
}