// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.alpha.enums.NetworkInterfaceSubInterfaceIpAllocationMode;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInterfaceSubInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceSubInterfaceArgs Empty = new NetworkInterfaceSubInterfaceArgs();

    /**
     * An IPv4 internal IP address to assign to the instance for this subinterface. If specified, ip_allocation_mode should be set to ALLOCATE_IP.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return An IPv4 internal IP address to assign to the instance for this subinterface. If specified, ip_allocation_mode should be set to ALLOCATE_IP.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    @Import(name="ipAllocationMode")
    private @Nullable Output<NetworkInterfaceSubInterfaceIpAllocationMode> ipAllocationMode;

    public Optional<Output<NetworkInterfaceSubInterfaceIpAllocationMode>> ipAllocationMode() {
        return Optional.ofNullable(this.ipAllocationMode);
    }

    /**
     * If specified, this subnetwork must belong to the same network as that of the network interface. If not specified the subnet of network interface will be used. If you specify this property, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return If specified, this subnetwork must belong to the same network as that of the network interface. If not specified the subnet of network interface will be used. If you specify this property, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    /**
     * VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is connecting.
     * 
     */
    @Import(name="vlan")
    private @Nullable Output<Integer> vlan;

    /**
     * @return VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is connecting.
     * 
     */
    public Optional<Output<Integer>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    private NetworkInterfaceSubInterfaceArgs() {}

    private NetworkInterfaceSubInterfaceArgs(NetworkInterfaceSubInterfaceArgs $) {
        this.ipAddress = $.ipAddress;
        this.ipAllocationMode = $.ipAllocationMode;
        this.subnetwork = $.subnetwork;
        this.vlan = $.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInterfaceSubInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInterfaceSubInterfaceArgs $;

        public Builder() {
            $ = new NetworkInterfaceSubInterfaceArgs();
        }

        public Builder(NetworkInterfaceSubInterfaceArgs defaults) {
            $ = new NetworkInterfaceSubInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddress An IPv4 internal IP address to assign to the instance for this subinterface. If specified, ip_allocation_mode should be set to ALLOCATE_IP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress An IPv4 internal IP address to assign to the instance for this subinterface. If specified, ip_allocation_mode should be set to ALLOCATE_IP.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder ipAllocationMode(@Nullable Output<NetworkInterfaceSubInterfaceIpAllocationMode> ipAllocationMode) {
            $.ipAllocationMode = ipAllocationMode;
            return this;
        }

        public Builder ipAllocationMode(NetworkInterfaceSubInterfaceIpAllocationMode ipAllocationMode) {
            return ipAllocationMode(Output.of(ipAllocationMode));
        }

        /**
         * @param subnetwork If specified, this subnetwork must belong to the same network as that of the network interface. If not specified the subnet of network interface will be used. If you specify this property, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork If specified, this subnetwork must belong to the same network as that of the network interface. If not specified the subnet of network interface will be used. If you specify this property, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        /**
         * @param vlan VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is connecting.
         * 
         * @return builder
         * 
         */
        public Builder vlan(@Nullable Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        /**
         * @param vlan VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is connecting.
         * 
         * @return builder
         * 
         */
        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        public NetworkInterfaceSubInterfaceArgs build() {
            return $;
        }
    }

}