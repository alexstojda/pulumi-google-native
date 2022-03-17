// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The format of packages that are stored in the repository.
type RepositoryFormat string

const (
	// Unspecified package format.
	RepositoryFormatFormatUnspecified = RepositoryFormat("FORMAT_UNSPECIFIED")
	// Docker package format.
	RepositoryFormatDocker = RepositoryFormat("DOCKER")
	// Maven package format.
	RepositoryFormatMaven = RepositoryFormat("MAVEN")
	// NPM package format.
	RepositoryFormatNpm = RepositoryFormat("NPM")
	// APT package format.
	RepositoryFormatApt = RepositoryFormat("APT")
	// YUM package format.
	RepositoryFormatYum = RepositoryFormat("YUM")
	// Python package format.
	RepositoryFormatPython = RepositoryFormat("PYTHON")
)

func (RepositoryFormat) ElementType() reflect.Type {
	return reflect.TypeOf((*RepositoryFormat)(nil)).Elem()
}

func (e RepositoryFormat) ToRepositoryFormatOutput() RepositoryFormatOutput {
	return pulumi.ToOutput(e).(RepositoryFormatOutput)
}

func (e RepositoryFormat) ToRepositoryFormatOutputWithContext(ctx context.Context) RepositoryFormatOutput {
	return pulumi.ToOutputWithContext(ctx, e).(RepositoryFormatOutput)
}

func (e RepositoryFormat) ToRepositoryFormatPtrOutput() RepositoryFormatPtrOutput {
	return e.ToRepositoryFormatPtrOutputWithContext(context.Background())
}

func (e RepositoryFormat) ToRepositoryFormatPtrOutputWithContext(ctx context.Context) RepositoryFormatPtrOutput {
	return RepositoryFormat(e).ToRepositoryFormatOutputWithContext(ctx).ToRepositoryFormatPtrOutputWithContext(ctx)
}

func (e RepositoryFormat) ToStringOutput() pulumi.StringOutput {
	return pulumi.ToOutput(pulumi.String(e)).(pulumi.StringOutput)
}

func (e RepositoryFormat) ToStringOutputWithContext(ctx context.Context) pulumi.StringOutput {
	return pulumi.ToOutputWithContext(ctx, pulumi.String(e)).(pulumi.StringOutput)
}

func (e RepositoryFormat) ToStringPtrOutput() pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringPtrOutputWithContext(context.Background())
}

func (e RepositoryFormat) ToStringPtrOutputWithContext(ctx context.Context) pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringOutputWithContext(ctx).ToStringPtrOutputWithContext(ctx)
}

type RepositoryFormatOutput struct{ *pulumi.OutputState }

func (RepositoryFormatOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RepositoryFormat)(nil)).Elem()
}

func (o RepositoryFormatOutput) ToRepositoryFormatOutput() RepositoryFormatOutput {
	return o
}

func (o RepositoryFormatOutput) ToRepositoryFormatOutputWithContext(ctx context.Context) RepositoryFormatOutput {
	return o
}

func (o RepositoryFormatOutput) ToRepositoryFormatPtrOutput() RepositoryFormatPtrOutput {
	return o.ToRepositoryFormatPtrOutputWithContext(context.Background())
}

func (o RepositoryFormatOutput) ToRepositoryFormatPtrOutputWithContext(ctx context.Context) RepositoryFormatPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v RepositoryFormat) *RepositoryFormat {
		return &v
	}).(RepositoryFormatPtrOutput)
}

func (o RepositoryFormatOutput) ToStringOutput() pulumi.StringOutput {
	return o.ToStringOutputWithContext(context.Background())
}

func (o RepositoryFormatOutput) ToStringOutputWithContext(ctx context.Context) pulumi.StringOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, e RepositoryFormat) string {
		return string(e)
	}).(pulumi.StringOutput)
}

func (o RepositoryFormatOutput) ToStringPtrOutput() pulumi.StringPtrOutput {
	return o.ToStringPtrOutputWithContext(context.Background())
}

func (o RepositoryFormatOutput) ToStringPtrOutputWithContext(ctx context.Context) pulumi.StringPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, e RepositoryFormat) *string {
		v := string(e)
		return &v
	}).(pulumi.StringPtrOutput)
}

type RepositoryFormatPtrOutput struct{ *pulumi.OutputState }

func (RepositoryFormatPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryFormat)(nil)).Elem()
}

func (o RepositoryFormatPtrOutput) ToRepositoryFormatPtrOutput() RepositoryFormatPtrOutput {
	return o
}

func (o RepositoryFormatPtrOutput) ToRepositoryFormatPtrOutputWithContext(ctx context.Context) RepositoryFormatPtrOutput {
	return o
}

func (o RepositoryFormatPtrOutput) Elem() RepositoryFormatOutput {
	return o.ApplyT(func(v *RepositoryFormat) RepositoryFormat {
		if v != nil {
			return *v
		}
		var ret RepositoryFormat
		return ret
	}).(RepositoryFormatOutput)
}

func (o RepositoryFormatPtrOutput) ToStringPtrOutput() pulumi.StringPtrOutput {
	return o.ToStringPtrOutputWithContext(context.Background())
}

func (o RepositoryFormatPtrOutput) ToStringPtrOutputWithContext(ctx context.Context) pulumi.StringPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, e *RepositoryFormat) *string {
		if e == nil {
			return nil
		}
		v := string(*e)
		return &v
	}).(pulumi.StringPtrOutput)
}

// RepositoryFormatInput is an input type that accepts RepositoryFormatArgs and RepositoryFormatOutput values.
// You can construct a concrete instance of `RepositoryFormatInput` via:
//
//          RepositoryFormatArgs{...}
type RepositoryFormatInput interface {
	pulumi.Input

	ToRepositoryFormatOutput() RepositoryFormatOutput
	ToRepositoryFormatOutputWithContext(context.Context) RepositoryFormatOutput
}

var repositoryFormatPtrType = reflect.TypeOf((**RepositoryFormat)(nil)).Elem()

type RepositoryFormatPtrInput interface {
	pulumi.Input

	ToRepositoryFormatPtrOutput() RepositoryFormatPtrOutput
	ToRepositoryFormatPtrOutputWithContext(context.Context) RepositoryFormatPtrOutput
}

type repositoryFormatPtr string

func RepositoryFormatPtr(v string) RepositoryFormatPtrInput {
	return (*repositoryFormatPtr)(&v)
}

func (*repositoryFormatPtr) ElementType() reflect.Type {
	return repositoryFormatPtrType
}

func (in *repositoryFormatPtr) ToRepositoryFormatPtrOutput() RepositoryFormatPtrOutput {
	return pulumi.ToOutput(in).(RepositoryFormatPtrOutput)
}

func (in *repositoryFormatPtr) ToRepositoryFormatPtrOutputWithContext(ctx context.Context) RepositoryFormatPtrOutput {
	return pulumi.ToOutputWithContext(ctx, in).(RepositoryFormatPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryFormatInput)(nil)).Elem(), RepositoryFormat("FORMAT_UNSPECIFIED"))
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryFormatPtrInput)(nil)).Elem(), RepositoryFormat("FORMAT_UNSPECIFIED"))
	pulumi.RegisterOutputType(RepositoryFormatOutput{})
	pulumi.RegisterOutputType(RepositoryFormatPtrOutput{})
}