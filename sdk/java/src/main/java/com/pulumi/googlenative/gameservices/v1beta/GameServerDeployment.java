// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.gameservices.v1beta.GameServerDeploymentArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new game server deployment in a given project and location.
 * 
 */
@ResourceType(type="google-native:gameservices/v1beta:GameServerDeployment")
public class GameServerDeployment extends com.pulumi.resources.CustomResource {
    /**
     * The creation time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Required. The ID of the game server deployment resource to create.
     * 
     */
    @Export(name="deploymentId", type=String.class, parameters={})
    private Output<String> deploymentId;

    /**
     * @return Required. The ID of the game server deployment resource to create.
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }
    /**
     * Human readable description of the game server deployment.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Human readable description of the game server deployment.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The labels associated with this game server deployment. Each label is a key-value pair.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this game server deployment. Each label is a key-value pair.
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
     * The resource name of the game server deployment, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-deployment`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the game server deployment, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-deployment`.
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
     * The last-modified time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last-modified time.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GameServerDeployment(String name) {
        this(name, GameServerDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GameServerDeployment(String name, GameServerDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GameServerDeployment(String name, GameServerDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1beta:GameServerDeployment", name, args == null ? GameServerDeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GameServerDeployment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1beta:GameServerDeployment", name, null, makeResourceOptions(options, id));
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
    public static GameServerDeployment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GameServerDeployment(name, id, options);
    }
}