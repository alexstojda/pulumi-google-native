// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An instance-attached disk resource.
 * 
 */
public final class SavedDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final SavedDiskArgs Empty = new SavedDiskArgs();

    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
     */
    @Import(name="sourceDisk")
    private @Nullable Output<String> sourceDisk;

    /**
     * @return Specifies a URL of the disk attached to the source instance.
     * 
     */
    public Optional<Output<String>> sourceDisk() {
        return Optional.ofNullable(this.sourceDisk);
    }

    private SavedDiskArgs() {}

    private SavedDiskArgs(SavedDiskArgs $) {
        this.sourceDisk = $.sourceDisk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SavedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SavedDiskArgs $;

        public Builder() {
            $ = new SavedDiskArgs();
        }

        public Builder(SavedDiskArgs defaults) {
            $ = new SavedDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceDisk Specifies a URL of the disk attached to the source instance.
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(@Nullable Output<String> sourceDisk) {
            $.sourceDisk = sourceDisk;
            return this;
        }

        /**
         * @param sourceDisk Specifies a URL of the disk attached to the source instance.
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(String sourceDisk) {
            return sourceDisk(Output.of(sourceDisk));
        }

        public SavedDiskArgs build() {
            return $;
        }
    }

}