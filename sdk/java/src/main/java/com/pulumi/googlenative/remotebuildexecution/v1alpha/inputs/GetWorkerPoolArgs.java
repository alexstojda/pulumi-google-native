// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkerPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkerPoolArgs Empty = new GetWorkerPoolArgs();

    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="workerpoolId", required=true)
    private Output<String> workerpoolId;

    public Output<String> workerpoolId() {
        return this.workerpoolId;
    }

    private GetWorkerPoolArgs() {}

    private GetWorkerPoolArgs(GetWorkerPoolArgs $) {
        this.instanceId = $.instanceId;
        this.project = $.project;
        this.workerpoolId = $.workerpoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkerPoolArgs $;

        public Builder() {
            $ = new GetWorkerPoolArgs();
        }

        public Builder(GetWorkerPoolArgs defaults) {
            $ = new GetWorkerPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder workerpoolId(Output<String> workerpoolId) {
            $.workerpoolId = workerpoolId;
            return this;
        }

        public Builder workerpoolId(String workerpoolId) {
            return workerpoolId(Output.of(workerpoolId));
        }

        public GetWorkerPoolArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.workerpoolId = Objects.requireNonNull($.workerpoolId, "expected parameter 'workerpoolId' to be non-null");
            return $;
        }
    }

}