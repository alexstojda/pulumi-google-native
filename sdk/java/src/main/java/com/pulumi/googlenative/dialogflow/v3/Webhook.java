// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow.v3.WebhookArgs;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse;
import com.pulumi.googlenative.dialogflow.v3.outputs.GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a webhook in the specified agent.
 * 
 */
@ResourceType(type="google-native:dialogflow/v3:Webhook")
public class Webhook extends com.pulumi.resources.CustomResource {
    @Export(name="agentId", type=String.class, parameters={})
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * Indicates whether the webhook is disabled.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Indicates whether the webhook is disabled.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }
    /**
     * The human-readable name of the webhook, unique within the agent.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the webhook, unique within the agent.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Configuration for a generic web service.
     * 
     */
    @Export(name="genericWebService", type=GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse> genericWebService;

    /**
     * @return Configuration for a generic web service.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse> genericWebService() {
        return this.genericWebService;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
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
     * Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    @Export(name="serviceDirectory", type=GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse> serviceDirectory;

    /**
     * @return Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfigResponse> serviceDirectory() {
        return this.serviceDirectory;
    }
    /**
     * Webhook execution timeout. Execution is considered failed if Dialogflow doesn&#39;t receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return Webhook execution timeout. Execution is considered failed if Dialogflow doesn&#39;t receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
     * 
     */
    public Output<String> timeout() {
        return this.timeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Webhook(String name) {
        this(name, WebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Webhook(String name, WebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhook(String name, WebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Webhook(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3:Webhook", name, null, makeResourceOptions(options, id));
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
    public static Webhook get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, options);
    }
}