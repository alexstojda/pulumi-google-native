// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datastream.v1alpha1.ConnectionProfileArgs;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.ForwardSshTunnelConnectivityResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.GcsProfileResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.MysqlProfileResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.NoConnectivitySettingsResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.OracleProfileResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.PrivateConnectivityResponse;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.StaticServiceIpConnectivityResponse;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this method to create a connection profile in a project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:datastream/v1alpha1:ConnectionProfile")
public class ConnectionProfile extends com.pulumi.resources.CustomResource {
    /**
     * Required. The connection profile identifier.
     * 
     */
    @Export(name="connectionProfileId", type=String.class, parameters={})
    private Output<String> connectionProfileId;

    /**
     * @return Required. The connection profile identifier.
     * 
     */
    public Output<String> connectionProfileId() {
        return this.connectionProfileId;
    }
    /**
     * The create time of the resource.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The create time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Forward SSH tunnel connectivity.
     * 
     */
    @Export(name="forwardSshConnectivity", type=ForwardSshTunnelConnectivityResponse.class, parameters={})
    private Output<ForwardSshTunnelConnectivityResponse> forwardSshConnectivity;

    /**
     * @return Forward SSH tunnel connectivity.
     * 
     */
    public Output<ForwardSshTunnelConnectivityResponse> forwardSshConnectivity() {
        return this.forwardSshConnectivity;
    }
    /**
     * Cloud Storage ConnectionProfile configuration.
     * 
     */
    @Export(name="gcsProfile", type=GcsProfileResponse.class, parameters={})
    private Output<GcsProfileResponse> gcsProfile;

    /**
     * @return Cloud Storage ConnectionProfile configuration.
     * 
     */
    public Output<GcsProfileResponse> gcsProfile() {
        return this.gcsProfile;
    }
    /**
     * Labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels.
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
     * MySQL ConnectionProfile configuration.
     * 
     */
    @Export(name="mysqlProfile", type=MysqlProfileResponse.class, parameters={})
    private Output<MysqlProfileResponse> mysqlProfile;

    /**
     * @return MySQL ConnectionProfile configuration.
     * 
     */
    public Output<MysqlProfileResponse> mysqlProfile() {
        return this.mysqlProfile;
    }
    /**
     * The resource&#39;s name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource&#39;s name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * No connectivity option chosen.
     * 
     */
    @Export(name="noConnectivity", type=NoConnectivitySettingsResponse.class, parameters={})
    private Output<NoConnectivitySettingsResponse> noConnectivity;

    /**
     * @return No connectivity option chosen.
     * 
     */
    public Output<NoConnectivitySettingsResponse> noConnectivity() {
        return this.noConnectivity;
    }
    /**
     * Oracle ConnectionProfile configuration.
     * 
     */
    @Export(name="oracleProfile", type=OracleProfileResponse.class, parameters={})
    private Output<OracleProfileResponse> oracleProfile;

    /**
     * @return Oracle ConnectionProfile configuration.
     * 
     */
    public Output<OracleProfileResponse> oracleProfile() {
        return this.oracleProfile;
    }
    /**
     * Private connectivity.
     * 
     */
    @Export(name="privateConnectivity", type=PrivateConnectivityResponse.class, parameters={})
    private Output<PrivateConnectivityResponse> privateConnectivity;

    /**
     * @return Private connectivity.
     * 
     */
    public Output<PrivateConnectivityResponse> privateConnectivity() {
        return this.privateConnectivity;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Static Service IP connectivity.
     * 
     */
    @Export(name="staticServiceIpConnectivity", type=StaticServiceIpConnectivityResponse.class, parameters={})
    private Output<StaticServiceIpConnectivityResponse> staticServiceIpConnectivity;

    /**
     * @return Static Service IP connectivity.
     * 
     */
    public Output<StaticServiceIpConnectivityResponse> staticServiceIpConnectivity() {
        return this.staticServiceIpConnectivity;
    }
    /**
     * The update time of the resource.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The update time of the resource.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionProfile(String name) {
        this(name, ConnectionProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionProfile(String name, ConnectionProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionProfile(String name, ConnectionProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:ConnectionProfile", name, args == null ? ConnectionProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectionProfile(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:ConnectionProfile", name, null, makeResourceOptions(options, id));
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
    public static ConnectionProfile get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionProfile(name, id, options);
    }
}