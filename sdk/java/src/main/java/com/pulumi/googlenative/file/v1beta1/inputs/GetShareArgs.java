// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetShareArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetShareArgs Empty = new GetShareArgs();

    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

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

    @Import(name="shareId", required=true)
    private Output<String> shareId;

    public Output<String> shareId() {
        return this.shareId;
    }

    private GetShareArgs() {}

    private GetShareArgs(GetShareArgs $) {
        this.instanceId = $.instanceId;
        this.location = $.location;
        this.project = $.project;
        this.shareId = $.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetShareArgs $;

        public Builder() {
            $ = new GetShareArgs();
        }

        public Builder(GetShareArgs defaults) {
            $ = new GetShareArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
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

        public Builder shareId(Output<String> shareId) {
            $.shareId = shareId;
            return this;
        }

        public Builder shareId(String shareId) {
            return shareId(Output.of(shareId));
        }

        public GetShareArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.shareId = Objects.requireNonNull($.shareId, "expected parameter 'shareId' to be non-null");
            return $;
        }
    }

}