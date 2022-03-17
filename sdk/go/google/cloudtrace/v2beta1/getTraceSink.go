// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v2beta1

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get a trace sink by name under the parent resource (GCP project).
func LookupTraceSink(ctx *pulumi.Context, args *LookupTraceSinkArgs, opts ...pulumi.InvokeOption) (*LookupTraceSinkResult, error) {
	var rv LookupTraceSinkResult
	err := ctx.Invoke("google-native:cloudtrace/v2beta1:getTraceSink", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupTraceSinkArgs struct {
	Project     *string `pulumi:"project"`
	TraceSinkId string  `pulumi:"traceSinkId"`
}

type LookupTraceSinkResult struct {
	// The canonical sink resource name, unique within the project. Must be of the form: projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
	Name string `pulumi:"name"`
	// The export destination.
	OutputConfig OutputConfigResponse `pulumi:"outputConfig"`
	// A service account name for exporting the data. This field is set by sinks.create and sinks.update. The service account will need to be granted write access to the destination specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create tables and to write data, this account needs the `dataEditor` role. Read more about roles in the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.: "service-00000001@00000002.iam.gserviceaccount.com"
	WriterIdentity string `pulumi:"writerIdentity"`
}

func LookupTraceSinkOutput(ctx *pulumi.Context, args LookupTraceSinkOutputArgs, opts ...pulumi.InvokeOption) LookupTraceSinkResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTraceSinkResult, error) {
			args := v.(LookupTraceSinkArgs)
			r, err := LookupTraceSink(ctx, &args, opts...)
			return *r, err
		}).(LookupTraceSinkResultOutput)
}

type LookupTraceSinkOutputArgs struct {
	Project     pulumi.StringPtrInput `pulumi:"project"`
	TraceSinkId pulumi.StringInput    `pulumi:"traceSinkId"`
}

func (LookupTraceSinkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTraceSinkArgs)(nil)).Elem()
}

type LookupTraceSinkResultOutput struct{ *pulumi.OutputState }

func (LookupTraceSinkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTraceSinkResult)(nil)).Elem()
}

func (o LookupTraceSinkResultOutput) ToLookupTraceSinkResultOutput() LookupTraceSinkResultOutput {
	return o
}

func (o LookupTraceSinkResultOutput) ToLookupTraceSinkResultOutputWithContext(ctx context.Context) LookupTraceSinkResultOutput {
	return o
}

// The canonical sink resource name, unique within the project. Must be of the form: projects/[PROJECT_NUMBER]/traceSinks/[SINK_ID]. E.g.: `"projects/12345/traceSinks/my-project-trace-sink"`. Sink identifiers are limited to 256 characters and can include only the following characters: upper and lower-case alphanumeric characters, underscores, hyphens, and periods.
func (o LookupTraceSinkResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTraceSinkResult) string { return v.Name }).(pulumi.StringOutput)
}

// The export destination.
func (o LookupTraceSinkResultOutput) OutputConfig() OutputConfigResponseOutput {
	return o.ApplyT(func(v LookupTraceSinkResult) OutputConfigResponse { return v.OutputConfig }).(OutputConfigResponseOutput)
}

// A service account name for exporting the data. This field is set by sinks.create and sinks.update. The service account will need to be granted write access to the destination specified in the output configuration, see [Granting access for a resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource). To create tables and to write data, this account needs the `dataEditor` role. Read more about roles in the [BigQuery documentation](https://cloud.google.com/bigquery/docs/access-control). E.g.: "service-00000001@00000002.iam.gserviceaccount.com"
func (o LookupTraceSinkResultOutput) WriterIdentity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTraceSinkResult) string { return v.WriterIdentity }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTraceSinkResultOutput{})
}