// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.beta.enums.ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Policy for retention of scheduled snapshots.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs Empty = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs();

    /**
     * Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    @Import(name="maxRetentionDays")
    private @Nullable Output<Integer> maxRetentionDays;

    /**
     * @return Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    public Optional<Output<Integer>> maxRetentionDays() {
        return Optional.ofNullable(this.maxRetentionDays);
    }

    /**
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * 
     */
    @Import(name="onSourceDiskDelete")
    private @Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete;

    /**
     * @return Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * 
     */
    public Optional<Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete>> onSourceDiskDelete() {
        return Optional.ofNullable(this.onSourceDiskDelete);
    }

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs() {}

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs $) {
        this.maxRetentionDays = $.maxRetentionDays;
        this.onSourceDiskDelete = $.onSourceDiskDelete;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs $;

        public Builder() {
            $ = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs();
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
            $ = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxRetentionDays Maximum age of the snapshot that is allowed to be kept.
         * 
         * @return builder
         * 
         */
        public Builder maxRetentionDays(@Nullable Output<Integer> maxRetentionDays) {
            $.maxRetentionDays = maxRetentionDays;
            return this;
        }

        /**
         * @param maxRetentionDays Maximum age of the snapshot that is allowed to be kept.
         * 
         * @return builder
         * 
         */
        public Builder maxRetentionDays(Integer maxRetentionDays) {
            return maxRetentionDays(Output.of(maxRetentionDays));
        }

        /**
         * @param onSourceDiskDelete Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
         * 
         * @return builder
         * 
         */
        public Builder onSourceDiskDelete(@Nullable Output<ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete> onSourceDiskDelete) {
            $.onSourceDiskDelete = onSourceDiskDelete;
            return this;
        }

        /**
         * @param onSourceDiskDelete Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
         * 
         * @return builder
         * 
         */
        public Builder onSourceDiskDelete(ResourcePolicySnapshotSchedulePolicyRetentionPolicyOnSourceDiskDelete onSourceDiskDelete) {
            return onSourceDiskDelete(Output.of(onSourceDiskDelete));
        }

        public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs build() {
            return $;
        }
    }

}