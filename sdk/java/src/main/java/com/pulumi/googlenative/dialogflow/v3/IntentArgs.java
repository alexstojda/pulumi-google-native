// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v3.inputs.GoogleCloudDialogflowCxV3IntentParameterArgs;
import com.pulumi.googlenative.dialogflow.v3.inputs.GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntentArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentArgs Empty = new IntentArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the intent, unique within the agent.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    @Import(name="isFallback")
    private @Nullable Output<Boolean> isFallback;

    /**
     * @return Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    public Optional<Output<Boolean>> isFallback() {
        return Optional.ofNullable(this.isFallback);
    }

    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The language of the following fields in `intent`: * `Intent.training_phrases.parts.text` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return The language of the following fields in `intent`: * `Intent.training_phrases.parts.text` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The collection of parameters associated with the intent.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3IntentParameterArgs>> parameters;

    /**
     * @return The collection of parameters associated with the intent.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3IntentParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * 
     */
    @Import(name="trainingPhrases")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs>> trainingPhrases;

    /**
     * @return The collection of training phrases the agent is trained on to identify the intent.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs>>> trainingPhrases() {
        return Optional.ofNullable(this.trainingPhrases);
    }

    private IntentArgs() {}

    private IntentArgs(IntentArgs $) {
        this.agentId = $.agentId;
        this.description = $.description;
        this.displayName = $.displayName;
        this.isFallback = $.isFallback;
        this.labels = $.labels;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.name = $.name;
        this.parameters = $.parameters;
        this.priority = $.priority;
        this.project = $.project;
        this.trainingPhrases = $.trainingPhrases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentArgs $;

        public Builder() {
            $ = new IntentArgs();
        }

        public Builder(IntentArgs defaults) {
            $ = new IntentArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param description Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The human-readable name of the intent, unique within the agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the intent, unique within the agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param isFallback Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
         * 
         * @return builder
         * 
         */
        public Builder isFallback(@Nullable Output<Boolean> isFallback) {
            $.isFallback = isFallback;
            return this;
        }

        /**
         * @param isFallback Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation. Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
         * 
         * @return builder
         * 
         */
        public Builder isFallback(Boolean isFallback) {
            return isFallback(Output.of(isFallback));
        }

        /**
         * @param labels The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes. Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param languageCode The language of the following fields in `intent`: * `Intent.training_phrases.parts.text` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode The language of the following fields in `intent`: * `Intent.training_phrases.parts.text` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique identifier of the intent. Required for the Intents.UpdateIntent method. Intents.CreateIntent populates the name automatically. Format: `projects//locations//agents//intents/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters The collection of parameters associated with the intent.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<GoogleCloudDialogflowCxV3IntentParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The collection of parameters associated with the intent.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<GoogleCloudDialogflowCxV3IntentParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters The collection of parameters associated with the intent.
         * 
         * @return builder
         * 
         */
        public Builder parameters(GoogleCloudDialogflowCxV3IntentParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param priority The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of this intent. Higher numbers represent higher priorities. - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the `Normal` priority in the console. - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
         * 
         * @return builder
         * 
         */
        public Builder trainingPhrases(@Nullable Output<List<GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs>> trainingPhrases) {
            $.trainingPhrases = trainingPhrases;
            return this;
        }

        /**
         * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
         * 
         * @return builder
         * 
         */
        public Builder trainingPhrases(List<GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs> trainingPhrases) {
            return trainingPhrases(Output.of(trainingPhrases));
        }

        /**
         * @param trainingPhrases The collection of training phrases the agent is trained on to identify the intent.
         * 
         * @return builder
         * 
         */
        public Builder trainingPhrases(GoogleCloudDialogflowCxV3IntentTrainingPhraseArgs... trainingPhrases) {
            return trainingPhrases(List.of(trainingPhrases));
        }

        public IntentArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}