// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies options for controlling advanced machine features.
 * 
 */
public final class AdvancedMachineFeaturesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdvancedMachineFeaturesArgs Empty = new AdvancedMachineFeaturesArgs();

    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    @Import(name="threadsPerCore")
    private @Nullable Output<String> threadsPerCore;

    /**
     * @return The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    public Optional<Output<String>> threadsPerCore() {
        return Optional.ofNullable(this.threadsPerCore);
    }

    private AdvancedMachineFeaturesArgs() {}

    private AdvancedMachineFeaturesArgs(AdvancedMachineFeaturesArgs $) {
        this.threadsPerCore = $.threadsPerCore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdvancedMachineFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdvancedMachineFeaturesArgs $;

        public Builder() {
            $ = new AdvancedMachineFeaturesArgs();
        }

        public Builder(AdvancedMachineFeaturesArgs defaults) {
            $ = new AdvancedMachineFeaturesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param threadsPerCore The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
         * 
         * @return builder
         * 
         */
        public Builder threadsPerCore(@Nullable Output<String> threadsPerCore) {
            $.threadsPerCore = threadsPerCore;
            return this;
        }

        /**
         * @param threadsPerCore The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
         * 
         * @return builder
         * 
         */
        public Builder threadsPerCore(String threadsPerCore) {
            return threadsPerCore(Output.of(threadsPerCore));
        }

        public AdvancedMachineFeaturesArgs build() {
            return $;
        }
    }

}