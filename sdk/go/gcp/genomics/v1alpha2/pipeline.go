// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha2

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates a pipeline that can be run later. Create takes a Pipeline that has all fields other than `pipelineId` populated, and then returns the same pipeline with `pipelineId` populated. This id can be used to run the pipeline. Caller must have WRITE permission to the project.
type Pipeline struct {
	pulumi.CustomResourceState

	// User-specified description.
	Description pulumi.StringOutput `pulumi:"description"`
	// Specifies the docker run information.
	Docker DockerExecutorResponseOutput `pulumi:"docker"`
	// Input parameters of the pipeline.
	InputParameters PipelineParameterResponseArrayOutput `pulumi:"inputParameters"`
	// Required. A user specified pipeline name that does not have to be unique. This name can be used for filtering Pipelines in ListPipelines.
	Name pulumi.StringOutput `pulumi:"name"`
	// Output parameters of the pipeline.
	OutputParameters PipelineParameterResponseArrayOutput `pulumi:"outputParameters"`
	// Unique pipeline id that is generated by the service when CreatePipeline is called. Cannot be specified in the Pipeline used in the CreatePipelineRequest, and will be populated in the response to CreatePipeline and all subsequent Get and List calls. Indicates that the service has registered this pipeline.
	PipelineId pulumi.StringOutput `pulumi:"pipelineId"`
	// Required. The project in which to create the pipeline. The caller must have WRITE access.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Required. Specifies resource requirements for the pipeline run. Required fields: * minimumCpuCores * minimumRamGb
	Resources PipelineResourcesResponseOutput `pulumi:"resources"`
}

