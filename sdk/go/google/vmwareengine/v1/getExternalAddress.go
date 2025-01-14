// Code generated by the Pulumi SDK Generator DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-google-native/sdk/go/google/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets details of a single external IP address.
func LookupExternalAddress(ctx *pulumi.Context, args *LookupExternalAddressArgs, opts ...pulumi.InvokeOption) (*LookupExternalAddressResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupExternalAddressResult
	err := ctx.Invoke("google-native:vmwareengine/v1:getExternalAddress", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupExternalAddressArgs struct {
	ExternalAddressId string  `pulumi:"externalAddressId"`
	Location          string  `pulumi:"location"`
	PrivateCloudId    string  `pulumi:"privateCloudId"`
	Project           *string `pulumi:"project"`
}

type LookupExternalAddressResult struct {
	// Creation time of this resource.
	CreateTime string `pulumi:"createTime"`
	// User-provided description for this resource.
	Description string `pulumi:"description"`
	// The external IP address of a workload VM.
	ExternalIp string `pulumi:"externalIp"`
	// The internal IP address of a workload VM.
	InternalIp string `pulumi:"internalIp"`
	// The resource name of this external IP address. Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names. For example: `projects/my-project/locations/us-central1-a/privateClouds/my-cloud/externalAddresses/my-address`
	Name string `pulumi:"name"`
	// The state of the resource.
	State string `pulumi:"state"`
	// System-generated unique identifier for the resource.
	Uid string `pulumi:"uid"`
	// Last update time of this resource.
	UpdateTime string `pulumi:"updateTime"`
}

func LookupExternalAddressOutput(ctx *pulumi.Context, args LookupExternalAddressOutputArgs, opts ...pulumi.InvokeOption) LookupExternalAddressResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupExternalAddressResult, error) {
			args := v.(LookupExternalAddressArgs)
			r, err := LookupExternalAddress(ctx, &args, opts...)
			var s LookupExternalAddressResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupExternalAddressResultOutput)
}

type LookupExternalAddressOutputArgs struct {
	ExternalAddressId pulumi.StringInput    `pulumi:"externalAddressId"`
	Location          pulumi.StringInput    `pulumi:"location"`
	PrivateCloudId    pulumi.StringInput    `pulumi:"privateCloudId"`
	Project           pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupExternalAddressOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupExternalAddressArgs)(nil)).Elem()
}

type LookupExternalAddressResultOutput struct{ *pulumi.OutputState }

func (LookupExternalAddressResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupExternalAddressResult)(nil)).Elem()
}

func (o LookupExternalAddressResultOutput) ToLookupExternalAddressResultOutput() LookupExternalAddressResultOutput {
	return o
}

func (o LookupExternalAddressResultOutput) ToLookupExternalAddressResultOutputWithContext(ctx context.Context) LookupExternalAddressResultOutput {
	return o
}

// Creation time of this resource.
func (o LookupExternalAddressResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalAddressResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

// User-provided description for this resource.
func (o LookupExternalAddressResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalAddressResult) string { return v.Description }).(pulumi.StringOutput)
}

// The external IP address of a workload VM.
func (o LookupExternalAddressResultOutput) ExternalIp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalAddressResult) string { return v.ExternalIp }).(pulumi.StringOutput)
}

// The internal IP address of a workload VM.
func (o LookupExternalAddressResultOutput) InternalIp() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalAddressResult) string { return v.InternalIp }).(pulumi.StringOutput)
}

// The resource name of this external IP address. Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names. For example: `projects/my-project/locations/us-central1-a/privateClouds/my-cloud/externalAddresses/my-address`
func (o LookupExternalAddressResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalAddressResult) string { return v.Name }).(pulumi.StringOutput)
}

// The state of the resource.
func (o LookupExternalAddressResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalAddressResult) string { return v.State }).(pulumi.StringOutput)
}

// System-generated unique identifier for the resource.
func (o LookupExternalAddressResultOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalAddressResult) string { return v.Uid }).(pulumi.StringOutput)
}

// Last update time of this resource.
func (o LookupExternalAddressResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalAddressResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupExternalAddressResultOutput{})
}
