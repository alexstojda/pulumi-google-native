// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class VerticalPodAutoscalingResponse {
    /**
     * @return Enables vertical pod autoscaling.
     * 
     */
    private Boolean enabled;

    private VerticalPodAutoscalingResponse() {}
    /**
     * @return Enables vertical pod autoscaling.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VerticalPodAutoscalingResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(VerticalPodAutoscalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public VerticalPodAutoscalingResponse build() {
            final var o = new VerticalPodAutoscalingResponse();
            o.enabled = enabled;
            return o;
        }
    }
}