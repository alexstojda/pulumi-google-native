// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetProjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetProjectArgs Empty = new GetTargetProjectArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="targetProjectId", required=true)
    private Output<String> targetProjectId;

    public Output<String> targetProjectId() {
        return this.targetProjectId;
    }

    private GetTargetProjectArgs() {}

    private GetTargetProjectArgs(GetTargetProjectArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.targetProjectId = $.targetProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetProjectArgs $;

        public Builder() {
            $ = new GetTargetProjectArgs();
        }

        public Builder(GetTargetProjectArgs defaults) {
            $ = new GetTargetProjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder targetProjectId(Output<String> targetProjectId) {
            $.targetProjectId = targetProjectId;
            return this;
        }

        public Builder targetProjectId(String targetProjectId) {
            return targetProjectId(Output.of(targetProjectId));
        }

        public GetTargetProjectArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.targetProjectId = Objects.requireNonNull($.targetProjectId, "expected parameter 'targetProjectId' to be non-null");
            return $;
        }
    }

}