// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare.v1beta1.enums.AttributeDefinitionCategory;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttributeDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttributeDefinitionArgs Empty = new AttributeDefinitionArgs();

    /**
     * Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
     * 
     */
    @Import(name="allowedValues", required=true)
    private Output<List<String>> allowedValues;

    /**
     * @return Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
     * 
     */
    public Output<List<String>> allowedValues() {
        return this.allowedValues;
    }

    /**
     * Required. The ID of the Attribute definition to create. The string must match the following regex: `_a-zA-Z{0,255}` and must not be a reserved keyword within the Common Expression Language as listed on https://github.com/google/cel-spec/blob/master/doc/langdef.md.
     * 
     */
    @Import(name="attributeDefinitionId", required=true)
    private Output<String> attributeDefinitionId;

    /**
     * @return Required. The ID of the Attribute definition to create. The string must match the following regex: `_a-zA-Z{0,255}` and must not be a reserved keyword within the Common Expression Language as listed on https://github.com/google/cel-spec/blob/master/doc/langdef.md.
     * 
     */
    public Output<String> attributeDefinitionId() {
        return this.attributeDefinitionId;
    }

    /**
     * The category of the attribute. The value of this field cannot be changed after creation.
     * 
     */
    @Import(name="category", required=true)
    private Output<AttributeDefinitionCategory> category;

    /**
     * @return The category of the attribute. The value of this field cannot be changed after creation.
     * 
     */
    public Output<AttributeDefinitionCategory> category() {
        return this.category;
    }

    /**
     * Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
     * 
     */
    @Import(name="consentDefaultValues")
    private @Nullable Output<List<String>> consentDefaultValues;

    /**
     * @return Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
     * 
     */
    public Optional<Output<List<String>>> consentDefaultValues() {
        return Optional.ofNullable(this.consentDefaultValues);
    }

    @Import(name="consentStoreId", required=true)
    private Output<String> consentStoreId;

    public Output<String> consentStoreId() {
        return this.consentStoreId;
    }

    /**
     * Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
     * 
     */
    @Import(name="dataMappingDefaultValue")
    private @Nullable Output<String> dataMappingDefaultValue;

    /**
     * @return Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
     * 
     */
    public Optional<Output<String>> dataMappingDefaultValue() {
        return Optional.ofNullable(this.dataMappingDefaultValue);
    }

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * Optional. A description of the attribute.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. A description of the attribute.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
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

    private AttributeDefinitionArgs() {}

    private AttributeDefinitionArgs(AttributeDefinitionArgs $) {
        this.allowedValues = $.allowedValues;
        this.attributeDefinitionId = $.attributeDefinitionId;
        this.category = $.category;
        this.consentDefaultValues = $.consentDefaultValues;
        this.consentStoreId = $.consentStoreId;
        this.dataMappingDefaultValue = $.dataMappingDefaultValue;
        this.datasetId = $.datasetId;
        this.description = $.description;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttributeDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttributeDefinitionArgs $;

        public Builder() {
            $ = new AttributeDefinitionArgs();
        }

        public Builder(AttributeDefinitionArgs defaults) {
            $ = new AttributeDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedValues Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
         * 
         * @return builder
         * 
         */
        public Builder allowedValues(Output<List<String>> allowedValues) {
            $.allowedValues = allowedValues;
            return this;
        }

        /**
         * @param allowedValues Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
         * 
         * @return builder
         * 
         */
        public Builder allowedValues(List<String> allowedValues) {
            return allowedValues(Output.of(allowedValues));
        }

        /**
         * @param allowedValues Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
         * 
         * @return builder
         * 
         */
        public Builder allowedValues(String... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }

        /**
         * @param attributeDefinitionId Required. The ID of the Attribute definition to create. The string must match the following regex: `_a-zA-Z{0,255}` and must not be a reserved keyword within the Common Expression Language as listed on https://github.com/google/cel-spec/blob/master/doc/langdef.md.
         * 
         * @return builder
         * 
         */
        public Builder attributeDefinitionId(Output<String> attributeDefinitionId) {
            $.attributeDefinitionId = attributeDefinitionId;
            return this;
        }

        /**
         * @param attributeDefinitionId Required. The ID of the Attribute definition to create. The string must match the following regex: `_a-zA-Z{0,255}` and must not be a reserved keyword within the Common Expression Language as listed on https://github.com/google/cel-spec/blob/master/doc/langdef.md.
         * 
         * @return builder
         * 
         */
        public Builder attributeDefinitionId(String attributeDefinitionId) {
            return attributeDefinitionId(Output.of(attributeDefinitionId));
        }

        /**
         * @param category The category of the attribute. The value of this field cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder category(Output<AttributeDefinitionCategory> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category of the attribute. The value of this field cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder category(AttributeDefinitionCategory category) {
            return category(Output.of(category));
        }

        /**
         * @param consentDefaultValues Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
         * 
         * @return builder
         * 
         */
        public Builder consentDefaultValues(@Nullable Output<List<String>> consentDefaultValues) {
            $.consentDefaultValues = consentDefaultValues;
            return this;
        }

        /**
         * @param consentDefaultValues Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
         * 
         * @return builder
         * 
         */
        public Builder consentDefaultValues(List<String> consentDefaultValues) {
            return consentDefaultValues(Output.of(consentDefaultValues));
        }

        /**
         * @param consentDefaultValues Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
         * 
         * @return builder
         * 
         */
        public Builder consentDefaultValues(String... consentDefaultValues) {
            return consentDefaultValues(List.of(consentDefaultValues));
        }

        public Builder consentStoreId(Output<String> consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            return consentStoreId(Output.of(consentStoreId));
        }

        /**
         * @param dataMappingDefaultValue Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder dataMappingDefaultValue(@Nullable Output<String> dataMappingDefaultValue) {
            $.dataMappingDefaultValue = dataMappingDefaultValue;
            return this;
        }

        /**
         * @param dataMappingDefaultValue Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder dataMappingDefaultValue(String dataMappingDefaultValue) {
            return dataMappingDefaultValue(Output.of(dataMappingDefaultValue));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param description Optional. A description of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. A description of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
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

        public AttributeDefinitionArgs build() {
            $.allowedValues = Objects.requireNonNull($.allowedValues, "expected parameter 'allowedValues' to be non-null");
            $.attributeDefinitionId = Objects.requireNonNull($.attributeDefinitionId, "expected parameter 'attributeDefinitionId' to be non-null");
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            $.consentStoreId = Objects.requireNonNull($.consentStoreId, "expected parameter 'consentStoreId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            return $;
        }
    }

}