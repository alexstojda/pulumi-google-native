// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The content of an HL7v2 message in a structured format as specified by a schema.
 * 
 */
public final class SchematizedDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchematizedDataArgs Empty = new SchematizedDataArgs();

    /**
     * JSON output of the parser.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    /**
     * @return JSON output of the parser.
     * 
     */
    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * The error output of the parser.
     * 
     */
    @Import(name="error")
    private @Nullable Output<String> error;

    /**
     * @return The error output of the parser.
     * 
     */
    public Optional<Output<String>> error() {
        return Optional.ofNullable(this.error);
    }

    private SchematizedDataArgs() {}

    private SchematizedDataArgs(SchematizedDataArgs $) {
        this.data = $.data;
        this.error = $.error;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchematizedDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchematizedDataArgs $;

        public Builder() {
            $ = new SchematizedDataArgs();
        }

        public Builder(SchematizedDataArgs defaults) {
            $ = new SchematizedDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param data JSON output of the parser.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data JSON output of the parser.
         * 
         * @return builder
         * 
         */
        public Builder data(String data) {
            return data(Output.of(data));
        }

        /**
         * @param error The error output of the parser.
         * 
         * @return builder
         * 
         */
        public Builder error(@Nullable Output<String> error) {
            $.error = error;
            return this;
        }

        /**
         * @param error The error output of the parser.
         * 
         * @return builder
         * 
         */
        public Builder error(String error) {
            return error(Output.of(error));
        }

        public SchematizedDataArgs build() {
            return $;
        }
    }

}