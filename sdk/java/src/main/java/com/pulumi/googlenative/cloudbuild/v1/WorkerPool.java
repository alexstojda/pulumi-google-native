// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudbuild.v1.WorkerPoolArgs;
import com.pulumi.googlenative.cloudbuild.v1.outputs.PrivatePoolV1ConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a `WorkerPool`.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudbuild/v1:WorkerPool")
public class WorkerPool extends com.pulumi.resources.CustomResource {
    /**
     * User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> annotations;

    /**
     * @return User specified annotations. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * Time at which the request to create the `WorkerPool` was received.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time at which the request to create the `WorkerPool` was received.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A user-specified, human-readable name for the `WorkerPool`. If provided, this value must be 1-63 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Checksum computed by the server. May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Checksum computed by the server. May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of the `WorkerPool`, with format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location}` is determined by the endpoint accessed.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the `WorkerPool`, with format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. The value of `{worker_pool}` is provided by `worker_pool_id` in `CreateWorkerPool` request and the value of `{location}` is determined by the endpoint accessed.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Legacy Private Pool configuration.
     * 
     */
    @Export(name="privatePoolV1Config", type=PrivatePoolV1ConfigResponse.class, parameters={})
    private Output<PrivatePoolV1ConfigResponse> privatePoolV1Config;

    /**
     * @return Legacy Private Pool configuration.
     * 
     */
    public Output<PrivatePoolV1ConfigResponse> privatePoolV1Config() {
        return this.privatePoolV1Config;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * `WorkerPool` state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return `WorkerPool` state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A unique identifier for the `WorkerPool`.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return A unique identifier for the `WorkerPool`.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Time at which the request to update the `WorkerPool` was received.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time at which the request to update the `WorkerPool` was received.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * If set, validate the request and preview the response, but do not actually post it.
     * 
     */
    @Export(name="validateOnly", type=String.class, parameters={})
    private Output</* @Nullable */ String> validateOnly;

    /**
     * @return If set, validate the request and preview the response, but do not actually post it.
     * 
     */
    public Output<Optional<String>> validateOnly() {
        return Codegen.optional(this.validateOnly);
    }
    /**
     * Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
     * 
     */
    @Export(name="workerPoolId", type=String.class, parameters={})
    private Output<String> workerPoolId;

    /**
     * @return Required. Immutable. The ID to use for the `WorkerPool`, which will become the final component of the resource name. This value should be 1-63 characters, and valid characters are /a-z-/.
     * 
     */
    public Output<String> workerPoolId() {
        return this.workerPoolId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerPool(String name) {
        this(name, WorkerPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerPool(String name, WorkerPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerPool(String name, WorkerPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:WorkerPool", name, args == null ? WorkerPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkerPool(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:WorkerPool", name, null, makeResourceOptions(options, id));
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
    public static WorkerPool get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkerPool(name, id, options);
    }
}