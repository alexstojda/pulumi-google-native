// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package alpha

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Returns the specified BackendBucket resource. Gets a list of available backend buckets by making a list() request.
func LookupBackendBucket(ctx *pulumi.Context, args *LookupBackendBucketArgs, opts ...pulumi.InvokeOption) (*LookupBackendBucketResult, error) {
	var rv LookupBackendBucketResult
	err := ctx.Invoke("google-native:compute/alpha:getBackendBucket", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

type LookupBackendBucketArgs struct {
	BackendBucket string `pulumi:"backendBucket"`
	Project       string `pulumi:"project"`
}

type LookupBackendBucketResult struct {
	// Cloud Storage bucket name.
	BucketName string `pulumi:"bucketName"`
	// Cloud CDN configuration for this BackendBucket.
	CdnPolicy BackendBucketCdnPolicyResponse `pulumi:"cdnPolicy"`
	// [Output Only] Creation timestamp in RFC3339 text format.
	CreationTimestamp string `pulumi:"creationTimestamp"`
	// Headers that the HTTP/S load balancer should add to proxied responses.
	CustomResponseHeaders []string `pulumi:"customResponseHeaders"`
	// An optional textual description of the resource; provided by the client when the resource is created.
	Description string `pulumi:"description"`
	// [Output Only] The resource URL for the edge security policy associated with this backend bucket.
	EdgeSecurityPolicy string `pulumi:"edgeSecurityPolicy"`
	// If true, enable Cloud CDN for this BackendBucket.
	EnableCdn bool `pulumi:"enableCdn"`
	// Type of the resource.
	Kind string `pulumi:"kind"`
	// Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
	Name string `pulumi:"name"`
	// [Output Only] Server-defined URL for the resource.
	SelfLink string `pulumi:"selfLink"`
	// [Output Only] Server-defined URL for this resource with the resource id.
	SelfLinkWithId string `pulumi:"selfLinkWithId"`
}