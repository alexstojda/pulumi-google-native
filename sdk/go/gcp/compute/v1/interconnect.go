// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates a Interconnect in the specified project using the data included in the request.
type Interconnect struct {
	pulumi.CustomResourceState

	// Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
	AdminEnabled pulumi.BoolOutput `pulumi:"adminEnabled"`
	// [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
	CircuitInfos InterconnectCircuitInfoResponseArrayOutput `pulumi:"circuitInfos"`
	// [Output Only] Creation timestamp in RFC3339 text format.
	CreationTimestamp pulumi.StringOutput `pulumi:"creationTimestamp"`
	// Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
	CustomerName pulumi.StringOutput `pulumi:"customerName"`
	// An optional description of this resource. Provide this property when you create the resource.
	Description pulumi.StringOutput `pulumi:"description"`
	// [Output Only] A list of outages expected for this Interconnect.
	ExpectedOutages InterconnectOutageNotificationResponseArrayOutput `pulumi:"expectedOutages"`
	// [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
	GoogleIpAddress pulumi.StringOutput `pulumi:"googleIpAddress"`
	// [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
	GoogleReferenceId pulumi.StringOutput `pulumi:"googleReferenceId"`
	// [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
	InterconnectAttachments pulumi.StringArrayOutput `pulumi:"interconnectAttachments"`
	// Type of interconnect, which can take one of the following values:
	// - PARTNER: A partner-managed interconnection shared between customers though a partner.
	// - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
	InterconnectType pulumi.StringOutput `pulumi:"interconnectType"`
	// [Output Only] Type of the resource. Always compute#interconnect for interconnects.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Type of link requested, which can take one of the following values:
	// - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics
	// - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
	LinkType pulumi.StringOutput `pulumi:"linkType"`
	// URL of the InterconnectLocation object that represents where this connection is to be provisioned.
	Location pulumi.StringOutput `pulumi:"location"`
	// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
	Name pulumi.StringOutput `pulumi:"name"`
	// Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
	NocContactEmail pulumi.StringOutput `pulumi:"nocContactEmail"`
	// [Output Only] The current status of this Interconnect's functionality, which can take one of the following values:
	// - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect.
	// - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	OperationalStatus pulumi.StringOutput `pulumi:"operationalStatus"`
	// [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
	PeerIpAddress pulumi.StringOutput `pulumi:"peerIpAddress"`
	// [Output Only] Number of links actually provisioned in this interconnect.
	ProvisionedLinkCount pulumi.IntOutput `pulumi:"provisionedLinkCount"`
	// Target number of physical links in the link bundle, as requested by the customer.
	RequestedLinkCount pulumi.IntOutput `pulumi:"requestedLinkCount"`
	// [Output Only] Server-defined URL for the resource.
	SelfLink pulumi.StringOutput `pulumi:"selfLink"`
	// [Output Only] The current state of Interconnect functionality, which can take one of the following values:
	// - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect.
	// - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	State pulumi.StringOutput `pulumi:"state"`
}

