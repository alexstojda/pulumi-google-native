// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetModelIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelIamPolicyArgs Empty = new GetModelIamPolicyArgs();

    @Import(name="modelId", required=true)
    private Output<String> modelId;

    public Output<String> modelId() {
        return this.modelId;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable Output<String> optionsRequestedPolicyVersion;

    public Optional<Output<String>> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetModelIamPolicyArgs() {}

    private GetModelIamPolicyArgs(GetModelIamPolicyArgs $) {
        this.modelId = $.modelId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelIamPolicyArgs $;

        public Builder() {
            $ = new GetModelIamPolicyArgs();
        }

        public Builder(GetModelIamPolicyArgs defaults) {
            $ = new GetModelIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder modelId(Output<String> modelId) {
            $.modelId = modelId;
            return this;
        }

        public Builder modelId(String modelId) {
            return modelId(Output.of(modelId));
        }

        public Builder optionsRequestedPolicyVersion(@Nullable Output<String> optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(String optionsRequestedPolicyVersion) {
            return optionsRequestedPolicyVersion(Output.of(optionsRequestedPolicyVersion));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetModelIamPolicyArgs build() {
            $.modelId = Objects.requireNonNull($.modelId, "expected parameter 'modelId' to be non-null");
            return $;
        }
    }

}