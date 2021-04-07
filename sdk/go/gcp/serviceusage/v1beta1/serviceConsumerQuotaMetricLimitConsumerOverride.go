// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates a consumer override. A consumer override is applied to the consumer on its own authority to limit its own quota usage. Consumer overrides cannot be used to grant more quota than would be allowed by admin overrides, producer overrides, or the default limit of the service.
type ServiceConsumerQuotaMetricLimitConsumerOverride struct {
	pulumi.CustomResourceState
}

// NewServiceConsumerQuotaMetricLimitConsumerOverride registers a new resource with the given unique name, arguments, and options.
func NewServiceConsumerQuotaMetricLimitConsumerOverride(ctx *pulumi.Context,
	name string, args *ServiceConsumerQuotaMetricLimitConsumerOverrideArgs, opts ...pulumi.ResourceOption) (*ServiceConsumerQuotaMetricLimitConsumerOverride, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConsumerOverridesId == nil {
		return nil, errors.New("invalid value for required argument 'ConsumerOverridesId'")
	}
	if args.ConsumerQuotaMetricsId == nil {
		return nil, errors.New("invalid value for required argument 'ConsumerQuotaMetricsId'")
	}
	if args.LimitsId == nil {
		return nil, errors.New("invalid value for required argument 'LimitsId'")
	}
	if args.ServicesId == nil {
		return nil, errors.New("invalid value for required argument 'ServicesId'")
	}
	if args.V1beta1Id == nil {
		return nil, errors.New("invalid value for required argument 'V1beta1Id'")
	}
	if args.V1beta1Id1 == nil {
		return nil, errors.New("invalid value for required argument 'V1beta1Id1'")
	}
	var resource ServiceConsumerQuotaMetricLimitConsumerOverride
	err := ctx.RegisterResource("gcp-native:serviceusage/v1beta1:ServiceConsumerQuotaMetricLimitConsumerOverride", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceConsumerQuotaMetricLimitConsumerOverride gets an existing ServiceConsumerQuotaMetricLimitConsumerOverride resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceConsumerQuotaMetricLimitConsumerOverride(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceConsumerQuotaMetricLimitConsumerOverrideState, opts ...pulumi.ResourceOption) (*ServiceConsumerQuotaMetricLimitConsumerOverride, error) {
	var resource ServiceConsumerQuotaMetricLimitConsumerOverride
	err := ctx.ReadResource("gcp-native:serviceusage/v1beta1:ServiceConsumerQuotaMetricLimitConsumerOverride", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceConsumerQuotaMetricLimitConsumerOverride resources.
type serviceConsumerQuotaMetricLimitConsumerOverrideState struct {
}

type ServiceConsumerQuotaMetricLimitConsumerOverrideState struct {
}

func (ServiceConsumerQuotaMetricLimitConsumerOverrideState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceConsumerQuotaMetricLimitConsumerOverrideState)(nil)).Elem()
}

type serviceConsumerQuotaMetricLimitConsumerOverrideArgs struct {
	// The resource name of the ancestor that requested the override. For example: "organizations/12345" or "folders/67890". Used by admin overrides only.
	AdminOverrideAncestor  *string `pulumi:"adminOverrideAncestor"`
	ConsumerOverridesId    string  `pulumi:"consumerOverridesId"`
	ConsumerQuotaMetricsId string  `pulumi:"consumerQuotaMetricsId"`
	// If this map is nonempty, then this override applies only to specific values for dimensions defined in the limit unit. For example, an override on a limit with the unit 1/{project}/{region} could contain an entry with the key "region" and the value "us-east-1"; the override is only applied to quota consumed in that region. This map has the following restrictions: * Keys that are not defined in the limit's unit are not valid keys. Any string appearing in {brackets} in the unit (besides {project} or {user}) is a defined key. * "project" is not a valid key; the project is already specified in the parent resource name. * "user" is not a valid key; the API does not support quota overrides that apply only to a specific user. * If "region" appears as a key, its value must be a valid Cloud region. * If "zone" appears as a key, its value must be a valid Cloud zone. * If any valid key other than "region" or "zone" appears in the map, then all valid keys other than "region" or "zone" must also appear in the map.
	Dimensions map[string]string `pulumi:"dimensions"`
	LimitsId   string            `pulumi:"limitsId"`
	// The name of the metric to which this override applies. An example name would be: `compute.googleapis.com/cpus`
	Metric *string `pulumi:"metric"`
	// The resource name of the override. This name is generated by the server when the override is created. Example names would be: `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminOverrides/4a3f2c1d` `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/consumerOverrides/4a3f2c1d` The resource name is intended to be opaque and should not be parsed for its component strings, since its representation could change in the future.
	Name *string `pulumi:"name"`
	// The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
	OverrideValue *string `pulumi:"overrideValue"`
	ServicesId    string  `pulumi:"servicesId"`
	// The limit unit of the limit to which this override applies. An example unit would be: `1/{project}/{region}` Note that `{project}` and `{region}` are not placeholders in this example; the literal characters `{` and `}` occur in the string.
	Unit       *string `pulumi:"unit"`
	V1beta1Id  string  `pulumi:"v1beta1Id"`
	V1beta1Id1 string  `pulumi:"v1beta1Id1"`
}

// The set of arguments for constructing a ServiceConsumerQuotaMetricLimitConsumerOverride resource.
type ServiceConsumerQuotaMetricLimitConsumerOverrideArgs struct {
	// The resource name of the ancestor that requested the override. For example: "organizations/12345" or "folders/67890". Used by admin overrides only.
	AdminOverrideAncestor  pulumi.StringPtrInput
	ConsumerOverridesId    pulumi.StringInput
	ConsumerQuotaMetricsId pulumi.StringInput
	// If this map is nonempty, then this override applies only to specific values for dimensions defined in the limit unit. For example, an override on a limit with the unit 1/{project}/{region} could contain an entry with the key "region" and the value "us-east-1"; the override is only applied to quota consumed in that region. This map has the following restrictions: * Keys that are not defined in the limit's unit are not valid keys. Any string appearing in {brackets} in the unit (besides {project} or {user}) is a defined key. * "project" is not a valid key; the project is already specified in the parent resource name. * "user" is not a valid key; the API does not support quota overrides that apply only to a specific user. * If "region" appears as a key, its value must be a valid Cloud region. * If "zone" appears as a key, its value must be a valid Cloud zone. * If any valid key other than "region" or "zone" appears in the map, then all valid keys other than "region" or "zone" must also appear in the map.
	Dimensions pulumi.StringMapInput
	LimitsId   pulumi.StringInput
	// The name of the metric to which this override applies. An example name would be: `compute.googleapis.com/cpus`
	Metric pulumi.StringPtrInput
	// The resource name of the override. This name is generated by the server when the override is created. Example names would be: `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminOverrides/4a3f2c1d` `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/consumerOverrides/4a3f2c1d` The resource name is intended to be opaque and should not be parsed for its component strings, since its representation could change in the future.
	Name pulumi.StringPtrInput
	// The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
	OverrideValue pulumi.StringPtrInput
	ServicesId    pulumi.StringInput
	// The limit unit of the limit to which this override applies. An example unit would be: `1/{project}/{region}` Note that `{project}` and `{region}` are not placeholders in this example; the literal characters `{` and `}` occur in the string.
	Unit       pulumi.StringPtrInput
	V1beta1Id  pulumi.StringInput
	V1beta1Id1 pulumi.StringInput
}

func (ServiceConsumerQuotaMetricLimitConsumerOverrideArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceConsumerQuotaMetricLimitConsumerOverrideArgs)(nil)).Elem()
}

