// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An **entity entry** for an associated entity type.
 * 
 */
public final class GoogleCloudDialogflowV2EntityTypeEntityArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2EntityTypeEntityArgs Empty = new GoogleCloudDialogflowV2EntityTypeEntityArgs();

    /**
     * A collection of value synonyms. For example, if the entity type is *vegetable*, and `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This collection must contain exactly one synonym equal to `value`.
     * 
     */
    @Import(name="synonyms", required=true)
    private Output<List<String>> synonyms;

    /**
     * @return A collection of value synonyms. For example, if the entity type is *vegetable*, and `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This collection must contain exactly one synonym equal to `value`.
     * 
     */
    public Output<List<String>> synonyms() {
        return this.synonyms;
    }

    /**
     * The primary value associated with this entity entry. For example, if the entity type is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A reference value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can contain references to other entity types (with or without aliases).
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The primary value associated with this entity entry. For example, if the entity type is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A reference value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can contain references to other entity types (with or without aliases).
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private GoogleCloudDialogflowV2EntityTypeEntityArgs() {}

    private GoogleCloudDialogflowV2EntityTypeEntityArgs(GoogleCloudDialogflowV2EntityTypeEntityArgs $) {
        this.synonyms = $.synonyms;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2EntityTypeEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2EntityTypeEntityArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2EntityTypeEntityArgs();
        }

        public Builder(GoogleCloudDialogflowV2EntityTypeEntityArgs defaults) {
            $ = new GoogleCloudDialogflowV2EntityTypeEntityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param synonyms A collection of value synonyms. For example, if the entity type is *vegetable*, and `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This collection must contain exactly one synonym equal to `value`.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(Output<List<String>> synonyms) {
            $.synonyms = synonyms;
            return this;
        }

        /**
         * @param synonyms A collection of value synonyms. For example, if the entity type is *vegetable*, and `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This collection must contain exactly one synonym equal to `value`.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(List<String> synonyms) {
            return synonyms(Output.of(synonyms));
        }

        /**
         * @param synonyms A collection of value synonyms. For example, if the entity type is *vegetable*, and `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This collection must contain exactly one synonym equal to `value`.
         * 
         * @return builder
         * 
         */
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }

        /**
         * @param value The primary value associated with this entity entry. For example, if the entity type is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A reference value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can contain references to other entity types (with or without aliases).
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The primary value associated with this entity entry. For example, if the entity type is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A reference value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can contain references to other entity types (with or without aliases).
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GoogleCloudDialogflowV2EntityTypeEntityArgs build() {
            $.synonyms = Objects.requireNonNull($.synonyms, "expected parameter 'synonyms' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}