// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager.v2beta.enums.ValidationOptionsSchemaValidation;
import com.pulumi.googlenative.deploymentmanager.v2beta.enums.ValidationOptionsUndeclaredProperties;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Options for how to validate and process properties on a resource.
 * 
 */
public final class ValidationOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ValidationOptionsArgs Empty = new ValidationOptionsArgs();

    /**
     * Customize how deployment manager will validate the resource against schema errors.
     * 
     */
    @Import(name="schemaValidation")
    private @Nullable Output<ValidationOptionsSchemaValidation> schemaValidation;

    /**
     * @return Customize how deployment manager will validate the resource against schema errors.
     * 
     */
    public Optional<Output<ValidationOptionsSchemaValidation>> schemaValidation() {
        return Optional.ofNullable(this.schemaValidation);
    }

    /**
     * Specify what to do with extra properties when executing a request.
     * 
     */
    @Import(name="undeclaredProperties")
    private @Nullable Output<ValidationOptionsUndeclaredProperties> undeclaredProperties;

    /**
     * @return Specify what to do with extra properties when executing a request.
     * 
     */
    public Optional<Output<ValidationOptionsUndeclaredProperties>> undeclaredProperties() {
        return Optional.ofNullable(this.undeclaredProperties);
    }

    private ValidationOptionsArgs() {}

    private ValidationOptionsArgs(ValidationOptionsArgs $) {
        this.schemaValidation = $.schemaValidation;
        this.undeclaredProperties = $.undeclaredProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValidationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValidationOptionsArgs $;

        public Builder() {
            $ = new ValidationOptionsArgs();
        }

        public Builder(ValidationOptionsArgs defaults) {
            $ = new ValidationOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param schemaValidation Customize how deployment manager will validate the resource against schema errors.
         * 
         * @return builder
         * 
         */
        public Builder schemaValidation(@Nullable Output<ValidationOptionsSchemaValidation> schemaValidation) {
            $.schemaValidation = schemaValidation;
            return this;
        }

        /**
         * @param schemaValidation Customize how deployment manager will validate the resource against schema errors.
         * 
         * @return builder
         * 
         */
        public Builder schemaValidation(ValidationOptionsSchemaValidation schemaValidation) {
            return schemaValidation(Output.of(schemaValidation));
        }

        /**
         * @param undeclaredProperties Specify what to do with extra properties when executing a request.
         * 
         * @return builder
         * 
         */
        public Builder undeclaredProperties(@Nullable Output<ValidationOptionsUndeclaredProperties> undeclaredProperties) {
            $.undeclaredProperties = undeclaredProperties;
            return this;
        }

        /**
         * @param undeclaredProperties Specify what to do with extra properties when executing a request.
         * 
         * @return builder
         * 
         */
        public Builder undeclaredProperties(ValidationOptionsUndeclaredProperties undeclaredProperties) {
            return undeclaredProperties(Output.of(undeclaredProperties));
        }

        public ValidationOptionsArgs build() {
            return $;
        }
    }

}