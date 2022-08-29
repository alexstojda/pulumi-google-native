// Code generated by the Pulumi SDK Generator DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about a job.
func GetJob(ctx *pulumi.Context, args *GetJobArgs, opts ...pulumi.InvokeOption) (*GetJobResult, error) {
	var rv GetJobResult
	err := ctx.Invoke("google-native:run/v1:getJob", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type GetJobArgs struct {
	JobId       string `pulumi:"jobId"`
	NamespaceId string `pulumi:"namespaceId"`
}

type GetJobResult struct {
	// Optional. APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
	ApiVersion string `pulumi:"apiVersion"`
	// Optional. Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
	Kind string `pulumi:"kind"`
	// Optional. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
	Metadata ObjectMetaResponse `pulumi:"metadata"`
	// Optional. Specification of the desired behavior of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Spec JobSpecResponse `pulumi:"spec"`
	// Current status of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
	Status JobStatusResponse `pulumi:"status"`
}

func GetJobOutput(ctx *pulumi.Context, args GetJobOutputArgs, opts ...pulumi.InvokeOption) GetJobResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetJobResult, error) {
			args := v.(GetJobArgs)
			r, err := GetJob(ctx, &args, opts...)
			var s GetJobResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetJobResultOutput)
}

type GetJobOutputArgs struct {
	JobId       pulumi.StringInput `pulumi:"jobId"`
	NamespaceId pulumi.StringInput `pulumi:"namespaceId"`
}

func (GetJobOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJobArgs)(nil)).Elem()
}

type GetJobResultOutput struct{ *pulumi.OutputState }

func (GetJobResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJobResult)(nil)).Elem()
}

func (o GetJobResultOutput) ToGetJobResultOutput() GetJobResultOutput {
	return o
}

func (o GetJobResultOutput) ToGetJobResultOutputWithContext(ctx context.Context) GetJobResultOutput {
	return o
}

// Optional. APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
func (o GetJobResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetJobResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

// Optional. Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
func (o GetJobResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v GetJobResult) string { return v.Kind }).(pulumi.StringOutput)
}

// Optional. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
func (o GetJobResultOutput) Metadata() ObjectMetaResponseOutput {
	return o.ApplyT(func(v GetJobResult) ObjectMetaResponse { return v.Metadata }).(ObjectMetaResponseOutput)
}

// Optional. Specification of the desired behavior of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o GetJobResultOutput) Spec() JobSpecResponseOutput {
	return o.ApplyT(func(v GetJobResult) JobSpecResponse { return v.Spec }).(JobSpecResponseOutput)
}

// Current status of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
func (o GetJobResultOutput) Status() JobStatusResponseOutput {
	return o.ApplyT(func(v GetJobResult) JobStatusResponse { return v.Status }).(JobStatusResponseOutput)
}

func init() {
	pulumi.RegisterOutputType(GetJobResultOutput{})
}