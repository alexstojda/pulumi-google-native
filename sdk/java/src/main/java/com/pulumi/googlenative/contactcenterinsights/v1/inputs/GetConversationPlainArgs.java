// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConversationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConversationPlainArgs Empty = new GetConversationPlainArgs();

    @Import(name="conversationId", required=true)
    private String conversationId;

    public String conversationId() {
        return this.conversationId;
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

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetConversationPlainArgs() {}

    private GetConversationPlainArgs(GetConversationPlainArgs $) {
        this.conversationId = $.conversationId;
        this.location = $.location;
        this.project = $.project;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConversationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConversationPlainArgs $;

        public Builder() {
            $ = new GetConversationPlainArgs();
        }

        public Builder(GetConversationPlainArgs defaults) {
            $ = new GetConversationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationId(String conversationId) {
            $.conversationId = conversationId;
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

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetConversationPlainArgs build() {
            $.conversationId = Objects.requireNonNull($.conversationId, "expected parameter 'conversationId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}