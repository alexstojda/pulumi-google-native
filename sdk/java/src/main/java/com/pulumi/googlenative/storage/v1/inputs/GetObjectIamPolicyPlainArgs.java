// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetObjectIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetObjectIamPolicyPlainArgs Empty = new GetObjectIamPolicyPlainArgs();

    @Import(name="bucket", required=true)
    private String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="generation")
    private @Nullable String generation;

    public Optional<String> generation() {
        return Optional.ofNullable(this.generation);
    }

    @Import(name="object", required=true)
    private String object;

    public String object() {
        return this.object;
    }

    @Import(name="userProject")
    private @Nullable String userProject;

    public Optional<String> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    private GetObjectIamPolicyPlainArgs() {}

    private GetObjectIamPolicyPlainArgs(GetObjectIamPolicyPlainArgs $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
        this.userProject = $.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObjectIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObjectIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetObjectIamPolicyPlainArgs();
        }

        public Builder(GetObjectIamPolicyPlainArgs defaults) {
            $ = new GetObjectIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder generation(@Nullable String generation) {
            $.generation = generation;
            return this;
        }

        public Builder object(String object) {
            $.object = object;
            return this;
        }

        public Builder userProject(@Nullable String userProject) {
            $.userProject = userProject;
            return this;
        }

        public GetObjectIamPolicyPlainArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}