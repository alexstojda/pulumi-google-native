// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.servicemanagement.v1.RolloutArgs;
import com.pulumi.googlenative.servicemanagement.v1.outputs.DeleteServiceStrategyResponse;
import com.pulumi.googlenative.servicemanagement.v1.outputs.TrafficPercentStrategyResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new service configuration rollout. Based on rollout, the Google Service Management will roll out the service configurations to different backend services. For example, the logging configuration will be pushed to Google Cloud Logging. Please note that any previous pending and running Rollouts and associated Operations will be automatically cancelled so that the latest Rollout will not be blocked by previous Rollouts. Only the 100 most recent (in any state) and the last 10 successful (if not already part of the set of 100 most recent) rollouts are kept for each service. The rest will be deleted eventually. Operation
 * Auto-naming is currently not supported for this resource.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:servicemanagement/v1:Rollout")
public class Rollout extends com.pulumi.resources.CustomResource {
    /**
     * Creation time of the rollout. Readonly.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation time of the rollout. Readonly.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The user who created the Rollout. Readonly.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output<String> createdBy;

    /**
     * @return The user who created the Rollout. Readonly.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
     */
    @Export(name="deleteServiceStrategy", type=DeleteServiceStrategyResponse.class, parameters={})
    private Output<DeleteServiceStrategyResponse> deleteServiceStrategy;

    /**
     * @return The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
     */
    public Output<DeleteServiceStrategyResponse> deleteServiceStrategy() {
        return this.deleteServiceStrategy;
    }
    /**
     * Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where &#34;date&#34; is the create date in ISO 8601 format. &#34;revision number&#34; is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is &#39;2016-02-16r1&#39;
     * 
     */
    @Export(name="rolloutId", type=String.class, parameters={})
    private Output<String> rolloutId;

    /**
     * @return Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, &#39;.&#39;, &#39;_&#39; and &#39;-&#39; are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where &#34;date&#34; is the create date in ISO 8601 format. &#34;revision number&#34; is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is &#39;2016-02-16r1&#39;
     * 
     */
    public Output<String> rolloutId() {
        return this.rolloutId;
    }
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Google Service Control selects service configurations based on traffic percentage.
     * 
     */
    @Export(name="trafficPercentStrategy", type=TrafficPercentStrategyResponse.class, parameters={})
    private Output<TrafficPercentStrategyResponse> trafficPercentStrategy;

    /**
     * @return Google Service Control selects service configurations based on traffic percentage.
     * 
     */
    public Output<TrafficPercentStrategyResponse> trafficPercentStrategy() {
        return this.trafficPercentStrategy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rollout(String name) {
        this(name, RolloutArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rollout(String name, RolloutArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rollout(String name, RolloutArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:servicemanagement/v1:Rollout", name, args == null ? RolloutArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rollout(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:servicemanagement/v1:Rollout", name, null, makeResourceOptions(options, id));
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
    public static Rollout get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Rollout(name, id, options);
    }
}