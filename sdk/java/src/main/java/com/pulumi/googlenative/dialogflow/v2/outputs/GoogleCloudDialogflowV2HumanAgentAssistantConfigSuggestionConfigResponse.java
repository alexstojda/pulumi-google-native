// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v2.outputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse {
    /**
     * @return Configuration of different suggestion features. One feature can have only one config.
     * 
     */
    private List<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse> featureConfigs;
    /**
     * @return If `group_suggestion_responses` is false, and there are multiple `feature_configs` in `event based suggestion` or StreamingAnalyzeContent, we will try to deliver suggestions to customers as soon as we get new suggestion. Different type of suggestions based on the same context will be in separate Pub/Sub event or `StreamingAnalyzeContentResponse`. If `group_suggestion_responses` set to true. All the suggestions to the same participant based on the same context will be grouped into a single Pub/Sub event or StreamingAnalyzeContentResponse.
     * 
     */
    private Boolean groupSuggestionResponses;

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse() {}
    /**
     * @return Configuration of different suggestion features. One feature can have only one config.
     * 
     */
    public List<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse> featureConfigs() {
        return this.featureConfigs;
    }
    /**
     * @return If `group_suggestion_responses` is false, and there are multiple `feature_configs` in `event based suggestion` or StreamingAnalyzeContent, we will try to deliver suggestions to customers as soon as we get new suggestion. Different type of suggestions based on the same context will be in separate Pub/Sub event or `StreamingAnalyzeContentResponse`. If `group_suggestion_responses` set to true. All the suggestions to the same participant based on the same context will be grouped into a single Pub/Sub event or StreamingAnalyzeContentResponse.
     * 
     */
    public Boolean groupSuggestionResponses() {
        return this.groupSuggestionResponses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse> featureConfigs;
        private Boolean groupSuggestionResponses;
        public Builder() {}
        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureConfigs = defaults.featureConfigs;
    	      this.groupSuggestionResponses = defaults.groupSuggestionResponses;
        }

        @CustomType.Setter
        public Builder featureConfigs(List<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse> featureConfigs) {
            this.featureConfigs = Objects.requireNonNull(featureConfigs);
            return this;
        }
        public Builder featureConfigs(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse... featureConfigs) {
            return featureConfigs(List.of(featureConfigs));
        }
        @CustomType.Setter
        public Builder groupSuggestionResponses(Boolean groupSuggestionResponses) {
            this.groupSuggestionResponses = Objects.requireNonNull(groupSuggestionResponses);
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse build() {
            final var o = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse();
            o.featureConfigs = featureConfigs;
            o.groupSuggestionResponses = groupSuggestionResponses;
            return o;
        }
    }
}