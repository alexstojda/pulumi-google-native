// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a resource file. Specify the `Content-Type` as `application/octet-stream` or `multipart/form-data`. For more information about resource files, see [Resource files](https://cloud.google.com/apigee/docs/api-platform/develop/resource-files).
// Auto-naming is currently not supported for this resource.
type Resourcefile struct {
	pulumi.CustomResourceState

	// The HTTP Content-Type header value specifying the content type of the body.
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// The HTTP request/response body as raw binary.
	Data pulumi.StringOutput `pulumi:"data"`
	// Application specific response metadata. Must be set in the first response for streaming APIs.
	Extensions pulumi.StringMapArrayOutput `pulumi:"extensions"`
}

// NewResourcefile registers a new resource with the given unique name, arguments, and options.
func NewResourcefile(ctx *pulumi.Context,
	name string, args *ResourcefileArgs, opts ...pulumi.ResourceOption) (*Resourcefile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'EnvironmentId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource Resourcefile
	err := ctx.RegisterResource("google-native:apigee/v1:Resourcefile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourcefile gets an existing Resourcefile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourcefile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourcefileState, opts ...pulumi.ResourceOption) (*Resourcefile, error) {
	var resource Resourcefile
	err := ctx.ReadResource("google-native:apigee/v1:Resourcefile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Resourcefile resources.
type resourcefileState struct {
}

type ResourcefileState struct {
}

func (ResourcefileState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourcefileState)(nil)).Elem()
}

type resourcefileArgs struct {
	// The HTTP Content-Type header value specifying the content type of the body.
	ContentType *string `pulumi:"contentType"`
	// The HTTP request/response body as raw binary.
	Data          *string `pulumi:"data"`
	EnvironmentId string  `pulumi:"environmentId"`
	// Application specific response metadata. Must be set in the first response for streaming APIs.
	Extensions []map[string]string `pulumi:"extensions"`
	// Required. Name of the resource file. Must match the regular expression: [a-zA-Z0-9:/\\!@#$%^&{}\[\]()+\-=,.~'` ]{1,255}
	Name           string `pulumi:"name"`
	OrganizationId string `pulumi:"organizationId"`
	// Required. Resource file type. {{ resource_file_type }}
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Resourcefile resource.
type ResourcefileArgs struct {
	// The HTTP Content-Type header value specifying the content type of the body.
	ContentType pulumi.StringPtrInput
	// The HTTP request/response body as raw binary.
	Data          pulumi.StringPtrInput
	EnvironmentId pulumi.StringInput
	// Application specific response metadata. Must be set in the first response for streaming APIs.
	Extensions pulumi.StringMapArrayInput
	// Required. Name of the resource file. Must match the regular expression: [a-zA-Z0-9:/\\!@#$%^&{}\[\]()+\-=,.~'` ]{1,255}
	Name           pulumi.StringInput
	OrganizationId pulumi.StringInput
	// Required. Resource file type. {{ resource_file_type }}
	Type pulumi.StringInput
}

func (ResourcefileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourcefileArgs)(nil)).Elem()
}

type ResourcefileInput interface {
	pulumi.Input

	ToResourcefileOutput() ResourcefileOutput
	ToResourcefileOutputWithContext(ctx context.Context) ResourcefileOutput
}

func (*Resourcefile) ElementType() reflect.Type {
	return reflect.TypeOf((**Resourcefile)(nil)).Elem()
}

func (i *Resourcefile) ToResourcefileOutput() ResourcefileOutput {
	return i.ToResourcefileOutputWithContext(context.Background())
}

func (i *Resourcefile) ToResourcefileOutputWithContext(ctx context.Context) ResourcefileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourcefileOutput)
}

type ResourcefileOutput struct{ *pulumi.OutputState }

func (ResourcefileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Resourcefile)(nil)).Elem()
}

func (o ResourcefileOutput) ToResourcefileOutput() ResourcefileOutput {
	return o
}

func (o ResourcefileOutput) ToResourcefileOutputWithContext(ctx context.Context) ResourcefileOutput {
	return o
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourcefileInput)(nil)).Elem(), &Resourcefile{})
	pulumi.RegisterOutputType(ResourcefileOutput{})
}