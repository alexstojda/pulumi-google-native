// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.inputs.InstancePropertiesPatchArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerAllInstancesConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerAllInstancesConfigArgs Empty = new InstanceGroupManagerAllInstancesConfigArgs();

    /**
     * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group&#39;s instances to apply the configuration. To apply the configuration, set the group&#39;s updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<InstancePropertiesPatchArgs> properties;

    /**
     * @return Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group&#39;s instances to apply the configuration. To apply the configuration, set the group&#39;s updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
     * 
     */
    public Optional<Output<InstancePropertiesPatchArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private InstanceGroupManagerAllInstancesConfigArgs() {}

    private InstanceGroupManagerAllInstancesConfigArgs(InstanceGroupManagerAllInstancesConfigArgs $) {
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerAllInstancesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerAllInstancesConfigArgs $;

        public Builder() {
            $ = new InstanceGroupManagerAllInstancesConfigArgs();
        }

        public Builder(InstanceGroupManagerAllInstancesConfigArgs defaults) {
            $ = new InstanceGroupManagerAllInstancesConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param properties Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group&#39;s instances to apply the configuration. To apply the configuration, set the group&#39;s updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<InstancePropertiesPatchArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group&#39;s instances to apply the configuration. To apply the configuration, set the group&#39;s updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
         * 
         * @return builder
         * 
         */
        public Builder properties(InstancePropertiesPatchArgs properties) {
            return properties(Output.of(properties));
        }

        public InstanceGroupManagerAllInstancesConfigArgs build() {
            return $;
        }
    }

}