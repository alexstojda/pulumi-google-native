// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRuntimeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRuntimeArgs Empty = new GetRuntimeArgs();

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

    @Import(name="runtimeId", required=true)
    private Output<String> runtimeId;

    public Output<String> runtimeId() {
        return this.runtimeId;
    }

    private GetRuntimeArgs() {}

    private GetRuntimeArgs(GetRuntimeArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.runtimeId = $.runtimeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuntimeArgs $;

        public Builder() {
            $ = new GetRuntimeArgs();
        }

        public Builder(GetRuntimeArgs defaults) {
            $ = new GetRuntimeArgs(Objects.requireNonNull(defaults));
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

        public Builder runtimeId(Output<String> runtimeId) {
            $.runtimeId = runtimeId;
            return this;
        }

        public Builder runtimeId(String runtimeId) {
            return runtimeId(Output.of(runtimeId));
        }

        public GetRuntimeArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.runtimeId = Objects.requireNonNull($.runtimeId, "expected parameter 'runtimeId' to be non-null");
            return $;
        }
    }

}