// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement.v1.enums.FieldCardinality;
import com.pulumi.googlenative.servicemanagement.v1.enums.FieldKind;
import com.pulumi.googlenative.servicemanagement.v1.inputs.OptionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A single field of a message type.
 * 
 */
public final class FieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final FieldArgs Empty = new FieldArgs();

    /**
     * The field cardinality.
     * 
     */
    @Import(name="cardinality")
    private @Nullable Output<FieldCardinality> cardinality;

    /**
     * @return The field cardinality.
     * 
     */
    public Optional<Output<FieldCardinality>> cardinality() {
        return Optional.ofNullable(this.cardinality);
    }

    /**
     * The string value of the default value of this field. Proto2 syntax only.
     * 
     */
    @Import(name="defaultValue")
    private @Nullable Output<String> defaultValue;

    /**
     * @return The string value of the default value of this field. Proto2 syntax only.
     * 
     */
    public Optional<Output<String>> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }

    /**
     * The field JSON name.
     * 
     */
    @Import(name="jsonName")
    private @Nullable Output<String> jsonName;

    /**
     * @return The field JSON name.
     * 
     */
    public Optional<Output<String>> jsonName() {
        return Optional.ofNullable(this.jsonName);
    }

    /**
     * The field type.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<FieldKind> kind;

    /**
     * @return The field type.
     * 
     */
    public Optional<Output<FieldKind>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The field name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The field name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The field number.
     * 
     */
    @Import(name="number")
    private @Nullable Output<Integer> number;

    /**
     * @return The field number.
     * 
     */
    public Optional<Output<Integer>> number() {
        return Optional.ofNullable(this.number);
    }

    /**
     * The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
     * 
     */
    @Import(name="oneofIndex")
    private @Nullable Output<Integer> oneofIndex;

    /**
     * @return The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
     * 
     */
    public Optional<Output<Integer>> oneofIndex() {
        return Optional.ofNullable(this.oneofIndex);
    }

    /**
     * The protocol buffer options.
     * 
     */
    @Import(name="options")
    private @Nullable Output<List<OptionArgs>> options;

    /**
     * @return The protocol buffer options.
     * 
     */
    public Optional<Output<List<OptionArgs>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Whether to use alternative packed wire representation.
     * 
     */
    @Import(name="packed")
    private @Nullable Output<Boolean> packed;

    /**
     * @return Whether to use alternative packed wire representation.
     * 
     */
    public Optional<Output<Boolean>> packed() {
        return Optional.ofNullable(this.packed);
    }

    /**
     * The field type URL, without the scheme, for message or enumeration types. Example: `&#34;type.googleapis.com/google.protobuf.Timestamp&#34;`.
     * 
     */
    @Import(name="typeUrl")
    private @Nullable Output<String> typeUrl;

    /**
     * @return The field type URL, without the scheme, for message or enumeration types. Example: `&#34;type.googleapis.com/google.protobuf.Timestamp&#34;`.
     * 
     */
    public Optional<Output<String>> typeUrl() {
        return Optional.ofNullable(this.typeUrl);
    }

    private FieldArgs() {}

    private FieldArgs(FieldArgs $) {
        this.cardinality = $.cardinality;
        this.defaultValue = $.defaultValue;
        this.jsonName = $.jsonName;
        this.kind = $.kind;
        this.name = $.name;
        this.number = $.number;
        this.oneofIndex = $.oneofIndex;
        this.options = $.options;
        this.packed = $.packed;
        this.typeUrl = $.typeUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldArgs $;

        public Builder() {
            $ = new FieldArgs();
        }

        public Builder(FieldArgs defaults) {
            $ = new FieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cardinality The field cardinality.
         * 
         * @return builder
         * 
         */
        public Builder cardinality(@Nullable Output<FieldCardinality> cardinality) {
            $.cardinality = cardinality;
            return this;
        }

        /**
         * @param cardinality The field cardinality.
         * 
         * @return builder
         * 
         */
        public Builder cardinality(FieldCardinality cardinality) {
            return cardinality(Output.of(cardinality));
        }

        /**
         * @param defaultValue The string value of the default value of this field. Proto2 syntax only.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue The string value of the default value of this field. Proto2 syntax only.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        /**
         * @param jsonName The field JSON name.
         * 
         * @return builder
         * 
         */
        public Builder jsonName(@Nullable Output<String> jsonName) {
            $.jsonName = jsonName;
            return this;
        }

        /**
         * @param jsonName The field JSON name.
         * 
         * @return builder
         * 
         */
        public Builder jsonName(String jsonName) {
            return jsonName(Output.of(jsonName));
        }

        /**
         * @param kind The field type.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<FieldKind> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The field type.
         * 
         * @return builder
         * 
         */
        public Builder kind(FieldKind kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name The field name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The field name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param number The field number.
         * 
         * @return builder
         * 
         */
        public Builder number(@Nullable Output<Integer> number) {
            $.number = number;
            return this;
        }

        /**
         * @param number The field number.
         * 
         * @return builder
         * 
         */
        public Builder number(Integer number) {
            return number(Output.of(number));
        }

        /**
         * @param oneofIndex The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
         * 
         * @return builder
         * 
         */
        public Builder oneofIndex(@Nullable Output<Integer> oneofIndex) {
            $.oneofIndex = oneofIndex;
            return this;
        }

        /**
         * @param oneofIndex The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
         * 
         * @return builder
         * 
         */
        public Builder oneofIndex(Integer oneofIndex) {
            return oneofIndex(Output.of(oneofIndex));
        }

        /**
         * @param options The protocol buffer options.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<List<OptionArgs>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options The protocol buffer options.
         * 
         * @return builder
         * 
         */
        public Builder options(List<OptionArgs> options) {
            return options(Output.of(options));
        }

        /**
         * @param options The protocol buffer options.
         * 
         * @return builder
         * 
         */
        public Builder options(OptionArgs... options) {
            return options(List.of(options));
        }

        /**
         * @param packed Whether to use alternative packed wire representation.
         * 
         * @return builder
         * 
         */
        public Builder packed(@Nullable Output<Boolean> packed) {
            $.packed = packed;
            return this;
        }

        /**
         * @param packed Whether to use alternative packed wire representation.
         * 
         * @return builder
         * 
         */
        public Builder packed(Boolean packed) {
            return packed(Output.of(packed));
        }

        /**
         * @param typeUrl The field type URL, without the scheme, for message or enumeration types. Example: `&#34;type.googleapis.com/google.protobuf.Timestamp&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder typeUrl(@Nullable Output<String> typeUrl) {
            $.typeUrl = typeUrl;
            return this;
        }

        /**
         * @param typeUrl The field type URL, without the scheme, for message or enumeration types. Example: `&#34;type.googleapis.com/google.protobuf.Timestamp&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder typeUrl(String typeUrl) {
            return typeUrl(Output.of(typeUrl));
        }

        public FieldArgs build() {
            return $;
        }
    }

}