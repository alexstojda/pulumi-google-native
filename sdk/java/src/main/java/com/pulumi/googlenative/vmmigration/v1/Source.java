// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.vmmigration.v1.SourceArgs;
import com.pulumi.googlenative.vmmigration.v1.outputs.VmwareSourceDetailsResponse;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Source in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1:Source")
public class Source extends com.pulumi.resources.CustomResource {
    /**
     * The create time timestamp.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The create time timestamp.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the source.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-provided description of the source.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The labels of the source.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels of the source.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The Source name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Source name.
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
     * A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Required. The source identifier.
     * 
     */
    @Export(name="sourceId", type=String.class, parameters={})
    private Output<String> sourceId;

    /**
     * @return Required. The source identifier.
     * 
     */
    public Output<String> sourceId() {
        return this.sourceId;
    }
    /**
     * The update time timestamp.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The update time timestamp.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Vmware type source details.
     * 
     */
    @Export(name="vmware", type=VmwareSourceDetailsResponse.class, parameters={})
    private Output<VmwareSourceDetailsResponse> vmware;

    /**
     * @return Vmware type source details.
     * 
     */
    public Output<VmwareSourceDetailsResponse> vmware() {
        return this.vmware;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Source(String name) {
        this(name, SourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Source(String name, SourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Source(String name, SourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:Source", name, args == null ? SourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Source(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1:Source", name, null, makeResourceOptions(options, id));
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
    public static Source get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Source(name, id, options);
    }
}