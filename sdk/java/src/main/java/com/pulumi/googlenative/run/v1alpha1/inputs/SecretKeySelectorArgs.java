// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run.v1alpha1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SecretKeySelector selects a key of a Secret.
 * 
 */
public final class SecretKeySelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretKeySelectorArgs Empty = new SecretKeySelectorArgs();

    /**
     * A Cloud Secret Manager secret version. Must be &#39;latest&#39; for the latest version or an integer for a specific version. The key of the secret to select from. Must be a valid secret key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return A Cloud Secret Manager secret version. Must be &#39;latest&#39; for the latest version or an integer for a specific version. The key of the secret to select from. Must be a valid secret key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
     * 
     */
    @Import(name="localObjectReference")
    private @Nullable Output<LocalObjectReferenceArgs> localObjectReference;

    /**
     * @return This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
     * 
     */
    public Optional<Output<LocalObjectReferenceArgs>> localObjectReference() {
        return Optional.ofNullable(this.localObjectReference);
    }

    /**
     * The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. The name of the secret in the pod&#39;s namespace to select from.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. The name of the secret in the pod&#39;s namespace to select from.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Optional) Specify whether the Secret or its key must be defined
     * 
     */
    @Import(name="optional")
    private @Nullable Output<Boolean> optional;

    /**
     * @return (Optional) Specify whether the Secret or its key must be defined
     * 
     */
    public Optional<Output<Boolean>> optional() {
        return Optional.ofNullable(this.optional);
    }

    private SecretKeySelectorArgs() {}

    private SecretKeySelectorArgs(SecretKeySelectorArgs $) {
        this.key = $.key;
        this.localObjectReference = $.localObjectReference;
        this.name = $.name;
        this.optional = $.optional;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretKeySelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretKeySelectorArgs $;

        public Builder() {
            $ = new SecretKeySelectorArgs();
        }

        public Builder(SecretKeySelectorArgs defaults) {
            $ = new SecretKeySelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A Cloud Secret Manager secret version. Must be &#39;latest&#39; for the latest version or an integer for a specific version. The key of the secret to select from. Must be a valid secret key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key A Cloud Secret Manager secret version. Must be &#39;latest&#39; for the latest version or an integer for a specific version. The key of the secret to select from. Must be a valid secret key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param localObjectReference This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
         * 
         * @return builder
         * 
         */
        public Builder localObjectReference(@Nullable Output<LocalObjectReferenceArgs> localObjectReference) {
            $.localObjectReference = localObjectReference;
            return this;
        }

        /**
         * @param localObjectReference This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
         * 
         * @return builder
         * 
         */
        public Builder localObjectReference(LocalObjectReferenceArgs localObjectReference) {
            return localObjectReference(Output.of(localObjectReference));
        }

        /**
         * @param name The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. The name of the secret in the pod&#39;s namespace to select from.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. The name of the secret in the pod&#39;s namespace to select from.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param optional (Optional) Specify whether the Secret or its key must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(@Nullable Output<Boolean> optional) {
            $.optional = optional;
            return this;
        }

        /**
         * @param optional (Optional) Specify whether the Secret or its key must be defined
         * 
         * @return builder
         * 
         */
        public Builder optional(Boolean optional) {
            return optional(Output.of(optional));
        }

        public SecretKeySelectorArgs build() {
            return $;
        }
    }

}