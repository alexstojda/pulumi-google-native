// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSessionEntityTypePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSessionEntityTypePlainArgs Empty = new GetSessionEntityTypePlainArgs();

    @Import(name="agentId", required=true)
    private String agentId;

    public String agentId() {
        return this.agentId;
    }

    @Import(name="entityTypeId", required=true)
    private String entityTypeId;

    public String entityTypeId() {
        return this.entityTypeId;
    }

    @Import(name="environmentId", required=true)
    private String environmentId;

    public String environmentId() {
        return this.environmentId;
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

    @Import(name="sessionId", required=true)
    private String sessionId;

    public String sessionId() {
        return this.sessionId;
    }

    private GetSessionEntityTypePlainArgs() {}

    private GetSessionEntityTypePlainArgs(GetSessionEntityTypePlainArgs $) {
        this.agentId = $.agentId;
        this.entityTypeId = $.entityTypeId;
        this.environmentId = $.environmentId;
        this.location = $.location;
        this.project = $.project;
        this.sessionId = $.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSessionEntityTypePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSessionEntityTypePlainArgs $;

        public Builder() {
            $ = new GetSessionEntityTypePlainArgs();
        }

        public Builder(GetSessionEntityTypePlainArgs defaults) {
            $ = new GetSessionEntityTypePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(String agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder entityTypeId(String entityTypeId) {
            $.entityTypeId = entityTypeId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            $.environmentId = environmentId;
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

        public Builder sessionId(String sessionId) {
            $.sessionId = sessionId;
            return this;
        }

        public GetSessionEntityTypePlainArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.entityTypeId = Objects.requireNonNull($.entityTypeId, "expected parameter 'entityTypeId' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.sessionId = Objects.requireNonNull($.sessionId, "expected parameter 'sessionId' to be non-null");
            return $;
        }
    }

}