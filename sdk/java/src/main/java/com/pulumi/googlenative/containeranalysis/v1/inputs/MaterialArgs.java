// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaterialArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaterialArgs Empty = new MaterialArgs();

    @Import(name="digest")
    private @Nullable Output<Map<String,String>> digest;

    public Optional<Output<Map<String,String>>> digest() {
        return Optional.ofNullable(this.digest);
    }

    @Import(name="uri")
    private @Nullable Output<String> uri;

    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private MaterialArgs() {}

    private MaterialArgs(MaterialArgs $) {
        this.digest = $.digest;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaterialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaterialArgs $;

        public Builder() {
            $ = new MaterialArgs();
        }

        public Builder(MaterialArgs defaults) {
            $ = new MaterialArgs(Objects.requireNonNull(defaults));
        }

        public Builder digest(@Nullable Output<Map<String,String>> digest) {
            $.digest = digest;
            return this;
        }

        public Builder digest(Map<String,String> digest) {
            return digest(Output.of(digest));
        }

        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public MaterialArgs build() {
            return $;
        }
    }

}