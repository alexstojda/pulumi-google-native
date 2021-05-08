// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta3

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a History. The returned History will have the id set. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing project does not exist
type History struct {
	pulumi.CustomResourceState

	// A short human-readable (plain text) name to display in the UI. Maximum of 100 characters. - In response: present if set during create. - In create request: optional
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// A unique identifier within a project for this History. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create request: never set
	HistoryId pulumi.StringOutput `pulumi:"historyId"`
	// A name to uniquely identify a history within a project. Maximum of 200 characters. - In response always set - In create request: always set
	Name pulumi.StringOutput `pulumi:"name"`
	// The platform of the test history. - In response: always set. Returns the platform of the last execution if unknown.
	TestPlatform pulumi.StringOutput `pulumi:"testPlatform"`
}

// NewHistory registers a new resource with the given unique name, arguments, and options.
func NewHistory(ctx *pulumi.Context,
	name string, args *HistoryArgs, opts ...pulumi.ResourceOption) (*History, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.HistoryId == nil {
		return nil, errors.New("invalid value for required argument 'HistoryId'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	var resource History
	err := ctx.RegisterResource("google-native:toolresults/v1beta3:History", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHistory gets an existing History resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHistory(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HistoryState, opts ...pulumi.ResourceOption) (*History, error) {
	var resource History
	err := ctx.ReadResource("google-native:toolresults/v1beta3:History", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering History resources.
type historyState struct {
	// A short human-readable (plain text) name to display in the UI. Maximum of 100 characters. - In response: present if set during create. - In create request: optional
	DisplayName *string `pulumi:"displayName"`
	// A unique identifier within a project for this History. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create request: never set
	HistoryId *string `pulumi:"historyId"`
	// A name to uniquely identify a history within a project. Maximum of 200 characters. - In response always set - In create request: always set
	Name *string `pulumi:"name"`
	// The platform of the test history. - In response: always set. Returns the platform of the last execution if unknown.
	TestPlatform *string `pulumi:"testPlatform"`
}

type HistoryState struct {
	// A short human-readable (plain text) name to display in the UI. Maximum of 100 characters. - In response: present if set during create. - In create request: optional
	DisplayName pulumi.StringPtrInput
	// A unique identifier within a project for this History. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create request: never set
	HistoryId pulumi.StringPtrInput
	// A name to uniquely identify a history within a project. Maximum of 200 characters. - In response always set - In create request: always set
	Name pulumi.StringPtrInput
	// The platform of the test history. - In response: always set. Returns the platform of the last execution if unknown.
	TestPlatform pulumi.StringPtrInput
}

func (HistoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*historyState)(nil)).Elem()
}

type historyArgs struct {
	// A short human-readable (plain text) name to display in the UI. Maximum of 100 characters. - In response: present if set during create. - In create request: optional
	DisplayName *string `pulumi:"displayName"`
	// A unique identifier within a project for this History. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create request: never set
	HistoryId string `pulumi:"historyId"`
	// A name to uniquely identify a history within a project. Maximum of 200 characters. - In response always set - In create request: always set
	Name      *string `pulumi:"name"`
	ProjectId string  `pulumi:"projectId"`
	RequestId *string `pulumi:"requestId"`
	// The platform of the test history. - In response: always set. Returns the platform of the last execution if unknown.
	TestPlatform *string `pulumi:"testPlatform"`
}

// The set of arguments for constructing a History resource.
type HistoryArgs struct {
	// A short human-readable (plain text) name to display in the UI. Maximum of 100 characters. - In response: present if set during create. - In create request: optional
	DisplayName pulumi.StringPtrInput
	// A unique identifier within a project for this History. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create request: never set
	HistoryId pulumi.StringInput
	// A name to uniquely identify a history within a project. Maximum of 200 characters. - In response always set - In create request: always set
	Name      pulumi.StringPtrInput
	ProjectId pulumi.StringInput
	RequestId pulumi.StringPtrInput
	// The platform of the test history. - In response: always set. Returns the platform of the last execution if unknown.
	TestPlatform pulumi.StringPtrInput
}

func (HistoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*historyArgs)(nil)).Elem()
}

type HistoryInput interface {
	pulumi.Input

	ToHistoryOutput() HistoryOutput
	ToHistoryOutputWithContext(ctx context.Context) HistoryOutput
}

func (*History) ElementType() reflect.Type {
	return reflect.TypeOf((*History)(nil))
}

func (i *History) ToHistoryOutput() HistoryOutput {
	return i.ToHistoryOutputWithContext(context.Background())
}

func (i *History) ToHistoryOutputWithContext(ctx context.Context) HistoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HistoryOutput)
}

type HistoryOutput struct {
	*pulumi.OutputState
}

func (HistoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*History)(nil))
}

func (o HistoryOutput) ToHistoryOutput() HistoryOutput {
	return o
}

func (o HistoryOutput) ToHistoryOutputWithContext(ctx context.Context) HistoryOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(HistoryOutput{})
}