// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GcpNative.Compute.V1.Outputs
{

    [OutputType]
    public sealed class RouterInterfaceResponse
    {
        /// <summary>
        /// IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
        /// </summary>
        public readonly string IpRange;
        /// <summary>
        /// URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
        /// </summary>
        public readonly string LinkedInterconnectAttachment;
        /// <summary>
        /// URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
        /// </summary>
        public readonly string LinkedVpnTunnel;
        /// <summary>
        /// [Output Only] The resource that configures and manages this interface. 
        /// - MANAGED_BY_USER is the default value and can be managed directly by users. 
        /// - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
        /// </summary>
        public readonly string ManagementType;
        /// <summary>
        /// Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private RouterInterfaceResponse(
            string ipRange,

            string linkedInterconnectAttachment,

            string linkedVpnTunnel,

            string managementType,

            string name)
        {
            IpRange = ipRange;
            LinkedInterconnectAttachment = linkedInterconnectAttachment;
            LinkedVpnTunnel = linkedVpnTunnel;
            ManagementType = managementType;
            Name = name;
        }
    }
}