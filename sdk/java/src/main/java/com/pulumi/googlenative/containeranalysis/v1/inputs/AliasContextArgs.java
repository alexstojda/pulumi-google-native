// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1.enums.AliasContextKind;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An alias to a repo revision.
 * 
 */
public final class AliasContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final AliasContextArgs Empty = new AliasContextArgs();

    /**
     * The alias kind.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<AliasContextKind> kind;

    /**
     * @return The alias kind.
     * 
     */
    public Optional<Output<AliasContextKind>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The alias name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The alias name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AliasContextArgs() {}

    private AliasContextArgs(AliasContextArgs $) {
        this.kind = $.kind;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasContextArgs $;

        public Builder() {
            $ = new AliasContextArgs();
        }

        public Builder(AliasContextArgs defaults) {
            $ = new AliasContextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind The alias kind.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<AliasContextKind> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The alias kind.
         * 
         * @return builder
         * 
         */
        public Builder kind(AliasContextKind kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name The alias name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The alias name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AliasContextArgs build() {
            return $;
        }
    }

}