// Code generated by the Pulumi SDK Generator DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets an sfdc instance. If the instance doesn't exist, Code.NOT_FOUND exception will be thrown.
func LookupSfdcInstance(ctx *pulumi.Context, args *LookupSfdcInstanceArgs, opts ...pulumi.InvokeOption) (*LookupSfdcInstanceResult, error) {
	var rv LookupSfdcInstanceResult
	err := ctx.Invoke("google-native:integrations/v1alpha:getSfdcInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupSfdcInstanceArgs struct {
	Location       string  `pulumi:"location"`
	ProductId      string  `pulumi:"productId"`
	Project        *string `pulumi:"project"`
	SfdcInstanceId string  `pulumi:"sfdcInstanceId"`
}

type LookupSfdcInstanceResult struct {
	// A list of AuthConfigs that can be tried to open the channel to SFDC
	AuthConfigId []string `pulumi:"authConfigId"`
	// Time when the instance is created
	CreateTime string `pulumi:"createTime"`
	// Time when the instance was deleted. Empty if not deleted.
	DeleteTime string `pulumi:"deleteTime"`
	// A description of the sfdc instance.
	Description string `pulumi:"description"`
	// User selected unique name/alias to easily reference an instance.
	DisplayName string `pulumi:"displayName"`
	// Resource name of the SFDC instance projects/{project}/locations/{location}/sfdcInstances/{sfdcInstance}.
	Name string `pulumi:"name"`
	// URL used for API calls after authentication (the login authority is configured within the referenced AuthConfig).
	ServiceAuthority string `pulumi:"serviceAuthority"`
	// The SFDC Org Id. This is defined in salesforce.
	SfdcOrgId string `pulumi:"sfdcOrgId"`
	// Time when the instance was last updated
	UpdateTime string `pulumi:"updateTime"`
}

func LookupSfdcInstanceOutput(ctx *pulumi.Context, args LookupSfdcInstanceOutputArgs, opts ...pulumi.InvokeOption) LookupSfdcInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSfdcInstanceResult, error) {
			args := v.(LookupSfdcInstanceArgs)
			r, err := LookupSfdcInstance(ctx, &args, opts...)
			var s LookupSfdcInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSfdcInstanceResultOutput)
}

type LookupSfdcInstanceOutputArgs struct {
	Location       pulumi.StringInput    `pulumi:"location"`
	ProductId      pulumi.StringInput    `pulumi:"productId"`
	Project        pulumi.StringPtrInput `pulumi:"project"`
	SfdcInstanceId pulumi.StringInput    `pulumi:"sfdcInstanceId"`
}

func (LookupSfdcInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSfdcInstanceArgs)(nil)).Elem()
}

type LookupSfdcInstanceResultOutput struct{ *pulumi.OutputState }

func (LookupSfdcInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSfdcInstanceResult)(nil)).Elem()
}

func (o LookupSfdcInstanceResultOutput) ToLookupSfdcInstanceResultOutput() LookupSfdcInstanceResultOutput {
	return o
}

func (o LookupSfdcInstanceResultOutput) ToLookupSfdcInstanceResultOutputWithContext(ctx context.Context) LookupSfdcInstanceResultOutput {
	return o
}

// A list of AuthConfigs that can be tried to open the channel to SFDC
func (o LookupSfdcInstanceResultOutput) AuthConfigId() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSfdcInstanceResult) []string { return v.AuthConfigId }).(pulumi.StringArrayOutput)
}

// Time when the instance is created
func (o LookupSfdcInstanceResultOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSfdcInstanceResult) string { return v.CreateTime }).(pulumi.StringOutput)
}

// Time when the instance was deleted. Empty if not deleted.
func (o LookupSfdcInstanceResultOutput) DeleteTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSfdcInstanceResult) string { return v.DeleteTime }).(pulumi.StringOutput)
}

// A description of the sfdc instance.
func (o LookupSfdcInstanceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSfdcInstanceResult) string { return v.Description }).(pulumi.StringOutput)
}

// User selected unique name/alias to easily reference an instance.
func (o LookupSfdcInstanceResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSfdcInstanceResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// Resource name of the SFDC instance projects/{project}/locations/{location}/sfdcInstances/{sfdcInstance}.
func (o LookupSfdcInstanceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSfdcInstanceResult) string { return v.Name }).(pulumi.StringOutput)
}

// URL used for API calls after authentication (the login authority is configured within the referenced AuthConfig).
func (o LookupSfdcInstanceResultOutput) ServiceAuthority() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSfdcInstanceResult) string { return v.ServiceAuthority }).(pulumi.StringOutput)
}

// The SFDC Org Id. This is defined in salesforce.
func (o LookupSfdcInstanceResultOutput) SfdcOrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSfdcInstanceResult) string { return v.SfdcOrgId }).(pulumi.StringOutput)
}

// Time when the instance was last updated
func (o LookupSfdcInstanceResultOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSfdcInstanceResult) string { return v.UpdateTime }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSfdcInstanceResultOutput{})
}