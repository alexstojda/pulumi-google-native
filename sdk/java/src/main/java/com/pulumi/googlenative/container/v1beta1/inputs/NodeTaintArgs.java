// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1beta1.enums.NodeTaintEffect;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubernetes taint is comprised of three fields: key, value, and effect. Effect can only be one of three types: NoSchedule, PreferNoSchedule or NoExecute. See [here](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration) for more information, including usage and the valid values.
 * 
 */
public final class NodeTaintArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTaintArgs Empty = new NodeTaintArgs();

    /**
     * Effect for taint.
     * 
     */
    @Import(name="effect")
    private @Nullable Output<NodeTaintEffect> effect;

    /**
     * @return Effect for taint.
     * 
     */
    public Optional<Output<NodeTaintEffect>> effect() {
        return Optional.ofNullable(this.effect);
    }

    /**
     * Key for taint.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key for taint.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Value for taint.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value for taint.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private NodeTaintArgs() {}

    private NodeTaintArgs(NodeTaintArgs $) {
        this.effect = $.effect;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTaintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTaintArgs $;

        public Builder() {
            $ = new NodeTaintArgs();
        }

        public Builder(NodeTaintArgs defaults) {
            $ = new NodeTaintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effect Effect for taint.
         * 
         * @return builder
         * 
         */
        public Builder effect(@Nullable Output<NodeTaintEffect> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect Effect for taint.
         * 
         * @return builder
         * 
         */
        public Builder effect(NodeTaintEffect effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param key Key for taint.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key for taint.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Value for taint.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value for taint.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public NodeTaintArgs build() {
            return $;
        }
    }

}