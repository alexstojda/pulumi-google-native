// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement.v1.enums.ApiSyntax;
import com.pulumi.googlenative.servicemanagement.v1.inputs.MethodArgs;
import com.pulumi.googlenative.servicemanagement.v1.inputs.MixinArgs;
import com.pulumi.googlenative.servicemanagement.v1.inputs.OptionArgs;
import com.pulumi.googlenative.servicemanagement.v1.inputs.SourceContextArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Api is a light-weight descriptor for an API Interface. Interfaces are also described as &#34;protocol buffer services&#34; in some contexts, such as by the &#34;service&#34; keyword in a .proto file, but they are different from API Services, which represent a concrete implementation of an interface as opposed to simply a description of methods and bindings. They are also sometimes simply referred to as &#34;APIs&#34; in other contexts, such as the name of this message itself. See https://cloud.google.com/apis/design/glossary for detailed terminology.
 * 
 */
public final class ApiArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiArgs Empty = new ApiArgs();

    /**
     * The methods of this interface, in unspecified order.
     * 
     */
    @Import(name="methods")
    private @Nullable Output<List<MethodArgs>> methods;

    /**
     * @return The methods of this interface, in unspecified order.
     * 
     */
    public Optional<Output<List<MethodArgs>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    /**
     * Included interfaces. See Mixin.
     * 
     */
    @Import(name="mixins")
    private @Nullable Output<List<MixinArgs>> mixins;

    /**
     * @return Included interfaces. See Mixin.
     * 
     */
    public Optional<Output<List<MixinArgs>>> mixins() {
        return Optional.ofNullable(this.mixins);
    }

    /**
     * The fully qualified name of this interface, including package name followed by the interface&#39;s simple name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The fully qualified name of this interface, including package name followed by the interface&#39;s simple name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Any metadata attached to the interface.
     * 
     */
    @Import(name="options")
    private @Nullable Output<List<OptionArgs>> options;

    /**
     * @return Any metadata attached to the interface.
     * 
     */
    public Optional<Output<List<OptionArgs>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Source context for the protocol buffer service represented by this message.
     * 
     */
    @Import(name="sourceContext")
    private @Nullable Output<SourceContextArgs> sourceContext;

    /**
     * @return Source context for the protocol buffer service represented by this message.
     * 
     */
    public Optional<Output<SourceContextArgs>> sourceContext() {
        return Optional.ofNullable(this.sourceContext);
    }

    /**
     * The source syntax of the service.
     * 
     */
    @Import(name="syntax")
    private @Nullable Output<ApiSyntax> syntax;

    /**
     * @return The source syntax of the service.
     * 
     */
    public Optional<Output<ApiSyntax>> syntax() {
        return Optional.ofNullable(this.syntax);
    }

    /**
     * A version string for this interface. If specified, must have the form `major-version.minor-version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire version field is empty, the major version is derived from the package name, as outlined below. If the field is not empty, the version in the package name will be verified to be consistent with what is provided here. The versioning schema uses [semantic versioning](http://semver.org) where the major version number indicates a breaking change and the minor version an additive, non-breaking change. Both version numbers are signals to users what to expect from different versions, and should be carefully chosen based on the product plan. The major version is also reflected in the package name of the interface, which must end in `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero major versions must only be used for experimental, non-GA interfaces.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return A version string for this interface. If specified, must have the form `major-version.minor-version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire version field is empty, the major version is derived from the package name, as outlined below. If the field is not empty, the version in the package name will be verified to be consistent with what is provided here. The versioning schema uses [semantic versioning](http://semver.org) where the major version number indicates a breaking change and the minor version an additive, non-breaking change. Both version numbers are signals to users what to expect from different versions, and should be carefully chosen based on the product plan. The major version is also reflected in the package name of the interface, which must end in `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero major versions must only be used for experimental, non-GA interfaces.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ApiArgs() {}

    private ApiArgs(ApiArgs $) {
        this.methods = $.methods;
        this.mixins = $.mixins;
        this.name = $.name;
        this.options = $.options;
        this.sourceContext = $.sourceContext;
        this.syntax = $.syntax;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiArgs $;

        public Builder() {
            $ = new ApiArgs();
        }

        public Builder(ApiArgs defaults) {
            $ = new ApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param methods The methods of this interface, in unspecified order.
         * 
         * @return builder
         * 
         */
        public Builder methods(@Nullable Output<List<MethodArgs>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods The methods of this interface, in unspecified order.
         * 
         * @return builder
         * 
         */
        public Builder methods(List<MethodArgs> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods The methods of this interface, in unspecified order.
         * 
         * @return builder
         * 
         */
        public Builder methods(MethodArgs... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param mixins Included interfaces. See Mixin.
         * 
         * @return builder
         * 
         */
        public Builder mixins(@Nullable Output<List<MixinArgs>> mixins) {
            $.mixins = mixins;
            return this;
        }

        /**
         * @param mixins Included interfaces. See Mixin.
         * 
         * @return builder
         * 
         */
        public Builder mixins(List<MixinArgs> mixins) {
            return mixins(Output.of(mixins));
        }

        /**
         * @param mixins Included interfaces. See Mixin.
         * 
         * @return builder
         * 
         */
        public Builder mixins(MixinArgs... mixins) {
            return mixins(List.of(mixins));
        }

        /**
         * @param name The fully qualified name of this interface, including package name followed by the interface&#39;s simple name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The fully qualified name of this interface, including package name followed by the interface&#39;s simple name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param options Any metadata attached to the interface.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<List<OptionArgs>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Any metadata attached to the interface.
         * 
         * @return builder
         * 
         */
        public Builder options(List<OptionArgs> options) {
            return options(Output.of(options));
        }

        /**
         * @param options Any metadata attached to the interface.
         * 
         * @return builder
         * 
         */
        public Builder options(OptionArgs... options) {
            return options(List.of(options));
        }

        /**
         * @param sourceContext Source context for the protocol buffer service represented by this message.
         * 
         * @return builder
         * 
         */
        public Builder sourceContext(@Nullable Output<SourceContextArgs> sourceContext) {
            $.sourceContext = sourceContext;
            return this;
        }

        /**
         * @param sourceContext Source context for the protocol buffer service represented by this message.
         * 
         * @return builder
         * 
         */
        public Builder sourceContext(SourceContextArgs sourceContext) {
            return sourceContext(Output.of(sourceContext));
        }

        /**
         * @param syntax The source syntax of the service.
         * 
         * @return builder
         * 
         */
        public Builder syntax(@Nullable Output<ApiSyntax> syntax) {
            $.syntax = syntax;
            return this;
        }

        /**
         * @param syntax The source syntax of the service.
         * 
         * @return builder
         * 
         */
        public Builder syntax(ApiSyntax syntax) {
            return syntax(Output.of(syntax));
        }

        /**
         * @param version A version string for this interface. If specified, must have the form `major-version.minor-version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire version field is empty, the major version is derived from the package name, as outlined below. If the field is not empty, the version in the package name will be verified to be consistent with what is provided here. The versioning schema uses [semantic versioning](http://semver.org) where the major version number indicates a breaking change and the minor version an additive, non-breaking change. Both version numbers are signals to users what to expect from different versions, and should be carefully chosen based on the product plan. The major version is also reflected in the package name of the interface, which must end in `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero major versions must only be used for experimental, non-GA interfaces.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version A version string for this interface. If specified, must have the form `major-version.minor-version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire version field is empty, the major version is derived from the package name, as outlined below. If the field is not empty, the version in the package name will be verified to be consistent with what is provided here. The versioning schema uses [semantic versioning](http://semver.org) where the major version number indicates a breaking change and the minor version an additive, non-breaking change. Both version numbers are signals to users what to expect from different versions, and should be carefully chosen based on the product plan. The major version is also reflected in the package name of the interface, which must end in `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero major versions must only be used for experimental, non-GA interfaces.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ApiArgs build() {
            return $;
        }
    }

}