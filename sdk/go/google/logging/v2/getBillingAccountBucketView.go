// Code generated by the Pulumi SDK Generator DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets a view on a log bucket..
func LookupBillingAccountBucketView(ctx *pulumi.Context, args *LookupBillingAccountBucketViewArgs, opts ...pulumi.InvokeOption) (*LookupBillingAccountBucketViewResult, error) {
	var rv LookupBillingAccountBucketViewResult
	err := ctx.Invoke("google-native:logging/v2:getBillingAccountBucketView", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupBillingAccountBucketViewArgs struct {
	BillingAccountId string `pulumi:"billingAccountId"`
	BucketId         string `pulumi:"bucketId"`
	Location         string `pulumi:"location"`
	ViewId           string `pulumi:"viewId"`
}

type LookupBillingAccountBucketViewResult struct {
	// The creation timestamp of the view.
	CreateTime string `pulumi:"createTime"`
	// Describes this view.
	Description string `pulumi:"description"`
	// Filter that restricts which log entries in a bucket are visible in this view.Filters are restricted to be a logical AND of ==/!= of any of the following: originating project/folder/organization/billing account. resource type log idFor example:SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
	Filter string `pulumi:"filter"`
	// The resource name of the view.For example:projects/my-project/locations/global/buckets/my-bucket/views/my-view
	Name string `pulumi:"name"`
	// The last update timestamp of the view.
	UpdateTime string `pulumi:"updateTime"`
}

func LookupBillingAccountBucketViewOutput(ctx *pulumi.Context, args LookupBillingAccountBucketViewOutputArgs, opts ...pulumi.InvokeOption) LookupBillingAccountBucketViewResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBillingAccountBucketViewResult, error) {
			args := v.(LookupBillingAccountBucketViewArgs)
			r, err := LookupBillingAccountBucketView(ctx, &args, opts...)
			var s LookupBillingAccountBucketViewResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBillingAccountBucketViewResultOutput)
}

type LookupBillingAccountBucketViewOutputArgs struct {
	BillingAccountId pulumi.StringInput `pulumi:"billingAccountId"`
	BucketId         pulumi.StringInput `pulumi:"bucketId"`
	Location         pulumi.StringInput `pulumi:"location"`
	ViewId           pulumi.StringInput `pulumi:"viewId"`
}

func (LookupBillingAccountBucketViewOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBillingAccountBucketViewArgs)(nil)).Elem()
}

type LookupBillingAccountBucketViewResultOutput struct{ *pulumi.OutputState }

func (LookupBillingAccountBucketViewResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBillingAccountBucketViewResult)(nil)).Elem()
}

func (o LookupBillingAccountBucketViewResultOutput) ToLookupBillingAccountBucketViewResultOutput() LookupBillingAccountBucketViewResultOutput {
	return o
}

func (o LookupBillingAccountBucketViewResultOutput) ToLookupBillingAccountBucketViewResultOutputWithContext(ctx context.Context) LookupBillingAccountBucketViewResultOutput {
	return o
}

// The creation timestamp of the view.
func (o LookupBillingAccountBucketViewResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBillingAccountBucketViewResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

// Describes this view.
func (o LookupBillingAccountBucketViewResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBillingAccountBucketViewResult) string { return v.Description }).(pulumi.StringOutput)
}

// Filter that restricts which log entries in a bucket are visible in this view.Filters are restricted to be a logical AND of ==/!= of any of the following: originating project/folder/organization/billing account. resource type log idFor example:SOURCE("projects/myproject") AND resource.type = "gce_instance" AND LOG_ID("stdout")
func (o LookupBillingAccountBucketViewResultOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBillingAccountBucketViewResult) string { return v.Filter }).(pulumi.StringOutput)
}

// The resource name of the view.For example:projects/my-project/locations/global/buckets/my-bucket/views/my-view
func (o LookupBillingAccountBucketViewResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBillingAccountBucketViewResult) string { return v.Name }).(pulumi.StringOutput)
}

// The last update timestamp of the view.
func (o LookupBillingAccountBucketViewResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBillingAccountBucketViewResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBillingAccountBucketViewResultOutput{})
}