// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFlowPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlowPlainArgs Empty = new GetFlowPlainArgs();

    @Import(name="agentId", required=true)
    private String agentId;

    public String agentId() {
        return this.agentId;
    }

    @Import(name="flowId", required=true)
    private String flowId;

    public String flowId() {
        return this.flowId;
    }

    @Import(name="languageCode")
    private @Nullable String languageCode;

    public Optional<String> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

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

    private GetFlowPlainArgs() {}

    private GetFlowPlainArgs(GetFlowPlainArgs $) {
        this.agentId = $.agentId;
        this.flowId = $.flowId;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlowPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlowPlainArgs $;

        public Builder() {
            $ = new GetFlowPlainArgs();
        }

        public Builder(GetFlowPlainArgs defaults) {
            $ = new GetFlowPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(String agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder flowId(String flowId) {
            $.flowId = flowId;
            return this;
        }

        public Builder languageCode(@Nullable String languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetFlowPlainArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.flowId = Objects.requireNonNull($.flowId, "expected parameter 'flowId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}