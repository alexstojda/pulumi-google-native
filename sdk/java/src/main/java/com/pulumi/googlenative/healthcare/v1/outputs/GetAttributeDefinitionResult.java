// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAttributeDefinitionResult {
    /**
     * @return Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
     * 
     */
    private List<String> allowedValues;
    /**
     * @return The category of the attribute. The value of this field cannot be changed after creation.
     * 
     */
    private String category;
    /**
     * @return Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
     * 
     */
    private List<String> consentDefaultValues;
    /**
     * @return Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
     * 
     */
    private String dataMappingDefaultValue;
    /**
     * @return Optional. A description of the attribute.
     * 
     */
    private String description;
    /**
     * @return Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
     * 
     */
    private String name;

    private GetAttributeDefinitionResult() {}
    /**
     * @return Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
     * 
     */
    public List<String> allowedValues() {
        return this.allowedValues;
    }
    /**
     * @return The category of the attribute. The value of this field cannot be changed after creation.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
     * 
     */
    public List<String> consentDefaultValues() {
        return this.consentDefaultValues;
    }
    /**
     * @return Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
     * 
     */
    public String dataMappingDefaultValue() {
        return this.dataMappingDefaultValue;
    }
    /**
     * @return Optional. A description of the attribute.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttributeDefinitionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedValues;
        private String category;
        private List<String> consentDefaultValues;
        private String dataMappingDefaultValue;
        private String description;
        private String name;
        public Builder() {}
        public Builder(GetAttributeDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.category = defaults.category;
    	      this.consentDefaultValues = defaults.consentDefaultValues;
    	      this.dataMappingDefaultValue = defaults.dataMappingDefaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder allowedValues(List<String> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }
        public Builder allowedValues(String... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }
        @CustomType.Setter
        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        @CustomType.Setter
        public Builder consentDefaultValues(List<String> consentDefaultValues) {
            this.consentDefaultValues = Objects.requireNonNull(consentDefaultValues);
            return this;
        }
        public Builder consentDefaultValues(String... consentDefaultValues) {
            return consentDefaultValues(List.of(consentDefaultValues));
        }
        @CustomType.Setter
        public Builder dataMappingDefaultValue(String dataMappingDefaultValue) {
            this.dataMappingDefaultValue = Objects.requireNonNull(dataMappingDefaultValue);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetAttributeDefinitionResult build() {
            final var o = new GetAttributeDefinitionResult();
            o.allowedValues = allowedValues;
            o.category = category;
            o.consentDefaultValues = consentDefaultValues;
            o.dataMappingDefaultValue = dataMappingDefaultValue;
            o.description = description;
            o.name = name;
            return o;
        }
    }
}