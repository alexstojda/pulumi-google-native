// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.beyondcorp.v1alpha.ClientConnectorServiceArgs;
import com.pulumi.googlenative.beyondcorp.v1alpha.outputs.EgressResponse;
import com.pulumi.googlenative.beyondcorp.v1alpha.outputs.IngressResponse;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new ClientConnectorService in a given project and location.
 * 
 */
@ResourceType(type="google-native:beyondcorp/v1alpha:ClientConnectorService")
public class ClientConnectorService extends com.pulumi.resources.CustomResource {
    /**
     * Optional. User-settable client connector service resource ID. * Must start with a letter. * Must contain between 4-63 characters from `/a-z-/`. * Must end with a number or a letter. A random system generated name will be assigned if not specified by the user.
     * 
     */
    @Export(name="clientConnectorServiceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientConnectorServiceId;

    /**
     * @return Optional. User-settable client connector service resource ID. * Must start with a letter. * Must contain between 4-63 characters from `/a-z-/`. * Must end with a number or a letter. A random system generated name will be assigned if not specified by the user.
     * 
     */
    public Output<Optional<String>> clientConnectorServiceId() {
        return Codegen.optional(this.clientConnectorServiceId);
    }
    /**
     * [Output only] Create time stamp.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return [Output only] Create time stamp.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. User-provided name. The display name should follow certain format. * Must be 6 to 30 characters in length. * Can only contain lowercase letters, numbers, and hyphens. * Must start with a letter.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. User-provided name. The display name should follow certain format. * Must be 6 to 30 characters in length. * Can only contain lowercase letters, numbers, and hyphens. * Must start with a letter.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The details of the egress settings.
     * 
     */
    @Export(name="egress", type=EgressResponse.class, parameters={})
    private Output<EgressResponse> egress;

    /**
     * @return The details of the egress settings.
     * 
     */
    public Output<EgressResponse> egress() {
        return this.egress;
    }
    /**
     * The details of the ingress settings.
     * 
     */
    @Export(name="ingress", type=IngressResponse.class, parameters={})
    private Output<IngressResponse> ingress;

    /**
     * @return The details of the ingress settings.
     * 
     */
    public Output<IngressResponse> ingress() {
        return this.ingress;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of resource. The name is ignored during creation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of resource. The name is ignored during creation.
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
     * Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return Optional. An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * The operational state of the ClientConnectorService.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The operational state of the ClientConnectorService.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * [Output only] Update time stamp.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return [Output only] Update time stamp.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Optional. If set, validates request by executing a dry-run which would not alter the resource in any way.
     * 
     */
    @Export(name="validateOnly", type=String.class, parameters={})
    private Output</* @Nullable */ String> validateOnly;

    /**
     * @return Optional. If set, validates request by executing a dry-run which would not alter the resource in any way.
     * 
     */
    public Output<Optional<String>> validateOnly() {
        return Codegen.optional(this.validateOnly);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientConnectorService(String name) {
        this(name, ClientConnectorServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientConnectorService(String name, ClientConnectorServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientConnectorService(String name, ClientConnectorServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:beyondcorp/v1alpha:ClientConnectorService", name, args == null ? ClientConnectorServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClientConnectorService(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:beyondcorp/v1alpha:ClientConnectorService", name, null, makeResourceOptions(options, id));
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
    public static ClientConnectorService get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClientConnectorService(name, id, options);
    }
}