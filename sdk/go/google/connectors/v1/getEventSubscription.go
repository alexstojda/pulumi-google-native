// Code generated by the Pulumi SDK Generator DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-google-native/sdk/go/google/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets details of a single EventSubscription.
func LookupEventSubscription(ctx *pulumi.Context, args *LookupEventSubscriptionArgs, opts ...pulumi.InvokeOption) (*LookupEventSubscriptionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEventSubscriptionResult
	err := ctx.Invoke("google-native:connectors/v1:getEventSubscription", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupEventSubscriptionArgs struct {
	ConnectionId        string  `pulumi:"connectionId"`
	EventSubscriptionId string  `pulumi:"eventSubscriptionId"`
	Location            string  `pulumi:"location"`
	Project             *string `pulumi:"project"`
}

type LookupEventSubscriptionResult struct {
	// Created time.
	CreateTime string `pulumi:"createTime"`
	// Optional. The destination to hit when we receive an event
	Destinations EventSubscriptionDestinationResponse `pulumi:"destinations"`
	// Optional. Event type id of the event of current EventSubscription.
	EventTypeId string `pulumi:"eventTypeId"`
	// Optional. JMS is the source for the event listener.
	Jms JMSResponse `pulumi:"jms"`
	// Resource name of the EventSubscription. Format: projects/{project}/locations/{location}/connections/{connection}/eventSubscriptions/{event_subscription}
	Name string `pulumi:"name"`
	// Optional. Status indicates the status of the event subscription resource
	Status EventSubscriptionStatusResponse `pulumi:"status"`
	// Optional. name of the Subscriber for the current EventSubscription.
	Subscriber string `pulumi:"subscriber"`
	// Optional. Link for Subscriber of the current EventSubscription.
	SubscriberLink string `pulumi:"subscriberLink"`
	// Updated time.
	UpdateTime string `pulumi:"updateTime"`
}

func LookupEventSubscriptionOutput(ctx *pulumi.Context, args LookupEventSubscriptionOutputArgs, opts ...pulumi.InvokeOption) LookupEventSubscriptionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEventSubscriptionResult, error) {
			args := v.(LookupEventSubscriptionArgs)
			r, err := LookupEventSubscription(ctx, &args, opts...)
			var s LookupEventSubscriptionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEventSubscriptionResultOutput)
}

type LookupEventSubscriptionOutputArgs struct {
	ConnectionId        pulumi.StringInput    `pulumi:"connectionId"`
	EventSubscriptionId pulumi.StringInput    `pulumi:"eventSubscriptionId"`
	Location            pulumi.StringInput    `pulumi:"location"`
	Project             pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupEventSubscriptionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventSubscriptionArgs)(nil)).Elem()
}

type LookupEventSubscriptionResultOutput struct{ *pulumi.OutputState }

func (LookupEventSubscriptionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEventSubscriptionResult)(nil)).Elem()
}

func (o LookupEventSubscriptionResultOutput) ToLookupEventSubscriptionResultOutput() LookupEventSubscriptionResultOutput {
	return o
}

func (o LookupEventSubscriptionResultOutput) ToLookupEventSubscriptionResultOutputWithContext(ctx context.Context) LookupEventSubscriptionResultOutput {
	return o
}

// Created time.
func (o LookupEventSubscriptionResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventSubscriptionResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

// Optional. The destination to hit when we receive an event
func (o LookupEventSubscriptionResultOutput) Destinations() EventSubscriptionDestinationResponseOutput {
	return o.ApplyT(func(v LookupEventSubscriptionResult) EventSubscriptionDestinationResponse { return v.Destinations }).(EventSubscriptionDestinationResponseOutput)
}

// Optional. Event type id of the event of current EventSubscription.
func (o LookupEventSubscriptionResultOutput) EventTypeId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventSubscriptionResult) string { return v.EventTypeId }).(pulumi.StringOutput)
}

// Optional. JMS is the source for the event listener.
func (o LookupEventSubscriptionResultOutput) Jms() JMSResponseOutput {
	return o.ApplyT(func(v LookupEventSubscriptionResult) JMSResponse { return v.Jms }).(JMSResponseOutput)
}

// Resource name of the EventSubscription. Format: projects/{project}/locations/{location}/connections/{connection}/eventSubscriptions/{event_subscription}
func (o LookupEventSubscriptionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventSubscriptionResult) string { return v.Name }).(pulumi.StringOutput)
}

// Optional. Status indicates the status of the event subscription resource
func (o LookupEventSubscriptionResultOutput) Status() EventSubscriptionStatusResponseOutput {
	return o.ApplyT(func(v LookupEventSubscriptionResult) EventSubscriptionStatusResponse { return v.Status }).(EventSubscriptionStatusResponseOutput)
}

// Optional. name of the Subscriber for the current EventSubscription.
func (o LookupEventSubscriptionResultOutput) Subscriber() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventSubscriptionResult) string { return v.Subscriber }).(pulumi.StringOutput)
}

// Optional. Link for Subscriber of the current EventSubscription.
func (o LookupEventSubscriptionResultOutput) SubscriberLink() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventSubscriptionResult) string { return v.SubscriberLink }).(pulumi.StringOutput)
}

// Updated time.
func (o LookupEventSubscriptionResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEventSubscriptionResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEventSubscriptionResultOutput{})
}
