// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.gameservices.v1beta.outputs.FleetConfigResponse;
import com.pulumi.googlenative.gameservices.v1beta.outputs.ScalingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConfigResult {
    /**
     * @return The creation time.
     * 
     */
    private String createTime;
    /**
     * @return The description of the game server config.
     * 
     */
    private String description;
    /**
     * @return FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    private List<FleetConfigResponse> fleetConfigs;
    /**
     * @return The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The resource name of the game server config, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}/configs/{configId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    private String name;
    /**
     * @return The autoscaling settings.
     * 
     */
    private List<ScalingConfigResponse> scalingConfigs;
    /**
     * @return The last-modified time.
     * 
     */
    private String updateTime;

    private GetConfigResult() {}
    /**
     * @return The creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the game server config.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    public List<FleetConfigResponse> fleetConfigs() {
        return this.fleetConfigs;
    }
    /**
     * @return The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The resource name of the game server config, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}/configs/{configId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The autoscaling settings.
     * 
     */
    public List<ScalingConfigResponse> scalingConfigs() {
        return this.scalingConfigs;
    }
    /**
     * @return The last-modified time.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private List<FleetConfigResponse> fleetConfigs;
        private Map<String,String> labels;
        private String name;
        private List<ScalingConfigResponse> scalingConfigs;
        private String updateTime;
        public Builder() {}
        public Builder(GetConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.fleetConfigs = defaults.fleetConfigs;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.scalingConfigs = defaults.scalingConfigs;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder fleetConfigs(List<FleetConfigResponse> fleetConfigs) {
            this.fleetConfigs = Objects.requireNonNull(fleetConfigs);
            return this;
        }
        public Builder fleetConfigs(FleetConfigResponse... fleetConfigs) {
            return fleetConfigs(List.of(fleetConfigs));
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder scalingConfigs(List<ScalingConfigResponse> scalingConfigs) {
            this.scalingConfigs = Objects.requireNonNull(scalingConfigs);
            return this;
        }
        public Builder scalingConfigs(ScalingConfigResponse... scalingConfigs) {
            return scalingConfigs(List.of(scalingConfigs));
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetConfigResult build() {
            final var o = new GetConfigResult();
            o.createTime = createTime;
            o.description = description;
            o.fleetConfigs = fleetConfigs;
            o.labels = labels;
            o.name = name;
            o.scalingConfigs = scalingConfigs;
            o.updateTime = updateTime;
            return o;
        }
    }
}