// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for fine-grained cost management feature.
 * 
 */
public final class CostManagementConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CostManagementConfigArgs Empty = new CostManagementConfigArgs();

    /**
     * Whether the feature is enabled or not.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the feature is enabled or not.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private CostManagementConfigArgs() {}

    private CostManagementConfigArgs(CostManagementConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CostManagementConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CostManagementConfigArgs $;

        public Builder() {
            $ = new CostManagementConfigArgs();
        }

        public Builder(CostManagementConfigArgs defaults) {
            $ = new CostManagementConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether the feature is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the feature is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public CostManagementConfigArgs build() {
            return $;
        }
    }

}