// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns an IAM policy for the specified object.
func LookupObjectIamPolicy(ctx *pulumi.Context, args *LookupObjectIamPolicyArgs, opts ...pulumi.InvokeOption) (*LookupObjectIamPolicyResult, error) {
	var rv LookupObjectIamPolicyResult
	err := ctx.Invoke("google-native:storage/v1:getObjectIamPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupObjectIamPolicyArgs struct {
	Bucket                 string  `pulumi:"bucket"`
	Generation             *string `pulumi:"generation"`
	Object                 string  `pulumi:"object"`
	ProvisionalUserProject *string `pulumi:"provisionalUserProject"`
	UserProject            *string `pulumi:"userProject"`
}

type LookupObjectIamPolicyResult struct {
	// An association between a role, which comes with a set of permissions, and members who may assume that role.
	Bindings []ObjectIamPolicyBindingsItemResponse `pulumi:"bindings"`
	// HTTP 1.1  Entity tag for the policy.
	Etag string `pulumi:"etag"`
	// The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
	Kind string `pulumi:"kind"`
	// The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
	ResourceId string `pulumi:"resourceId"`
	// The IAM policy format version.
	Version int `pulumi:"version"`
}

func LookupObjectIamPolicyOutput(ctx *pulumi.Context, args LookupObjectIamPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupObjectIamPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupObjectIamPolicyResult, error) {
			args := v.(LookupObjectIamPolicyArgs)
			r, err := LookupObjectIamPolicy(ctx, &args, opts...)
			return *r, err
		}).(LookupObjectIamPolicyResultOutput)
}

type LookupObjectIamPolicyOutputArgs struct {
	Bucket                 pulumi.StringInput    `pulumi:"bucket"`
	Generation             pulumi.StringPtrInput `pulumi:"generation"`
	Object                 pulumi.StringInput    `pulumi:"object"`
	ProvisionalUserProject pulumi.StringPtrInput `pulumi:"provisionalUserProject"`
	UserProject            pulumi.StringPtrInput `pulumi:"userProject"`
}

func (LookupObjectIamPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupObjectIamPolicyArgs)(nil)).Elem()
}

type LookupObjectIamPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupObjectIamPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupObjectIamPolicyResult)(nil)).Elem()
}

func (o LookupObjectIamPolicyResultOutput) ToLookupObjectIamPolicyResultOutput() LookupObjectIamPolicyResultOutput {
	return o
}

func (o LookupObjectIamPolicyResultOutput) ToLookupObjectIamPolicyResultOutputWithContext(ctx context.Context) LookupObjectIamPolicyResultOutput {
	return o
}

// An association between a role, which comes with a set of permissions, and members who may assume that role.
func (o LookupObjectIamPolicyResultOutput) Bindings() ObjectIamPolicyBindingsItemResponseArrayOutput {
	return o.ApplyT(func(v LookupObjectIamPolicyResult) []ObjectIamPolicyBindingsItemResponse { return v.Bindings }).(ObjectIamPolicyBindingsItemResponseArrayOutput)
}

// HTTP 1.1  Entity tag for the policy.
func (o LookupObjectIamPolicyResultOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupObjectIamPolicyResult) string { return v.Etag }).(pulumi.StringOutput)
}

// The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
func (o LookupObjectIamPolicyResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupObjectIamPolicyResult) string { return v.Kind }).(pulumi.StringOutput)
}

// The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
func (o LookupObjectIamPolicyResultOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupObjectIamPolicyResult) string { return v.ResourceId }).(pulumi.StringOutput)
}

// The IAM policy format version.
func (o LookupObjectIamPolicyResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupObjectIamPolicyResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupObjectIamPolicyResultOutput{})
}