// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.runtimeconfig.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.runtimeconfig.v1beta1.WaiterArgs;
import com.pulumi.googlenative.runtimeconfig.v1beta1.outputs.EndConditionResponse;
import com.pulumi.googlenative.runtimeconfig.v1beta1.outputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a Waiter resource. This operation returns a long-running Operation resource which can be polled for completion. However, a waiter with the given name will exist (and can be retrieved) prior to the operation completing. If the operation fails, the failed Waiter resource will still exist and must be deleted prior to subsequent creation attempts.
 * 
 */
@ResourceType(type="google-native:runtimeconfig/v1beta1:Waiter")
public class Waiter extends com.pulumi.resources.CustomResource {
    @Export(name="configId", type=String.class, parameters={})
    private Output<String> configId;

    public Output<String> configId() {
        return this.configId;
    }
    /**
     * The instant at which this Waiter resource was created. Adding the value of `timeout` to this instant yields the timeout deadline for the waiter.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The instant at which this Waiter resource was created. Adding the value of `timeout` to this instant yields the timeout deadline for the waiter.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * If the value is `false`, it means the waiter is still waiting for one of its conditions to be met. If true, the waiter has finished. If the waiter finished due to a timeout or failure, `error` will be set.
     * 
     */
    @Export(name="done", type=Boolean.class, parameters={})
    private Output<Boolean> done;

    /**
     * @return If the value is `false`, it means the waiter is still waiting for one of its conditions to be met. If true, the waiter has finished. If the waiter finished due to a timeout or failure, `error` will be set.
     * 
     */
    public Output<Boolean> done() {
        return this.done;
    }
    /**
     * If the waiter ended due to a failure or timeout, this value will be set.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return If the waiter ended due to a failure or timeout, this value will be set.
     * 
     */
    public Output<StatusResponse> error() {
        return this.error;
    }
    /**
     * [Optional] The failure condition of this waiter. If this condition is met, `done` will be set to `true` and the `error` code will be set to `ABORTED`. The failure condition takes precedence over the success condition. If both conditions are met, a failure will be indicated. This value is optional; if no failure condition is set, the only failure scenario will be a timeout.
     * 
     */
    @Export(name="failure", type=EndConditionResponse.class, parameters={})
    private Output<EndConditionResponse> failure;

    /**
     * @return [Optional] The failure condition of this waiter. If this condition is met, `done` will be set to `true` and the `error` code will be set to `ABORTED`. The failure condition takes precedence over the success condition. If both conditions are met, a failure will be indicated. This value is optional; if no failure condition is set, the only failure scenario will be a timeout.
     * 
     */
    public Output<EndConditionResponse> failure() {
        return this.failure;
    }
    /**
     * The name of the Waiter resource, in the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME]/waiters/[WAITER_NAME] The `[PROJECT_ID]` must be a valid Google Cloud project ID, the `[CONFIG_NAME]` must be a valid RuntimeConfig resource, the `[WAITER_NAME]` must match RFC 1035 segment specification, and the length of `[WAITER_NAME]` must be less than 64 bytes. After you create a Waiter resource, you cannot change the resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Waiter resource, in the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME]/waiters/[WAITER_NAME] The `[PROJECT_ID]` must be a valid Google Cloud project ID, the `[CONFIG_NAME]` must be a valid RuntimeConfig resource, the `[WAITER_NAME]` must match RFC 1035 segment specification, and the length of `[WAITER_NAME]` must be less than 64 bytes. After you create a Waiter resource, you cannot change the resource name.
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
     * An optional but recommended unique `request_id`. If the server receives two `create()` requests with the same `request_id`, then the second request will be ignored and the first resource created and stored in the backend is returned. Empty `request_id` fields are ignored. It is responsibility of the client to ensure uniqueness of the `request_id` strings. `request_id` strings are limited to 64 characters.
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return An optional but recommended unique `request_id`. If the server receives two `create()` requests with the same `request_id`, then the second request will be ignored and the first resource created and stored in the backend is returned. Empty `request_id` fields are ignored. It is responsibility of the client to ensure uniqueness of the `request_id` strings. `request_id` strings are limited to 64 characters.
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * [Required] The success condition. If this condition is met, `done` will be set to `true` and the `error` value will remain unset. The failure condition takes precedence over the success condition. If both conditions are met, a failure will be indicated.
     * 
     */
    @Export(name="success", type=EndConditionResponse.class, parameters={})
    private Output<EndConditionResponse> success;

    /**
     * @return [Required] The success condition. If this condition is met, `done` will be set to `true` and the `error` value will remain unset. The failure condition takes precedence over the success condition. If both conditions are met, a failure will be indicated.
     * 
     */
    public Output<EndConditionResponse> success() {
        return this.success;
    }
    /**
     * [Required] Specifies the timeout of the waiter in seconds, beginning from the instant that `waiters().create` method is called. If this time elapses before the success or failure conditions are met, the waiter fails and sets the `error` code to `DEADLINE_EXCEEDED`.
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return [Required] Specifies the timeout of the waiter in seconds, beginning from the instant that `waiters().create` method is called. If this time elapses before the success or failure conditions are met, the waiter fails and sets the `error` code to `DEADLINE_EXCEEDED`.
     * 
     */
    public Output<String> timeout() {
        return this.timeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Waiter(String name) {
        this(name, WaiterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Waiter(String name, WaiterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Waiter(String name, WaiterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:runtimeconfig/v1beta1:Waiter", name, args == null ? WaiterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Waiter(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:runtimeconfig/v1beta1:Waiter", name, null, makeResourceOptions(options, id));
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
    public static Waiter get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Waiter(name, id, options);
    }
}