// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks.v1.enums.VirtualMachineConfigNicType;
import com.pulumi.googlenative.notebooks.v1.inputs.BootImageArgs;
import com.pulumi.googlenative.notebooks.v1.inputs.ContainerImageArgs;
import com.pulumi.googlenative.notebooks.v1.inputs.EncryptionConfigArgs;
import com.pulumi.googlenative.notebooks.v1.inputs.LocalDiskArgs;
import com.pulumi.googlenative.notebooks.v1.inputs.RuntimeAcceleratorConfigArgs;
import com.pulumi.googlenative.notebooks.v1.inputs.RuntimeShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The config settings for virtual machine.
 * 
 */
public final class VirtualMachineConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineConfigArgs Empty = new VirtualMachineConfigArgs();

    /**
     * Optional. The Compute Engine accelerator configuration for this runtime.
     * 
     */
    @Import(name="acceleratorConfig")
    private @Nullable Output<RuntimeAcceleratorConfigArgs> acceleratorConfig;

    /**
     * @return Optional. The Compute Engine accelerator configuration for this runtime.
     * 
     */
    public Optional<Output<RuntimeAcceleratorConfigArgs>> acceleratorConfig() {
        return Optional.ofNullable(this.acceleratorConfig);
    }

    /**
     * Optional. Boot image metadata used for runtime upgradeability.
     * 
     */
    @Import(name="bootImage")
    private @Nullable Output<BootImageArgs> bootImage;

    /**
     * @return Optional. Boot image metadata used for runtime upgradeability.
     * 
     */
    public Optional<Output<BootImageArgs>> bootImage() {
        return Optional.ofNullable(this.bootImage);
    }

    /**
     * Optional. Use a list of container images to use as Kernels in the notebook instance.
     * 
     */
    @Import(name="containerImages")
    private @Nullable Output<List<ContainerImageArgs>> containerImages;

    /**
     * @return Optional. Use a list of container images to use as Kernels in the notebook instance.
     * 
     */
    public Optional<Output<List<ContainerImageArgs>>> containerImages() {
        return Optional.ofNullable(this.containerImages);
    }

    /**
     * Data disk option configuration settings.
     * 
     */
    @Import(name="dataDisk", required=true)
    private Output<LocalDiskArgs> dataDisk;

    /**
     * @return Data disk option configuration settings.
     * 
     */
    public Output<LocalDiskArgs> dataDisk() {
        return this.dataDisk;
    }

    /**
     * Optional. Encryption settings for virtual machine data disk.
     * 
     */
    @Import(name="encryptionConfig")
    private @Nullable Output<EncryptionConfigArgs> encryptionConfig;

    /**
     * @return Optional. Encryption settings for virtual machine data disk.
     * 
     */
    public Optional<Output<EncryptionConfigArgs>> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }

    /**
     * Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    @Import(name="internalIpOnly")
    private @Nullable Output<Boolean> internalIpOnly;

    /**
     * @return Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    public Optional<Output<Boolean>> internalIpOnly() {
        return Optional.ofNullable(this.internalIpOnly);
    }

    /**
     * Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The Compute Engine machine type used for runtimes. Short name is valid. Examples: * `n1-standard-2` * `e2-standard-8`
     * 
     */
    @Import(name="machineType", required=true)
    private Output<String> machineType;

    /**
     * @return The Compute Engine machine type used for runtimes. Short name is valid. Examples: * `n1-standard-2` * `e2-standard-8`
     * 
     */
    public Output<String> machineType() {
        return this.machineType;
    }

    /**
     * Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork. If neither `network` nor `subnet` is specified, the &#34;default&#34; network of the project is used, if it exists. A full URL or partial URI. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google Infrastructure. Runtimes support the following network configurations: * Google Managed Network (Network &amp; subnet are empty) * Consumer Project VPC (network &amp; subnet are required). Requires configuring Private Service Access. * Shared VPC (network &amp; subnet are required). Requires configuring Private Service Access.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork. If neither `network` nor `subnet` is specified, the &#34;default&#34; network of the project is used, if it exists. A full URL or partial URI. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google Infrastructure. Runtimes support the following network configurations: * Google Managed Network (Network &amp; subnet are empty) * Consumer Project VPC (network &amp; subnet are required). Requires configuring Private Service Access. * Shared VPC (network &amp; subnet are required). Requires configuring Private Service Access.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    @Import(name="nicType")
    private @Nullable Output<VirtualMachineConfigNicType> nicType;

    /**
     * @return Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    public Optional<Output<VirtualMachineConfigNicType>> nicType() {
        return Optional.ofNullable(this.nicType);
    }

    /**
     * Optional. Reserved IP Range name is used for VPC Peering. The subnetwork allocation will use the range *name* if it&#39;s assigned. Example: managed-notebooks-range-c PEERING_RANGE_NAME_3=managed-notebooks-range-c gcloud compute addresses create $PEERING_RANGE_NAME_3 \ --global \ --prefix-length=24 \ --description=&#34;Google Cloud Managed Notebooks Range 24 c&#34; \ --network=$NETWORK \ --addresses=192.168.0.0 \ --purpose=VPC_PEERING Field value will be: `managed-notebooks-range-c`
     * 
     */
    @Import(name="reservedIpRange")
    private @Nullable Output<String> reservedIpRange;

    /**
     * @return Optional. Reserved IP Range name is used for VPC Peering. The subnetwork allocation will use the range *name* if it&#39;s assigned. Example: managed-notebooks-range-c PEERING_RANGE_NAME_3=managed-notebooks-range-c gcloud compute addresses create $PEERING_RANGE_NAME_3 \ --global \ --prefix-length=24 \ --description=&#34;Google Cloud Managed Notebooks Range 24 c&#34; \ --network=$NETWORK \ --addresses=192.168.0.0 \ --purpose=VPC_PEERING Field value will be: `managed-notebooks-range-c`
     * 
     */
    public Optional<Output<String>> reservedIpRange() {
        return Optional.ofNullable(this.reservedIpRange);
    }

    /**
     * Optional. Shielded VM Instance configuration settings.
     * 
     */
    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<RuntimeShieldedInstanceConfigArgs> shieldedInstanceConfig;

    /**
     * @return Optional. Shielded VM Instance configuration settings.
     * 
     */
    public Optional<Output<RuntimeShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network. A full URL or partial URI are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0` * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network. A full URL or partial URI are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0` * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private VirtualMachineConfigArgs() {}

    private VirtualMachineConfigArgs(VirtualMachineConfigArgs $) {
        this.acceleratorConfig = $.acceleratorConfig;
        this.bootImage = $.bootImage;
        this.containerImages = $.containerImages;
        this.dataDisk = $.dataDisk;
        this.encryptionConfig = $.encryptionConfig;
        this.internalIpOnly = $.internalIpOnly;
        this.labels = $.labels;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.network = $.network;
        this.nicType = $.nicType;
        this.reservedIpRange = $.reservedIpRange;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.subnet = $.subnet;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineConfigArgs $;

        public Builder() {
            $ = new VirtualMachineConfigArgs();
        }

        public Builder(VirtualMachineConfigArgs defaults) {
            $ = new VirtualMachineConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorConfig Optional. The Compute Engine accelerator configuration for this runtime.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorConfig(@Nullable Output<RuntimeAcceleratorConfigArgs> acceleratorConfig) {
            $.acceleratorConfig = acceleratorConfig;
            return this;
        }

        /**
         * @param acceleratorConfig Optional. The Compute Engine accelerator configuration for this runtime.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorConfig(RuntimeAcceleratorConfigArgs acceleratorConfig) {
            return acceleratorConfig(Output.of(acceleratorConfig));
        }

        /**
         * @param bootImage Optional. Boot image metadata used for runtime upgradeability.
         * 
         * @return builder
         * 
         */
        public Builder bootImage(@Nullable Output<BootImageArgs> bootImage) {
            $.bootImage = bootImage;
            return this;
        }

        /**
         * @param bootImage Optional. Boot image metadata used for runtime upgradeability.
         * 
         * @return builder
         * 
         */
        public Builder bootImage(BootImageArgs bootImage) {
            return bootImage(Output.of(bootImage));
        }

        /**
         * @param containerImages Optional. Use a list of container images to use as Kernels in the notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder containerImages(@Nullable Output<List<ContainerImageArgs>> containerImages) {
            $.containerImages = containerImages;
            return this;
        }

        /**
         * @param containerImages Optional. Use a list of container images to use as Kernels in the notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder containerImages(List<ContainerImageArgs> containerImages) {
            return containerImages(Output.of(containerImages));
        }

        /**
         * @param containerImages Optional. Use a list of container images to use as Kernels in the notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder containerImages(ContainerImageArgs... containerImages) {
            return containerImages(List.of(containerImages));
        }

        /**
         * @param dataDisk Data disk option configuration settings.
         * 
         * @return builder
         * 
         */
        public Builder dataDisk(Output<LocalDiskArgs> dataDisk) {
            $.dataDisk = dataDisk;
            return this;
        }

        /**
         * @param dataDisk Data disk option configuration settings.
         * 
         * @return builder
         * 
         */
        public Builder dataDisk(LocalDiskArgs dataDisk) {
            return dataDisk(Output.of(dataDisk));
        }

        /**
         * @param encryptionConfig Optional. Encryption settings for virtual machine data disk.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(@Nullable Output<EncryptionConfigArgs> encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * @param encryptionConfig Optional. Encryption settings for virtual machine data disk.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(EncryptionConfigArgs encryptionConfig) {
            return encryptionConfig(Output.of(encryptionConfig));
        }

        /**
         * @param internalIpOnly Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all dependencies must be configured to be accessible without external IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder internalIpOnly(@Nullable Output<Boolean> internalIpOnly) {
            $.internalIpOnly = internalIpOnly;
            return this;
        }

        /**
         * @param internalIpOnly Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all dependencies must be configured to be accessible without external IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder internalIpOnly(Boolean internalIpOnly) {
            return internalIpOnly(Output.of(internalIpOnly));
        }

        /**
         * @param labels Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param machineType The Compute Engine machine type used for runtimes. Short name is valid. Examples: * `n1-standard-2` * `e2-standard-8`
         * 
         * @return builder
         * 
         */
        public Builder machineType(Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType The Compute Engine machine type used for runtimes. Short name is valid. Examples: * `n1-standard-2` * `e2-standard-8`
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param metadata Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param network Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork. If neither `network` nor `subnet` is specified, the &#34;default&#34; network of the project is used, if it exists. A full URL or partial URI. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google Infrastructure. Runtimes support the following network configurations: * Google Managed Network (Network &amp; subnet are empty) * Consumer Project VPC (network &amp; subnet are required). Requires configuring Private Service Access. * Shared VPC (network &amp; subnet are required). Requires configuring Private Service Access.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork. If neither `network` nor `subnet` is specified, the &#34;default&#34; network of the project is used, if it exists. A full URL or partial URI. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google Infrastructure. Runtimes support the following network configurations: * Google Managed Network (Network &amp; subnet are empty) * Consumer Project VPC (network &amp; subnet are required). Requires configuring Private Service Access. * Shared VPC (network &amp; subnet are required). Requires configuring Private Service Access.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param nicType Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
         * 
         * @return builder
         * 
         */
        public Builder nicType(@Nullable Output<VirtualMachineConfigNicType> nicType) {
            $.nicType = nicType;
            return this;
        }

        /**
         * @param nicType Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
         * 
         * @return builder
         * 
         */
        public Builder nicType(VirtualMachineConfigNicType nicType) {
            return nicType(Output.of(nicType));
        }

        /**
         * @param reservedIpRange Optional. Reserved IP Range name is used for VPC Peering. The subnetwork allocation will use the range *name* if it&#39;s assigned. Example: managed-notebooks-range-c PEERING_RANGE_NAME_3=managed-notebooks-range-c gcloud compute addresses create $PEERING_RANGE_NAME_3 \ --global \ --prefix-length=24 \ --description=&#34;Google Cloud Managed Notebooks Range 24 c&#34; \ --network=$NETWORK \ --addresses=192.168.0.0 \ --purpose=VPC_PEERING Field value will be: `managed-notebooks-range-c`
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(@Nullable Output<String> reservedIpRange) {
            $.reservedIpRange = reservedIpRange;
            return this;
        }

        /**
         * @param reservedIpRange Optional. Reserved IP Range name is used for VPC Peering. The subnetwork allocation will use the range *name* if it&#39;s assigned. Example: managed-notebooks-range-c PEERING_RANGE_NAME_3=managed-notebooks-range-c gcloud compute addresses create $PEERING_RANGE_NAME_3 \ --global \ --prefix-length=24 \ --description=&#34;Google Cloud Managed Notebooks Range 24 c&#34; \ --network=$NETWORK \ --addresses=192.168.0.0 \ --purpose=VPC_PEERING Field value will be: `managed-notebooks-range-c`
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(String reservedIpRange) {
            return reservedIpRange(Output.of(reservedIpRange));
        }

        /**
         * @param shieldedInstanceConfig Optional. Shielded VM Instance configuration settings.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(@Nullable Output<RuntimeShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        /**
         * @param shieldedInstanceConfig Optional. Shielded VM Instance configuration settings.
         * 
         * @return builder
         * 
         */
        public Builder shieldedInstanceConfig(RuntimeShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        /**
         * @param subnet Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network. A full URL or partial URI are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0` * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network. A full URL or partial URI are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0` * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param tags Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public VirtualMachineConfigArgs build() {
            $.dataDisk = Objects.requireNonNull($.dataDisk, "expected parameter 'dataDisk' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            return $;
        }
    }

}