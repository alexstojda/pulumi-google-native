// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates a Serverless VPC Access connector, returns an operation.
type Connector struct {
	pulumi.CustomResourceState

	// List of projects using the connector.
	ConnectedProjects pulumi.StringArrayOutput `pulumi:"connectedProjects"`
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange pulumi.StringOutput `pulumi:"ipCidrRange"`
	// Maximum throughput of the connector in Mbps. Default is 200, max is 1000.
	MaxThroughput pulumi.IntOutput `pulumi:"maxThroughput"`
	// Minimum throughput of the connector in Mbps. Default and min is 200.
	MinThroughput pulumi.IntOutput `pulumi:"minThroughput"`
	// The resource name in the format `projects/*/locations/*/connectors/*`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Name of a VPC network.
	Network pulumi.StringOutput `pulumi:"network"`
	// State of the VPC access connector.
	State pulumi.StringOutput `pulumi:"state"`
	// The subnet in which to house the VPC Access Connector.
	Subnet SubnetResponseOutput `pulumi:"subnet"`
}

// NewConnector registers a new resource with the given unique name, arguments, and options.
func NewConnector(ctx *pulumi.Context,
	name string, args *ConnectorArgs, opts ...pulumi.ResourceOption) (*Connector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectorsId == nil {
		return nil, errors.New("invalid value for required argument 'ConnectorsId'")
	}
	if args.LocationsId == nil {
		return nil, errors.New("invalid value for required argument 'LocationsId'")
	}
	if args.ProjectsId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectsId'")
	}
	var resource Connector
	err := ctx.RegisterResource("gcp-native:vpcaccess/v1:Connector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnector gets an existing Connector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorState, opts ...pulumi.ResourceOption) (*Connector, error) {
	var resource Connector
	err := ctx.ReadResource("gcp-native:vpcaccess/v1:Connector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connector resources.
type connectorState struct {
	// List of projects using the connector.
	ConnectedProjects []string `pulumi:"connectedProjects"`
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange *string `pulumi:"ipCidrRange"`
	// Maximum throughput of the connector in Mbps. Default is 200, max is 1000.
	MaxThroughput *int `pulumi:"maxThroughput"`
	// Minimum throughput of the connector in Mbps. Default and min is 200.
	MinThroughput *int `pulumi:"minThroughput"`
	// The resource name in the format `projects/*/locations/*/connectors/*`.
	Name *string `pulumi:"name"`
	// Name of a VPC network.
	Network *string `pulumi:"network"`
	// State of the VPC access connector.
	State *string `pulumi:"state"`
	// The subnet in which to house the VPC Access Connector.
	Subnet *SubnetResponse `pulumi:"subnet"`
}

type ConnectorState struct {
	// List of projects using the connector.
	ConnectedProjects pulumi.StringArrayInput
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange pulumi.StringPtrInput
	// Maximum throughput of the connector in Mbps. Default is 200, max is 1000.
	MaxThroughput pulumi.IntPtrInput
	// Minimum throughput of the connector in Mbps. Default and min is 200.
	MinThroughput pulumi.IntPtrInput
	// The resource name in the format `projects/*/locations/*/connectors/*`.
	Name pulumi.StringPtrInput
	// Name of a VPC network.
	Network pulumi.StringPtrInput
	// State of the VPC access connector.
	State pulumi.StringPtrInput
	// The subnet in which to house the VPC Access Connector.
	Subnet SubnetResponsePtrInput
}

func (ConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorState)(nil)).Elem()
}

type connectorArgs struct {
	ConnectorsId string `pulumi:"connectorsId"`
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange *string `pulumi:"ipCidrRange"`
	LocationsId string  `pulumi:"locationsId"`
	// Maximum throughput of the connector in Mbps. Default is 200, max is 1000.
	MaxThroughput *int `pulumi:"maxThroughput"`
	// Minimum throughput of the connector in Mbps. Default and min is 200.
	MinThroughput *int `pulumi:"minThroughput"`
	// The resource name in the format `projects/*/locations/*/connectors/*`.
	Name *string `pulumi:"name"`
	// Name of a VPC network.
	Network    *string `pulumi:"network"`
	ProjectsId string  `pulumi:"projectsId"`
	// The subnet in which to house the VPC Access Connector.
	Subnet *Subnet `pulumi:"subnet"`
}

// The set of arguments for constructing a Connector resource.
type ConnectorArgs struct {
	ConnectorsId pulumi.StringInput
	// The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
	IpCidrRange pulumi.StringPtrInput
	LocationsId pulumi.StringInput
	// Maximum throughput of the connector in Mbps. Default is 200, max is 1000.
	MaxThroughput pulumi.IntPtrInput
	// Minimum throughput of the connector in Mbps. Default and min is 200.
	MinThroughput pulumi.IntPtrInput
	// The resource name in the format `projects/*/locations/*/connectors/*`.
	Name pulumi.StringPtrInput
	// Name of a VPC network.
	Network    pulumi.StringPtrInput
	ProjectsId pulumi.StringInput
	// The subnet in which to house the VPC Access Connector.
	Subnet SubnetPtrInput
}

func (ConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorArgs)(nil)).Elem()
}

type ConnectorInput interface {
	pulumi.Input

	ToConnectorOutput() ConnectorOutput
	ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput
}

func (*Connector) ElementType() reflect.Type {
	return reflect.TypeOf((*Connector)(nil))
}

func (i *Connector) ToConnectorOutput() ConnectorOutput {
	return i.ToConnectorOutputWithContext(context.Background())
}

func (i *Connector) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorOutput)
}

type ConnectorOutput struct {
	*pulumi.OutputState
}

func (ConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Connector)(nil))
}

func (o ConnectorOutput) ToConnectorOutput() ConnectorOutput {
	return o
}

func (o ConnectorOutput) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ConnectorOutput{})
}