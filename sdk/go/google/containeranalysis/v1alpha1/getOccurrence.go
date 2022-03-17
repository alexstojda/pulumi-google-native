// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns the requested `Occurrence`.
func LookupOccurrence(ctx *pulumi.Context, args *LookupOccurrenceArgs, opts ...pulumi.InvokeOption) (*LookupOccurrenceResult, error) {
	var rv LookupOccurrenceResult
	err := ctx.Invoke("google-native:containeranalysis/v1alpha1:getOccurrence", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupOccurrenceArgs struct {
	OccurrenceId string  `pulumi:"occurrenceId"`
	Project      *string `pulumi:"project"`
}

type LookupOccurrenceResult struct {
	// Describes an attestation of an artifact.
	Attestation AttestationResponse `pulumi:"attestation"`
	// Build details for a verifiable build.
	BuildDetails BuildDetailsResponse `pulumi:"buildDetails"`
	// Describes whether or not a resource passes compliance checks.
	Compliance ComplianceOccurrenceResponse `pulumi:"compliance"`
	// The time this `Occurrence` was created.
	CreateTime string `pulumi:"createTime"`
	// Describes the deployment of an artifact on a runtime.
	Deployment DeploymentResponse `pulumi:"deployment"`
	// Describes how this resource derives from the basis in the associated note.
	DerivedImage DerivedResponse `pulumi:"derivedImage"`
	// Describes the initial scan status for this resource.
	Discovered DiscoveredResponse `pulumi:"discovered"`
	// This represents a DSSE attestation occurrence
	DsseAttestation DSSEAttestationOccurrenceResponse `pulumi:"dsseAttestation"`
	// https://github.com/secure-systems-lab/dsse
	Envelope EnvelopeResponse `pulumi:"envelope"`
	// Describes the installation of a package on the linked resource.
	Installation InstallationResponse `pulumi:"installation"`
	// This explicitly denotes which of the `Occurrence` details are specified. This field can be used as a filter in list requests.
	Kind string `pulumi:"kind"`
	// The name of the `Occurrence` in the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
	Name string `pulumi:"name"`
	// An analysis note associated with this image, in the form "providers/{provider_id}/notes/{NOTE_ID}" This field can be used as a filter in list requests.
	NoteName string `pulumi:"noteName"`
	// A description of actions that can be taken to remedy the `Note`
	Remediation string `pulumi:"remediation"`
	//  The resource for which the `Occurrence` applies.
	Resource ResourceResponse `pulumi:"resource"`
	// The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
	ResourceUrl string `pulumi:"resourceUrl"`
	// Describes a specific software bill of materials document.
	Sbom DocumentOccurrenceResponse `pulumi:"sbom"`
	// Describes a specific SPDX File.
	SpdxFile FileOccurrenceResponse `pulumi:"spdxFile"`
	// Describes a specific SPDX Package.
	SpdxPackage PackageInfoOccurrenceResponse `pulumi:"spdxPackage"`
	// Describes a specific relationship between SPDX elements.
	SpdxRelationship RelationshipOccurrenceResponse `pulumi:"spdxRelationship"`
	// The time this `Occurrence` was last updated.
	UpdateTime string `pulumi:"updateTime"`
	// Describes an upgrade.
	Upgrade UpgradeOccurrenceResponse `pulumi:"upgrade"`
	// Details of a security vulnerability note.
	VulnerabilityDetails VulnerabilityDetailsResponse `pulumi:"vulnerabilityDetails"`
}

func LookupOccurrenceOutput(ctx *pulumi.Context, args LookupOccurrenceOutputArgs, opts ...pulumi.InvokeOption) LookupOccurrenceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOccurrenceResult, error) {
			args := v.(LookupOccurrenceArgs)
			r, err := LookupOccurrence(ctx, &args, opts...)
			return *r, err
		}).(LookupOccurrenceResultOutput)
}

type LookupOccurrenceOutputArgs struct {
	OccurrenceId pulumi.StringInput    `pulumi:"occurrenceId"`
	Project      pulumi.StringPtrInput `pulumi:"project"`
}

func (LookupOccurrenceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOccurrenceArgs)(nil)).Elem()
}

type LookupOccurrenceResultOutput struct{ *pulumi.OutputState }

func (LookupOccurrenceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOccurrenceResult)(nil)).Elem()
}

func (o LookupOccurrenceResultOutput) ToLookupOccurrenceResultOutput() LookupOccurrenceResultOutput {
	return o
}

func (o LookupOccurrenceResultOutput) ToLookupOccurrenceResultOutputWithContext(ctx context.Context) LookupOccurrenceResultOutput {
	return o
}

// Describes an attestation of an artifact.
func (o LookupOccurrenceResultOutput) Attestation() AttestationResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) AttestationResponse { return v.Attestation }).(AttestationResponseOutput)
}

