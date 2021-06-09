// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v3beta1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a session entity type.
type SessionEntityType struct {
	pulumi.CustomResourceState

	// Required. The collection of entities to override or supplement the custom entity type.
	Entities GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponseArrayOutput `pulumi:"entities"`
	// Required. Indicates whether the additional data should override or supplement the custom entity type definition.
	EntityOverrideMode pulumi.StringOutput `pulumi:"entityOverrideMode"`
	// Required. The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewSessionEntityType registers a new resource with the given unique name, arguments, and options.
func NewSessionEntityType(ctx *pulumi.Context,
	name string, args *SessionEntityTypeArgs, opts ...pulumi.ResourceOption) (*SessionEntityType, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AgentId == nil {
		return nil, errors.New("invalid value for required argument 'AgentId'")
	}
	if args.EnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'EnvironmentId'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.SessionId == nil {
		return nil, errors.New("invalid value for required argument 'SessionId'")
	}
	var resource SessionEntityType
	err := ctx.RegisterResource("google-native:dialogflow/v3beta1:SessionEntityType", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSessionEntityType gets an existing SessionEntityType resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSessionEntityType(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SessionEntityTypeState, opts ...pulumi.ResourceOption) (*SessionEntityType, error) {
	var resource SessionEntityType
	err := ctx.ReadResource("google-native:dialogflow/v3beta1:SessionEntityType", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SessionEntityType resources.
type sessionEntityTypeState struct {
	// Required. The collection of entities to override or supplement the custom entity type.
	Entities []GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse `pulumi:"entities"`
	// Required. Indicates whether the additional data should override or supplement the custom entity type definition.
	EntityOverrideMode *string `pulumi:"entityOverrideMode"`
	// Required. The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
	Name *string `pulumi:"name"`
}

type SessionEntityTypeState struct {
	// Required. The collection of entities to override or supplement the custom entity type.
	Entities GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponseArrayInput
	// Required. Indicates whether the additional data should override or supplement the custom entity type definition.
	EntityOverrideMode pulumi.StringPtrInput
	// Required. The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
	Name pulumi.StringPtrInput
}

func (SessionEntityTypeState) ElementType() reflect.Type {
	return reflect.TypeOf((*sessionEntityTypeState)(nil)).Elem()
}

type sessionEntityTypeArgs struct {
	AgentId string `pulumi:"agentId"`
	// Required. The collection of entities to override or supplement the custom entity type.
	Entities []GoogleCloudDialogflowCxV3beta1EntityTypeEntity `pulumi:"entities"`
	// Required. Indicates whether the additional data should override or supplement the custom entity type definition.
	EntityOverrideMode *string `pulumi:"entityOverrideMode"`
	EnvironmentId      string  `pulumi:"environmentId"`
	Location           string  `pulumi:"location"`
	// Required. The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
	Name      *string `pulumi:"name"`
	Project   string  `pulumi:"project"`
	SessionId string  `pulumi:"sessionId"`
}

// The set of arguments for constructing a SessionEntityType resource.
type SessionEntityTypeArgs struct {
	AgentId pulumi.StringInput
	// Required. The collection of entities to override or supplement the custom entity type.
	Entities GoogleCloudDialogflowCxV3beta1EntityTypeEntityArrayInput
	// Required. Indicates whether the additional data should override or supplement the custom entity type definition.
	EntityOverrideMode pulumi.StringPtrInput
	EnvironmentId      pulumi.StringInput
	Location           pulumi.StringInput
	// Required. The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
	Name      pulumi.StringPtrInput
	Project   pulumi.StringInput
	SessionId pulumi.StringInput
}

func (SessionEntityTypeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sessionEntityTypeArgs)(nil)).Elem()
}

type SessionEntityTypeInput interface {
	pulumi.Input

	ToSessionEntityTypeOutput() SessionEntityTypeOutput
	ToSessionEntityTypeOutputWithContext(ctx context.Context) SessionEntityTypeOutput
}

func (*SessionEntityType) ElementType() reflect.Type {
	return reflect.TypeOf((*SessionEntityType)(nil))
}

func (i *SessionEntityType) ToSessionEntityTypeOutput() SessionEntityTypeOutput {
	return i.ToSessionEntityTypeOutputWithContext(context.Background())
}

func (i *SessionEntityType) ToSessionEntityTypeOutputWithContext(ctx context.Context) SessionEntityTypeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SessionEntityTypeOutput)
}

type SessionEntityTypeOutput struct {
	*pulumi.OutputState
}

func (SessionEntityTypeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SessionEntityType)(nil))
}

func (o SessionEntityTypeOutput) ToSessionEntityTypeOutput() SessionEntityTypeOutput {
	return o
}

func (o SessionEntityTypeOutput) ToSessionEntityTypeOutputWithContext(ctx context.Context) SessionEntityTypeOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(SessionEntityTypeOutput{})
}