// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a part of a training phrase.
 * 
 */
public final class GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs Empty = new GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs();

    /**
     * Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase.
     * 
     */
    @Import(name="entityType")
    private @Nullable Output<String> entityType;

    /**
     * @return Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase.
     * 
     */
    public Optional<Output<String>> entityType() {
        return Optional.ofNullable(this.entityType);
    }

    /**
     * The text for this part.
     * 
     */
    @Import(name="text", required=true)
    private Output<String> text;

    /**
     * @return The text for this part.
     * 
     */
    public Output<String> text() {
        return this.text;
    }

    /**
     * Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated part with the API, you must set this to true.
     * 
     */
    @Import(name="userDefined")
    private @Nullable Output<Boolean> userDefined;

    /**
     * @return Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated part with the API, you must set this to true.
     * 
     */
    public Optional<Output<Boolean>> userDefined() {
        return Optional.ofNullable(this.userDefined);
    }

    private GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs() {}

    private GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs(GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs $) {
        this.alias = $.alias;
        this.entityType = $.entityType;
        this.text = $.text;
        this.userDefined = $.userDefined;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param entityType Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase.
         * 
         * @return builder
         * 
         */
        public Builder entityType(@Nullable Output<String> entityType) {
            $.entityType = entityType;
            return this;
        }

        /**
         * @param entityType Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase.
         * 
         * @return builder
         * 
         */
        public Builder entityType(String entityType) {
            return entityType(Output.of(entityType));
        }

        /**
         * @param text The text for this part.
         * 
         * @return builder
         * 
         */
        public Builder text(Output<String> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text The text for this part.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            return text(Output.of(text));
        }

        /**
         * @param userDefined Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated part with the API, you must set this to true.
         * 
         * @return builder
         * 
         */
        public Builder userDefined(@Nullable Output<Boolean> userDefined) {
            $.userDefined = userDefined;
            return this;
        }

        /**
         * @param userDefined Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated part with the API, you must set this to true.
         * 
         * @return builder
         * 
         */
        public Builder userDefined(Boolean userDefined) {
            return userDefined(Output.of(userDefined));
        }

        public GoogleCloudDialogflowV2IntentTrainingPhrasePartArgs build() {
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}