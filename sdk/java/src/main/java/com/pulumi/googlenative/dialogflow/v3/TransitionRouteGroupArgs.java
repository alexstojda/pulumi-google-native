// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v3.inputs.GoogleCloudDialogflowCxV3TransitionRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitionRouteGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitionRouteGroupArgs Empty = new TransitionRouteGroupArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    /**
     * The human-readable name of the transition route group, unique within the flow. The display name can be no longer than 30 characters.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the transition route group, unique within the flow. The display name can be no longer than 30 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="flowId", required=true)
    private Output<String> flowId;

    public Output<String> flowId() {
        return this.flowId;
    }

    /**
     * The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
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
     * The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Transition routes associated with the TransitionRouteGroup.
     * 
     */
    @Import(name="transitionRoutes")
    private @Nullable Output<List<GoogleCloudDialogflowCxV3TransitionRouteArgs>> transitionRoutes;

    /**
     * @return Transition routes associated with the TransitionRouteGroup.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowCxV3TransitionRouteArgs>>> transitionRoutes() {
        return Optional.ofNullable(this.transitionRoutes);
    }

    private TransitionRouteGroupArgs() {}

    private TransitionRouteGroupArgs(TransitionRouteGroupArgs $) {
        this.agentId = $.agentId;
        this.displayName = $.displayName;
        this.flowId = $.flowId;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.transitionRoutes = $.transitionRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitionRouteGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitionRouteGroupArgs $;

        public Builder() {
            $ = new TransitionRouteGroupArgs();
        }

        public Builder(TransitionRouteGroupArgs defaults) {
            $ = new TransitionRouteGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        /**
         * @param displayName The human-readable name of the transition route group, unique within the flow. The display name can be no longer than 30 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the transition route group, unique within the flow. The display name can be no longer than 30 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder flowId(Output<String> flowId) {
            $.flowId = flowId;
            return this;
        }

        public Builder flowId(String flowId) {
            return flowId(Output.of(flowId));
        }

        /**
         * @param languageCode The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode The language of the following fields in `TransitionRouteGroup`: * `TransitionRouteGroup.transition_routes.trigger_fulfillment.messages` * `TransitionRouteGroup.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
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
         * @param name The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique identifier of the transition route group. TransitionRouteGroups.CreateTransitionRouteGroup populates the name automatically. Format: `projects//locations//agents//flows//transitionRouteGroups/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param transitionRoutes Transition routes associated with the TransitionRouteGroup.
         * 
         * @return builder
         * 
         */
        public Builder transitionRoutes(@Nullable Output<List<GoogleCloudDialogflowCxV3TransitionRouteArgs>> transitionRoutes) {
            $.transitionRoutes = transitionRoutes;
            return this;
        }

        /**
         * @param transitionRoutes Transition routes associated with the TransitionRouteGroup.
         * 
         * @return builder
         * 
         */
        public Builder transitionRoutes(List<GoogleCloudDialogflowCxV3TransitionRouteArgs> transitionRoutes) {
            return transitionRoutes(Output.of(transitionRoutes));
        }

        /**
         * @param transitionRoutes Transition routes associated with the TransitionRouteGroup.
         * 
         * @return builder
         * 
         */
        public Builder transitionRoutes(GoogleCloudDialogflowCxV3TransitionRouteArgs... transitionRoutes) {
            return transitionRoutes(List.of(transitionRoutes));
        }

        public TransitionRouteGroupArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.flowId = Objects.requireNonNull($.flowId, "expected parameter 'flowId' to be non-null");
            return $;
        }
    }

}