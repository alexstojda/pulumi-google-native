// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.beyondcorp.v1alpha.ConnectionArgs;
import com.pulumi.googlenative.beyondcorp.v1alpha.outputs.ApplicationEndpointResponse;
import com.pulumi.googlenative.beyondcorp.v1alpha.outputs.GatewayResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Connection in a given project and location.
 * 
 */
@ResourceType(type="google-native:beyondcorp/v1alpha:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * Address of the remote application endpoint for the BeyondCorp Connection.
     * 
     */
    @Export(name="applicationEndpoint", type=ApplicationEndpointResponse.class, parameters={})
    private Output<ApplicationEndpointResponse> applicationEndpoint;

    /**
     * @return Address of the remote application endpoint for the BeyondCorp Connection.
     * 
     */
    public Output<ApplicationEndpointResponse> applicationEndpoint() {
        return this.applicationEndpoint;
    }
    /**
     * Optional. User-settable connection resource ID. * Must start with a letter. * Must contain between 4-63 characters from `/a-z-/`. * Must end with a number or a letter.
     * 
     */
    @Export(name="connectionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionId;

    /**
     * @return Optional. User-settable connection resource ID. * Must start with a letter. * Must contain between 4-63 characters from `/a-z-/`. * Must end with a number or a letter.
     * 
     */
    public Output<Optional<String>> connectionId() {
        return Codegen.optional(this.connectionId);
    }
    /**
     * Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are authorised to be associated with this Connection.
     * 
     */
    @Export(name="connectors", type=List.class, parameters={String.class})
    private Output<List<String>> connectors;

    /**
     * @return Optional. List of [google.cloud.beyondcorp.v1main.Connector.name] that are authorised to be associated with this Connection.
     * 
     */
    public Output<List<String>> connectors() {
        return this.connectors;
    }
    /**
     * Timestamp when the resource was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Timestamp when the resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. An arbitrary user-provided name for the connection. Cannot exceed 64 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Optional. An arbitrary user-provided name for the connection. Cannot exceed 64 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Optional. Gateway used by the connection.
     * 
     */
    @Export(name="gateway", type=GatewayResponse.class, parameters={})
    private Output<GatewayResponse> gateway;

    /**
     * @return Optional. Gateway used by the connection.
     * 
     */
    public Output<GatewayResponse> gateway() {
        return this.gateway;
    }
    /**
     * Optional. Resource labels to represent user provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user provided metadata.
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
     * Unique resource name of the connection. The name is ignored when creating a connection.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique resource name of the connection. The name is ignored when creating a connection.
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
     * The current state of the connection.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the connection.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The type of network connectivity used by the connection.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of network connectivity used by the connection.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A unique identifier for the instance generated by the system.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return A unique identifier for the instance generated by the system.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Timestamp when the resource was last modified.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Timestamp when the resource was last modified.
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
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:beyondcorp/v1alpha:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:beyondcorp/v1alpha:Connection", name, null, makeResourceOptions(options, id));
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
    public static Connection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, options);
    }
}