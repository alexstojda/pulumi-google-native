// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.workflows.v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkflowPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkflowPlainArgs Empty = new GetWorkflowPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="workflowId", required=true)
    private String workflowId;

    public String workflowId() {
        return this.workflowId;
    }

    private GetWorkflowPlainArgs() {}

    private GetWorkflowPlainArgs(GetWorkflowPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.workflowId = $.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkflowPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkflowPlainArgs $;

        public Builder() {
            $ = new GetWorkflowPlainArgs();
        }

        public Builder(GetWorkflowPlainArgs defaults) {
            $ = new GetWorkflowPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder workflowId(String workflowId) {
            $.workflowId = workflowId;
            return this;
        }

        public GetWorkflowPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.workflowId = Objects.requireNonNull($.workflowId, "expected parameter 'workflowId' to be non-null");
            return $;
        }
    }

}