// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectivityTestIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectivityTestIamPolicyArgs Empty = new GetConnectivityTestIamPolicyArgs();

    @Import(name="connectivityTestId", required=true)
    private Output<String> connectivityTestId;

    public Output<String> connectivityTestId() {
        return this.connectivityTestId;
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

    private GetConnectivityTestIamPolicyArgs() {}

    private GetConnectivityTestIamPolicyArgs(GetConnectivityTestIamPolicyArgs $) {
        this.connectivityTestId = $.connectivityTestId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectivityTestIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectivityTestIamPolicyArgs $;

        public Builder() {
            $ = new GetConnectivityTestIamPolicyArgs();
        }

        public Builder(GetConnectivityTestIamPolicyArgs defaults) {
            $ = new GetConnectivityTestIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectivityTestId(Output<String> connectivityTestId) {
            $.connectivityTestId = connectivityTestId;
            return this;
        }

        public Builder connectivityTestId(String connectivityTestId) {
            return connectivityTestId(Output.of(connectivityTestId));
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

        public GetConnectivityTestIamPolicyArgs build() {
            $.connectivityTestId = Objects.requireNonNull($.connectivityTestId, "expected parameter 'connectivityTestId' to be non-null");
            return $;
        }
    }

}