type ServiceConsumerQuotaMetricLimitConsumerOverrideInput interface {
	pulumi.Input

	ToServiceConsumerQuotaMetricLimitConsumerOverrideOutput() ServiceConsumerQuotaMetricLimitConsumerOverrideOutput
	ToServiceConsumerQuotaMetricLimitConsumerOverrideOutputWithContext(ctx context.Context) ServiceConsumerQuotaMetricLimitConsumerOverrideOutput
}

func (*ServiceConsumerQuotaMetricLimitConsumerOverride) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceConsumerQuotaMetricLimitConsumerOverride)(nil))
}

func (i *ServiceConsumerQuotaMetricLimitConsumerOverride) ToServiceConsumerQuotaMetricLimitConsumerOverrideOutput() ServiceConsumerQuotaMetricLimitConsumerOverrideOutput {
	return i.ToServiceConsumerQuotaMetricLimitConsumerOverrideOutputWithContext(context.Background())
}

func (i *ServiceConsumerQuotaMetricLimitConsumerOverride) ToServiceConsumerQuotaMetricLimitConsumerOverrideOutputWithContext(ctx context.Context) ServiceConsumerQuotaMetricLimitConsumerOverrideOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceConsumerQuotaMetricLimitConsumerOverrideOutput)
}

type ServiceConsumerQuotaMetricLimitConsumerOverrideOutput struct {
	*pulumi.OutputState
}

func (ServiceConsumerQuotaMetricLimitConsumerOverrideOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceConsumerQuotaMetricLimitConsumerOverride)(nil))
}

func (o ServiceConsumerQuotaMetricLimitConsumerOverrideOutput) ToServiceConsumerQuotaMetricLimitConsumerOverrideOutput() ServiceConsumerQuotaMetricLimitConsumerOverrideOutput {
	return o
}

func (o ServiceConsumerQuotaMetricLimitConsumerOverrideOutput) ToServiceConsumerQuotaMetricLimitConsumerOverrideOutputWithContext(ctx context.Context) ServiceConsumerQuotaMetricLimitConsumerOverrideOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ServiceConsumerQuotaMetricLimitConsumerOverrideOutput{})
}