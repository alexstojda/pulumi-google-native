// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs.v4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.jobs.v4.inputs.CompensationEntryArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Job compensation details.
 * 
 */
public final class CompensationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final CompensationInfoArgs Empty = new CompensationInfoArgs();

    /**
     * Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as **base compensation entry** for the job.
     * 
     */
    @Import(name="entries")
    private @Nullable Output<List<CompensationEntryArgs>> entries;

    /**
     * @return Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as **base compensation entry** for the job.
     * 
     */
    public Optional<Output<List<CompensationEntryArgs>>> entries() {
        return Optional.ofNullable(this.entries);
    }

    private CompensationInfoArgs() {}

    private CompensationInfoArgs(CompensationInfoArgs $) {
        this.entries = $.entries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CompensationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompensationInfoArgs $;

        public Builder() {
            $ = new CompensationInfoArgs();
        }

        public Builder(CompensationInfoArgs defaults) {
            $ = new CompensationInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entries Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as **base compensation entry** for the job.
         * 
         * @return builder
         * 
         */
        public Builder entries(@Nullable Output<List<CompensationEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as **base compensation entry** for the job.
         * 
         * @return builder
         * 
         */
        public Builder entries(List<CompensationEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as **base compensation entry** for the job.
         * 
         * @return builder
         * 
         */
        public Builder entries(CompensationEntryArgs... entries) {
            return entries(List.of(entries));
        }

        public CompensationInfoArgs build() {
            return $;
        }
    }

}