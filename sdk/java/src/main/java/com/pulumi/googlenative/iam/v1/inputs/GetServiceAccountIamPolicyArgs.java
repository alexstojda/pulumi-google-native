// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceAccountIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceAccountIamPolicyArgs Empty = new GetServiceAccountIamPolicyArgs();

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

    @Import(name="serviceAccountId", required=true)
    private Output<String> serviceAccountId;

    public Output<String> serviceAccountId() {
        return this.serviceAccountId;
    }

    private GetServiceAccountIamPolicyArgs() {}

    private GetServiceAccountIamPolicyArgs(GetServiceAccountIamPolicyArgs $) {
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.serviceAccountId = $.serviceAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceAccountIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceAccountIamPolicyArgs $;

        public Builder() {
            $ = new GetServiceAccountIamPolicyArgs();
        }

        public Builder(GetServiceAccountIamPolicyArgs defaults) {
            $ = new GetServiceAccountIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder serviceAccountId(Output<String> serviceAccountId) {
            $.serviceAccountId = serviceAccountId;
            return this;
        }

        public Builder serviceAccountId(String serviceAccountId) {
            return serviceAccountId(Output.of(serviceAccountId));
        }

        public GetServiceAccountIamPolicyArgs build() {
            $.serviceAccountId = Objects.requireNonNull($.serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
            return $;
        }
    }

}