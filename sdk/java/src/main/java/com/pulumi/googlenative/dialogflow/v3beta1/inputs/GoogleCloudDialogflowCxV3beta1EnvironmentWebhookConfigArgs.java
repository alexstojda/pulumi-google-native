// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v3beta1.inputs.GoogleCloudDialogflowCxV3beta1WebhookArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for webhooks.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs Empty = new GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs();

    /**
     * The list of webhooks to override for the agent environment. The webhook must exist in the agent. You can override fields in `generic_web_service` and `service_directory`.
     * 
     */
    @Import(name="webhookOverrides")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1WebhookArgs>> webhookOverrides;

    /**
     * @return The list of webhooks to override for the agent environment. The webhook must exist in the agent. You can override fields in `generic_web_service` and `service_directory`.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3beta1WebhookArgs>>> webhookOverrides() {
        return Optional.ofNullable(this.webhookOverrides);
    }

    private GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs() {}

    private GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs(GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs $) {
        this.webhookOverrides = $.webhookOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param webhookOverrides The list of webhooks to override for the agent environment. The webhook must exist in the agent. You can override fields in `generic_web_service` and `service_directory`.
         * 
         * @return builder
         * 
         */
        public Builder webhookOverrides(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1WebhookArgs>> webhookOverrides) {
            $.webhookOverrides = webhookOverrides;
            return this;
        }

        /**
         * @param webhookOverrides The list of webhooks to override for the agent environment. The webhook must exist in the agent. You can override fields in `generic_web_service` and `service_directory`.
         * 
         * @return builder
         * 
         */
        public Builder webhookOverrides(List<GoogleCloudDialogflowCxV3beta1WebhookArgs> webhookOverrides) {
            return webhookOverrides(Output.of(webhookOverrides));
        }

        /**
         * @param webhookOverrides The list of webhooks to override for the agent environment. The webhook must exist in the agent. You can override fields in `generic_web_service` and `service_directory`.
         * 
         * @return builder
         * 
         */
        public Builder webhookOverrides(GoogleCloudDialogflowCxV3beta1WebhookArgs... webhookOverrides) {
            return webhookOverrides(List.of(webhookOverrides));
        }

        public GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfigArgs build() {
            return $;
        }
    }

}