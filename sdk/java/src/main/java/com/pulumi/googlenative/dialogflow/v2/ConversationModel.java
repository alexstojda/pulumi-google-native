// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow.v2.ConversationModelArgs;
import com.pulumi.googlenative.dialogflow.v2.outputs.GoogleCloudDialogflowV2ArticleSuggestionModelMetadataResponse;
import com.pulumi.googlenative.dialogflow.v2.outputs.GoogleCloudDialogflowV2InputDatasetResponse;
import com.pulumi.googlenative.dialogflow.v2.outputs.GoogleCloudDialogflowV2SmartReplyModelMetadataResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a model. This method is a [long-running operation](https://cloud.google.com/dialogflow/es/docs/how/long-running-operations). The returned `Operation` type has the following method-specific fields: - `metadata`: CreateConversationModelOperationMetadata - `response`: ConversationModel
 * 
 */
@ResourceType(type="google-native:dialogflow/v2:ConversationModel")
public class ConversationModel extends com.pulumi.resources.CustomResource {
    /**
     * Metadata for article suggestion models.
     * 
     */
    @Export(name="articleSuggestionModelMetadata", type=GoogleCloudDialogflowV2ArticleSuggestionModelMetadataResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2ArticleSuggestionModelMetadataResponse> articleSuggestionModelMetadata;

    /**
     * @return Metadata for article suggestion models.
     * 
     */
    public Output<GoogleCloudDialogflowV2ArticleSuggestionModelMetadataResponse> articleSuggestionModelMetadata() {
        return this.articleSuggestionModelMetadata;
    }
    /**
     * Creation time of this model.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation time of this model.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Datasets used to create model.
     * 
     */
    @Export(name="datasets", type=List.class, parameters={GoogleCloudDialogflowV2InputDatasetResponse.class})
    private Output<List<GoogleCloudDialogflowV2InputDatasetResponse>> datasets;

    /**
     * @return Datasets used to create model.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2InputDatasetResponse>> datasets() {
        return this.datasets;
    }
    /**
     * The display name of the model. At most 64 bytes long.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the model. At most 64 bytes long.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Language code for the conversation model. If not specified, the language is en-US. Language at ConversationModel should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output<String> languageCode;

    /**
     * @return Language code for the conversation model. If not specified, the language is en-US. Language at ConversationModel should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
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
     * ConversationModel resource name. Format: `projects//conversationModels/`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return ConversationModel resource name. Format: `projects//conversationModels/`
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
     * Metadata for smart reply models.
     * 
     */
    @Export(name="smartReplyModelMetadata", type=GoogleCloudDialogflowV2SmartReplyModelMetadataResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2SmartReplyModelMetadataResponse> smartReplyModelMetadata;

    /**
     * @return Metadata for smart reply models.
     * 
     */
    public Output<GoogleCloudDialogflowV2SmartReplyModelMetadataResponse> smartReplyModelMetadata() {
        return this.smartReplyModelMetadata;
    }
    /**
     * State of the model. A model can only serve prediction requests after it gets deployed.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the model. A model can only serve prediction requests after it gets deployed.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConversationModel(String name) {
        this(name, ConversationModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConversationModel(String name, ConversationModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConversationModel(String name, ConversationModelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:ConversationModel", name, args == null ? ConversationModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConversationModel(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:ConversationModel", name, null, makeResourceOptions(options, id));
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
    public static ConversationModel get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConversationModel(name, id, options);
    }
}