// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package v1beta1

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns specified connection.
func LookupConnection(ctx *pulumi.Context, args *LookupConnectionArgs, opts ...pulumi.InvokeOption) (*LookupConnectionResult, error) {
	var rv LookupConnectionResult
	err := ctx.Invoke("google-native:bigqueryconnection/v1beta1:getConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupConnectionArgs struct {
	ConnectionId string `pulumi:"connectionId"`
	Location     string `pulumi:"location"`
	Project      string `pulumi:"project"`
}

type LookupConnectionResult struct {
	// Cloud SQL properties.
	CloudSql CloudSqlPropertiesResponse `pulumi:"cloudSql"`
	// The creation timestamp of the connection.
	CreationTime string `pulumi:"creationTime"`
	// User provided description.
	Description string `pulumi:"description"`
	// User provided display name for the connection.
	FriendlyName string `pulumi:"friendlyName"`
	// True, if credential is configured for this connection.
	HasCredential bool `pulumi:"hasCredential"`
	// The last update timestamp of the connection.
	LastModifiedTime string `pulumi:"lastModifiedTime"`
	// The resource name of the connection in the form of: `projects/{project_id}/locations/{location_id}/connections/{connection_id}`
	Name string `pulumi:"name"`
}