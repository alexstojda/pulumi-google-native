// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement.v1.enums.MethodSyntax;
import com.pulumi.googlenative.servicemanagement.v1.inputs.OptionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Method represents a method of an API interface.
 * 
 */
public final class MethodArgs extends com.pulumi.resources.ResourceArgs {

    public static final MethodArgs Empty = new MethodArgs();

    /**
     * The simple name of this method.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The simple name of this method.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Any metadata attached to the method.
     * 
     */
    @Import(name="options")
    private @Nullable Output<List<OptionArgs>> options;

    /**
     * @return Any metadata attached to the method.
     * 
     */
    public Optional<Output<List<OptionArgs>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * If true, the request is streamed.
     * 
     */
    @Import(name="requestStreaming")
    private @Nullable Output<Boolean> requestStreaming;

    /**
     * @return If true, the request is streamed.
     * 
     */
    public Optional<Output<Boolean>> requestStreaming() {
        return Optional.ofNullable(this.requestStreaming);
    }

    /**
     * A URL of the input message type.
     * 
     */
    @Import(name="requestTypeUrl")
    private @Nullable Output<String> requestTypeUrl;

    /**
     * @return A URL of the input message type.
     * 
     */
    public Optional<Output<String>> requestTypeUrl() {
        return Optional.ofNullable(this.requestTypeUrl);
    }

    /**
     * If true, the response is streamed.
     * 
     */
    @Import(name="responseStreaming")
    private @Nullable Output<Boolean> responseStreaming;

    /**
     * @return If true, the response is streamed.
     * 
     */
    public Optional<Output<Boolean>> responseStreaming() {
        return Optional.ofNullable(this.responseStreaming);
    }

    /**
     * The URL of the output message type.
     * 
     */
    @Import(name="responseTypeUrl")
    private @Nullable Output<String> responseTypeUrl;

    /**
     * @return The URL of the output message type.
     * 
     */
    public Optional<Output<String>> responseTypeUrl() {
        return Optional.ofNullable(this.responseTypeUrl);
    }

    /**
     * The source syntax of this method.
     * 
     */
    @Import(name="syntax")
    private @Nullable Output<MethodSyntax> syntax;

    /**
     * @return The source syntax of this method.
     * 
     */
    public Optional<Output<MethodSyntax>> syntax() {
        return Optional.ofNullable(this.syntax);
    }

    private MethodArgs() {}

    private MethodArgs(MethodArgs $) {
        this.name = $.name;
        this.options = $.options;
        this.requestStreaming = $.requestStreaming;
        this.requestTypeUrl = $.requestTypeUrl;
        this.responseStreaming = $.responseStreaming;
        this.responseTypeUrl = $.responseTypeUrl;
        this.syntax = $.syntax;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MethodArgs $;

        public Builder() {
            $ = new MethodArgs();
        }

        public Builder(MethodArgs defaults) {
            $ = new MethodArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The simple name of this method.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The simple name of this method.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param options Any metadata attached to the method.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<List<OptionArgs>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Any metadata attached to the method.
         * 
         * @return builder
         * 
         */
        public Builder options(List<OptionArgs> options) {
            return options(Output.of(options));
        }

        /**
         * @param options Any metadata attached to the method.
         * 
         * @return builder
         * 
         */
        public Builder options(OptionArgs... options) {
            return options(List.of(options));
        }

        /**
         * @param requestStreaming If true, the request is streamed.
         * 
         * @return builder
         * 
         */
        public Builder requestStreaming(@Nullable Output<Boolean> requestStreaming) {
            $.requestStreaming = requestStreaming;
            return this;
        }

        /**
         * @param requestStreaming If true, the request is streamed.
         * 
         * @return builder
         * 
         */
        public Builder requestStreaming(Boolean requestStreaming) {
            return requestStreaming(Output.of(requestStreaming));
        }

        /**
         * @param requestTypeUrl A URL of the input message type.
         * 
         * @return builder
         * 
         */
        public Builder requestTypeUrl(@Nullable Output<String> requestTypeUrl) {
            $.requestTypeUrl = requestTypeUrl;
            return this;
        }

        /**
         * @param requestTypeUrl A URL of the input message type.
         * 
         * @return builder
         * 
         */
        public Builder requestTypeUrl(String requestTypeUrl) {
            return requestTypeUrl(Output.of(requestTypeUrl));
        }

        /**
         * @param responseStreaming If true, the response is streamed.
         * 
         * @return builder
         * 
         */
        public Builder responseStreaming(@Nullable Output<Boolean> responseStreaming) {
            $.responseStreaming = responseStreaming;
            return this;
        }

        /**
         * @param responseStreaming If true, the response is streamed.
         * 
         * @return builder
         * 
         */
        public Builder responseStreaming(Boolean responseStreaming) {
            return responseStreaming(Output.of(responseStreaming));
        }

        /**
         * @param responseTypeUrl The URL of the output message type.
         * 
         * @return builder
         * 
         */
        public Builder responseTypeUrl(@Nullable Output<String> responseTypeUrl) {
            $.responseTypeUrl = responseTypeUrl;
            return this;
        }

        /**
         * @param responseTypeUrl The URL of the output message type.
         * 
         * @return builder
         * 
         */
        public Builder responseTypeUrl(String responseTypeUrl) {
            return responseTypeUrl(Output.of(responseTypeUrl));
        }

        /**
         * @param syntax The source syntax of this method.
         * 
         * @return builder
         * 
         */
        public Builder syntax(@Nullable Output<MethodSyntax> syntax) {
            $.syntax = syntax;
            return this;
        }

        /**
         * @param syntax The source syntax of this method.
         * 
         * @return builder
         * 
         */
        public Builder syntax(MethodSyntax syntax) {
            return syntax(Output.of(syntax));
        }

        public MethodArgs build() {
            return $;
        }
    }

}