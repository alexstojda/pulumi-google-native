// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks.v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.AppEngineRoutingResponse;
import java.util.Objects;

@CustomType
public final class AppEngineHttpTargetResponse {
    /**
     * @return Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    private AppEngineRoutingResponse appEngineRoutingOverride;

    private AppEngineHttpTargetResponse() {}
    /**
     * @return Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    public AppEngineRoutingResponse appEngineRoutingOverride() {
        return this.appEngineRoutingOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineHttpTargetResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AppEngineRoutingResponse appEngineRoutingOverride;
        public Builder() {}
        public Builder(AppEngineHttpTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRoutingOverride = defaults.appEngineRoutingOverride;
        }

        @CustomType.Setter
        public Builder appEngineRoutingOverride(AppEngineRoutingResponse appEngineRoutingOverride) {
            this.appEngineRoutingOverride = Objects.requireNonNull(appEngineRoutingOverride);
            return this;
        }
        public AppEngineHttpTargetResponse build() {
            final var o = new AppEngineHttpTargetResponse();
            o.appEngineRoutingOverride = appEngineRoutingOverride;
            return o;
        }
    }
}