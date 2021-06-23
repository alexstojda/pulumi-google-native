// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Capacity commitment commitment plan.
type CapacityCommitmentPlan pulumi.String

const (
	// Invalid plan value. Requests with this value will be rejected with error code `google.rpc.Code.INVALID_ARGUMENT`.
	CapacityCommitmentPlanCommitmentPlanUnspecified = CapacityCommitmentPlan("COMMITMENT_PLAN_UNSPECIFIED")
	// Flex commitments have committed period of 1 minute after becoming ACTIVE. After that, they are not in a committed period anymore and can be removed any time.
	CapacityCommitmentPlanFlex = CapacityCommitmentPlan("FLEX")
	// Trial commitments have a committed period of 182 days after becoming ACTIVE. After that, they are converted to a new commitment based on the `renewal_plan`. Default `renewal_plan` for Trial commitment is Flex so that it can be deleted right after committed period ends.
	CapacityCommitmentPlanTrial = CapacityCommitmentPlan("TRIAL")
	// Monthly commitments have a committed period of 30 days after becoming ACTIVE. After that, they are not in a committed period anymore and can be removed any time.
	CapacityCommitmentPlanMonthly = CapacityCommitmentPlan("MONTHLY")
	// Annual commitments have a committed period of 365 days after becoming ACTIVE. After that they are converted to a new commitment based on the renewal_plan.
	CapacityCommitmentPlanAnnual = CapacityCommitmentPlan("ANNUAL")
)

func (CapacityCommitmentPlan) ElementType() reflect.Type {
	return reflect.TypeOf((*pulumi.String)(nil)).Elem()
}

func (e CapacityCommitmentPlan) ToStringOutput() pulumi.StringOutput {
	return pulumi.ToOutput(pulumi.String(e)).(pulumi.StringOutput)
}

func (e CapacityCommitmentPlan) ToStringOutputWithContext(ctx context.Context) pulumi.StringOutput {
	return pulumi.ToOutputWithContext(ctx, pulumi.String(e)).(pulumi.StringOutput)
}

func (e CapacityCommitmentPlan) ToStringPtrOutput() pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringPtrOutputWithContext(context.Background())
}

func (e CapacityCommitmentPlan) ToStringPtrOutputWithContext(ctx context.Context) pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringOutputWithContext(ctx).ToStringPtrOutputWithContext(ctx)
}

// The plan this capacity commitment is converted to after commitment_end_time passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for ANNUAL commitments.
type CapacityCommitmentRenewalPlan pulumi.String

const (
	// Invalid plan value. Requests with this value will be rejected with error code `google.rpc.Code.INVALID_ARGUMENT`.
	CapacityCommitmentRenewalPlanCommitmentPlanUnspecified = CapacityCommitmentRenewalPlan("COMMITMENT_PLAN_UNSPECIFIED")
	// Flex commitments have committed period of 1 minute after becoming ACTIVE. After that, they are not in a committed period anymore and can be removed any time.
	CapacityCommitmentRenewalPlanFlex = CapacityCommitmentRenewalPlan("FLEX")
	// Trial commitments have a committed period of 182 days after becoming ACTIVE. After that, they are converted to a new commitment based on the `renewal_plan`. Default `renewal_plan` for Trial commitment is Flex so that it can be deleted right after committed period ends.
	CapacityCommitmentRenewalPlanTrial = CapacityCommitmentRenewalPlan("TRIAL")
	// Monthly commitments have a committed period of 30 days after becoming ACTIVE. After that, they are not in a committed period anymore and can be removed any time.
	CapacityCommitmentRenewalPlanMonthly = CapacityCommitmentRenewalPlan("MONTHLY")
	// Annual commitments have a committed period of 365 days after becoming ACTIVE. After that they are converted to a new commitment based on the renewal_plan.
	CapacityCommitmentRenewalPlanAnnual = CapacityCommitmentRenewalPlan("ANNUAL")
)

func (CapacityCommitmentRenewalPlan) ElementType() reflect.Type {
	return reflect.TypeOf((*pulumi.String)(nil)).Elem()
}

func (e CapacityCommitmentRenewalPlan) ToStringOutput() pulumi.StringOutput {
	return pulumi.ToOutput(pulumi.String(e)).(pulumi.StringOutput)
}

func (e CapacityCommitmentRenewalPlan) ToStringOutputWithContext(ctx context.Context) pulumi.StringOutput {
	return pulumi.ToOutputWithContext(ctx, pulumi.String(e)).(pulumi.StringOutput)
}

func (e CapacityCommitmentRenewalPlan) ToStringPtrOutput() pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringPtrOutputWithContext(context.Background())
}

func (e CapacityCommitmentRenewalPlan) ToStringPtrOutputWithContext(ctx context.Context) pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringOutputWithContext(ctx).ToStringPtrOutputWithContext(ctx)
}