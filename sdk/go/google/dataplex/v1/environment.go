// Code generated by the Pulumi SDK Generator DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Create an environment resource.
// Auto-naming is currently not supported for this resource.
type Environment struct {
	pulumi.CustomResourceState

	// Environment creation time.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Optional. Description of the environment.
	Description pulumi.StringOutput `pulumi:"description"`
	// Optional. User friendly display name.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// URI Endpoints to access sessions associated with the Environment.
	Endpoints GoogleCloudDataplexV1EnvironmentEndpointsResponseOutput `pulumi:"endpoints"`
	// Infrastructure specification for the Environment.
	InfrastructureSpec GoogleCloudDataplexV1EnvironmentInfrastructureSpecResponseOutput `pulumi:"infrastructureSpec"`
	// Optional. User defined labels for the environment.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The relative resource name of the environment, of the form: projects/{project_id}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}
	Name pulumi.StringOutput `pulumi:"name"`
	// Optional. Configuration for sessions created for this environment.
	SessionSpec GoogleCloudDataplexV1EnvironmentSessionSpecResponseOutput `pulumi:"sessionSpec"`
	// Status of sessions created for this environment.
	SessionStatus GoogleCloudDataplexV1EnvironmentSessionStatusResponseOutput `pulumi:"sessionStatus"`
	// Current state of the environment.
	State pulumi.StringOutput `pulumi:"state"`
	// System generated globally unique ID for the environment. This ID will be different if the environment is deleted and re-created with the same name.
	Uid pulumi.StringOutput `pulumi:"uid"`
	// The time when the environment was last updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewEnvironment registers a new resource with the given unique name, arguments, and options.
func NewEnvironment(ctx *pulumi.Context,
	name string, args *EnvironmentArgs, opts ...pulumi.ResourceOption) (*Environment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'EnvironmentId'")
	}
	if args.InfrastructureSpec == nil {
		return nil, errors.New("invalid value for required argument 'InfrastructureSpec'")
	}
	if args.LakeId == nil {
		return nil, errors.New("invalid value for required argument 'LakeId'")
	}
	var resource Environment
	err := ctx.RegisterResource("google-native:dataplex/v1:Environment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnvironment gets an existing Environment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnvironment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnvironmentState, opts ...pulumi.ResourceOption) (*Environment, error) {
	var resource Environment
	err := ctx.ReadResource("google-native:dataplex/v1:Environment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Environment resources.
type environmentState struct {
}

type EnvironmentState struct {
}

func (EnvironmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentState)(nil)).Elem()
}

type environmentArgs struct {
	// Optional. Description of the environment.
	Description *string `pulumi:"description"`
	// Optional. User friendly display name.
	DisplayName *string `pulumi:"displayName"`
	// Required. Environment identifier. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the lake.
	EnvironmentId string `pulumi:"environmentId"`
	// Infrastructure specification for the Environment.
	InfrastructureSpec GoogleCloudDataplexV1EnvironmentInfrastructureSpec `pulumi:"infrastructureSpec"`
	// Optional. User defined labels for the environment.
	Labels   map[string]string `pulumi:"labels"`
	LakeId   string            `pulumi:"lakeId"`
	Location *string           `pulumi:"location"`
	Project  *string           `pulumi:"project"`
	// Optional. Configuration for sessions created for this environment.
	SessionSpec *GoogleCloudDataplexV1EnvironmentSessionSpec `pulumi:"sessionSpec"`
	// Optional. Only validate the request, but do not perform mutations. The default is false.
	ValidateOnly *string `pulumi:"validateOnly"`
}

// The set of arguments for constructing a Environment resource.
type EnvironmentArgs struct {
	// Optional. Description of the environment.
	Description pulumi.StringPtrInput
	// Optional. User friendly display name.
	DisplayName pulumi.StringPtrInput
	// Required. Environment identifier. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the lake.
	EnvironmentId pulumi.StringInput
	// Infrastructure specification for the Environment.
	InfrastructureSpec GoogleCloudDataplexV1EnvironmentInfrastructureSpecInput
	// Optional. User defined labels for the environment.
	Labels   pulumi.StringMapInput
	LakeId   pulumi.StringInput
	Location pulumi.StringPtrInput
	Project  pulumi.StringPtrInput
	// Optional. Configuration for sessions created for this environment.
	SessionSpec GoogleCloudDataplexV1EnvironmentSessionSpecPtrInput
	// Optional. Only validate the request, but do not perform mutations. The default is false.
	ValidateOnly pulumi.StringPtrInput
}

func (EnvironmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentArgs)(nil)).Elem()
}

