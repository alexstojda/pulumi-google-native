// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigee.v1.TargetServerArgs;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1TlsInfoResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a TargetServer in the specified environment.
 * 
 */
@ResourceType(type="google-native:apigee/v1:TargetServer")
public class TargetServer extends com.pulumi.resources.CustomResource {
    /**
     * Optional. A human-readable description of this TargetServer.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. A human-readable description of this TargetServer.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    @Export(name="environmentId", type=String.class, parameters={})
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }
    /**
     * The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isEnabled;

    /**
     * @return Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }
    /**
     * Optional. The ID to give the TargetServer. This will overwrite the value in TargetServer.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optional. The ID to give the TargetServer. This will overwrite the value in TargetServer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * Immutable. The protocol used by this TargetServer.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return Immutable. The protocol used by this TargetServer.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * 
     */
    @Export(name="sSLInfo", type=GoogleCloudApigeeV1TlsInfoResponse.class, parameters={})
    private Output<GoogleCloudApigeeV1TlsInfoResponse> sSLInfo;

    /**
     * @return Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * 
     */
    public Output<GoogleCloudApigeeV1TlsInfoResponse> sSLInfo() {
        return this.sSLInfo;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TargetServer(String name) {
        this(name, TargetServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TargetServer(String name, TargetServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetServer(String name, TargetServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:TargetServer", name, args == null ? TargetServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TargetServer(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:TargetServer", name, null, makeResourceOptions(options, id));
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
    public static TargetServer get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TargetServer(name, id, options);
    }
}