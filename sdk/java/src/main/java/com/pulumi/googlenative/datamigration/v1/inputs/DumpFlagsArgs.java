// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datamigration.v1.inputs.DumpFlagArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dump flags definition.
 * 
 */
public final class DumpFlagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DumpFlagsArgs Empty = new DumpFlagsArgs();

    /**
     * The flags for the initial dump.
     * 
     */
    @Import(name="dumpFlags")
    private @Nullable Output<List<DumpFlagArgs>> dumpFlags;

    /**
     * @return The flags for the initial dump.
     * 
     */
    public Optional<Output<List<DumpFlagArgs>>> dumpFlags() {
        return Optional.ofNullable(this.dumpFlags);
    }

    private DumpFlagsArgs() {}

    private DumpFlagsArgs(DumpFlagsArgs $) {
        this.dumpFlags = $.dumpFlags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DumpFlagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DumpFlagsArgs $;

        public Builder() {
            $ = new DumpFlagsArgs();
        }

        public Builder(DumpFlagsArgs defaults) {
            $ = new DumpFlagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dumpFlags The flags for the initial dump.
         * 
         * @return builder
         * 
         */
        public Builder dumpFlags(@Nullable Output<List<DumpFlagArgs>> dumpFlags) {
            $.dumpFlags = dumpFlags;
            return this;
        }

        /**
         * @param dumpFlags The flags for the initial dump.
         * 
         * @return builder
         * 
         */
        public Builder dumpFlags(List<DumpFlagArgs> dumpFlags) {
            return dumpFlags(Output.of(dumpFlags));
        }

        /**
         * @param dumpFlags The flags for the initial dump.
         * 
         * @return builder
         * 
         */
        public Builder dumpFlags(DumpFlagArgs... dumpFlags) {
            return dumpFlags(List.of(dumpFlags));
        }

        public DumpFlagsArgs build() {
            return $;
        }
    }

}