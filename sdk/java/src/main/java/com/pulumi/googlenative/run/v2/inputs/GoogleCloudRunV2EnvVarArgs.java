// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run.v2.inputs.GoogleCloudRunV2EnvVarSourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EnvVar represents an environment variable present in a Container.
 * 
 */
public final class GoogleCloudRunV2EnvVarArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunV2EnvVarArgs Empty = new GoogleCloudRunV2EnvVarArgs();

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER, and mnay not exceed 32768 characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the environment variable. Must be a C_IDENTIFIER, and mnay not exceed 32768 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;, and the maximum length is 32768 bytes.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;, and the maximum length is 32768 bytes.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * Source for the environment variable&#39;s value.
     * 
     */
    @Import(name="valueSource")
    private @Nullable Output<GoogleCloudRunV2EnvVarSourceArgs> valueSource;

    /**
     * @return Source for the environment variable&#39;s value.
     * 
     */
    public Optional<Output<GoogleCloudRunV2EnvVarSourceArgs>> valueSource() {
        return Optional.ofNullable(this.valueSource);
    }

    private GoogleCloudRunV2EnvVarArgs() {}

    private GoogleCloudRunV2EnvVarArgs(GoogleCloudRunV2EnvVarArgs $) {
        this.name = $.name;
        this.value = $.value;
        this.valueSource = $.valueSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunV2EnvVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunV2EnvVarArgs $;

        public Builder() {
            $ = new GoogleCloudRunV2EnvVarArgs();
        }

        public Builder(GoogleCloudRunV2EnvVarArgs defaults) {
            $ = new GoogleCloudRunV2EnvVarArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the environment variable. Must be a C_IDENTIFIER, and mnay not exceed 32768 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the environment variable. Must be a C_IDENTIFIER, and mnay not exceed 32768 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;, and the maximum length is 32768 bytes.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;, and the maximum length is 32768 bytes.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueSource Source for the environment variable&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder valueSource(@Nullable Output<GoogleCloudRunV2EnvVarSourceArgs> valueSource) {
            $.valueSource = valueSource;
            return this;
        }

        /**
         * @param valueSource Source for the environment variable&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder valueSource(GoogleCloudRunV2EnvVarSourceArgs valueSource) {
            return valueSource(Output.of(valueSource));
        }

        public GoogleCloudRunV2EnvVarArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}