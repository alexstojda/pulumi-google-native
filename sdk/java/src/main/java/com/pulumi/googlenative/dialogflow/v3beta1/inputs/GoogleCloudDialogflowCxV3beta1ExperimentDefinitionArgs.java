// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v3beta1.inputs.GoogleCloudDialogflowCxV3beta1VersionVariantsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the experiment.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs Empty = new GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs();

    /**
     * The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. &#34;query_input.language_code=en&#34; See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. &#34;query_input.language_code=en&#34; See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The flow versions as the variants of this experiment.
     * 
     */
    @Import(name="versionVariants")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1VersionVariantsArgs> versionVariants;

    /**
     * @return The flow versions as the variants of this experiment.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1VersionVariantsArgs>> versionVariants() {
        return Optional.ofNullable(this.versionVariants);
    }

    private GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs() {}

    private GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs(GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs $) {
        this.condition = $.condition;
        this.versionVariants = $.versionVariants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. &#34;query_input.language_code=en&#34; See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The condition defines which subset of sessions are selected for this experiment. If not specified, all sessions are eligible. E.g. &#34;query_input.language_code=en&#34; See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param versionVariants The flow versions as the variants of this experiment.
         * 
         * @return builder
         * 
         */
        public Builder versionVariants(@Nullable Output<GoogleCloudDialogflowCxV3beta1VersionVariantsArgs> versionVariants) {
            $.versionVariants = versionVariants;
            return this;
        }

        /**
         * @param versionVariants The flow versions as the variants of this experiment.
         * 
         * @return builder
         * 
         */
        public Builder versionVariants(GoogleCloudDialogflowCxV3beta1VersionVariantsArgs versionVariants) {
            return versionVariants(Output.of(versionVariants));
        }

        public GoogleCloudDialogflowCxV3beta1ExperimentDefinitionArgs build() {
            return $;
        }
    }

}