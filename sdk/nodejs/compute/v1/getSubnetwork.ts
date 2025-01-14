// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as enums from "../../types/enums";
import * as utilities from "../../utilities";

/**
 * Returns the specified subnetwork.
 */
export function getSubnetwork(args: GetSubnetworkArgs, opts?: pulumi.InvokeOptions): Promise<GetSubnetworkResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("google-native:compute/v1:getSubnetwork", {
        "project": args.project,
        "region": args.region,
        "subnetwork": args.subnetwork,
    }, opts);
}

export interface GetSubnetworkArgs {
    project?: string;
    region: string;
    subnetwork: string;
}

export interface GetSubnetworkResult {
    /**
     * Creation timestamp in RFC3339 text format.
     */
    readonly creationTimestamp: string;
    /**
     * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     */
    readonly description: string;
    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported if the subnet purpose field is set to REGIONAL_MANAGED_PROXY.
     */
    readonly enableFlowLogs: boolean;
    /**
     * The external IPv6 address range that is owned by this subnetwork.
     */
    readonly externalIpv6Prefix: string;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
     */
    readonly fingerprint: string;
    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     */
    readonly gatewayAddress: string;
    /**
     * The internal IPv6 address range that is assigned to this subnetwork.
     */
    readonly internalIpv6Prefix: string;
    /**
     * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     */
    readonly ipCidrRange: string;
    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack.
     */
    readonly ipv6AccessType: string;
    /**
     * This field is for internal use.
     */
    readonly ipv6CidrRange: string;
    /**
     * Type of the resource. Always compute#subnetwork for Subnetwork resources.
     */
    readonly kind: string;
    /**
     * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     */
    readonly logConfig: outputs.compute.v1.SubnetworkLogConfigResponse;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     */
    readonly name: string;
    /**
     * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     */
    readonly network: string;
    /**
     * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     */
    readonly privateIpGoogleAccess: boolean;
    /**
     * This field is for internal use. This field can be both set at resource creation time and updated using patch.
     */
    readonly privateIpv6GoogleAccess: string;
    /**
     * The purpose of the resource. This field can be either PRIVATE, REGIONAL_MANAGED_PROXY, PRIVATE_SERVICE_CONNECT, or INTERNAL_HTTPS_LOAD_BALANCER. PRIVATE is the default purpose for user-created subnets or subnets that are automatically created in auto mode networks. A subnet with purpose set to REGIONAL_MANAGED_PROXY is a user-created subnetwork that is reserved for regional Envoy-based load balancers. A subnet with purpose set to PRIVATE_SERVICE_CONNECT is used to publish services using Private Service Connect. A subnet with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a proxy-only subnet that can be used only by regional internal HTTP(S) load balancers. Note that REGIONAL_MANAGED_PROXY is the preferred setting for all regional Envoy load balancers. If unspecified, the subnet purpose defaults to PRIVATE. The enableFlowLogs field isn't supported if the subnet purpose field is set to REGIONAL_MANAGED_PROXY.
     */
    readonly purpose: string;
    /**
     * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     */
    readonly region: string;
    /**
     * The role of subnetwork. Currently, this field is only used when purpose = REGIONAL_MANAGED_PROXY. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Envoy-based load balancers in a region. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     */
    readonly role: string;
    /**
     * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     */
    readonly secondaryIpRanges: outputs.compute.v1.SubnetworkSecondaryRangeResponse[];
    /**
     * Server-defined URL for the resource.
     */
    readonly selfLink: string;
    /**
     * The stack type for the subnet. If set to IPV4_ONLY, new VMs in the subnet are assigned IPv4 addresses only. If set to IPV4_IPV6, new VMs in the subnet can be assigned both IPv4 and IPv6 addresses. If not specified, IPV4_ONLY is used. This field can be both set at resource creation time and updated using patch.
     */
    readonly stackType: string;
    /**
     * The state of the subnetwork, which can be one of the following values: READY: Subnetwork is created and ready to use DRAINING: only applicable to subnetworks that have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load balancer are being drained. A subnetwork that is draining cannot be used or modified until it reaches a status of READY
     */
    readonly state: string;
}
/**
 * Returns the specified subnetwork.
 */
export function getSubnetworkOutput(args: GetSubnetworkOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubnetworkResult> {
    return pulumi.output(args).apply((a: any) => getSubnetwork(a, opts))
}

export interface GetSubnetworkOutputArgs {
    project?: pulumi.Input<string>;
    region: pulumi.Input<string>;
    subnetwork: pulumi.Input<string>;
}
