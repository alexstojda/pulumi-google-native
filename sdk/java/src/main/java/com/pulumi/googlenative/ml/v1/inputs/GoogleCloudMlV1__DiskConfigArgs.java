// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the config of disk options.
 * 
 */
public final class GoogleCloudMlV1__DiskConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__DiskConfigArgs Empty = new GoogleCloudMlV1__DiskConfigArgs();

    /**
     * Size in GB of the boot disk (default is 100GB).
     * 
     */
    @Import(name="bootDiskSizeGb")
    private @Nullable Output<Integer> bootDiskSizeGb;

    /**
     * @return Size in GB of the boot disk (default is 100GB).
     * 
     */
    public Optional<Output<Integer>> bootDiskSizeGb() {
        return Optional.ofNullable(this.bootDiskSizeGb);
    }

    /**
     * Type of the boot disk (default is &#34;pd-ssd&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
     * 
     */
    @Import(name="bootDiskType")
    private @Nullable Output<String> bootDiskType;

    /**
     * @return Type of the boot disk (default is &#34;pd-ssd&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
     * 
     */
    public Optional<Output<String>> bootDiskType() {
        return Optional.ofNullable(this.bootDiskType);
    }

    private GoogleCloudMlV1__DiskConfigArgs() {}

    private GoogleCloudMlV1__DiskConfigArgs(GoogleCloudMlV1__DiskConfigArgs $) {
        this.bootDiskSizeGb = $.bootDiskSizeGb;
        this.bootDiskType = $.bootDiskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__DiskConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__DiskConfigArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1__DiskConfigArgs();
        }

        public Builder(GoogleCloudMlV1__DiskConfigArgs defaults) {
            $ = new GoogleCloudMlV1__DiskConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bootDiskSizeGb Size in GB of the boot disk (default is 100GB).
         * 
         * @return builder
         * 
         */
        public Builder bootDiskSizeGb(@Nullable Output<Integer> bootDiskSizeGb) {
            $.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        /**
         * @param bootDiskSizeGb Size in GB of the boot disk (default is 100GB).
         * 
         * @return builder
         * 
         */
        public Builder bootDiskSizeGb(Integer bootDiskSizeGb) {
            return bootDiskSizeGb(Output.of(bootDiskSizeGb));
        }

        /**
         * @param bootDiskType Type of the boot disk (default is &#34;pd-ssd&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
         * 
         * @return builder
         * 
         */
        public Builder bootDiskType(@Nullable Output<String> bootDiskType) {
            $.bootDiskType = bootDiskType;
            return this;
        }

        /**
         * @param bootDiskType Type of the boot disk (default is &#34;pd-ssd&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
         * 
         * @return builder
         * 
         */
        public Builder bootDiskType(String bootDiskType) {
            return bootDiskType(Output.of(bootDiskType));
        }

        public GoogleCloudMlV1__DiskConfigArgs build() {
            return $;
        }
    }

}