// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare.v1beta1.inputs.InfoTypeTransformationArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TextConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final TextConfigArgs Empty = new TextConfigArgs();

    /**
     * The transformations to apply to the detected data.
     * 
     */
    @Import(name="transformations")
    private @Nullable Output<List<InfoTypeTransformationArgs>> transformations;

    /**
     * @return The transformations to apply to the detected data.
     * 
     */
    public Optional<Output<List<InfoTypeTransformationArgs>>> transformations() {
        return Optional.ofNullable(this.transformations);
    }

    private TextConfigArgs() {}

    private TextConfigArgs(TextConfigArgs $) {
        this.transformations = $.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TextConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TextConfigArgs $;

        public Builder() {
            $ = new TextConfigArgs();
        }

        public Builder(TextConfigArgs defaults) {
            $ = new TextConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param transformations The transformations to apply to the detected data.
         * 
         * @return builder
         * 
         */
        public Builder transformations(@Nullable Output<List<InfoTypeTransformationArgs>> transformations) {
            $.transformations = transformations;
            return this;
        }

        /**
         * @param transformations The transformations to apply to the detected data.
         * 
         * @return builder
         * 
         */
        public Builder transformations(List<InfoTypeTransformationArgs> transformations) {
            return transformations(Output.of(transformations));
        }

        /**
         * @param transformations The transformations to apply to the detected data.
         * 
         * @return builder
         * 
         */
        public Builder transformations(InfoTypeTransformationArgs... transformations) {
            return transformations(List.of(transformations));
        }

        public TextConfigArgs build() {
            return $;
        }
    }

}