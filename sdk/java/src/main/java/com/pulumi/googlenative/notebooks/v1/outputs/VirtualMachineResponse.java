// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.notebooks.v1.outputs.VirtualMachineConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualMachineResponse {
    /**
     * @return The unique identifier of the Managed Compute Engine instance.
     * 
     */
    private String instanceId;
    /**
     * @return The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    private String instanceName;
    /**
     * @return Virtual Machine configuration settings.
     * 
     */
    private VirtualMachineConfigResponse virtualMachineConfig;

    private VirtualMachineResponse() {}
    /**
     * @return The unique identifier of the Managed Compute Engine instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return Virtual Machine configuration settings.
     * 
     */
    public VirtualMachineConfigResponse virtualMachineConfig() {
        return this.virtualMachineConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceId;
        private String instanceName;
        private VirtualMachineConfigResponse virtualMachineConfig;
        public Builder() {}
        public Builder(VirtualMachineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.virtualMachineConfig = defaults.virtualMachineConfig;
        }

        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        @CustomType.Setter
        public Builder virtualMachineConfig(VirtualMachineConfigResponse virtualMachineConfig) {
            this.virtualMachineConfig = Objects.requireNonNull(virtualMachineConfig);
            return this;
        }
        public VirtualMachineResponse build() {
            final var o = new VirtualMachineResponse();
            o.instanceId = instanceId;
            o.instanceName = instanceName;
            o.virtualMachineConfig = virtualMachineConfig;
            return o;
        }
    }
}