// NewPipeline registers a new resource with the given unique name, arguments, and options.
func NewPipeline(ctx *pulumi.Context,
	name string, args *PipelineArgs, opts ...pulumi.ResourceOption) (*Pipeline, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PipelineId == nil {
		return nil, errors.New("invalid value for required argument 'PipelineId'")
	}
	var resource Pipeline
	err := ctx.RegisterResource("gcp-native:genomics/v1alpha2:Pipeline", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPipeline gets an existing Pipeline resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPipeline(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PipelineState, opts ...pulumi.ResourceOption) (*Pipeline, error) {
	var resource Pipeline
	err := ctx.ReadResource("gcp-native:genomics/v1alpha2:Pipeline", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Pipeline resources.
type pipelineState struct {
	// User-specified description.
	Description *string `pulumi:"description"`
	// Specifies the docker run information.
	Docker *DockerExecutorResponse `pulumi:"docker"`
	// Input parameters of the pipeline.
	InputParameters []PipelineParameterResponse `pulumi:"inputParameters"`
	// Required. A user specified pipeline name that does not have to be unique. This name can be used for filtering Pipelines in ListPipelines.
	Name *string `pulumi:"name"`
	// Output parameters of the pipeline.
	OutputParameters []PipelineParameterResponse `pulumi:"outputParameters"`
	// Unique pipeline id that is generated by the service when CreatePipeline is called. Cannot be specified in the Pipeline used in the CreatePipelineRequest, and will be populated in the response to CreatePipeline and all subsequent Get and List calls. Indicates that the service has registered this pipeline.
	PipelineId *string `pulumi:"pipelineId"`
	// Required. The project in which to create the pipeline. The caller must have WRITE access.
	ProjectId *string `pulumi:"projectId"`
	// Required. Specifies resource requirements for the pipeline run. Required fields: * minimumCpuCores * minimumRamGb
	Resources *PipelineResourcesResponse `pulumi:"resources"`
}

type PipelineState struct {
	// User-specified description.
	Description pulumi.StringPtrInput
	// Specifies the docker run information.
	Docker DockerExecutorResponsePtrInput
	// Input parameters of the pipeline.
	InputParameters PipelineParameterResponseArrayInput
	// Required. A user specified pipeline name that does not have to be unique. This name can be used for filtering Pipelines in ListPipelines.
	Name pulumi.StringPtrInput
	// Output parameters of the pipeline.
	OutputParameters PipelineParameterResponseArrayInput
	// Unique pipeline id that is generated by the service when CreatePipeline is called. Cannot be specified in the Pipeline used in the CreatePipelineRequest, and will be populated in the response to CreatePipeline and all subsequent Get and List calls. Indicates that the service has registered this pipeline.
	PipelineId pulumi.StringPtrInput
	// Required. The project in which to create the pipeline. The caller must have WRITE access.
	ProjectId pulumi.StringPtrInput
	// Required. Specifies resource requirements for the pipeline run. Required fields: * minimumCpuCores * minimumRamGb
	Resources PipelineResourcesResponsePtrInput
}

func (PipelineState) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineState)(nil)).Elem()
}

type pipelineArgs struct {
	// User-specified description.
	Description *string `pulumi:"description"`
	// Specifies the docker run information.
	Docker *DockerExecutor `pulumi:"docker"`
	// Input parameters of the pipeline.
	InputParameters []PipelineParameter `pulumi:"inputParameters"`
	// Required. A user specified pipeline name that does not have to be unique. This name can be used for filtering Pipelines in ListPipelines.
	Name *string `pulumi:"name"`
	// Output parameters of the pipeline.
	OutputParameters []PipelineParameter `pulumi:"outputParameters"`
	// Unique pipeline id that is generated by the service when CreatePipeline is called. Cannot be specified in the Pipeline used in the CreatePipelineRequest, and will be populated in the response to CreatePipeline and all subsequent Get and List calls. Indicates that the service has registered this pipeline.
	PipelineId string `pulumi:"pipelineId"`
	// Required. The project in which to create the pipeline. The caller must have WRITE access.
	ProjectId *string `pulumi:"projectId"`
	// Required. Specifies resource requirements for the pipeline run. Required fields: * minimumCpuCores * minimumRamGb
	Resources *PipelineResources `pulumi:"resources"`
}

// The set of arguments for constructing a Pipeline resource.
type PipelineArgs struct {
	// User-specified description.
	Description pulumi.StringPtrInput
	// Specifies the docker run information.
	Docker DockerExecutorPtrInput
	// Input parameters of the pipeline.
	InputParameters PipelineParameterArrayInput
	// Required. A user specified pipeline name that does not have to be unique. This name can be used for filtering Pipelines in ListPipelines.
	Name pulumi.StringPtrInput
	// Output parameters of the pipeline.
	OutputParameters PipelineParameterArrayInput
	// Unique pipeline id that is generated by the service when CreatePipeline is called. Cannot be specified in the Pipeline used in the CreatePipelineRequest, and will be populated in the response to CreatePipeline and all subsequent Get and List calls. Indicates that the service has registered this pipeline.
	PipelineId pulumi.StringInput
	// Required. The project in which to create the pipeline. The caller must have WRITE access.
	ProjectId pulumi.StringPtrInput
	// Required. Specifies resource requirements for the pipeline run. Required fields: * minimumCpuCores * minimumRamGb
	Resources PipelineResourcesPtrInput
}

func (PipelineArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineArgs)(nil)).Elem()
}

type PipelineInput interface {
	pulumi.Input

	ToPipelineOutput() PipelineOutput
	ToPipelineOutputWithContext(ctx context.Context) PipelineOutput
}

func (*Pipeline) ElementType() reflect.Type {
	return reflect.TypeOf((*Pipeline)(nil))
}

func (i *Pipeline) ToPipelineOutput() PipelineOutput {
	return i.ToPipelineOutputWithContext(context.Background())
}

func (i *Pipeline) ToPipelineOutputWithContext(ctx context.Context) PipelineOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineOutput)
}

type PipelineOutput struct {
	*pulumi.OutputState
}

func (PipelineOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Pipeline)(nil))
}

func (o PipelineOutput) ToPipelineOutput() PipelineOutput {
	return o
}

func (o PipelineOutput) ToPipelineOutputWithContext(ctx context.Context) PipelineOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(PipelineOutput{})
}