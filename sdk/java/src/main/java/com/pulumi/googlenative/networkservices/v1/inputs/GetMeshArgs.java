// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMeshArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMeshArgs Empty = new GetMeshArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="meshId", required=true)
    private Output<String> meshId;

    public Output<String> meshId() {
        return this.meshId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetMeshArgs() {}

    private GetMeshArgs(GetMeshArgs $) {
        this.location = $.location;
        this.meshId = $.meshId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMeshArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMeshArgs $;

        public Builder() {
            $ = new GetMeshArgs();
        }

        public Builder(GetMeshArgs defaults) {
            $ = new GetMeshArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder meshId(Output<String> meshId) {
            $.meshId = meshId;
            return this;
        }

        public Builder meshId(String meshId) {
            return meshId(Output.of(meshId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetMeshArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.meshId = Objects.requireNonNull($.meshId, "expected parameter 'meshId' to be non-null");
            return $;
        }
    }

}