type EnvironmentInput interface {
	pulumi.Input

	ToEnvironmentOutput() EnvironmentOutput
	ToEnvironmentOutputWithContext(ctx context.Context) EnvironmentOutput
}

func (*Environment) ElementType() reflect.Type {
	return reflect.TypeOf((**Environment)(nil)).Elem()
}

func (i *Environment) ToEnvironmentOutput() EnvironmentOutput {
	return i.ToEnvironmentOutputWithContext(context.Background())
}

func (i *Environment) ToEnvironmentOutputWithContext(ctx context.Context) EnvironmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentOutput)
}

type EnvironmentOutput struct{ *pulumi.OutputState }

func (EnvironmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Environment)(nil)).Elem()
}

func (o EnvironmentOutput) ToEnvironmentOutput() EnvironmentOutput {
	return o
}

func (o EnvironmentOutput) ToEnvironmentOutputWithContext(ctx context.Context) EnvironmentOutput {
	return o
}

// Environment creation time.
func (o EnvironmentOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Environment) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Optional. Description of the environment.
func (o EnvironmentOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Environment) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Optional. User friendly display name.
func (o EnvironmentOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Environment) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// URI Endpoints to access sessions associated with the Environment.
func (o EnvironmentOutput) Endpoints() GoogleCloudDataplexV1EnvironmentEndpointsResponseOutput {
	return o.ApplyT(func(v *Environment) GoogleCloudDataplexV1EnvironmentEndpointsResponseOutput { return v.Endpoints }).(GoogleCloudDataplexV1EnvironmentEndpointsResponseOutput)
}

// Infrastructure specification for the Environment.
func (o EnvironmentOutput) InfrastructureSpec() GoogleCloudDataplexV1EnvironmentInfrastructureSpecResponseOutput {
	return o.ApplyT(func(v *Environment) GoogleCloudDataplexV1EnvironmentInfrastructureSpecResponseOutput {
		return v.InfrastructureSpec
	}).(GoogleCloudDataplexV1EnvironmentInfrastructureSpecResponseOutput)
}

// Optional. User defined labels for the environment.
func (o EnvironmentOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Environment) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The relative resource name of the environment, of the form: projects/{project_id}/locations/{location_id}/lakes/{lake_id}/environment/{environment_id}
func (o EnvironmentOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Environment) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Optional. Configuration for sessions created for this environment.
func (o EnvironmentOutput) SessionSpec() GoogleCloudDataplexV1EnvironmentSessionSpecResponseOutput {
	return o.ApplyT(func(v *Environment) GoogleCloudDataplexV1EnvironmentSessionSpecResponseOutput { return v.SessionSpec }).(GoogleCloudDataplexV1EnvironmentSessionSpecResponseOutput)
}

// Status of sessions created for this environment.
func (o EnvironmentOutput) SessionStatus() GoogleCloudDataplexV1EnvironmentSessionStatusResponseOutput {
	return o.ApplyT(func(v *Environment) GoogleCloudDataplexV1EnvironmentSessionStatusResponseOutput {
		return v.SessionStatus
	}).(GoogleCloudDataplexV1EnvironmentSessionStatusResponseOutput)
}

// Current state of the environment.
func (o EnvironmentOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Environment) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// System generated globally unique ID for the environment. This ID will be different if the environment is deleted and re-created with the same name.
func (o EnvironmentOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v *Environment) pulumi.StringOutput { return v.Uid }).(pulumi.StringOutput)
}

// The time when the environment was last updated.
func (o EnvironmentOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Environment) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentInput)(nil)).Elem(), &Environment{})
	pulumi.RegisterOutputType(EnvironmentOutput{})
}