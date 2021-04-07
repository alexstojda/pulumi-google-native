// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Create a new trigger in a particular project and location.
type Trigger struct {
	pulumi.CustomResourceState

	// The creation time.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Required. Destination specifies where the events should be sent to.
	Destination DestinationResponseOutput `pulumi:"destination"`
	// This checksum is computed by the server based on the value of other fields, and may be sent only on create requests to ensure the client has an up-to-date value before proceeding.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Optional. User labels attached to the triggers that can be used to group resources.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Required. null The criteria by which events are filtered. Only events that match with this criteria will be sent to the destination.
	MatchingCriteria MatchingCriteriaResponseArrayOutput `pulumi:"matchingCriteria"`
	// Required. The resource name of the trigger. Must be unique within the location on the project and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
	Name pulumi.StringOutput `pulumi:"name"`
	// Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
	ServiceAccount pulumi.StringOutput `pulumi:"serviceAccount"`
	// In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
	Transport TransportResponseOutput `pulumi:"transport"`
	// The last-modified time.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewTrigger registers a new resource with the given unique name, arguments, and options.
func NewTrigger(ctx *pulumi.Context,
	name string, args *TriggerArgs, opts ...pulumi.ResourceOption) (*Trigger, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LocationsId == nil {
		return nil, errors.New("invalid value for required argument 'LocationsId'")
	}
	if args.ProjectsId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectsId'")
	}
	if args.TriggersId == nil {
		return nil, errors.New("invalid value for required argument 'TriggersId'")
	}
	var resource Trigger
	err := ctx.RegisterResource("gcp-native:eventarc/v1beta1:Trigger", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTrigger gets an existing Trigger resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTrigger(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TriggerState, opts ...pulumi.ResourceOption) (*Trigger, error) {
	var resource Trigger
	err := ctx.ReadResource("gcp-native:eventarc/v1beta1:Trigger", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Trigger resources.
type triggerState struct {
	// The creation time.
	CreateTime *string `pulumi:"createTime"`
	// Required. Destination specifies where the events should be sent to.
	Destination *DestinationResponse `pulumi:"destination"`
	// This checksum is computed by the server based on the value of other fields, and may be sent only on create requests to ensure the client has an up-to-date value before proceeding.
	Etag *string `pulumi:"etag"`
	// Optional. User labels attached to the triggers that can be used to group resources.
	Labels map[string]string `pulumi:"labels"`
	// Required. null The criteria by which events are filtered. Only events that match with this criteria will be sent to the destination.
	MatchingCriteria []MatchingCriteriaResponse `pulumi:"matchingCriteria"`
	// Required. The resource name of the trigger. Must be unique within the location on the project and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
	Name *string `pulumi:"name"`
	// Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
	ServiceAccount *string `pulumi:"serviceAccount"`
	// In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
	Transport *TransportResponse `pulumi:"transport"`
	// The last-modified time.
	UpdateTime *string `pulumi:"updateTime"`
}

type TriggerState struct {
	// The creation time.
	CreateTime pulumi.StringPtrInput
	// Required. Destination specifies where the events should be sent to.
	Destination DestinationResponsePtrInput
	// This checksum is computed by the server based on the value of other fields, and may be sent only on create requests to ensure the client has an up-to-date value before proceeding.
	Etag pulumi.StringPtrInput
	// Optional. User labels attached to the triggers that can be used to group resources.
	Labels pulumi.StringMapInput
	// Required. null The criteria by which events are filtered. Only events that match with this criteria will be sent to the destination.
	MatchingCriteria MatchingCriteriaResponseArrayInput
	// Required. The resource name of the trigger. Must be unique within the location on the project and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
	Name pulumi.StringPtrInput
	// Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
	ServiceAccount pulumi.StringPtrInput
	// In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
	Transport TransportResponsePtrInput
	// The last-modified time.
	UpdateTime pulumi.StringPtrInput
}

func (TriggerState) ElementType() reflect.Type {
	return reflect.TypeOf((*triggerState)(nil)).Elem()
}

type triggerArgs struct {
	// Required. Destination specifies where the events should be sent to.
	Destination *Destination `pulumi:"destination"`
	// Optional. User labels attached to the triggers that can be used to group resources.
	Labels      map[string]string `pulumi:"labels"`
	LocationsId string            `pulumi:"locationsId"`
	// Required. null The criteria by which events are filtered. Only events that match with this criteria will be sent to the destination.
	MatchingCriteria []MatchingCriteria `pulumi:"matchingCriteria"`
	// Required. The resource name of the trigger. Must be unique within the location on the project and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
	Name       *string `pulumi:"name"`
	ProjectsId string  `pulumi:"projectsId"`
	// Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
	ServiceAccount *string `pulumi:"serviceAccount"`
	TriggersId     string  `pulumi:"triggersId"`
}

// The set of arguments for constructing a Trigger resource.
type TriggerArgs struct {
	// Required. Destination specifies where the events should be sent to.
	Destination DestinationPtrInput
	// Optional. User labels attached to the triggers that can be used to group resources.
	Labels      pulumi.StringMapInput
	LocationsId pulumi.StringInput
	// Required. null The criteria by which events are filtered. Only events that match with this criteria will be sent to the destination.
	MatchingCriteria MatchingCriteriaArrayInput
	// Required. The resource name of the trigger. Must be unique within the location on the project and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
	Name       pulumi.StringPtrInput
	ProjectsId pulumi.StringInput
	// Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud Run destinations, this service account is used to generate identity tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
	ServiceAccount pulumi.StringPtrInput
	TriggersId     pulumi.StringInput
}

func (TriggerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*triggerArgs)(nil)).Elem()
}

type TriggerInput interface {
	pulumi.Input

	ToTriggerOutput() TriggerOutput
	ToTriggerOutputWithContext(ctx context.Context) TriggerOutput
}

func (*Trigger) ElementType() reflect.Type {
	return reflect.TypeOf((*Trigger)(nil))
}

func (i *Trigger) ToTriggerOutput() TriggerOutput {
	return i.ToTriggerOutputWithContext(context.Background())
}

func (i *Trigger) ToTriggerOutputWithContext(ctx context.Context) TriggerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerOutput)
}

type TriggerOutput struct {
	*pulumi.OutputState
}

func (TriggerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Trigger)(nil))
}

func (o TriggerOutput) ToTriggerOutput() TriggerOutput {
	return o
}

func (o TriggerOutput) ToTriggerOutputWithContext(ctx context.Context) TriggerOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(TriggerOutput{})
}