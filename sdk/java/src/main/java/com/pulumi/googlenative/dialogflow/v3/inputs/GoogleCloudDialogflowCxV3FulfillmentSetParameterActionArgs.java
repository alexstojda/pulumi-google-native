// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Setting a parameter value.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs Empty = new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs();

    /**
     * Display name of the parameter.
     * 
     */
    @Import(name="parameter")
    private @Nullable Output<String> parameter;

    /**
     * @return Display name of the parameter.
     * 
     */
    public Optional<Output<String>> parameter() {
        return Optional.ofNullable(this.parameter);
    }

    /**
     * The new value of the parameter. A null value clears the parameter.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Object> value;

    /**
     * @return The new value of the parameter. A null value clears the parameter.
     * 
     */
    public Optional<Output<Object>> value() {
        return Optional.ofNullable(this.value);
    }

    private GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs() {}

    private GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs $) {
        this.parameter = $.parameter;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameter Display name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameter(@Nullable Output<String> parameter) {
            $.parameter = parameter;
            return this;
        }

        /**
         * @param parameter Display name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameter(String parameter) {
            return parameter(Output.of(parameter));
        }

        /**
         * @param value The new value of the parameter. A null value clears the parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Object> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The new value of the parameter. A null value clears the parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(Object value) {
            return value(Output.of(value));
        }

        public GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs build() {
            return $;
        }
    }

}