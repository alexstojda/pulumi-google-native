// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
type DomainBackupIamPolicy struct {
	pulumi.CustomResourceState

	// Associates a list of `members` to a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one member.
	Bindings BindingResponseArrayOutput `pulumi:"bindings"`
	// `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewDomainBackupIamPolicy registers a new resource with the given unique name, arguments, and options.
func NewDomainBackupIamPolicy(ctx *pulumi.Context,
	name string, args *DomainBackupIamPolicyArgs, opts ...pulumi.ResourceOption) (*DomainBackupIamPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BackupId == nil {
		return nil, errors.New("invalid value for required argument 'BackupId'")
	}
	if args.DomainId == nil {
		return nil, errors.New("invalid value for required argument 'DomainId'")
	}
	var resource DomainBackupIamPolicy
	err := ctx.RegisterResource("google-native:managedidentities/v1alpha1:DomainBackupIamPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomainBackupIamPolicy gets an existing DomainBackupIamPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomainBackupIamPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainBackupIamPolicyState, opts ...pulumi.ResourceOption) (*DomainBackupIamPolicy, error) {
	var resource DomainBackupIamPolicy
	err := ctx.ReadResource("google-native:managedidentities/v1alpha1:DomainBackupIamPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DomainBackupIamPolicy resources.
type domainBackupIamPolicyState struct {
}

type DomainBackupIamPolicyState struct {
}

func (DomainBackupIamPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainBackupIamPolicyState)(nil)).Elem()
}

type domainBackupIamPolicyArgs struct {
	BackupId string `pulumi:"backupId"`
	// Associates a list of `members` to a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one member.
	Bindings []Binding `pulumi:"bindings"`
	DomainId string    `pulumi:"domainId"`
	// `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
	Etag    *string `pulumi:"etag"`
	Project *string `pulumi:"project"`
	// Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
	Version *int `pulumi:"version"`
}

// The set of arguments for constructing a DomainBackupIamPolicy resource.
type DomainBackupIamPolicyArgs struct {
	BackupId pulumi.StringInput
	// Associates a list of `members` to a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one member.
	Bindings BindingArrayInput
	DomainId pulumi.StringInput
	// `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
	Etag    pulumi.StringPtrInput
	Project pulumi.StringPtrInput
	// Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
	Version pulumi.IntPtrInput
}

func (DomainBackupIamPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainBackupIamPolicyArgs)(nil)).Elem()
}

type DomainBackupIamPolicyInput interface {
	pulumi.Input

	ToDomainBackupIamPolicyOutput() DomainBackupIamPolicyOutput
	ToDomainBackupIamPolicyOutputWithContext(ctx context.Context) DomainBackupIamPolicyOutput
}

func (*DomainBackupIamPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainBackupIamPolicy)(nil))
}

func (i *DomainBackupIamPolicy) ToDomainBackupIamPolicyOutput() DomainBackupIamPolicyOutput {
	return i.ToDomainBackupIamPolicyOutputWithContext(context.Background())
}

func (i *DomainBackupIamPolicy) ToDomainBackupIamPolicyOutputWithContext(ctx context.Context) DomainBackupIamPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainBackupIamPolicyOutput)
}

type DomainBackupIamPolicyOutput struct {
	*pulumi.OutputState
}

func (DomainBackupIamPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DomainBackupIamPolicy)(nil))
}

func (o DomainBackupIamPolicyOutput) ToDomainBackupIamPolicyOutput() DomainBackupIamPolicyOutput {
	return o
}

func (o DomainBackupIamPolicyOutput) ToDomainBackupIamPolicyOutputWithContext(ctx context.Context) DomainBackupIamPolicyOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(DomainBackupIamPolicyOutput{})
}