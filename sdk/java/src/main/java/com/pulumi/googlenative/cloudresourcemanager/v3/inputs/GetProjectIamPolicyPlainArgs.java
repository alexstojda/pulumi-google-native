// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectIamPolicyPlainArgs Empty = new GetProjectIamPolicyPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetProjectIamPolicyPlainArgs() {}

    private GetProjectIamPolicyPlainArgs(GetProjectIamPolicyPlainArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetProjectIamPolicyPlainArgs();
        }

        public Builder(GetProjectIamPolicyPlainArgs defaults) {
            $ = new GetProjectIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetProjectIamPolicyPlainArgs build() {
            return $;
        }
    }

}