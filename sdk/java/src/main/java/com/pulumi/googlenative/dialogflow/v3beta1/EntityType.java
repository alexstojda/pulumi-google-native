// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow.v3beta1.EntityTypeArgs;
import com.pulumi.googlenative.dialogflow.v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse;
import com.pulumi.googlenative.dialogflow.v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates an entity type in the specified agent.
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:EntityType")
public class EntityType extends com.pulumi.resources.CustomResource {
    @Export(name="agentId", type=String.class, parameters={})
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * Indicates whether the entity type can be automatically expanded.
     * 
     */
    @Export(name="autoExpansionMode", type=String.class, parameters={})
    private Output<String> autoExpansionMode;

    /**
     * @return Indicates whether the entity type can be automatically expanded.
     * 
     */
    public Output<String> autoExpansionMode() {
        return this.autoExpansionMode;
    }
    /**
     * The human-readable name of the entity type, unique within the agent.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the entity type, unique within the agent.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Enables fuzzy entity extraction during classification.
     * 
     */
    @Export(name="enableFuzzyExtraction", type=Boolean.class, parameters={})
    private Output<Boolean> enableFuzzyExtraction;

    /**
     * @return Enables fuzzy entity extraction during classification.
     * 
     */
    public Output<Boolean> enableFuzzyExtraction() {
        return this.enableFuzzyExtraction;
    }
    /**
     * The collection of entity entries associated with the entity type.
     * 
     */
    @Export(name="entities", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse>> entities;

    /**
     * @return The collection of entity entries associated with the entity type.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse>> entities() {
        return this.entities;
    }
    /**
     * Collection of exceptional words and phrases that shouldn&#39;t be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * 
     */
    @Export(name="excludedPhrases", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse>> excludedPhrases;

    /**
     * @return Collection of exceptional words and phrases that shouldn&#39;t be matched. For example, if you have a size entity type with entry `giant`(an adjective), you might consider adding `giants`(a noun) as an exclusion. If the kind of entity type is `KIND_MAP`, then the phrases specified by entities and excluded phrases should be mutually exclusive.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeExcludedPhraseResponse>> excludedPhrases() {
        return this.excludedPhrases;
    }
    /**
     * Indicates the kind of entity type.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Indicates the kind of entity type.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The language of the following fields in `entity_type`: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> languageCode;

    /**
     * @return The language of the following fields in `entity_type`: * `EntityType.entities.value` * `EntityType.entities.synonyms` * `EntityType.excluded_phrases.value` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Output<Optional<String>> languageCode() {
        return Codegen.optional(this.languageCode);
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType. Format: `projects//locations//agents//entityTypes/`.
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
     * Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
     * 
     */
    @Export(name="redact", type=Boolean.class, parameters={})
    private Output<Boolean> redact;

    /**
     * @return Indicates whether parameters of the entity type should be redacted in log. If redaction is enabled, page parameters and intent parameters referring to the entity type will be replaced by parameter name during logging.
     * 
     */
    public Output<Boolean> redact() {
        return this.redact;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EntityType(String name) {
        this(name, EntityTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EntityType(String name, EntityTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntityType(String name, EntityTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:EntityType", name, args == null ? EntityTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EntityType(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:EntityType", name, null, makeResourceOptions(options, id));
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
    public static EntityType get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EntityType(name, id, options);
    }
}