// NewInterconnect registers a new resource with the given unique name, arguments, and options.
func NewInterconnect(ctx *pulumi.Context,
	name string, args *InterconnectArgs, opts ...pulumi.ResourceOption) (*Interconnect, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Interconnect == nil {
		return nil, errors.New("invalid value for required argument 'Interconnect'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	var resource Interconnect
	err := ctx.RegisterResource("gcp-native:compute/v1:Interconnect", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInterconnect gets an existing Interconnect resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInterconnect(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InterconnectState, opts ...pulumi.ResourceOption) (*Interconnect, error) {
	var resource Interconnect
	err := ctx.ReadResource("gcp-native:compute/v1:Interconnect", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Interconnect resources.
type interconnectState struct {
	// Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
	AdminEnabled *bool `pulumi:"adminEnabled"`
	// [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
	CircuitInfos []InterconnectCircuitInfoResponse `pulumi:"circuitInfos"`
	// [Output Only] Creation timestamp in RFC3339 text format.
	CreationTimestamp *string `pulumi:"creationTimestamp"`
	// Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
	CustomerName *string `pulumi:"customerName"`
	// An optional description of this resource. Provide this property when you create the resource.
	Description *string `pulumi:"description"`
	// [Output Only] A list of outages expected for this Interconnect.
	ExpectedOutages []InterconnectOutageNotificationResponse `pulumi:"expectedOutages"`
	// [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
	GoogleIpAddress *string `pulumi:"googleIpAddress"`
	// [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
	GoogleReferenceId *string `pulumi:"googleReferenceId"`
	// [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
	InterconnectAttachments []string `pulumi:"interconnectAttachments"`
	// Type of interconnect, which can take one of the following values:
	// - PARTNER: A partner-managed interconnection shared between customers though a partner.
	// - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
	InterconnectType *string `pulumi:"interconnectType"`
	// [Output Only] Type of the resource. Always compute#interconnect for interconnects.
	Kind *string `pulumi:"kind"`
	// Type of link requested, which can take one of the following values:
	// - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics
	// - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
	LinkType *string `pulumi:"linkType"`
	// URL of the InterconnectLocation object that represents where this connection is to be provisioned.
	Location *string `pulumi:"location"`
	// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
	Name *string `pulumi:"name"`
	// Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
	NocContactEmail *string `pulumi:"nocContactEmail"`
	// [Output Only] The current status of this Interconnect's functionality, which can take one of the following values:
	// - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect.
	// - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	OperationalStatus *string `pulumi:"operationalStatus"`
	// [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
	PeerIpAddress *string `pulumi:"peerIpAddress"`
	// [Output Only] Number of links actually provisioned in this interconnect.
	ProvisionedLinkCount *int `pulumi:"provisionedLinkCount"`
	// Target number of physical links in the link bundle, as requested by the customer.
	RequestedLinkCount *int `pulumi:"requestedLinkCount"`
	// [Output Only] Server-defined URL for the resource.
	SelfLink *string `pulumi:"selfLink"`
	// [Output Only] The current state of Interconnect functionality, which can take one of the following values:
	// - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect.
	// - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	State *string `pulumi:"state"`
}

type InterconnectState struct {
	// Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
	AdminEnabled pulumi.BoolPtrInput
	// [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
	CircuitInfos InterconnectCircuitInfoResponseArrayInput
	// [Output Only] Creation timestamp in RFC3339 text format.
	CreationTimestamp pulumi.StringPtrInput
	// Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
	CustomerName pulumi.StringPtrInput
	// An optional description of this resource. Provide this property when you create the resource.
	Description pulumi.StringPtrInput
	// [Output Only] A list of outages expected for this Interconnect.
	ExpectedOutages InterconnectOutageNotificationResponseArrayInput
	// [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
	GoogleIpAddress pulumi.StringPtrInput
	// [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
	GoogleReferenceId pulumi.StringPtrInput
	// [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
	InterconnectAttachments pulumi.StringArrayInput
	// Type of interconnect, which can take one of the following values:
	// - PARTNER: A partner-managed interconnection shared between customers though a partner.
	// - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
	InterconnectType pulumi.StringPtrInput
	// [Output Only] Type of the resource. Always compute#interconnect for interconnects.
	Kind pulumi.StringPtrInput
	// Type of link requested, which can take one of the following values:
	// - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics
	// - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
	LinkType pulumi.StringPtrInput
	// URL of the InterconnectLocation object that represents where this connection is to be provisioned.
	Location pulumi.StringPtrInput
	// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
	Name pulumi.StringPtrInput
	// Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
	NocContactEmail pulumi.StringPtrInput
	// [Output Only] The current status of this Interconnect's functionality, which can take one of the following values:
	// - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect.
	// - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	OperationalStatus pulumi.StringPtrInput
	// [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
	PeerIpAddress pulumi.StringPtrInput
	// [Output Only] Number of links actually provisioned in this interconnect.
	ProvisionedLinkCount pulumi.IntPtrInput
	// Target number of physical links in the link bundle, as requested by the customer.
	RequestedLinkCount pulumi.IntPtrInput
	// [Output Only] Server-defined URL for the resource.
	SelfLink pulumi.StringPtrInput
	// [Output Only] The current state of Interconnect functionality, which can take one of the following values:
	// - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect.
	// - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	State pulumi.StringPtrInput
}

func (InterconnectState) ElementType() reflect.Type {
	return reflect.TypeOf((*interconnectState)(nil)).Elem()
}

type interconnectArgs struct {
	// Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
	AdminEnabled *bool `pulumi:"adminEnabled"`
	// [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
	CircuitInfos []InterconnectCircuitInfo `pulumi:"circuitInfos"`
	// [Output Only] Creation timestamp in RFC3339 text format.
	CreationTimestamp *string `pulumi:"creationTimestamp"`
	// Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
	CustomerName *string `pulumi:"customerName"`
	// An optional description of this resource. Provide this property when you create the resource.
	Description *string `pulumi:"description"`
	// [Output Only] A list of outages expected for this Interconnect.
	ExpectedOutages []InterconnectOutageNotification `pulumi:"expectedOutages"`
	// [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
	GoogleIpAddress *string `pulumi:"googleIpAddress"`
	// [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
	GoogleReferenceId *string `pulumi:"googleReferenceId"`
	// [Output Only] The unique identifier for the resource. This identifier is defined by the server.
	Id           *string `pulumi:"id"`
	Interconnect string  `pulumi:"interconnect"`
	// [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
	InterconnectAttachments []string `pulumi:"interconnectAttachments"`
	// Type of interconnect, which can take one of the following values:
	// - PARTNER: A partner-managed interconnection shared between customers though a partner.
	// - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
	InterconnectType *string `pulumi:"interconnectType"`
	// [Output Only] Type of the resource. Always compute#interconnect for interconnects.
	Kind *string `pulumi:"kind"`
	// Type of link requested, which can take one of the following values:
	// - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics
	// - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
	LinkType *string `pulumi:"linkType"`
	// URL of the InterconnectLocation object that represents where this connection is to be provisioned.
	Location *string `pulumi:"location"`
	// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
	Name *string `pulumi:"name"`
	// Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
	NocContactEmail *string `pulumi:"nocContactEmail"`
	// [Output Only] The current status of this Interconnect's functionality, which can take one of the following values:
	// - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect.
	// - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	OperationalStatus *string `pulumi:"operationalStatus"`
	// [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
	PeerIpAddress *string `pulumi:"peerIpAddress"`
	Project       string  `pulumi:"project"`
	// [Output Only] Number of links actually provisioned in this interconnect.
	ProvisionedLinkCount *int `pulumi:"provisionedLinkCount"`
	// Target number of physical links in the link bundle, as requested by the customer.
	RequestedLinkCount *int `pulumi:"requestedLinkCount"`
	// [Output Only] Server-defined URL for the resource.
	SelfLink *string `pulumi:"selfLink"`
	// [Output Only] The current state of Interconnect functionality, which can take one of the following values:
	// - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect.
	// - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	State *string `pulumi:"state"`
}

// The set of arguments for constructing a Interconnect resource.
type InterconnectArgs struct {
	// Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
	AdminEnabled pulumi.BoolPtrInput
	// [Output Only] A list of CircuitInfo objects, that describe the individual circuits in this LAG.
	CircuitInfos InterconnectCircuitInfoArrayInput
	// [Output Only] Creation timestamp in RFC3339 text format.
	CreationTimestamp pulumi.StringPtrInput
	// Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
	CustomerName pulumi.StringPtrInput
	// An optional description of this resource. Provide this property when you create the resource.
	Description pulumi.StringPtrInput
	// [Output Only] A list of outages expected for this Interconnect.
	ExpectedOutages InterconnectOutageNotificationArrayInput
	// [Output Only] IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
	GoogleIpAddress pulumi.StringPtrInput
	// [Output Only] Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
	GoogleReferenceId pulumi.StringPtrInput
	// [Output Only] The unique identifier for the resource. This identifier is defined by the server.
	Id           pulumi.StringPtrInput
	Interconnect pulumi.StringInput
	// [Output Only] A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
	InterconnectAttachments pulumi.StringArrayInput
	// Type of interconnect, which can take one of the following values:
	// - PARTNER: A partner-managed interconnection shared between customers though a partner.
	// - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
	InterconnectType pulumi.StringPtrInput
	// [Output Only] Type of the resource. Always compute#interconnect for interconnects.
	Kind pulumi.StringPtrInput
	// Type of link requested, which can take one of the following values:
	// - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics
	// - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
	LinkType pulumi.StringPtrInput
	// URL of the InterconnectLocation object that represents where this connection is to be provisioned.
	Location pulumi.StringPtrInput
	// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
	Name pulumi.StringPtrInput
	// Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
	NocContactEmail pulumi.StringPtrInput
	// [Output Only] The current status of this Interconnect's functionality, which can take one of the following values:
	// - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect.
	// - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	OperationalStatus pulumi.StringPtrInput
	// [Output Only] IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
	PeerIpAddress pulumi.StringPtrInput
	Project       pulumi.StringInput
	// [Output Only] Number of links actually provisioned in this interconnect.
	ProvisionedLinkCount pulumi.IntPtrInput
	// Target number of physical links in the link bundle, as requested by the customer.
	RequestedLinkCount pulumi.IntPtrInput
	// [Output Only] Server-defined URL for the resource.
	SelfLink pulumi.StringPtrInput
	// [Output Only] The current state of Interconnect functionality, which can take one of the following values:
	// - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect.
	// - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect.
	// - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
	State pulumi.StringPtrInput
}

func (InterconnectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*interconnectArgs)(nil)).Elem()
}

type InterconnectInput interface {
	pulumi.Input

	ToInterconnectOutput() InterconnectOutput
	ToInterconnectOutputWithContext(ctx context.Context) InterconnectOutput
}

func (*Interconnect) ElementType() reflect.Type {
	return reflect.TypeOf((*Interconnect)(nil))
}

func (i *Interconnect) ToInterconnectOutput() InterconnectOutput {
	return i.ToInterconnectOutputWithContext(context.Background())
}

func (i *Interconnect) ToInterconnectOutputWithContext(ctx context.Context) InterconnectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterconnectOutput)
}

type InterconnectOutput struct {
	*pulumi.OutputState
}

func (InterconnectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Interconnect)(nil))
}

func (o InterconnectOutput) ToInterconnectOutput() InterconnectOutput {
	return o
}

func (o InterconnectOutput) ToInterconnectOutputWithContext(ctx context.Context) InterconnectOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(InterconnectOutput{})
}