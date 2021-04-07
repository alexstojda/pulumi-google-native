// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Create a new Certificate in a given Project, Location from a particular CertificateAuthority.
type CertificateAuthorityCertificate struct {
	pulumi.CustomResourceState

	// A structured description of the issued X.509 certificate.
	CertificateDescription CertificateDescriptionResponseOutput `pulumi:"certificateDescription"`
	// Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
	Config CertificateConfigResponseOutput `pulumi:"config"`
	// The time at which this Certificate was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Optional. Labels with user-defined metadata.
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
	Lifetime pulumi.StringOutput `pulumi:"lifetime"`
	// The resource path for this Certificate in the format `projects/*/locations/*/certificateAuthorities/*/certificates/*`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The pem-encoded, signed X.509 certificate.
	PemCertificate pulumi.StringOutput `pulumi:"pemCertificate"`
	// The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
	PemCertificateChain pulumi.StringArrayOutput `pulumi:"pemCertificateChain"`
	// Immutable. A pem-encoded X.509 certificate signing request (CSR).
	PemCsr pulumi.StringOutput `pulumi:"pemCsr"`
	// Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
	RevocationDetails RevocationDetailsResponseOutput `pulumi:"revocationDetails"`
	// The time at which this Certificate was updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewCertificateAuthorityCertificate registers a new resource with the given unique name, arguments, and options.
func NewCertificateAuthorityCertificate(ctx *pulumi.Context,
	name string, args *CertificateAuthorityCertificateArgs, opts ...pulumi.ResourceOption) (*CertificateAuthorityCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateAuthoritiesId == nil {
		return nil, errors.New("invalid value for required argument 'CertificateAuthoritiesId'")
	}
	if args.CertificatesId == nil {
		return nil, errors.New("invalid value for required argument 'CertificatesId'")
	}
	if args.LocationsId == nil {
		return nil, errors.New("invalid value for required argument 'LocationsId'")
	}
	if args.ProjectsId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectsId'")
	}
	var resource CertificateAuthorityCertificate
	err := ctx.RegisterResource("gcp-native:privateca/v1beta1:CertificateAuthorityCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificateAuthorityCertificate gets an existing CertificateAuthorityCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificateAuthorityCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificateAuthorityCertificateState, opts ...pulumi.ResourceOption) (*CertificateAuthorityCertificate, error) {
	var resource CertificateAuthorityCertificate
	err := ctx.ReadResource("gcp-native:privateca/v1beta1:CertificateAuthorityCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CertificateAuthorityCertificate resources.
type certificateAuthorityCertificateState struct {
	// A structured description of the issued X.509 certificate.
	CertificateDescription *CertificateDescriptionResponse `pulumi:"certificateDescription"`
	// Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
	Config *CertificateConfigResponse `pulumi:"config"`
	// The time at which this Certificate was created.
	CreateTime *string `pulumi:"createTime"`
	// Optional. Labels with user-defined metadata.
	Labels map[string]string `pulumi:"labels"`
	// Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
	Lifetime *string `pulumi:"lifetime"`
	// The resource path for this Certificate in the format `projects/*/locations/*/certificateAuthorities/*/certificates/*`.
	Name *string `pulumi:"name"`
	// The pem-encoded, signed X.509 certificate.
	PemCertificate *string `pulumi:"pemCertificate"`
	// The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
	PemCertificateChain []string `pulumi:"pemCertificateChain"`
	// Immutable. A pem-encoded X.509 certificate signing request (CSR).
	PemCsr *string `pulumi:"pemCsr"`
	// Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
	RevocationDetails *RevocationDetailsResponse `pulumi:"revocationDetails"`
	// The time at which this Certificate was updated.
	UpdateTime *string `pulumi:"updateTime"`
}

type CertificateAuthorityCertificateState struct {
	// A structured description of the issued X.509 certificate.
	CertificateDescription CertificateDescriptionResponsePtrInput
	// Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
	Config CertificateConfigResponsePtrInput
	// The time at which this Certificate was created.
	CreateTime pulumi.StringPtrInput
	// Optional. Labels with user-defined metadata.
	Labels pulumi.StringMapInput
	// Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
	Lifetime pulumi.StringPtrInput
	// The resource path for this Certificate in the format `projects/*/locations/*/certificateAuthorities/*/certificates/*`.
	Name pulumi.StringPtrInput
	// The pem-encoded, signed X.509 certificate.
	PemCertificate pulumi.StringPtrInput
	// The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
	PemCertificateChain pulumi.StringArrayInput
	// Immutable. A pem-encoded X.509 certificate signing request (CSR).
	PemCsr pulumi.StringPtrInput
	// Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
	RevocationDetails RevocationDetailsResponsePtrInput
	// The time at which this Certificate was updated.
	UpdateTime pulumi.StringPtrInput
}

func (CertificateAuthorityCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateAuthorityCertificateState)(nil)).Elem()
}

type certificateAuthorityCertificateArgs struct {
	CertificateAuthoritiesId string `pulumi:"certificateAuthoritiesId"`
	CertificatesId           string `pulumi:"certificatesId"`
	// Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
	Config *CertificateConfig `pulumi:"config"`
	// Optional. Labels with user-defined metadata.
	Labels map[string]string `pulumi:"labels"`
	// Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
	Lifetime    *string `pulumi:"lifetime"`
	LocationsId string  `pulumi:"locationsId"`
	// Immutable. A pem-encoded X.509 certificate signing request (CSR).
	PemCsr     *string `pulumi:"pemCsr"`
	ProjectsId string  `pulumi:"projectsId"`
}

// The set of arguments for constructing a CertificateAuthorityCertificate resource.
type CertificateAuthorityCertificateArgs struct {
	CertificateAuthoritiesId pulumi.StringInput
	CertificatesId           pulumi.StringInput
	// Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
	Config CertificateConfigPtrInput
	// Optional. Labels with user-defined metadata.
	Labels pulumi.StringMapInput
	// Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
	Lifetime    pulumi.StringPtrInput
	LocationsId pulumi.StringInput
	// Immutable. A pem-encoded X.509 certificate signing request (CSR).
	PemCsr     pulumi.StringPtrInput
	ProjectsId pulumi.StringInput
}

func (CertificateAuthorityCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateAuthorityCertificateArgs)(nil)).Elem()
}

type CertificateAuthorityCertificateInput interface {
	pulumi.Input

	ToCertificateAuthorityCertificateOutput() CertificateAuthorityCertificateOutput
	ToCertificateAuthorityCertificateOutputWithContext(ctx context.Context) CertificateAuthorityCertificateOutput
}

func (*CertificateAuthorityCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((*CertificateAuthorityCertificate)(nil))
}

func (i *CertificateAuthorityCertificate) ToCertificateAuthorityCertificateOutput() CertificateAuthorityCertificateOutput {
	return i.ToCertificateAuthorityCertificateOutputWithContext(context.Background())
}

func (i *CertificateAuthorityCertificate) ToCertificateAuthorityCertificateOutputWithContext(ctx context.Context) CertificateAuthorityCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateAuthorityCertificateOutput)
}

type CertificateAuthorityCertificateOutput struct {
	*pulumi.OutputState
}

func (CertificateAuthorityCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CertificateAuthorityCertificate)(nil))
}

func (o CertificateAuthorityCertificateOutput) ToCertificateAuthorityCertificateOutput() CertificateAuthorityCertificateOutput {
	return o
}

func (o CertificateAuthorityCertificateOutput) ToCertificateAuthorityCertificateOutputWithContext(ctx context.Context) CertificateAuthorityCertificateOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(CertificateAuthorityCertificateOutput{})
}