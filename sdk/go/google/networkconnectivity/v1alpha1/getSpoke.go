// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1alpha1

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets details of a single Spoke.
func LookupSpoke(ctx *pulumi.Context, args *LookupSpokeArgs, opts ...pulumi.InvokeOption) (*LookupSpokeResult, error) {
	var rv LookupSpokeResult
	err := ctx.Invoke("google-native:networkconnectivity/v1alpha1:getSpoke", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupSpokeArgs struct {
	Location string `pulumi:"location"`
	Project  string `pulumi:"project"`
	SpokeId  string `pulumi:"spokeId"`
}

type LookupSpokeResult struct {
	// The time when the Spoke was created.
	CreateTime string `pulumi:"createTime"`
	// Short description of the spoke resource
	Description string `pulumi:"description"`
	// The resource URL of the hub resource that the spoke is attached to
	Hub string `pulumi:"hub"`
	// User-defined labels.
	Labels map[string]string `pulumi:"labels"`
	// The URIs of linked interconnect attachment resources
	LinkedInterconnectAttachments []string `pulumi:"linkedInterconnectAttachments"`
	// The URIs of linked Router appliance resources
	LinkedRouterApplianceInstances []RouterApplianceInstanceResponse `pulumi:"linkedRouterApplianceInstances"`
	// The URIs of linked VPN tunnel resources
	LinkedVpnTunnels []string `pulumi:"linkedVpnTunnels"`
	// Immutable. The name of a Spoke resource.
	Name string `pulumi:"name"`
	// The current lifecycle state of this Hub.
	State string `pulumi:"state"`
	// Google-generated UUID for this resource. This is unique across all Spoke resources. If a Spoke resource is deleted and another with the same name is created, it gets a different unique_id.
	UniqueId string `pulumi:"uniqueId"`
	// The time when the Spoke was updated.
	UpdateTime string `pulumi:"updateTime"`
}