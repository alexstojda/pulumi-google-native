// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A network.
 * 
 */
public final class NetworkAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAddressArgs Empty = new NetworkAddressArgs();

    /**
     * IPv4 address to be assigned to the server.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return IPv4 address to be assigned to the server.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Name of the existing network to use.
     * 
     */
    @Import(name="existingNetworkId")
    private @Nullable Output<String> existingNetworkId;

    /**
     * @return Name of the existing network to use.
     * 
     */
    public Optional<Output<String>> existingNetworkId() {
        return Optional.ofNullable(this.existingNetworkId);
    }

    /**
     * Id of the network to use, within the same ProvisioningConfig request.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return Id of the network to use, within the same ProvisioningConfig request.
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private NetworkAddressArgs() {}

    private NetworkAddressArgs(NetworkAddressArgs $) {
        this.address = $.address;
        this.existingNetworkId = $.existingNetworkId;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAddressArgs $;

        public Builder() {
            $ = new NetworkAddressArgs();
        }

        public Builder(NetworkAddressArgs defaults) {
            $ = new NetworkAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address IPv4 address to be assigned to the server.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address IPv4 address to be assigned to the server.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param existingNetworkId Name of the existing network to use.
         * 
         * @return builder
         * 
         */
        public Builder existingNetworkId(@Nullable Output<String> existingNetworkId) {
            $.existingNetworkId = existingNetworkId;
            return this;
        }

        /**
         * @param existingNetworkId Name of the existing network to use.
         * 
         * @return builder
         * 
         */
        public Builder existingNetworkId(String existingNetworkId) {
            return existingNetworkId(Output.of(existingNetworkId));
        }

        /**
         * @param networkId Id of the network to use, within the same ProvisioningConfig request.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId Id of the network to use, within the same ProvisioningConfig request.
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public NetworkAddressArgs build() {
            return $;
        }
    }

}