// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute.v1.BackendBucketArgs;
import com.pulumi.googlenative.compute.v1.outputs.BackendBucketCdnPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a BackendBucket resource in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/v1:BackendBucket")
public class BackendBucket extends com.pulumi.resources.CustomResource {
    /**
     * Cloud Storage bucket name.
     * 
     */
    @Export(name="bucketName", type=String.class, parameters={})
    private Output<String> bucketName;

    /**
     * @return Cloud Storage bucket name.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }
    /**
     * Cloud CDN configuration for this BackendBucket.
     * 
     */
    @Export(name="cdnPolicy", type=BackendBucketCdnPolicyResponse.class, parameters={})
    private Output<BackendBucketCdnPolicyResponse> cdnPolicy;

    /**
     * @return Cloud CDN configuration for this BackendBucket.
     * 
     */
    public Output<BackendBucketCdnPolicyResponse> cdnPolicy() {
        return this.cdnPolicy;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    @Export(name="customResponseHeaders", type=List.class, parameters={String.class})
    private Output<List<String>> customResponseHeaders;

    /**
     * @return Headers that the HTTP/S load balancer should add to proxied responses.
     * 
     */
    public Output<List<String>> customResponseHeaders() {
        return this.customResponseHeaders;
    }
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The resource URL for the edge security policy associated with this backend bucket.
     * 
     */
    @Export(name="edgeSecurityPolicy", type=String.class, parameters={})
    private Output<String> edgeSecurityPolicy;

    /**
     * @return The resource URL for the edge security policy associated with this backend bucket.
     * 
     */
    public Output<String> edgeSecurityPolicy() {
        return this.edgeSecurityPolicy;
    }
    /**
     * If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    @Export(name="enableCdn", type=Boolean.class, parameters={})
    private Output<Boolean> enableCdn;

    /**
     * @return If true, enable Cloud CDN for this BackendBucket.
     * 
     */
    public Output<Boolean> enableCdn() {
        return this.enableCdn;
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackendBucket(String name) {
        this(name, BackendBucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackendBucket(String name, @Nullable BackendBucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackendBucket(String name, @Nullable BackendBucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:BackendBucket", name, args == null ? BackendBucketArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackendBucket(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:BackendBucket", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BackendBucket get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackendBucket(name, id, options);
    }
}