// Build details for a verifiable build.
func (o LookupOccurrenceResultOutput) BuildDetails() BuildDetailsResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) BuildDetailsResponse { return v.BuildDetails }).(BuildDetailsResponseOutput)
}

// Describes whether or not a resource passes compliance checks.
func (o LookupOccurrenceResultOutput) Compliance() ComplianceOccurrenceResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) ComplianceOccurrenceResponse { return v.Compliance }).(ComplianceOccurrenceResponseOutput)
}

// The time this `Occurrence` was created.
func (o LookupOccurrenceResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

// Describes the deployment of an artifact on a runtime.
func (o LookupOccurrenceResultOutput) Deployment() DeploymentResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) DeploymentResponse { return v.Deployment }).(DeploymentResponseOutput)
}

// Describes how this resource derives from the basis in the associated note.
func (o LookupOccurrenceResultOutput) DerivedImage() DerivedResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) DerivedResponse { return v.DerivedImage }).(DerivedResponseOutput)
}

// Describes the initial scan status for this resource.
func (o LookupOccurrenceResultOutput) Discovered() DiscoveredResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) DiscoveredResponse { return v.Discovered }).(DiscoveredResponseOutput)
}

// This represents a DSSE attestation occurrence
func (o LookupOccurrenceResultOutput) DsseAttestation() DSSEAttestationOccurrenceResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) DSSEAttestationOccurrenceResponse { return v.DsseAttestation }).(DSSEAttestationOccurrenceResponseOutput)
}

// https://github.com/secure-systems-lab/dsse
func (o LookupOccurrenceResultOutput) Envelope() EnvelopeResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) EnvelopeResponse { return v.Envelope }).(EnvelopeResponseOutput)
}

// Describes the installation of a package on the linked resource.
func (o LookupOccurrenceResultOutput) Installation() InstallationResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) InstallationResponse { return v.Installation }).(InstallationResponseOutput)
}

// This explicitly denotes which of the `Occurrence` details are specified. This field can be used as a filter in list requests.
func (o LookupOccurrenceResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) string { return v.Kind }).(pulumi.StringOutput)
}

// The name of the `Occurrence` in the form "projects/{project_id}/occurrences/{OCCURRENCE_ID}"
func (o LookupOccurrenceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) string { return v.Name }).(pulumi.StringOutput)
}

// An analysis note associated with this image, in the form "providers/{provider_id}/notes/{NOTE_ID}" This field can be used as a filter in list requests.
func (o LookupOccurrenceResultOutput) NoteName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) string { return v.NoteName }).(pulumi.StringOutput)
}

// A description of actions that can be taken to remedy the `Note`
func (o LookupOccurrenceResultOutput) Remediation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) string { return v.Remediation }).(pulumi.StringOutput)
}

//  The resource for which the `Occurrence` applies.
func (o LookupOccurrenceResultOutput) Resource() ResourceResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) ResourceResponse { return v.Resource }).(ResourceResponseOutput)
}

// The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
func (o LookupOccurrenceResultOutput) ResourceUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) string { return v.ResourceUrl }).(pulumi.StringOutput)
}

// Describes a specific software bill of materials document.
func (o LookupOccurrenceResultOutput) Sbom() DocumentOccurrenceResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) DocumentOccurrenceResponse { return v.Sbom }).(DocumentOccurrenceResponseOutput)
}

// Describes a specific SPDX File.
func (o LookupOccurrenceResultOutput) SpdxFile() FileOccurrenceResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) FileOccurrenceResponse { return v.SpdxFile }).(FileOccurrenceResponseOutput)
}

// Describes a specific SPDX Package.
func (o LookupOccurrenceResultOutput) SpdxPackage() PackageInfoOccurrenceResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) PackageInfoOccurrenceResponse { return v.SpdxPackage }).(PackageInfoOccurrenceResponseOutput)
}

// Describes a specific relationship between SPDX elements.
func (o LookupOccurrenceResultOutput) SpdxRelationship() RelationshipOccurrenceResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) RelationshipOccurrenceResponse { return v.SpdxRelationship }).(RelationshipOccurrenceResponseOutput)
}

// The time this `Occurrence` was last updated.
func (o LookupOccurrenceResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

// Describes an upgrade.
func (o LookupOccurrenceResultOutput) Upgrade() UpgradeOccurrenceResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) UpgradeOccurrenceResponse { return v.Upgrade }).(UpgradeOccurrenceResponseOutput)
}

// Details of a security vulnerability note.
func (o LookupOccurrenceResultOutput) VulnerabilityDetails() VulnerabilityDetailsResponseOutput {
	return o.ApplyT(func(v LookupOccurrenceResult) VulnerabilityDetailsResponse { return v.VulnerabilityDetails }).(VulnerabilityDetailsResponseOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOccurrenceResultOutput{})
}