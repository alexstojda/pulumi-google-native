// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine.v1.enums.NetworkInstanceIpMode;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Extra network settings. Only applicable in the App Engine flexible environment.
 * 
 */
public final class NetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkArgs Empty = new NetworkArgs();

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="forwardedPorts")
    private @Nullable Output<List<String>> forwardedPorts;

    /**
     * @return List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable in the App Engine flexible environment.
     * 
     */
    public Optional<Output<List<String>>> forwardedPorts() {
        return Optional.ofNullable(this.forwardedPorts);
    }

    /**
     * The IP mode for instances. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="instanceIpMode")
    private @Nullable Output<NetworkInstanceIpMode> instanceIpMode;

    /**
     * @return The IP mode for instances. Only applicable in the App Engine flexible environment.
     * 
     */
    public Optional<Output<NetworkInstanceIpMode>> instanceIpMode() {
        return Optional.ofNullable(this.instanceIpMode);
    }

    /**
     * Tag to apply to the instance during creation. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="instanceTag")
    private @Nullable Output<String> instanceTag;

    /**
     * @return Tag to apply to the instance during creation. Only applicable in the App Engine flexible environment.
     * 
     */
    public Optional<Output<String>> instanceTag() {
        return Optional.ofNullable(this.instanceTag);
    }

    /**
     * Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Enable session affinity. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="sessionAffinity")
    private @Nullable Output<Boolean> sessionAffinity;

    /**
     * @return Enable session affinity. Only applicable in the App Engine flexible environment.
     * 
     */
    public Optional<Output<Boolean>> sessionAffinity() {
        return Optional.ofNullable(this.sessionAffinity);
    }

    /**
     * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network. If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network. If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
     */
    @Import(name="subnetworkName")
    private @Nullable Output<String> subnetworkName;

    /**
     * @return Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network. If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network. If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
     */
    public Optional<Output<String>> subnetworkName() {
        return Optional.ofNullable(this.subnetworkName);
    }

    private NetworkArgs() {}

    private NetworkArgs(NetworkArgs $) {
        this.forwardedPorts = $.forwardedPorts;
        this.instanceIpMode = $.instanceIpMode;
        this.instanceTag = $.instanceTag;
        this.name = $.name;
        this.sessionAffinity = $.sessionAffinity;
        this.subnetworkName = $.subnetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkArgs $;

        public Builder() {
            $ = new NetworkArgs();
        }

        public Builder(NetworkArgs defaults) {
            $ = new NetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forwardedPorts List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder forwardedPorts(@Nullable Output<List<String>> forwardedPorts) {
            $.forwardedPorts = forwardedPorts;
            return this;
        }

        /**
         * @param forwardedPorts List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder forwardedPorts(List<String> forwardedPorts) {
            return forwardedPorts(Output.of(forwardedPorts));
        }

        /**
         * @param forwardedPorts List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder forwardedPorts(String... forwardedPorts) {
            return forwardedPorts(List.of(forwardedPorts));
        }

        /**
         * @param instanceIpMode The IP mode for instances. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder instanceIpMode(@Nullable Output<NetworkInstanceIpMode> instanceIpMode) {
            $.instanceIpMode = instanceIpMode;
            return this;
        }

        /**
         * @param instanceIpMode The IP mode for instances. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder instanceIpMode(NetworkInstanceIpMode instanceIpMode) {
            return instanceIpMode(Output.of(instanceIpMode));
        }

        /**
         * @param instanceTag Tag to apply to the instance during creation. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder instanceTag(@Nullable Output<String> instanceTag) {
            $.instanceTag = instanceTag;
            return this;
        }

        /**
         * @param instanceTag Tag to apply to the instance during creation. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder instanceTag(String instanceTag) {
            return instanceTag(Output.of(instanceTag));
        }

        /**
         * @param name Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sessionAffinity Enable session affinity. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinity(@Nullable Output<Boolean> sessionAffinity) {
            $.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * @param sessionAffinity Enable session affinity. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinity(Boolean sessionAffinity) {
            return sessionAffinity(Output.of(sessionAffinity));
        }

        /**
         * @param subnetworkName Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network. If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network. If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
         * 
         * @return builder
         * 
         */
        public Builder subnetworkName(@Nullable Output<String> subnetworkName) {
            $.subnetworkName = subnetworkName;
            return this;
        }

        /**
         * @param subnetworkName Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network. If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network. If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
         * 
         * @return builder
         * 
         */
        public Builder subnetworkName(String subnetworkName) {
            return subnetworkName(Output.of(subnetworkName));
        }

        public NetworkArgs build() {
            return $;
        }
    }

}