// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSinkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSinkArgs Empty = new GetSinkArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sinkId", required=true)
    private Output<String> sinkId;

    public Output<String> sinkId() {
        return this.sinkId;
    }

    private GetSinkArgs() {}

    private GetSinkArgs(GetSinkArgs $) {
        this.project = $.project;
        this.sinkId = $.sinkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSinkArgs $;

        public Builder() {
            $ = new GetSinkArgs();
        }

        public Builder(GetSinkArgs defaults) {
            $ = new GetSinkArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder sinkId(Output<String> sinkId) {
            $.sinkId = sinkId;
            return this;
        }

        public Builder sinkId(String sinkId) {
            return sinkId(Output.of(sinkId));
        }

        public GetSinkArgs build() {
            $.sinkId = Objects.requireNonNull($.sinkId, "expected parameter 'sinkId' to be non-null");
            return $;
        }
    }

}