// Code generated by the Pulumi SDK Generator DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets the description of an exclusion in the _Default sink.
func LookupOrganizationExclusion(ctx *pulumi.Context, args *LookupOrganizationExclusionArgs, opts ...pulumi.InvokeOption) (*LookupOrganizationExclusionResult, error) {
	var rv LookupOrganizationExclusionResult
	err := ctx.Invoke("google-native:logging/v2:getOrganizationExclusion", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupOrganizationExclusionArgs struct {
	ExclusionId    string `pulumi:"exclusionId"`
	OrganizationId string `pulumi:"organizationId"`
}

type LookupOrganizationExclusionResult struct {
	// The creation timestamp of the exclusion.This field may not be present for older exclusions.
	CreateTime string `pulumi:"createTime"`
	// Optional. A description of this exclusion.
	Description string `pulumi:"description"`
	// Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can update an exclusion to change the value of this field.
	Disabled bool `pulumi:"disabled"`
	// An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries) that matches the log entries to be excluded. By using the sample function (https://cloud.google.com/logging/docs/view/advanced-queries#sample), you can exclude less than 100% of the matching log entries.For example, the following query matches 99% of low-severity log entries from Google Cloud Storage buckets:resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)
	Filter string `pulumi:"filter"`
	// A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
	Name string `pulumi:"name"`
	// The last update timestamp of the exclusion.This field may not be present for older exclusions.
	UpdateTime string `pulumi:"updateTime"`
}

func LookupOrganizationExclusionOutput(ctx *pulumi.Context, args LookupOrganizationExclusionOutputArgs, opts ...pulumi.InvokeOption) LookupOrganizationExclusionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOrganizationExclusionResult, error) {
			args := v.(LookupOrganizationExclusionArgs)
			r, err := LookupOrganizationExclusion(ctx, &args, opts...)
			var s LookupOrganizationExclusionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOrganizationExclusionResultOutput)
}

type LookupOrganizationExclusionOutputArgs struct {
	ExclusionId    pulumi.StringInput `pulumi:"exclusionId"`
	OrganizationId pulumi.StringInput `pulumi:"organizationId"`
}

func (LookupOrganizationExclusionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationExclusionArgs)(nil)).Elem()
}

type LookupOrganizationExclusionResultOutput struct{ *pulumi.OutputState }

func (LookupOrganizationExclusionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationExclusionResult)(nil)).Elem()
}

func (o LookupOrganizationExclusionResultOutput) ToLookupOrganizationExclusionResultOutput() LookupOrganizationExclusionResultOutput {
	return o
}

func (o LookupOrganizationExclusionResultOutput) ToLookupOrganizationExclusionResultOutputWithContext(ctx context.Context) LookupOrganizationExclusionResultOutput {
	return o
}

// The creation timestamp of the exclusion.This field may not be present for older exclusions.
func (o LookupOrganizationExclusionResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationExclusionResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

// Optional. A description of this exclusion.
func (o LookupOrganizationExclusionResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationExclusionResult) string { return v.Description }).(pulumi.StringOutput)
}

// Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can update an exclusion to change the value of this field.
func (o LookupOrganizationExclusionResultOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupOrganizationExclusionResult) bool { return v.Disabled }).(pulumi.BoolOutput)
}

// An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries) that matches the log entries to be excluded. By using the sample function (https://cloud.google.com/logging/docs/view/advanced-queries#sample), you can exclude less than 100% of the matching log entries.For example, the following query matches 99% of low-severity log entries from Google Cloud Storage buckets:resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)
func (o LookupOrganizationExclusionResultOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationExclusionResult) string { return v.Filter }).(pulumi.StringOutput)
}

// A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
func (o LookupOrganizationExclusionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationExclusionResult) string { return v.Name }).(pulumi.StringOutput)
}

// The last update timestamp of the exclusion.This field may not be present for older exclusions.
func (o LookupOrganizationExclusionResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationExclusionResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOrganizationExclusionResultOutput{})
}