// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.v1.outputs.PacketMirroringMirroredResourceInfoInstanceInfoResponse;
import com.pulumi.googlenative.compute.v1.outputs.PacketMirroringMirroredResourceInfoSubnetInfoResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PacketMirroringMirroredResourceInfoResponse {
    /**
     * @return A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring. Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring. You may specify a maximum of 50 Instances.
     * 
     */
    private List<PacketMirroringMirroredResourceInfoInstanceInfoResponse> instances;
    /**
     * @return A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring. You may specify a maximum of 5 subnetworks.
     * 
     */
    private List<PacketMirroringMirroredResourceInfoSubnetInfoResponse> subnetworks;
    /**
     * @return A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored.
     * 
     */
    private List<String> tags;

    private PacketMirroringMirroredResourceInfoResponse() {}
    /**
     * @return A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring. Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring. You may specify a maximum of 50 Instances.
     * 
     */
    public List<PacketMirroringMirroredResourceInfoInstanceInfoResponse> instances() {
        return this.instances;
    }
    /**
     * @return A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring. You may specify a maximum of 5 subnetworks.
     * 
     */
    public List<PacketMirroringMirroredResourceInfoSubnetInfoResponse> subnetworks() {
        return this.subnetworks;
    }
    /**
     * @return A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourceInfoResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<PacketMirroringMirroredResourceInfoInstanceInfoResponse> instances;
        private List<PacketMirroringMirroredResourceInfoSubnetInfoResponse> subnetworks;
        private List<String> tags;
        public Builder() {}
        public Builder(PacketMirroringMirroredResourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder instances(List<PacketMirroringMirroredResourceInfoInstanceInfoResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(PacketMirroringMirroredResourceInfoInstanceInfoResponse... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder subnetworks(List<PacketMirroringMirroredResourceInfoSubnetInfoResponse> subnetworks) {
            this.subnetworks = Objects.requireNonNull(subnetworks);
            return this;
        }
        public Builder subnetworks(PacketMirroringMirroredResourceInfoSubnetInfoResponse... subnetworks) {
            return subnetworks(List.of(subnetworks));
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public PacketMirroringMirroredResourceInfoResponse build() {
            final var o = new PacketMirroringMirroredResourceInfoResponse();
            o.instances = instances;
            o.subnetworks = subnetworks;
            o.tags = tags;
            return o;
        }
    }
}