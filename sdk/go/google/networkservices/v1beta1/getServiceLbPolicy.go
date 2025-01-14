// Code generated by the Pulumi SDK Generator DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-google-native/sdk/go/google/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets details of a single ServiceLbPolicy.
func LookupServiceLbPolicy(ctx *pulumi.Context, args *LookupServiceLbPolicyArgs, opts ...pulumi.InvokeOption) (*LookupServiceLbPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceLbPolicyResult
	err := ctx.Invoke("google-native:networkservices/v1beta1:getServiceLbPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupServiceLbPolicyArgs struct {
	Location          string  `pulumi:"location"`
	Project           *string `pulumi:"project"`
	ServiceLbPolicyId string  `pulumi:"serviceLbPolicyId"`
}

type LookupServiceLbPolicyResult struct {
	// Optional. Configuration to automatically move traffic away for unhealthy IG/NEG for the associated Backend Service.
	AutoCapacityDrain ServiceLbPolicyAutoCapacityDrainResponse `pulumi:"autoCapacityDrain"`
	// The timestamp when this resource was created.
	CreateTime string `pulumi:"createTime"`
	// Optional. A free-text description of the resource. Max length 1024 characters.
	Description string `pulumi:"description"`
	// Optional. Configuration related to health based failover.
	FailoverConfig ServiceLbPolicyFailoverConfigResponse `pulumi:"failoverConfig"`
	// Optional. Set of label tags associated with the ServiceLbPolicy resource.
	Labels map[string]string `pulumi:"labels"`
	// Optional. The type of load balancing algorithm to be used. The default behavior is WATERFALL_BY_REGION.
	LoadBalancingAlgorithm string `pulumi:"loadBalancingAlgorithm"`
	// Name of the ServiceLbPolicy resource. It matches pattern `projects/{project}/locations/{location}/serviceLbPolicies/{service_lb_policy_name}`.
	Name string `pulumi:"name"`
	// The timestamp when this resource was last updated.
	UpdateTime string `pulumi:"updateTime"`
}

func LookupServiceLbPolicyOutput(ctx *pulumi.Context, args LookupServiceLbPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupServiceLbPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceLbPolicyResult, error) {
			args := v.(LookupServiceLbPolicyArgs)
			r, err := LookupServiceLbPolicy(ctx, &args, opts...)
			var s LookupServiceLbPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceLbPolicyResultOutput)
}

type LookupServiceLbPolicyOutputArgs struct {
	Location          pulumi.StringInput    `pulumi:"location"`
	Project           pulumi.StringPtrInput `pulumi:"project"`
	ServiceLbPolicyId pulumi.StringInput    `pulumi:"serviceLbPolicyId"`
}

func (LookupServiceLbPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceLbPolicyArgs)(nil)).Elem()
}

type LookupServiceLbPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupServiceLbPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceLbPolicyResult)(nil)).Elem()
}

func (o LookupServiceLbPolicyResultOutput) ToLookupServiceLbPolicyResultOutput() LookupServiceLbPolicyResultOutput {
	return o
}

func (o LookupServiceLbPolicyResultOutput) ToLookupServiceLbPolicyResultOutputWithContext(ctx context.Context) LookupServiceLbPolicyResultOutput {
	return o
}

// Optional. Configuration to automatically move traffic away for unhealthy IG/NEG for the associated Backend Service.
func (o LookupServiceLbPolicyResultOutput) AutoCapacityDrain() ServiceLbPolicyAutoCapacityDrainResponseOutput {
	return o.ApplyT(func(v LookupServiceLbPolicyResult) ServiceLbPolicyAutoCapacityDrainResponse {
		return v.AutoCapacityDrain
	}).(ServiceLbPolicyAutoCapacityDrainResponseOutput)
}

// The timestamp when this resource was created.
func (o LookupServiceLbPolicyResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLbPolicyResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

// Optional. A free-text description of the resource. Max length 1024 characters.
func (o LookupServiceLbPolicyResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLbPolicyResult) string { return v.Description }).(pulumi.StringOutput)
}

// Optional. Configuration related to health based failover.
func (o LookupServiceLbPolicyResultOutput) FailoverConfig() ServiceLbPolicyFailoverConfigResponseOutput {
	return o.ApplyT(func(v LookupServiceLbPolicyResult) ServiceLbPolicyFailoverConfigResponse { return v.FailoverConfig }).(ServiceLbPolicyFailoverConfigResponseOutput)
}

// Optional. Set of label tags associated with the ServiceLbPolicy resource.
func (o LookupServiceLbPolicyResultOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupServiceLbPolicyResult) map[string]string { return v.Labels }).(pulumi.StringMapOutput)
}

// Optional. The type of load balancing algorithm to be used. The default behavior is WATERFALL_BY_REGION.
func (o LookupServiceLbPolicyResultOutput) LoadBalancingAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLbPolicyResult) string { return v.LoadBalancingAlgorithm }).(pulumi.StringOutput)
}

// Name of the ServiceLbPolicy resource. It matches pattern `projects/{project}/locations/{location}/serviceLbPolicies/{service_lb_policy_name}`.
func (o LookupServiceLbPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLbPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

// The timestamp when this resource was last updated.
func (o LookupServiceLbPolicyResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceLbPolicyResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceLbPolicyResultOutput{})
}
