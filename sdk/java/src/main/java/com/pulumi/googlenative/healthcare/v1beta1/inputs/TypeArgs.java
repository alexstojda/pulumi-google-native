// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare.v1beta1.enums.TypePrimitive;
import com.pulumi.googlenative.healthcare.v1beta1.inputs.FieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A type definition for some HL7v2 type (incl. Segments and Datatypes).
 * 
 */
public final class TypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final TypeArgs Empty = new TypeArgs();

    /**
     * The (sub) fields this type has (if not primitive).
     * 
     */
    @Import(name="fields")
    private @Nullable Output<List<FieldArgs>> fields;

    /**
     * @return The (sub) fields this type has (if not primitive).
     * 
     */
    public Optional<Output<List<FieldArgs>>> fields() {
        return Optional.ofNullable(this.fields);
    }

    /**
     * The name of this type. This would be the segment or datatype name. For example, &#34;PID&#34; or &#34;XPN&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this type. This would be the segment or datatype name. For example, &#34;PID&#34; or &#34;XPN&#34;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
     * 
     */
    @Import(name="primitive")
    private @Nullable Output<TypePrimitive> primitive;

    /**
     * @return If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
     * 
     */
    public Optional<Output<TypePrimitive>> primitive() {
        return Optional.ofNullable(this.primitive);
    }

    private TypeArgs() {}

    private TypeArgs(TypeArgs $) {
        this.fields = $.fields;
        this.name = $.name;
        this.primitive = $.primitive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypeArgs $;

        public Builder() {
            $ = new TypeArgs();
        }

        public Builder(TypeArgs defaults) {
            $ = new TypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fields The (sub) fields this type has (if not primitive).
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable Output<List<FieldArgs>> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields The (sub) fields this type has (if not primitive).
         * 
         * @return builder
         * 
         */
        public Builder fields(List<FieldArgs> fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param fields The (sub) fields this type has (if not primitive).
         * 
         * @return builder
         * 
         */
        public Builder fields(FieldArgs... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param name The name of this type. This would be the segment or datatype name. For example, &#34;PID&#34; or &#34;XPN&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this type. This would be the segment or datatype name. For example, &#34;PID&#34; or &#34;XPN&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primitive If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
         * 
         * @return builder
         * 
         */
        public Builder primitive(@Nullable Output<TypePrimitive> primitive) {
            $.primitive = primitive;
            return this;
        }

        /**
         * @param primitive If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
         * 
         * @return builder
         * 
         */
        public Builder primitive(TypePrimitive primitive) {
            return primitive(Output.of(primitive));
        }

        public TypeArgs build() {
            return $;
        }
    }

}