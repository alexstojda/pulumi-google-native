// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFunctionIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionIamPolicyArgs Empty = new GetFunctionIamPolicyArgs();

    @Import(name="functionId", required=true)
    private Output<String> functionId;

    public Output<String> functionId() {
        return this.functionId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
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

    private GetFunctionIamPolicyArgs() {}

    private GetFunctionIamPolicyArgs(GetFunctionIamPolicyArgs $) {
        this.functionId = $.functionId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionIamPolicyArgs $;

        public Builder() {
            $ = new GetFunctionIamPolicyArgs();
        }

        public Builder(GetFunctionIamPolicyArgs defaults) {
            $ = new GetFunctionIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionId(Output<String> functionId) {
            $.functionId = functionId;
            return this;
        }

        public Builder functionId(String functionId) {
            return functionId(Output.of(functionId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
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

        public GetFunctionIamPolicyArgs build() {
            $.functionId = Objects.requireNonNull($.functionId, "expected parameter 'functionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}