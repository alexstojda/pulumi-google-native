// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAgentPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAgentPoolArgs Empty = new GetAgentPoolArgs();

    @Import(name="agentPoolId", required=true)
    private Output<String> agentPoolId;

    public Output<String> agentPoolId() {
        return this.agentPoolId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAgentPoolArgs() {}

    private GetAgentPoolArgs(GetAgentPoolArgs $) {
        this.agentPoolId = $.agentPoolId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAgentPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAgentPoolArgs $;

        public Builder() {
            $ = new GetAgentPoolArgs();
        }

        public Builder(GetAgentPoolArgs defaults) {
            $ = new GetAgentPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentPoolId(Output<String> agentPoolId) {
            $.agentPoolId = agentPoolId;
            return this;
        }

        public Builder agentPoolId(String agentPoolId) {
            return agentPoolId(Output.of(agentPoolId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetAgentPoolArgs build() {
            $.agentPoolId = Objects.requireNonNull($.agentPoolId, "expected parameter 'agentPoolId' to be non-null");
            return $;
        }
    }

}