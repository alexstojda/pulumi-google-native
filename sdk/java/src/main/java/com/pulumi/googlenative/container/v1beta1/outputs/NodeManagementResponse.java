// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container.v1beta1.outputs.AutoUpgradeOptionsResponse;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class NodeManagementResponse {
    /**
     * @return Whether the nodes will be automatically repaired.
     * 
     */
    private Boolean autoRepair;
    /**
     * @return Whether the nodes will be automatically upgraded.
     * 
     */
    private Boolean autoUpgrade;
    /**
     * @return Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    private AutoUpgradeOptionsResponse upgradeOptions;

    private NodeManagementResponse() {}
    /**
     * @return Whether the nodes will be automatically repaired.
     * 
     */
    public Boolean autoRepair() {
        return this.autoRepair;
    }
    /**
     * @return Whether the nodes will be automatically upgraded.
     * 
     */
    public Boolean autoUpgrade() {
        return this.autoUpgrade;
    }
    /**
     * @return Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    public AutoUpgradeOptionsResponse upgradeOptions() {
        return this.upgradeOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeManagementResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoRepair;
        private Boolean autoUpgrade;
        private AutoUpgradeOptionsResponse upgradeOptions;
        public Builder() {}
        public Builder(NodeManagementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRepair = defaults.autoRepair;
    	      this.autoUpgrade = defaults.autoUpgrade;
    	      this.upgradeOptions = defaults.upgradeOptions;
        }

        @CustomType.Setter
        public Builder autoRepair(Boolean autoRepair) {
            this.autoRepair = Objects.requireNonNull(autoRepair);
            return this;
        }
        @CustomType.Setter
        public Builder autoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = Objects.requireNonNull(autoUpgrade);
            return this;
        }
        @CustomType.Setter
        public Builder upgradeOptions(AutoUpgradeOptionsResponse upgradeOptions) {
            this.upgradeOptions = Objects.requireNonNull(upgradeOptions);
            return this;
        }
        public NodeManagementResponse build() {
            final var o = new NodeManagementResponse();
            o.autoRepair = autoRepair;
            o.autoUpgrade = autoUpgrade;
            o.upgradeOptions = upgradeOptions;
            return o;
        }
    }
}