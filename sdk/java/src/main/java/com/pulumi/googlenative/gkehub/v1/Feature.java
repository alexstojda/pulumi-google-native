// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.gkehub.v1.FeatureArgs;
import com.pulumi.googlenative.gkehub.v1.outputs.CommonFeatureSpecResponse;
import com.pulumi.googlenative.gkehub.v1.outputs.CommonFeatureStateResponse;
import com.pulumi.googlenative.gkehub.v1.outputs.FeatureResourceStateResponse;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Adds a new Feature.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:gkehub/v1:Feature")
public class Feature extends com.pulumi.resources.CustomResource {
    /**
     * When the Feature resource was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return When the Feature resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * When the Feature resource was deleted.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return When the Feature resource was deleted.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * The ID of the feature to create.
     * 
     */
    @Export(name="featureId", type=String.class, parameters={})
    private Output</* @Nullable */ String> featureId;

    /**
     * @return The ID of the feature to create.
     * 
     */
    public Output<Optional<String>> featureId() {
        return Codegen.optional(this.featureId);
    }
    /**
     * GCP labels for this Feature.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return GCP labels for this Feature.
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
     * Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature&#39;s project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
     * 
     */
    @Export(name="membershipSpecs", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> membershipSpecs;

    /**
     * @return Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature&#39;s project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
     * 
     */
    public Output<Map<String,String>> membershipSpecs() {
        return this.membershipSpecs;
    }
    /**
     * Membership-specific Feature status. If this Feature does report any per-Membership status, this field may be unused. The keys indicate which Membership the state is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project number, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} MUST match the Feature&#39;s project number.
     * 
     */
    @Export(name="membershipStates", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> membershipStates;

    /**
     * @return Membership-specific Feature status. If this Feature does report any per-Membership status, this field may be unused. The keys indicate which Membership the state is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project number, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} MUST match the Feature&#39;s project number.
     * 
     */
    public Output<Map<String,String>> membershipStates() {
        return this.membershipStates;
    }
    /**
     * The full, unique name of this Feature resource in the format `projects/*{@literal /}locations/*{@literal /}features/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The full, unique name of this Feature resource in the format `projects/*{@literal /}locations/*{@literal /}features/*`.
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
     * A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * State of the Feature resource itself.
     * 
     */
    @Export(name="resourceState", type=FeatureResourceStateResponse.class, parameters={})
    private Output<FeatureResourceStateResponse> resourceState;

    /**
     * @return State of the Feature resource itself.
     * 
     */
    public Output<FeatureResourceStateResponse> resourceState() {
        return this.resourceState;
    }
    /**
     * Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
     */
    @Export(name="spec", type=CommonFeatureSpecResponse.class, parameters={})
    private Output<CommonFeatureSpecResponse> spec;

    /**
     * @return Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
     */
    public Output<CommonFeatureSpecResponse> spec() {
        return this.spec;
    }
    /**
     * The Hub-wide Feature state.
     * 
     */
    @Export(name="state", type=CommonFeatureStateResponse.class, parameters={})
    private Output<CommonFeatureStateResponse> state;

    /**
     * @return The Hub-wide Feature state.
     * 
     */
    public Output<CommonFeatureStateResponse> state() {
        return this.state;
    }
    /**
     * When the Feature resource was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return When the Feature resource was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Feature(String name) {
        this(name, FeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Feature(String name, @Nullable FeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Feature(String name, @Nullable FeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1:Feature", name, args == null ? FeatureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Feature(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gkehub/v1:Feature", name, null, makeResourceOptions(options, id));
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
    public static Feature get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Feature(name, id, options);
    }
}