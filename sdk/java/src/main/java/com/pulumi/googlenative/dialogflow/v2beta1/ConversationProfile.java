// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow.v2beta1.ConversationProfileArgs;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1LoggingConfigResponse;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1NotificationConfigResponse;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a conversation profile in the specified project. ConversationProfile.CreateTime and ConversationProfile.UpdateTime aren&#39;t populated in the response. You can retrieve them via GetConversationProfile API.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2beta1:ConversationProfile")
public class ConversationProfile extends com.pulumi.resources.CustomResource {
    /**
     * Configuration for an automated agent to use with this profile.
     * 
     */
    @Export(name="automatedAgentConfig", type=GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse> automatedAgentConfig;

    /**
     * @return Configuration for an automated agent to use with this profile.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse> automatedAgentConfig() {
        return this.automatedAgentConfig;
    }
    /**
     * Create time of the conversation profile.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Create time of the conversation profile.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Configuration for agent assistance to use with this profile.
     * 
     */
    @Export(name="humanAgentAssistantConfig", type=GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse> humanAgentAssistantConfig;

    /**
     * @return Configuration for agent assistance to use with this profile.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse> humanAgentAssistantConfig() {
        return this.humanAgentAssistantConfig;
    }
    /**
     * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Export(name="humanAgentHandoffConfig", type=GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse> humanAgentHandoffConfig;

    /**
     * @return Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse> humanAgentHandoffConfig() {
        return this.humanAgentHandoffConfig;
    }
    /**
     * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output<String> languageCode;

    /**
     * @return Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Configuration for logging conversation lifecycle events.
     * 
     */
    @Export(name="loggingConfig", type=GoogleCloudDialogflowV2beta1LoggingConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2beta1LoggingConfigResponse> loggingConfig;

    /**
     * @return Configuration for logging conversation lifecycle events.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1LoggingConfigResponse> loggingConfig() {
        return this.loggingConfig;
    }
    /**
     * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    @Export(name="newMessageEventNotificationConfig", type=GoogleCloudDialogflowV2beta1NotificationConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2beta1NotificationConfigResponse> newMessageEventNotificationConfig;

    /**
     * @return Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1NotificationConfigResponse> newMessageEventNotificationConfig() {
        return this.newMessageEventNotificationConfig;
    }
    /**
     * Configuration for publishing conversation lifecycle events.
     * 
     */
    @Export(name="notificationConfig", type=GoogleCloudDialogflowV2beta1NotificationConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2beta1NotificationConfigResponse> notificationConfig;

    /**
     * @return Configuration for publishing conversation lifecycle events.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1NotificationConfigResponse> notificationConfig() {
        return this.notificationConfig;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    @Export(name="securitySettings", type=String.class, parameters={})
    private Output<String> securitySettings;

    /**
     * @return Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    public Output<String> securitySettings() {
        return this.securitySettings;
    }
    /**
     * Settings for speech transcription.
     * 
     */
    @Export(name="sttConfig", type=GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse> sttConfig;

    /**
     * @return Settings for speech transcription.
     * 
     */
    public Output<GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse> sttConfig() {
        return this.sttConfig;
    }
    /**
     * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    @Export(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }
    /**
     * Update time of the conversation profile.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Update time of the conversation profile.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConversationProfile(String name) {
        this(name, ConversationProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConversationProfile(String name, ConversationProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConversationProfile(String name, ConversationProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2beta1:ConversationProfile", name, args == null ? ConversationProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConversationProfile(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2beta1:ConversationProfile", name, null, makeResourceOptions(options, id));
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
    public static ConversationProfile get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConversationProfile(name, id, options);
    }
}